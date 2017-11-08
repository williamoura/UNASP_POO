/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBanco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author william.moura
 */
public class CRUD {

    public void Insert(String table, ArrayList<String> fields, ArrayList<String> values, int qtdValues, java.sql.Connection connection) throws SQLException {
        String valuesStr = "";
        String columns = "";

        for (int i = 0; i < qtdValues; i++) {
            if (i == 0) {
                valuesStr = valuesStr + "?";
                columns = columns + fields.get(i);
            } else {
                valuesStr = valuesStr + ",?";
                columns = columns + "," + fields.get(i);
            }
        }

        String sql = "INSERT INTO " + table + "(" + columns + ") VALUES (" + valuesStr + ")";

        PreparedStatement statement = connection.prepareStatement(sql);
        for (int i = 0; i < qtdValues; i++) {

            if (new Uteis().tryParseInt(values.get(i))) {
                statement.setInt(i + 1, Integer.parseInt(values.get(i)));
            } else {
                statement.setString(i + 1, values.get(i));
            }
        }

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new person was inserted successfully!");
        }
    }

    public void Update(String table, ArrayList<String> columnsAndValues, String where, int qtdValues, java.sql.Connection connection) throws SQLException {
        String updateStr = "";

        for (int i = 0; i < qtdValues; i++) {
            if (i == 0) {
                updateStr = updateStr + columnsAndValues.get(i);
            } else {
                updateStr = updateStr +", " +  columnsAndValues.get(i);
            }
        }

        String sql = "UPDATE " + table + " SET " + updateStr + " WHERE " + where;

        PreparedStatement statement = connection.prepareStatement(sql);        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("table person was updated successfully!");
        }
    }

    public void Delete(String table, String where, java.sql.Connection connection) throws SQLException {
        String sql = "DELETE FROM " + table + " WHERE " + where;
        PreparedStatement statement = connection.prepareStatement(sql);
        //statement.setString(1, "bill");
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("A person was deleted successfully!");
        }
    }

    /**
     *
     * @param table
     * @param connection
     * @return
     * @throws SQLException
     */
//    public ArrayList<String> GetAll(String table, java.sql.Connection connection) throws SQLException {
//        String sql = "SELECT * FROM " + table;
//
//        Statement statement = connection.createStatement();
//        ResultSet result = statement.executeQuery(sql);
//
//        int count = 0;
//
//        while (result.next()) {
//            String name = result.getString(2);
//            String pass = result.getString(3);
//            String fullname = result.getString("fullname");
//            String email = result.getString("email");
//
//            String output = "User #%d: %s - %s - %s - %s";
//            System.out.println(String.format(output, ++count, name, pass, fullname, email));
//        }
//    }
}
