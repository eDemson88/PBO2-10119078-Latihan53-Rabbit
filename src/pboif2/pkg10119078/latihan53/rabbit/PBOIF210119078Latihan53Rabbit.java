/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan53.rabbit;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit r = new Rabbit("Peter", false,"Grass",4,"grey");
        
        System.out.println("Hello, His name is " +r.getName()+"\n" 
                + r.getName()+ " is Vegetarian? " + r.isVegetarian() +"\n"
                + r.getName()+ " eats " + r.getEats() + "\n"
                + r.getName()+ " has " + r.getNoOfLegs() + " legs\n"
                + r.getName()+ " color is " + r.getColor());
    }
    
}
