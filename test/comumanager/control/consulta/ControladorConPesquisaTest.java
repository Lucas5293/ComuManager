/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.control.consulta;

import comumanager.Principal;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ControladorConPesquisaTest {
    
    ControladorConPesquisa controladorConPesquisa;
    
    @Before
    public void setUp() throws IOException {
        controladorConPesquisa = new ControladorConPesquisa();
    }
    
    @Test
    public void getAllTest(){
        assertNotNull(controladorConPesquisa.getAll());
        //Principal.print(controladorConPesquisa.getAll().getPesqs());
    }
    
    @Test
    public void getByIdest(){
        assertNotNull(controladorConPesquisa.getById(1));
    }
    
}
