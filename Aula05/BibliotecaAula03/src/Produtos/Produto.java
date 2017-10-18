/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

import java.util.Date;

/**
 *
 * @author william.moura.a
 */
public abstract class Produto {

    protected float Valor;
    protected String Modelo;
    protected String Marca;
    private int Codigo;
    public String Tipo;

    public Produto() {
        
    }

    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public abstract void alterarValor(float valor);
}
