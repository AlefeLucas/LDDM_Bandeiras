package br.pucminas.computacao.alefelucas.bandeiras.bandeiras;

/**
 * Created by alefelucas on 21/02/18.
 */

public class Pais {

     private String nome;
     private int imageId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Pais(String nome, int imageId) {
        this.nome = nome;
        this.imageId = imageId;
    }
}
