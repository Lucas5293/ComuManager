/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model;

import comumanager.control.ControladorDB;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class ConfBD {
    public void storeConf(Map<String, String> info) throws IOException{
        try (FileWriter arq = new FileWriter("conf.cfg")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.println(info.get("host"));
            gravarArq.println(info.get("port"));
            gravarArq.println(info.get("db"));
            gravarArq.println(info.get("user"));
            gravarArq.print(info.get("pass"));
            
            arq.close();
        }
        try {
            ControladorDB.getInstance().restart();
        } catch (SQLException ex) {
            Logger.getLogger(ConfBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Map<String, String> getConf() throws IOException{
        Map<String, String> retorno = new HashMap<>();
        String texto;
        try{
            FileReader fileR = new FileReader ("conf.cfg");
            BufferedReader buffR = new BufferedReader (fileR);
            int cont = 0;
            while ((texto = buffR.readLine ()) != null){
                String key="";
                switch(cont){
                    case 0: {key = "host"; break;}
                    case 1: {key = "port"; break;}
                    case 2: {key = "db"; break;}
                    case 3: {key = "user"; break;}
                    case 4: {key = "pass"; break;}
                }
                retorno.put(key, texto);
                cont++;
            }
        }
        catch(Exception e){
            try (FileWriter arq = new FileWriter("conf.cfg")) {
                PrintWriter gravarArq = new PrintWriter(arq);
                arq.close();
                
                retorno.put("host","");
                retorno.put("port","");
                retorno.put("db","");
                retorno.put("user","");
                retorno.put("pass","");                
            }
        }
        return retorno;
    }
}
