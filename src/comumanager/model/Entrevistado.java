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
public class Entrevistado {
    private int id;
    private String nome;
    private float lat;
    private float lon;
    private int comu_id;

    public Entrevistado(int id, String nome, float lat, float lon, int comu_id) {
        this.id = id;
        this.nome = nome;
        this.lat = lat;
        this.lon = lon;
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

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public int getComu_id() {
        return comu_id;
    }

    public void setComu_id(int comu_id) {
        this.comu_id = comu_id;
    }
    
    @Override
    public String toString(){
        return "["+id +","+nome+","+lat+","+lon+","+comu_id+"]";
    }
}
