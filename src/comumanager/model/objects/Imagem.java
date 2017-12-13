/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model.objects;

import java.sql.Date;

/**
 *
 * @author lucas
 */
public class Imagem {
    private int id;
    private String nome;
    private String path;
    private Date data;
    private boolean publico;
    private int comu_id;

    public Imagem(int id, String nome, String path, Date data, boolean publico, int comu_id) {
        this.id = id;
        this.nome = nome;
        this.path = path;
        this.data = data;
        this.publico = publico;
        this.comu_id = comu_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public int getComu_id() {
        return comu_id;
    }

    public void setComu_id(int comu_id) {
        this.comu_id = comu_id;
    }
    
     @Override
    public String toString(){
        return "["+id +","+nome+","+path+","+data+","+publico+","+comu_id+"]";
    }
}
