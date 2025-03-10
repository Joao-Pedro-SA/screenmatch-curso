package br.com.Principal;

import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomedados;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1980);
        meuFilme.definirSinopse("""
                O filme conta a história de uma familia
                mafiosa que luta contra os seus inimigos enquanto
                lida com problemas familiares.
                """);
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliação: "+ meuFilme.pegaMedia());

        Serie vikings = new Serie("Vikings", 2003);
        vikings.setNome("Vikings");
        vikings.definirSinopse("""
                A série acompanha a saga dos navegadores nórdicos que exploram 
                e conquistam  novos territórios nos tempos medievais.
                          """);
        vikings.setAnoDeLancamento(2013);
        vikings.setTemporadas(8);
        vikings.setTempoDeEpisodio(48);
        vikings.setEpisodiosPorTemporada(12);
        vikings.exibeFichaTecnica();
        System.out.println("Tempo em minutos para terminar vikings: "+vikings.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Carros", 2005);
        outroFilme.definirSinopse("""
                O filme é um deseho animado que 
                conta a história de um carro de corrida
                disputando o primeiro lugar nas maiores pistas do mundo.
                """);
        outroFilme.setAnoDeLancamento(2005);
        outroFilme.setDuracaoEmMinutos(175);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.somaTempo(meuFilme);
        calculadora.somaTempo(outroFilme);
        calculadora.somaTempo(vikings);
        System.out.println("soma do tempo dos filmes: "+ calculadora.getTempoTotal());
        FiltroRecomedados filtro = new FiltroRecomedados();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio("Piloto", 2013);

        episodio.setNumero(1);
        episodio.setNome("Piloto");
        episodio.setSerie(vikings);
        episodio.setTotalVisualizacoes(300);
        vikings.exibeFichaTecnica();
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme ("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme"+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do  "+listaDeFilmes.get(0).toString());


    }
}
