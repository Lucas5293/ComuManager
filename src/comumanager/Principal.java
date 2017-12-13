/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager;

import comumanager.model.Model;
import comumanager.view.ViewPrincipal;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Model model = Model.getInstance();
        
        new ViewPrincipal(model).setVisible(true);
    }
    public static void print(ArrayList k){
        for (Object a: k)
            System.out.println(a.toString());
    }
    
}
