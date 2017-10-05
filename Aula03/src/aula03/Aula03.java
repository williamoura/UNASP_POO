/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;
import Produtos.Caneta;
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
        
        Caneta caneta01 = new Caneta("Azul", "Bic", 2, "crystal", 1, "pequena");
        
        caneta01.escrever("Teste"); 
        caneta01.imprimir();
        caneta01.desenhar();
        
        System.out.println(caneta01.verificarCarga());
        
        
    }
    
}
