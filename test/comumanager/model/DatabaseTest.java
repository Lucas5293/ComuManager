/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model;


import comumanager.Principal;
import comumanager.control.ControladorDB;
import java.io.IOException;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class DatabaseTest {
    
    private Database database;
    @Before
    public void setUp() throws IOException{
        database = ControladorDB.getInstance().getDatabase();
    }
    
    @Test
    public void selectPesqTest() throws SQLException{
        assertNotNull(database.selectPesquisa("select * from pesquisacampo"));
        //Principal.print(database.selectPesquisa("select * from pesquisacampo"));
    }
    
    @Test
    public void selectQuestTest() throws SQLException{
        assertNotNull(database.selectQuestionario("select * from questionario"));
        //Principal.print(database.selectQuestionario("select * from questionario"));
    }
    
    @Test
    public void selectComuTest() throws SQLException{
        assertNotNull(database.selectComunidade("select comu_id, comu_nome, ST_X(comu_localizacao), ST_Y(comu_localizacao) from comunidade"));
        //Principal.print(database.selectComunidade("select comu_id, comu_nome, ST_X(comu_localizacao), ST_Y(comu_localizacao) from comunidade"));
    }
    
    @Test
    public void selectEntrevistadoTest() throws SQLException{
        assertNotNull(database.selecEntrevistado("select entre_id, entre_nome, ST_X(entre_localizacao), ST_Y(entre_localizacao), comu_id from entrevistado"));
        //Principal.print(database.selectComunidade("select entre_id, entre_nome, ST_X(entre_localizacao), ST_Y(entre_localizacao), comu_id from entrevistado"));
    }
    
    @Test
    public void selectPerguntaTest() throws SQLException{
        assertNotNull(database.selectPergunta("select * from pergunta"));
        //Principal.print(database.selectPergunta("select * from pergunta"));
    }
    
    @Test
    public void selectRespostaTest() throws SQLException{
        assertNotNull(database.selectResposta("select * from resposta"));
        //Principal.print(database.selectResposta("select * from resposta"));
    }
    
    @Test
    public void selectImagemTest() throws SQLException{
        assertNotNull(database.selectImagem("select * from imagens"));
        //Principal.print(database.selectImagem("select * from imagens"));
    }
    
    @Test
    public void selectDocumentoTest() throws SQLException{
        assertNotNull(database.selectDocumento("select * from documentospesquisa"));
        Principal.print(database.selectDocumento("select * from documentospesquisa"));
    }
    
       @Test
    public void selectRasterTest() throws SQLException{
        assertNotNull(database.selectRaster("select * from pesquisaraster"));
        Principal.print(database.selectRaster("select * from pesquisaraster"));
    }
   
   
}
