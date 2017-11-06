/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.ResultSet;
import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author william.moura
 */
public class Pessoa implements SQLData {

    private int idPessoa;
    private String nome;
    private int idade;
    private String profissao;
    private String sql_type;

    public Pessoa() {
    }

    public Pessoa(ResultSet resultSqlItem) {
        this.fillObject(resultSqlItem);
    }

    private void fillObject(ResultSet resultSqlItem) {
        try {
            
            this.setNome(resultSqlItem.getString("nome"));
            this.setProfissao(resultSqlItem.getString("profissao"));
            this.setIdade(resultSqlItem.getInt("idade"));
            this.idPessoa = resultSqlItem.getInt("idPessoa");
            
        } catch (SQLException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    @Override
    public String getSQLTypeName() throws SQLException {
        return sql_type;
    }

    @Override
    public void readSQL(SQLInput stream, String type) throws SQLException {
        sql_type = type;
        profissao = stream.readString();
        idade = stream.readInt();
        nome = stream.readString();
        idPessoa = stream.readInt();
    }

    @Override
    public void writeSQL(SQLOutput stream) throws SQLException {
        stream.writeString(nome);
        stream.writeInt(idade);
        stream.writeString(profissao);
    }
    
    public void printInformation()
    {
        System.out.println("-------------------------------");
        System.out.println(idPessoa);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(profissao);
    }
}
