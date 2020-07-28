package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
        // trocar depois por ArrayList
//        List<Integer> teste = new ArrayList<>();
        List<Integer> teste = new LinkedList<>();
        for (int i = 0; i < 500; i++) {
            teste.add(0, i);
            System.out.println(teste.get(0));
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
        // A lista mais rápida é o LinkedList
    }
}

