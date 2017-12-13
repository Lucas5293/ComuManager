/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model;

/**
 *
 * @author lucas
 */
class Documento {
    private int id;
    private String nome;
    private String path;
    private boolean publico;
    private int ext_id;
    private String tipo;

    public Documento(int id, String nome, String path, boolean publico, int ext_id, String tipo) {
        this.id = id;
        this.nome = nome;
        this.path = path;
        this.publico = publico;
        this.ext_id = ext_id;
        this.tipo = tipo;
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

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public int getExt_id() {
        return ext_id;
    }

    public void setExt_id(int ext_id) {
        this.ext_id = ext_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

     @Override
    public String toString(){
        return "["+id +","+nome+","+path+","+publico+","+ext_id+","+tipo+"]";
    }
    
    
}
