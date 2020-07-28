package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.SaldoInsuficienteException;
import br.com.rd.rdevs.modelo.Cliente;
import br.com.rd.rdevs.contas.Conta;
import br.com.rd.rdevs.contas.ContaCorrente;
import br.com.rd.rdevs.contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {
//        Cliente c1 = new Cliente();
//        c1.setNome("Ricardo");
//        c1.setCpf("36925814799");
//        c1.setProfissao("Desenvolvedor");
//
//        ContaCorrente cc1 = new ContaCorrente(80209, "Ricardo");
//        cc1.depositar(100);
//        cc1.sacar(180);
//        System.out.println(cc1.getSaldo());
//
//        Cliente c2 = new Cliente();
//        c2.setNome("Augusto");
//        c2.setCpf("11122233365");
//        c2.setProfissao("Engenheiro");
//
//        ContaPoupanca cc2 = new ContaPoupanca(32659, "Augusto");
//        cc2.depositar(500);
//        cc2.sacar(100);
//        System.out.println(cc2.getSaldo());
//
//        cc2.transferir(100, cc1);
//        System.out.println(cc1.getSaldo());
//        System.out.println(cc2.getSaldo());
//
//        System.out.println(Conta.getIdentificador());
//        System.out.println(cc1.getTipo());
//        System.out.println(cc2.getTipo());
//        System.out.println(cc1.getValorImposto());

//        ContaCorrente c3 = new ContaCorrente(9999, "João");
//        c3.depositar(500);
//        ContaCorrente c4 = new ContaCorrente(8888, "Dani");
//        c4.depositar(200);
//        ContaCorrente c5 = new ContaCorrente(7777, "Ramon");
//        c5.depositar(150);
//
//        List<ContaCorrente> contas = new ArrayList<>();
//        contas.add(c3);
//        contas.add(c4);
//        contas.add(c5);
//        Collections.sort(contas);

        ContaCorrente cc1 = new ContaCorrente(80209, "Ricardo");

        try {
            cc1.depositar(300);
            cc1.sacar(400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
