package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.Conta;
import br.com.rd.rdevs.contas.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TestaArrays {
    public static void main(String[] args) {

        Conta [] contas = new Conta[10];
        double soma = 0.0;

        for (int i = 0; i < contas.length; i++) {
            contas [i] = new ContaCorrente();
            contas[i].depositar((i + 1) * 100.0);
            //System.out.println(contas[i].getSaldo());
        }

        Conta c1 = new ContaCorrente("Marcus");
        Conta c2 = new ContaCorrente("Luciano");
        Conta c3 = new ContaCorrente("Carlos");
        Conta c4 = new ContaCorrente("Graziel");
        Conta c5 = new ContaCorrente("Rafael");

        List<Conta> contas1 = new ArrayList<>();
        contas1.add(c1);
        contas1.add(c2);
        contas1.add(c3);
        contas1.add(c4);
        contas1.add(c5);

        contas1.sort(Conta::compareTo);

        for (Conta c: contas1) {
            System.out.println(c.getTitular());
        }

        //for normal
//        for (int i = 0; i < contas.length; i++) {
//            soma += contas[i].getSaldo();
//        }

        //for each
//        for (Conta c: contas) {
//            soma += c.getSaldo();
//            System.out.println(soma);
//        }
//        System.out.println("A media da " + soma/contas.length);
    }
}
