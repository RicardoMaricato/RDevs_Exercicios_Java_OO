package br.com.rd.rdevs.modelo;

import br.com.rd.rdevs.contas.Conta;

import java.util.*;

public class Banco {
    List<Conta> contas;
    Map<String, Conta> contasMapeadas;

    public Banco() {
        contas = new ArrayList<>();
        contasMapeadas = new HashMap<>();
    }

    public void adicionar(Conta conta) {
        this.contas.add(conta);
        this.contasMapeadas.put(conta.getTitular(), conta);
    }

    public Conta pega(int index) {
        return this.contas.get(index);
    }

    public int pegaQuantidadeDeContas() {
        return this.contas.size();
    }

    public Conta buscaPorTitular(String nome) {
        return this.contasMapeadas.get(nome);
    }

}
