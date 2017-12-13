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
public class Raster {
    private int id;
    private String path;
    private Date data;
    private int pesq_id;

    public Raster(int id, String path, Date data, int pesq_id) {
        this.id = id;
        this.path = path;
        this.data = data;
        this.pesq_id = pesq_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPesq_id() {
        return pesq_id;
    }

    public void setPesq_id(int pesq_id) {
        this.pesq_id = pesq_id;
    }
    
    @Override
    public String toString(){
        return "["+id +","+path+","+data+","+pesq_id+"]";
    }
    
    
    
}
