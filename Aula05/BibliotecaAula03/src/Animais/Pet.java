/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animais;

/**
 *
 * @author william.moura
 */
public abstract class Pet {

    //public Pet(int idadeConstrutor) {
    //            this.idade = idadeConstrutor;
    //}    

    private Integer idade;
    public String tipoAnimal;
    public static boolean alimentado;   //EXEMPLO Static 
    //protected boolean vacinado;
    
    public Integer getIdade() {
        return idade;
    }
    
    public boolean EstaAlimentado() {
         return alimentado;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public abstract void fazerBarulho();

    public final void comer() {
        alimentado = true;
    }
    
}
