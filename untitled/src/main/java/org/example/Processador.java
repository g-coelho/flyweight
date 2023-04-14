package org.example;

public class Processador {
    private String nome;
    private String arquitetura;

    public Processador(String nome, String arquitetura){
        this.nome = nome;
        this.arquitetura = arquitetura;
    }

    public String getNome(){
        return nome;
    }

    public String getArquitetura(){
        return arquitetura;
    }


}
