package Animais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wqm_a
 */
public class Cachorro extends Pet implements Mamifero{
        
    @Override
    public void makeSound() {
        System.out.println("Au-Au");
    }
    
    @Override
    public void method(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("teste0" + i);
        }
    }
}
