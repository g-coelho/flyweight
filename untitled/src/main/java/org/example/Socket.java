package org.example;

import java.util.ArrayList;
import java.util.List;

public class Socket {
    private List<Placamae> placas = new ArrayList<>();

    public void registrar(String nomePlacamae, String nomeProcessador, String arquitetura){
        Processador processador = ProcessadorFactory.getProcessador(nomeProcessador, arquitetura);
        Placamae placamae = new Placamae(nomePlacamae, processador);
        placas.add(placamae);
    }

    public List<String> obterPlacas(){
        List<String> saida = new ArrayList<String>();
        for(Placamae placamae : this.placas){
            saida.add(placamae.obterPlacamae());
        }
        return saida;
    }



}
