package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Avaliacao;

public class Filme extends Titulo implements Avaliacao {
    private String diretor;

    public Filme(String nome, int anoDeLacamento){
       super(nome,anoDeLacamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}