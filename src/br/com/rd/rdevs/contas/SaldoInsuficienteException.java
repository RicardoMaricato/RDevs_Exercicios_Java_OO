package br.com.rd.rdevs.contas;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(double valorSacado) {
        super("Saldo insuficiente para sacar este R$" + valorSacado);
    }
}
