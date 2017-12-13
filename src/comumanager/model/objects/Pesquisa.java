/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model.objects;

import java.util.Date;

/**
 *
 * @author lucas
 */
public class Pesquisa {
    private int id;
    private String nome;
    private Date data_inicio;
    private Date data_fim;
    private String descricao;
    private boolean publico;

    public Pesquisa(int id, String nome, Date data_inicio, Date data_fim, String descricao, boolean publico) {
        this.id = id;
        this.nome = nome;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.descricao = descricao;
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

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }
    
    @Override
    public String toString(){
        return "["+id +","+nome+","+data_inicio+","+data_fim+","+descricao+","+publico+"]";
    }
    
    
    
}
