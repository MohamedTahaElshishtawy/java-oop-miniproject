/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_system.project;

 class Flight_Dscrpt {

    //public Flight_Dscrpt() {}

    String from = "";
    String to = "";
    String Arrival = "";
    int Capacity = 0;

    public Flight_Dscrpt(String from, String to, String Arrival, int Capacity) {
        this.Arrival = Arrival;
        this.from = from;
        this.to = to;
        this.Capacity = Capacity;

    }

    public void getFrom_TO_Arriv_Capc_() {
        System.out.println("the flight is from : " + from + " to : " + to);
        System.out.println("the flight arrive at : " + Arrival);
        System.out.println("The flight Capacity is : " + Capacity);
    }

}
