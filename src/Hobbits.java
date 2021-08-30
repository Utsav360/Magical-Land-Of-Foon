/**
 * This is the Class for the Hobbits.
 *
 * @ author Utsavkumar Mukeshbhai Patel(000820474)
 * @ author Hetarth Sanjaykumar Barot (000825604)
 *
 */

public class Hobbits extends  Humanoids {

    /**
     *
     * Constructor to initialize all specific Characteristics of Hobbits
     * @param hoName
     * @param hoStrength
     * @param hoDexterity
     * @param hoArmour
     * @param hoMoxie
     * @param hoCoins
     * @param hoHealth
     *
     */


    public Hobbits(String hoName , int hoStrength , int hoDexterity, int hoArmour , int hoMoxie , int hoCoins , int hoHealth ){

        super(hoName,hoStrength,hoDexterity,hoArmour,hoMoxie,hoCoins,hoHealth);
    }

    /**
     *
     * Constructor to display the name of the hobbits
     * @param hoName of the Hobbits
     *
     */

     public Hobbits(String hoName){

        super(hoName);

     }

    /**
     *
     * This is the method to rob the money from other Humanoids.
     * @param other Humanoids whom money was robbed by the Hobbits.
     *
     */

     public void theftMoney(Humanoids other){
         if(aLive()) {

             int wins = getHDexterity() / 2 ;

             if(other.getHCoins() > wins) {
                 other.sethCoins(other.getHCoins() -wins);
                 sethCoins(getHCoins() + wins);
             }

             else {

                 other.sethCoins(0);
                 sethCoins(getHCoins() + other.getHCoins());
             }
         }
     }


    /**
     *
     * String Representation of Hobbits
     * @return finalPrint
     *
     */

     public String  toString(){
          String finalPrint ;
          return finalPrint = " CNAME : H0BBITS " +super.toString();

     }


}
