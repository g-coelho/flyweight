package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProcessadorFactory {
    private static Map<String, Processador> processadores = new HashMap<>();

    public static Processador getProcessador(String nome, String arquitetura){
        Processador processador = processadores.get(nome);

        if(processador == null){
            processador = new Processador(nome, arquitetura);
            processadores.put(nome, processador);
        }
        return processador;
    }

    public static int getTotalProcessadores(){
        return processadores.size();
    }

}
