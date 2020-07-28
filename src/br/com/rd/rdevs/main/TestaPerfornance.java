package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfornance {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
//        Collection<Integer> teste = new ArrayList<>();
        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();
        int total = 100000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long tempoPrimeiroFor = System.currentTimeMillis();
        long fimPrimeiroFor = tempoPrimeiroFor - inicio;
        System.out.println("Tempo fim do primeiro for: " + fimPrimeiroFor);
        inicio = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long segundoPrimeiroFor = System.currentTimeMillis();
        long fimSegundoFor = segundoPrimeiroFor - inicio;
        System.out.println("Tempo fim do segundo for: " + fimSegundoFor);
//        long fim = System.currentTimeMillis();
//        long tempo = fim - inicio;
//        System.out.println("Tempo gasto: " + tempo);
        // A diferença mais gritante seria realizar o contains, pois este método percorre todo o array para verificar se o i contain dentro do Array
    }
}
