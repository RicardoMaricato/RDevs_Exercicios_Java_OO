package br.com.rd.rdevs.modelo;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGrenciados;

    @Override
    public double bonificacao() {
        return this.salario *= 1.15;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido");
            return true;
        } else {
            System.out.println("Acesso Negado");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public int getNumeroDeFuncionariosGrenciados() {
        return numeroDeFuncionariosGrenciados;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setNumeroDeFuncionariosGrenciados(int numeroDeFuncionariosGrenciados) {
        this.numeroDeFuncionariosGrenciados = numeroDeFuncionariosGrenciados;
    }
}
