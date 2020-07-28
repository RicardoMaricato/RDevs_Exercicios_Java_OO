package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.ManipuladorDeSeguroDeVida;

public class TestaSeguro {
    public static void main(String[] args) {

        ManipuladorDeSeguroDeVida seg1 = new ManipuladorDeSeguroDeVida();

        seg1.criarSeguro(159753, "André Menezes", 132.0);
        seg1.exibirDados();
    }
}
