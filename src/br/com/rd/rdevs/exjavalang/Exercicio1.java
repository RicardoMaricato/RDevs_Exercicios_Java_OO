package br.com.rd.rdevs.exjavalang;

public class Exercicio1 {
    public static void main(String[] args) {
        String x = "ricardo";
        System.out.println(x.contains("i"));

        String y = "";
        System.out.println(y.isEmpty());

        String z = "Ricardo André Maricato Filho";
        String[] split = z.split(" ");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        int quantidadeDeCaracteres = z.length();
        System.out.println("Quantidade de Caracteres: " + quantidadeDeCaracteres);
    }
}
