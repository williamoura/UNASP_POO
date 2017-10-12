/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import Produtos.Caneta;
import Produtos.Produto;

/**
 *
 * @author william.moura.a
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Caneta caneta01 = new Caneta("Azul", "Bic", 2, "crystal", 1, "pequena", 001);

        

        Produto caneta02 = new Caneta("Azul", "Bic", 2, "crystal", 1, "pequena", 001);
               
        caneta01.escrever("Teste");
        caneta01.imprimir();
        caneta01.desenhar();
        caneta01.recarregar();
        
        caneta02.setCodigo(002);
        System.out.println(caneta02.getCodigo());

    }

}
