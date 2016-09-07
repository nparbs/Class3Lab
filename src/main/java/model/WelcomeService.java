/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Nick
 */
public class WelcomeService {
    


   
    private String getTimeOfDay(){
        Calendar cal = Calendar.getInstance();
        String morning = "Morning";
        String afternoon = "Afteroon";
        String evening = "Evening";
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        
        if (hour<12){
            return morning;
        } else if (hour>12 && hour<17){
            return afternoon;
        } else {
            return evening;
        }
    }
    
    public String welcome(String name){
        return "Good " + getTimeOfDay() + ", " + name + ". Welcome!";
    }
    
    
    
}
