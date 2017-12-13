/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

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
            gravarArq.println(info.get("pass"));
            
            arq.close();
        }
    }
    
    public Map<String, String> getConf() throws FileNotFoundException, IOException{
        Map<String, String> retorno = new HashMap<>();
        String texto;
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
        return retorno;
    }
}
