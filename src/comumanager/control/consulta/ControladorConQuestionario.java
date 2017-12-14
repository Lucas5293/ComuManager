/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.control.consulta;

import comumanager.control.ControladorDB;
import comumanager.model.Database;
import comumanager.model.objects.Pesquisas;
import comumanager.model.objects.Questionarios;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class ControladorConQuestionario implements ControladorCon {
    public Database database;
    
    public ControladorConQuestionario() throws IOException{
        this.database = ControladorDB.getInstance().getDatabase();
    }
    
    @Override
    public Questionarios getAll(){
        try {
            return new Questionarios(database.selectQuestionario("select * from questionario;"));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Questionarios getById(int id) {
        try {
            return new Questionarios(database.selectQuestionario("select * from questionario where quest_id="+id+";"));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
