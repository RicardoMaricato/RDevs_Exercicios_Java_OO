package br.com.rd.rdevs.main;

import br.com.rd.rdevs.modelo.Funcionario;
import br.com.rd.rdevs.modelo.Gerente;

public class TestaGerente {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Ivo");
        g.setCpf("78945612333");
        g.setSalario(15000);
        System.out.println(g.bonificacao());
    }
}
