/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.control;

import comumanager.model.Database;
import comumanager.model.Model;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class ControladorDB {
    private Model model;
    private static ControladorDB uniqueInstance;
    private static Database database;
    
    private ControladorDB(){
        this.model = Model.getInstance();
    }
     public static ControladorDB getInstance() throws IOException{
            if(uniqueInstance == null){
                uniqueInstance = new ControladorDB();
                uniqueInstance.conectar();
            }
            return uniqueInstance;
    }
     
    public Database getDatabase(){
        return database;
    }
     
    private void conectar() throws IOException {
        Map<String, String> config  = model.confBD.getConf();
        database = new Database(config);
    }
    
    public void restart() throws IOException, SQLException {
        database.close();
        Map<String, String> config  = model.confBD.getConf();
        database = new Database(config);
    }
      
   

}
