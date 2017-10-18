/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import Animais.Cachorro;
import Animais.Gato;
import Animais.Pet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author william.moura
 */
public class Aula05 {

    public static void main(String args[]) {

        List<Pet> pets = new ArrayList<>();
        
        //Inserindo Objetos de Classes diferentes no Array
        pets.add(new Gato(13));
        pets.add(new Cachorro());

        //Using extension Method FOREACH
        pets.forEach((pet) -> {
            pet.fazerBarulho();

            if (pet.getClass().toString().contains("Gato")) //pet.setIdade(10);
            {
            } else {
                pet.setIdade(12);
            }
        });

        //Using FOR LIKE FOREACH
        for (Pet petItem : pets) {
            petItem.fazerBarulho();

            if (petItem.getClass().toString().contains("Gato")) //pet.setIdade(10);
            {
            } else {
                petItem.setIdade(12);
            }
        }

        verIdade(pets);

        Pet gato = new Gato();
        if (gato.EstaAlimentado() == false) {
            gato.comer();
        }

        System.out.println(gato.EstaAlimentado());
    }

    public static void verIdade(List<Pet> pets) {
        pets.forEach((pet) -> {
            Integer idade = pet.getIdade();
            System.out.println(idade);
        });
    }

//    public static Boolean implementsInterface(Object object, Class interf) {
//        for (Class c : object.getClass().getInterfaces()) {
//            if (c.equals(interf)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
