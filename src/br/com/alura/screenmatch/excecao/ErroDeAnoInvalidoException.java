package br.com.alura.screenmatch.excecao;

public class ErroDeAnoInvalidoException extends RuntimeException {
    private String mensagem;
    public ErroDeAnoInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
