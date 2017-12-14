/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.model;

import comumanager.view.Observer;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Model {
    
    private static Model uniqueInstance;
    
    public ConfBD confBD;
    private ArrayList<Observer> observers;    
	
    private Model(){
        confBD = new ConfBD();
        observers = new ArrayList<>();
    }
	
    public static Model getInstance(){
            if(uniqueInstance == null){
                uniqueInstance = new Model();
            }
            return uniqueInstance;
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
	
    public void notifyObservers(Object object){
	for(Observer observer:observers){
            observer.update(object);
	}
    }
	
}
