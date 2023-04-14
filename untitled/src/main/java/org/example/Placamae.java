package org.example;

public class Placamae {
    private String nome;
    private Processador nomeProcessador;
    
    public Placamae(String nome, Processador nomeProcessador){
        this.nome = nome;
        this.nomeProcessador = nomeProcessador;
    }
    
    public String obterPlacamae() {
        return "Placamae{" +
                "nome='" + this.nome + '\'' +
                ", nomeProcessador='" + nomeProcessador.getNome() + '\'' +
                ", arquitetura='" + nomeProcessador.getArquitetura() + '\'' +
                '}';
    }
}
