package br.itau.decolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;
    
    @Column(name = "agencia")
    private int agencia;

    @Column(name = "saldo")
    private double saldo;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    @JsonIgnoreProperties("contas")
    private Cliente titular;

    @Column(name = "tipo_conta", length = 50, nullable = false, unique = true)   
    private String tipoConta;
    
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }    
}
