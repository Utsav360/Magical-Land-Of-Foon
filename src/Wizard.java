/**
 *
 * This is the Class for the Wizard .
 *
 * @ author Utsavkumar Mukeshbhai Patel(000820474)
 * @ author Hetarth Sanjaykumar Barot (000825604)
 *
 *
 */

public class Wizard  extends Human {

    // Represent the magic power of Wizard

    private  int wmagicRatings;

    /**
     *
     * Constructor to initialize the Member variable of Wizard
     * @param wName
     * @param wStrength
     * @param wDexterity
     * @param wArmour
     * @param wMoxie
     * @param wCoins
     * @param wHealth
     * @param noFriends
     * @param wmagicRatings
     *
     */

    public Wizard(String wName, int wStrength, int wDexterity, int wArmour, int wMoxie, int wCoins, int wHealth, Elfs noFriends, int wmagicRatings) {
        super(wName, wStrength, wDexterity, wArmour, wMoxie, wCoins, wHealth, noFriends);
        this.setWmagicRatings(wmagicRatings);
    }

    /**
     *
     * Constructor to represent the name of Wizard and magic Ratings
     * @param wName
     *
     */

    public Wizard(String wName){

        super(wName);
        this.wmagicRatings = 10;

    }

    /**
     *
     * Getters for represent MagicRatings of Wizard
     * @return wmagicRatings
     *
     */

    public int getWmagicRatings(){

        return wmagicRatings;

    }

    /**
     *
     * Setters for set the MagicRatings of Wizard
     * @param wmagicRatings
     *
     *
     */

    public void setWmagicRatings(int wmagicRatings){

        if  (wmagicRatings >  0 && wmagicRatings <= 20) {

            this.wmagicRatings = wmagicRatings;
        }

        else {

            System.out.println(" Wizard MagicRatings Must be between 0 and 20 ");

        }
    }

    /**
     *  Method of healingSpell to boost helth if wizard is alive which is check by health ratings
     */

    public void healingSpell (){

         if (aLive() && getHHealth() > 0 && getHHealth() <= 20 && getHDexterity() <=20 && getHStrength() <=20 && getHArmour() <=20){

             int boostRatings = wmagicRatings / 2 ;

             sethHealth(getHHealth() + boostRatings);

             wmagicRatings = wmagicRatings - 3 ;

         }

         else {

             //Display message that you don't have enough magic spell.
             System.out.println(" You don't have enough Magic for HealingSpell ");

         }

    }

    /**
     * String Representation of Wizard
     * @return finalPrint
     */

    public String toString(){
        String finalPrint ;
        return finalPrint= " CNAME : WIZARD " +super.toString();
    }



}
