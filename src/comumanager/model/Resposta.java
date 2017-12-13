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
class Resposta {
    private int id;
    private int perg_id;
    private boolean resp_boleano;
    private int resp_numerica;
    private String resp_descritiva;
    private int comu_id;
    private int entre_id;

    public Resposta(int id, int perg_id, boolean resp_boleano, int resp_numerica, String resp_descritiva, int comu_id, int entre_id) {
        this.id = id;
        this.perg_id = perg_id;
        this.resp_boleano = resp_boleano;
        this.resp_numerica = resp_numerica;
        this.resp_descritiva = resp_descritiva;
        this.comu_id = comu_id;
        this.entre_id = entre_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerg_id() {
        return perg_id;
    }

    public void setPerg_id(int perg_id) {
        this.perg_id = perg_id;
    }

    public boolean isResp_boleano() {
        return resp_boleano;
    }

    public void setResp_boleano(boolean resp_boleano) {
        this.resp_boleano = resp_boleano;
    }

    public int getResp_numerica() {
        return resp_numerica;
    }

    public void setResp_numerica(int resp_numerica) {
        this.resp_numerica = resp_numerica;
    }

    public String getResp_descritiva() {
        return resp_descritiva;
    }

    public void setResp_descritiva(String resp_descritiva) {
        this.resp_descritiva = resp_descritiva;
    }

    public int getComu_id() {
        return comu_id;
    }

    public void setComu_id(int comu_id) {
        this.comu_id = comu_id;
    }

    public int getEntre_id() {
        return entre_id;
    }

    public void setEntre_id(int entre_id) {
        this.entre_id = entre_id;
    }
    
     @Override
    public String toString(){
        return "["+id +","+perg_id+","+resp_boleano+","+resp_numerica+","+resp_descritiva+","+comu_id+","+entre_id+"]";
    }
}
