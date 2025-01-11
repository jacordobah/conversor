package com.conversor.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarDivisa {
    private double valorAConvertir;
    private double resultado;
    private String divisaBase;
    private String divisaSalida;

    public MonedaOMDB consultar(String divisa ){
        this.valorAConvertir = valorAConvertir;
        this.divisaBase = divisa;

        try {

            String url_str = "https://v6.exchangerate-api.com/v6/514dcd6cd7ca1efdf2714f84/latest/" + divisaBase;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson json = new Gson();
            MonedaOMDB moneda = json.fromJson(response.body(),MonedaOMDB.class);
            return moneda;

        } catch (Exception e) {
            System.out.println("Error en la conección: " + e.getMessage());
        }
        return null;
    }



}
