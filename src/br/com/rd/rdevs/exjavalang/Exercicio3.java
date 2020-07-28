package br.com.rd.rdevs.exjavalang;

public class Exercicio3 {
    public static void main(String[] args) {
        String teste1 = "Socorram-me, subi no ônibus em Marrocos";
        String teste2 = "anotaram a data da maratona";

        for (int i = teste1.length() -1; i >= 0; i--) {
            System.out.print(teste1.charAt(i));
        }
        System.out.println();
        for (int i = teste2.length() -1; i >= 0; i--) {
            System.out.print(teste2.charAt(i));
        }
    }
}
