package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el nombre de la pelicula a buscar...");
        var busqueda = entrada.nextLine();
        String direccionAPI = "https://www.omdbapi.com/?apikey=4830f843&"+
                "t="+busqueda.replace(" ","+");

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccionAPI))
                .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);

            //utilizacion del modulo de try cacth para capturar los errores o excepciones

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println(miTitulo);

        } catch (NumberFormatException evento){
            System.out.println("Ocurrio un error: ");
            System.out.println("el error es: "+ evento.getMessage());
        }
        catch(IllegalArgumentException evento){
            System.out.println("Error en la URI, verifique la direccion");
        }
        catch (Exception evento){
            System.out.println("Ocurrio un error inesperado");
        }

        System.out.println("Finalizo la ejecucion del programa");

    }
}
