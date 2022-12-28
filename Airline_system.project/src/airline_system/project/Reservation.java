/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_system.project;

public class Reservation  {


    
    
    public Reservation(Passenger psgr ,shudele_flight shdle ,String datemade){
        System.out.println("Reservation information : " );
       
        System.out.println("Passenger Number : "+psgr.getNumber());
        System.out.println("Passenger : "+psgr.getName());
        System.out.println("Passenger address: "+psgr.getName());

        System.out.println("Sheduled Flight : " );
          shdle.get_sheduledflight_data();

        
        System.out.println("Date of reservation : " +datemade);
    }
    
}

