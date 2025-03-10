package br.com.Principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.servicos.ClienteOmdb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Titulo> titulos = new ArrayList<>();
        ClienteOmdb pesquisa = new ClienteOmdb();



        Titulo filme = pesquisa.ConverterJsonFilme();


        System.out.println("Filme encontrado: "+ filme);

    }
}