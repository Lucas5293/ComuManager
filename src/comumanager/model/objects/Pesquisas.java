/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model.objects;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Pesquisas {
    
    private ArrayList<Pesquisa> pesqs;

    public Pesquisas(ArrayList<Pesquisa> pesqs) {
        this.pesqs = pesqs;
    }
    
    public ArrayList<Object[]> toObjects(){
        ArrayList<Object []> retorno = new ArrayList<>();
        for(Pesquisa p: pesqs){
            retorno.add(new Object[]{
               p.getId(),
               p.getNome(),
               p.getData_inicio(),
               p.getData_fim(),
               p.getDescricao(),
               p.isPublico()                
            });
        }
        return retorno;
    }

    public ArrayList<Pesquisa> getPesqs() {
        return pesqs;
    }

    public void setPesqs(ArrayList<Pesquisa> pesqs) {
        this.pesqs = pesqs;
    }
    
    @Override
    public String toString(){
        String retorno = "{\n";
        for (Pesquisa p: pesqs){
            retorno+="["+p.getId() +","+p.getNome()+","+p.getData_inicio()+","+p.getData_fim()+","+p.getDescricao()+","+p.isPublico()+"]\n";        
        }
       return retorno+"}";
    }
    
        
}
