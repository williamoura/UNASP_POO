/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemysql;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author william.moura
 */
public class Mapping {

    public void mappingExecute(String name, java.sql.Connection connection) {
        
        if ("".equals(name)) {
            name = "Pessoa";
        }
        
        java.util.Map map;

        try {
            
            map = connection.getTypeMap();
            map.put("aulatestedb." + name, name);
            connection.setTypeMap(map);
            
        } catch (SQLException ex) {
            Logger.getLogger(Mapping.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
