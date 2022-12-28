/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_system.project;

public class Passenger extends person {

   
   private int number= 0;
 
  
    public Passenger(String name,String address,int number)  {
        super(name,address);
        this.number=number;
  }

    public int getNumber() {
        return number;
    }
}