/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager;

import comumanager.model.Database;
import comumanager.model.Model;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class ControladorDatabase {
    public Model model;
    
    public ControladorDatabase(){
        this.model = Model.getInstance();
    }
    public Database conectar() throws IOException{
       Map<String, String> config  = model.confBD.getConf();
       return new Database(config);
    }
}
