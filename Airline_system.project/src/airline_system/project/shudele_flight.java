/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_system.project;

public class shudele_flight extends Flight_Dscrpt{
    
private String date;

    public shudele_flight(String from  , String to ,String Arrival , int Capacity,String date) {
       super(from,to,Arrival,Capacity);
       this.date=date;
        
    }

    public void get_sheduledflight_data() {
        
        getFrom_TO_Arriv_Capc_();
        System.out.println("Date of the trip is : "+date );

                

    }

    public void setDate(String date) {
        this.date = date;
    }

   

    }
    
    
    
    

