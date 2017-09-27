/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioeletronico3_percival;

/**
 *
 * @author william.moura
 */
public class Comercioeletronico3_Percival {

    public static void main(String[] args) {
        System.out.println("CADASTRO DE CLIENTES");

        Cliente c1 = new Cliente();
        c1.identificao = "15261561256";
        c1.genero = "F";
        c1.nome = "Maria SÃ³";
        c1.data_nascimento = new java.util.Date();
        c1.data_nascimento.setDate(1111111);

        Endereco e1 = new Endereco();
        e1.CEP = "13286-154";
        e1.bairro = "Cidade Nova";
        e1.cidade = "São Paulo";
        e1.complemento = "Apto 12";
        e1.logradouro = "Rua Amaral Gurgel";
        e1.numero = "450";
        e1.pais = "Brasil";

        c1.endereco = e1;

        System.out.println(c1);
    }
}
