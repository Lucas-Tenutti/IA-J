package com.sgp.modelo;

public class borracha{
     
    //caracteristica
     private String nome; //atributo privado tipo string
     private String material;  //atributo privado tipo string
     private String cor;  //atributo privado tipo string

    //construtor
    public borracha(String nome, String material, String cor  ){
        this.nome = nome;
        this.material = "";
        this.cor = "";
    }

    //construtor padrao
    public borracha(){
        this.nome = "borracha";
        this.material = "látex";
        this.cor = "vermelha";
    }

     public void apagar() {
        System.out.println("Apagar");
    }

     public String getNome() {
        return nome;
    }

     public String getMaterial() {
        return material;
    }

     public String getCor() {
        return cor;
    }

     public String setNome() {
        return nome;
    }

     public String setMaterial() {
        return material;
    }

    public String setCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Borracha [nome=" + nome + ", material=" + material + "]";
    }
}