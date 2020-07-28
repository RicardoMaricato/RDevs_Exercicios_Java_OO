package br.com.rd.rdevs.contas;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}
