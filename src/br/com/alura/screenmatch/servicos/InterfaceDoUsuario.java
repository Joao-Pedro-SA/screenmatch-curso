package br.com.alura.screenmatch.servicos;

import java.util.Scanner;

public class InterfaceDoUsuario {

    public String pesquisarTitulo(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o titulo do filme que procura: ");
        String titulo = leia.nextLine();

        return titulo;
    }
}
