package br.com.cobradev.jsontransformclass;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://receitaws.com.br/v1/cnpj/03181125000153";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();

            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            Root root = gson.fromJson(response.body(), Root.class);

            System.out.println("Resposta JSON");
            System.out.println(response.body());

            System.out.println("Resposta Objeto ");
            System.out.println(root);

            System.out.print("JSON novamente");
            System.out.print(gson.toJson(root));

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}