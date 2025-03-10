package br.com.alura.screenmatch.calculos;

public class FiltroRecomedados {

    public void filtra(Avaliacao avaliado){
        if (avaliado.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento.");

        } else if (avaliado.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado o momento.");

        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }


    }

}
