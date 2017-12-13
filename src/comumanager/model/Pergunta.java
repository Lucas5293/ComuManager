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
public class Pergunta {
    private int id;
    private String descricao;
    private String tipo;
    private int quest_id;

    public Pergunta(int id, String descricao, String tipo, int ques_id) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.quest_id = ques_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQues_id() {
        return quest_id;
    }

    public void setQues_id(int ques_id) {
        this.quest_id = ques_id;
    }
    
    @Override
    public String toString(){
        return "["+id +","+descricao+","+tipo+","+quest_id+"]";
    }
}
