package br.com.rd.rdevs.contas;

import br.com.rd.rdevs.modelo.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {

    private SeguroDeVida seguroDeVida;

    public void criarSeguro(int numeroApolice, String titular, double valor) {
        this.seguroDeVida = new SeguroDeVida();
        this.seguroDeVida.setNumeroApolice(numeroApolice);
        this.seguroDeVida.setTitular(titular);
        this.seguroDeVida.setValor(valor);
    }

    public void exibirDados() {
        System.out.println("Número da Apólice: " + seguroDeVida.getNumeroApolice());
        System.out.println("Titular: " + seguroDeVida.getTitular());
        System.out.println("Valor R$" + seguroDeVida.getValor());
    }
}
