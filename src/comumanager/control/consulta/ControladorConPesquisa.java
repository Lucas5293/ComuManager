/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.control.consulta;

import comumanager.control.ControladorDB;
import comumanager.model.Database;
import comumanager.model.objects.Pesquisas;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class ControladorConPesquisa implements ControladorCon{

    public Database database;
    
    public ControladorConPesquisa() throws IOException{
        this.database = ControladorDB.getInstance().getDatabase();
    }
    
    @Override
    public Pesquisas getAll(){
        try {
            return new Pesquisas(database.selectPesquisa("select * from pesquisacampo;"));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Pesquisas getById(int id) {
        try {
            return new Pesquisas(database.selectPesquisa("select * from pesquisacampo where pesq_id="+id+";"));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
