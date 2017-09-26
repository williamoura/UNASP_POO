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
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno01 = new Aluno("Fernando", 23);
        Aluno aluno02 = new Aluno("Rafela", 20);

        aluno01.setRG("000.000.000-X");

        aluno02.RA = 29881;
        aluno01.RA = 29881;
        aluno01.Idade = 24;

        System.out.println(aluno01.RA + "-" + aluno01.Nome + " tem :" + aluno01.Idade + " anos");
        System.out.println("---------------------------");

        System.out.println(aluno02.RA + "-" + aluno02.Nome + " tem :" + aluno02.Idade + " anos");

        System.out.println(aluno01.getRG() == null ? "Não tem RG" : aluno01.getRG());
        if (aluno02.getRG() == null) {
            System.out.println("Não tem RG");
        } else {
            System.out.println(aluno02.getRG());
            
            
            
            william.moura@unasp.edu.br
                    
                    
                    
            
        }
    }
}
