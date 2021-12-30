package br.itau.decolar.model;

public class Contas {

    private int numero;
    private int agencia;
    private double saldo;
    private Clientes titular;
    private int tipoConta;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Clientes getTitular() {
        return titular;
    }
    public void setTitular(Clientes titular) {
        this.titular = titular;
    }
    public int getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }    
}
