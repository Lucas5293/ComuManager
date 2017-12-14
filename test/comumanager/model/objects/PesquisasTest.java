/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model.objects;


import comumanager.Principal;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class PesquisasTest {
    
    public Pesquisas pesquisas;
    
    @Before
    public void setUp() {
        ArrayList<Pesquisa> pesqs = new ArrayList<>();
        pesqs.add(new Pesquisa(1,"teste",new Date(), new Date(),"",true));
        pesqs.add(new Pesquisa(1,"teste2",new Date(), new Date(),"",true));
        
        pesquisas = new Pesquisas(pesqs);
    }
    
    @Test
    public void toObjectTest(){
        assertNotNull(pesquisas.toObjects());
        Principal.print(pesquisas.getPesqs());
    }
    
}
