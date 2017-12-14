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
public class Questionarios {
      private ArrayList<Questionario> quests;

    public Questionarios(ArrayList<Questionario> quests) {
        this.quests = quests;
    }
    
    public ArrayList<Object[]> toObjects(){
        ArrayList<Object []> retorno = new ArrayList<>();
        for(Questionario q : quests){
            retorno.add(new Object[]{
               q.getId(),
               q.getNome(),
               q.getPesq_id(),
               q.isPublico()                
            });
        }
        return retorno;
    }

    public ArrayList<Questionario> getPesqs() {
        return quests;
    }

    public void setPesqs(ArrayList<Questionario> quests) {
        this.quests = quests;
    }
    
    @Override
    public String toString(){
        String retorno = "{\n";
        for (Questionario q: quests){
            retorno+="["+q.getId() +","+q.getNome()+","+q.getPesq_id()+","+q.isPublico()+"]\n";        
        }
       return retorno+"}";
    }
}
