/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model.objects;

/**
 *
 * @author lucas
 */
public class Questionario {
    private int id;
    private String nome;
    private int pesq_id;
    private boolean publico;

    public Questionario(int id, String nome, int pesq_id, boolean publico) {
        this.id = id;
        this.nome = nome;
        this.pesq_id = pesq_id;
        this.publico = publico;
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

    public int getPesq_id() {
        return pesq_id;
    }

    public void setPesq_id(int pesq_id) {
        this.pesq_id = pesq_id;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }
    
    @Override
    public String toString(){
        return "["+id +","+nome+","+pesq_id+","+publico+"]";
    }
    
}
