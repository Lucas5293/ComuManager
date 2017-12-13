/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.control;

import java.io.IOException;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ControladorDBTest {
        ControladorDB controladorDB;
    
    @Before
    public void setUp() throws IOException{
        controladorDB = ControladorDB.getInstance();
    }
    
    @Test
    public void conectarTest() throws IOException{
        assertNotNull(controladorDB.getDatabase());
    }
    
     @Test
    public void reconectarTest() throws IOException, SQLException{
        controladorDB.restart();
        assertNotNull(controladorDB.getDatabase());
    }
   
}
