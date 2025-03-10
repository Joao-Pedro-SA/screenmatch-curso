package br.com.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1980);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Carros", 2005);
        outroFilme.avalia(10);
        var filmeDoPaulo = new Filme ("Dogville", 2003);
        filmeDoPaulo.avalia(8.7);
        Serie vikings = new Serie("Vikings", 2003);
        vikings.avalia(10);


        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(vikings);

        for (Titulo item : lista) {
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
            //lista.forEach(System.out::println);
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adamm Sandler");
        buscaPorArtista.add("João Pedro");
        buscaPorArtista.add("Jason Momoa");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Artistas ordenados");
        System.out.println(buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de filmes ordenados");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);



    }
}
