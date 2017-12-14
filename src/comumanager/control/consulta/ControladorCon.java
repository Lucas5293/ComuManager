/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.control.consulta;

import comumanager.model.objects.Pesquisas;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public interface ControladorCon {
    public Object getAll() ;
    public Object getById(int id) ;
}
