/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemysql;

import ConexaoBanco.MySQL;
import Entities.Pessoa;
import com.sun.jndi.ldap.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author william.moura
 */
public class TesteMySql {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Mapping map = new Mapping();

        java.sql.Connection con = MySQL.getConexaoMySQL();
        System.out.println(MySQL.statusConection());

        map.mappingExecute("Pessoa", con);

        PreparedStatement preparedStmt = con.prepareStatement("");

        ResultSet rs = preparedStmt.executeQuery("SELECT * from pessoa");// where idPessoa = 1");
        rs.next();
        Pessoa p1 = new Pessoa();

        p1.setNome(rs.getString("nome"));
        p1.setProfissao(rs.getString("profissao"));
        p1.setIdade(rs.getInt("idade"));
        p1.setIdPessoa(rs.getInt("idPessoa"));

        Pessoa p2 = new Pessoa(rs);

        p2.setIdade(2323);
        
        p2.UpdateAux(con);
        
        System.out.println("Informações:");
        p1.printInformation();
        p2.printInformation();

        p1.setIdade(99);
        p1.printInformation();

        //p1.InsertAux(con);  
        //p1.DeleteById(con, 1);
        //p1.DeleteAux(con, " idade = '99'");
        p1.printInformation();

        con.close();
    }
}
