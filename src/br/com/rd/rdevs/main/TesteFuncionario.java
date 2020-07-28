package br.com.rd.rdevs.main;

import br.com.rd.rdevs.modelo.Funcionario;
import br.com.rd.rdevs.modelo.Gerente;
import br.com.rd.rdevs.modelo.Lider;

public class TesteFuncionario {
    public static void main(String[] args) {

        Lider funcionarioLeo = new Lider();
        funcionarioLeo.setNome("Leo");
        funcionarioLeo.setCpf("12345678922");

        Gerente funcionarioRicardo = new Gerente();
        funcionarioRicardo.setNome("Ricardo");
        funcionarioRicardo.setCpf("32165498733");
        funcionarioRicardo.setSenha(6845);

    }
}
