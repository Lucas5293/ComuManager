/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model;

import comumanager.model.objects.Documento;
import comumanager.model.objects.Comunidade;
import comumanager.model.objects.Entrevistado;
import comumanager.model.objects.Pesquisa;
import comumanager.model.objects.Imagem;
import comumanager.model.objects.Pergunta;
import comumanager.model.objects.Questionario;
import comumanager.model.objects.Raster;
import comumanager.model.objects.Resposta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class Database {
    
    private Connection c;
    private Statement stmt;

    public Database(Map<String, String> bd){
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(
            String.format("jdbc:postgresql://%s:%s/%s",bd.get("host"),bd.get("port"),bd.get("db")),
            bd.get("user"), bd.get("pass"));
            c.setAutoCommit(false) ;

        } catch (ClassNotFoundException | SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        
    }
    public void close() throws SQLException{
        c.close();
    }
    public ArrayList<Pesquisa> selectPesquisa(String query) throws SQLException {
        ArrayList<Pesquisa> pesquisas = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            pesquisas.add(
                    new Pesquisa(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getDate(4), rs.getString(5), rs.getBoolean(6))
            );
        }
        stmt.close();
        return pesquisas;
    }

    public ArrayList<Questionario> selectQuestionario(String query) throws SQLException {
        ArrayList<Questionario> questionarios = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            questionarios.add(
                    new Questionario(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getBoolean(4))
            );
        }
        stmt.close();
        return questionarios;
    }

    public ArrayList<Comunidade> selectComunidade(String query) throws SQLException {
        ArrayList<Comunidade> comunidades = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            comunidades.add(
                    new Comunidade(rs.getInt(1),rs.getString(2),rs.getFloat(3), rs.getFloat(4))
            );
        }
        stmt.close();
        return comunidades;
    }

    public ArrayList<Entrevistado> selecEntrevistado(String query) throws SQLException {
        ArrayList<Entrevistado> entrevistados = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            entrevistados.add(
                    new Entrevistado(rs.getInt(1),rs.getString(2),rs.getFloat(3), rs.getFloat(4),rs.getInt(5))
            );
        }
        stmt.close();
        return entrevistados;
    }

    public ArrayList<Pergunta> selectPergunta(String query) throws SQLException {
        ArrayList<Pergunta> perguntas = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            perguntas.add(
                    new Pergunta(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4))
            );
        }
        stmt.close();
        return perguntas;
    }

    public ArrayList<Resposta> selectResposta(String query) throws SQLException {
        ArrayList<Resposta> respostas = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            respostas.add(
                    new Resposta(rs.getInt(1),rs.getInt(2),rs.getBoolean(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getInt(7))
            );
        }
        stmt.close();
        return respostas;
    }

    public ArrayList<Imagem> selectImagem(String query) throws SQLException {
        ArrayList<Imagem> imagens = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            imagens.add(
                    new Imagem(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getBoolean(5), rs.getInt(6))
            );
        }
        stmt.close();
        return imagens;
    }

    public ArrayList<Documento> selectDocumento(String query) throws SQLException {
        ArrayList<Documento> documentos = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            documentos.add(
                    new Documento(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBoolean(4),rs.getInt(5), "pesq")
            );
        }
        stmt.close();
        return documentos;
    }

    public ArrayList<Raster> selectRaster(String query) throws SQLException {
        ArrayList<Raster> rasters = new ArrayList<>();
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(query) ;
        while ( rs.next() ) {
            rasters.add(
                    new Raster(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4))
            );
        }
        stmt.close();
        return rasters;
    }
    
}
