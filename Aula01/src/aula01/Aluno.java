/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author wqm_a
 */
public class Aluno {
   public int RA;
   public String Nome;
   protected int Idade;
   private String RG;
   private boolean Cansado;

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Aluno(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }
    
    public void irParaAula()
    {
        this.Cansado = false;
    }
    
    public void voltandoDaAula()
    {
        this.Cansado = true;
    }
}
