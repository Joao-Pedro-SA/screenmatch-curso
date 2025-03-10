package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeAnoInvalidoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable <Titulo>{

    //@SerializedName("Title")
    private String nome;
    //@SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private String sinopse;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //Construtor para tratamento da API como objeto de Titulo
    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length()>4) {
            throw new ErroDeAnoInvalidoException("Ano invalio, não consegui converter, pois tem mais de 4 caracteres");

        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));//Transformando a string runtime da API em int.
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void definirSinopse(String s){
        if (this.sinopse == null || this.sinopse.isEmpty()){
            this.sinopse = s;

        } else {
            System.out.println("Uma sinopse já foi definida e não pode ser alterada");
        }
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Sinopse: "+ sinopse);
        System.out.println("Tempo de filme: "+duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
       return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "\n{\nTitulo: " + nome + '\'' +
                "\nanoDeLancamento: " + anoDeLancamento + " \nduração em minutos: "+ getDuracaoEmMinutos() + "\n}";
    }
}

