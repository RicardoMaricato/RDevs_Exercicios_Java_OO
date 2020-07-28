package br.com.rd.rdevs.contas;

public abstract class Conta implements Comparable<Conta>  {
    protected int numero;
    protected String titular;
    protected double saldo;
    protected double rendimento;
    protected static int identificador = 0;

    public Conta(int numero, String titular) {
        identificador++;
        this.numero = numero;
        this.titular = "";
    }

    public Conta(){
    }

    public Conta(String titular) {
        this.titular = titular;
    }

    public void sacar(double valorSacado) {
        if (this.saldo < valorSacado && valorSacado < 0) {
        } else {
            this.saldo = this.saldo - valorSacado;
        }
    }

    public void depositar(double valorDepositado) {
        if (valorDepositado < 0) {
            throw new IllegalArgumentException("Você tentou depositar um valor negativo.");
        } else {
            this.saldo += valorDepositado;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void calcularRendimento() {
        rendimento = this.saldo * 0.1;
//        System.out.println(rendimento);
    }

    public void recuperarDadosParaImpressao() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Nome do Titular: " + this.titular);
        System.out.println("Saldo da conta: R$ " + this.saldo);
        System.out.println("Rendimento da conta: R$ " + this.rendimento);
    }

    public abstract String getTipo();

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendimento() {
        return rendimento;
    }

    public static int getIdentificador() {
        return Conta.identificador;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public abstract double getValorImposto();

    @Override
    public int compareTo(Conta o) {
        return this.titular.compareTo(o.titular);
    }
}
