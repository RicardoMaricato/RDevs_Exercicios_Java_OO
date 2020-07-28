package br.com.rd.rdevs.contas;

import br.com.rd.rdevs.modelo.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente() {
    }

    public ContaCorrente(String titular){
        super(titular);
    }

    public ContaCorrente(int numero, String titular) {
        super(numero, titular);
    }

    @Override
    public void sacar(double valorSacado) {
        if (valorSacado < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo.");
        } else if (this.saldo < valorSacado) {
            throw new SaldoInsuficienteException(valorSacado);
        } else {
            this.saldo -= valorSacado - 0.10;
        }
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }

    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }

}
