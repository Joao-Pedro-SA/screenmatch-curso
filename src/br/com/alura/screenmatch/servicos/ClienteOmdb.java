package br.com.alura.screenmatch.servicos;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ClienteOmdb {
    private static final String chave =  "&apikey=1d30b7a5";
    private static final String parametroFilme = "?t=";
    private static final String enderecoFilme = "http://www.omdbapi.com/";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting().create();
    private InterfaceDoUsuario interfaceDoUsuario = new InterfaceDoUsuario();

    public String buscarFilme () throws IOException, InterruptedException {
        String titulo = interfaceDoUsuario.pesquisarTitulo();
        String enderecoCodificado = URLEncoder.encode(titulo, StandardCharsets.UTF_8);
        String endereco = enderecoFilme + parametroFilme+ enderecoCodificado + chave;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        return json;
    }

    public Titulo ConverterJsonFilme() throws IOException, InterruptedException {
       String json = buscarFilme();
       TituloOmdb dadosOmdb = gson.fromJson(json, TituloOmdb.class);
       return new Titulo(dadosOmdb);

    }


}
