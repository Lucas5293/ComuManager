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
public class Model {
    public ConfBD confBD;
    
    private static Model uniqueInstance;
	
    private Model(){
        confBD = new ConfBD();
    }
	
    public static Model getInstance(){
            if(uniqueInstance == null){
                uniqueInstance = new Model();
            }
            return uniqueInstance;
    }
	
}
