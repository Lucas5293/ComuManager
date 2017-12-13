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
public class Comunidade {
    private int id;
    private String nome;
    private Float lat;
    private Float lon;

    public Comunidade(int id, String nome, Float lat, Float lon) {
        this.id = id;
        this.nome = nome;
        this.lat = lat;
        this.lon = lon;
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

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }
    
    @Override
    public String toString(){
        return "["+id +","+nome+","+lat+","+lon+"]";
    }
    
    
}
