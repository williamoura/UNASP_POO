/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioeletronico3_percival;

/**
 *
 * @author percival.lucena1
 */
public class Endereco {
    
    public String pais;
    public String estado;
    public String cidade;
    public String bairro;
    public String numero;
    public String logradouro;
    public String complemento;
    public String CEP;
    
    public String toString(){
        String texto = " CEP " + CEP;
        texto += "\n Pais:" + pais;
        texto += "\n Cidade " + cidade;
        texto += "\n Logradouro " + logradouro;
        texto += "\n Bairro " + bairro;
        texto += "\n Numero " + numero;
        texto += "\n Complemento " + complemento;
        return texto;
    }    
}