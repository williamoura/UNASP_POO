/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

/**
 *
 * @author william.moura.a
 */
public class Caneta {

    public String Cor;
    private String Marca;
    private double Ponta;
    private String Modelo;
    private float Valor;
    private String Tamanho;
    private int Carga;
    private boolean EstaAberta;
    private String Texto;

    public Caneta(String Cor, String Marca, double Ponta, String Modelo, float Valor, String Tamanho) {
        this.EstaAberta = false;
        this.Carga = 100;

        this.Cor = Cor;
        this.Marca = Marca;
        this.Ponta = Ponta;
        this.Modelo = Modelo;
        this.Valor = Valor;
        this.Tamanho = Tamanho;
    }

    public void escrever(String palavra) {
        if (this.verificarCarga() >= 5) {
            if (this.Texto == null || this.Texto == "") {
                this.Texto = palavra;
            } else {
                this.Texto = this.Texto + ", " + palavra;
            }
            this.Carga = this.Carga - 5;
        } else {
            System.out.println("Não tem Carga");
        }
    }

    public void desenhar() {
        if (this.verificarCarga() >= 25) {
            this.Carga = this.Carga - 25;
        } else {
            System.out.println("Não tem Carga");
        }
    }

    public void abrir() {
        if (this.EstaAberta == true) {
            System.out.println("Caneta já está aberta");
        } else {
            this.EstaAberta = true;
        }
    }

    public void fechar() {
        if (this.EstaAberta == false) {
            System.out.println("Caneta já está fechada");
        } else {
            this.EstaAberta = false;
        }
    }

    public int verificarCarga() {
        return this.Carga;
    }

    public void recarregar() {
        this.Carga = 100;
    }

    public void apagar() {
        this.Texto = "";    
    }

    public void imprimir() {
        System.out.println(this.Texto);
    }
}
