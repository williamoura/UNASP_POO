package Animais;
/**
 *
 * @author wqm_a
 */
public class Gato extends Pet implements Mamifero, Felino {
    
    public Gato(Integer Idade) {
        setIdadeDoGato(Idade);
    }

    public Gato() {
    }

    public void setIdadeDoGato(int idade) {
        setIdade(idade);
    }

    public void setTipo(int idade) {
        this.tipoAnimal = "tipo01";
    }

    @Override //Modo Manual
    public boolean EstaAlimentado() {
        return alimentado;
    }

    @Override //Modo Automático por ser Abstrato
    public void fazerBarulho() {
        System.out.println("Miau");
    }

    @Override
    public void arranhar() {
        
    }

    @Override
    public void method(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("teste0" + i);
        }
    }
}
