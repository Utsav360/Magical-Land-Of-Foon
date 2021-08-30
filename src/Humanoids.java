/**
 *
 * This is the humanoids class that shows the Magical land of Foon in town of Hogsface with Humanoids.
 *
 * @ author Utsavkumar Mukeshbhai Patel (000820474)
 * @ author Hetarth Sanjaykumar Barot (000825604)
 *
 *
 */


public class Humanoids {

    //instance variables for the Name of humanoids

    private String hName;

    //instance variables for the Strength , Dexterity , Armour , Moxie ,Coins and Health of Humanoids

    private int hStrength , hArmour , hMoxie , hDexterity , hCoins , hHealth ;

    /**
     *
     * This is the Humanoids constructors for the initialization of instance variables
     *
     */

     public Humanoids(String hName , int hStrength ,int hDexterity , int hArmour, int hMoxie , int hCoins , int hHealth){

         // Set the attributes of Humanoids abilities

         this.hName = hName;
         this.hStrength = hStrength;
         this.hArmour = hArmour;
         this.hMoxie = hMoxie;
         this.hDexterity = hDexterity;
         this.hCoins = hCoins;
         this.hHealth = hHealth;
     }

     // Getters

    /**
     *
     * Getters from the Name of the Humanoids
     * @return hName
     *
     */

    public String getHName() {

        return hName;

    }

    /**
     *
     * Getters from the Strength of the Humanoids
     * @return hStrength
     *
     */

    public int getHStrength() {

        return hStrength;

    }

    /**
     *
     * Getters from the Dexterity of the Humanoids
     * @return hDexterity
     *
     */

    public int getHDexterity() {

        return hDexterity;

    }

    /**
     *
     * Getters from the Armour of the Humanoids
     * @return hArmour
     *
     */

    public int getHArmour() {

        return hArmour;

    }

    /**
     *
     * Getters from the Moxie of the Humanoids
     * @return hMoxie
     *
     */

    public int getHMoxie() {

        return hMoxie;

    }

    /**
     *
     * Getters from the Coins of the Humanoids
     * @return hCoins
     *
     */

    public int getHCoins() {

        return hCoins;

    }

    /**
     *
     * Getters from the Health of the Humanoids
     * @return hHealth
     *
     */

    public int getHHealth() {

        return hHealth;

    }

    // Setters

    /**
     *
     * Setters for coins of Humanoids
     * @param hCoins
     *
     */

    public void sethCoins(int hCoins) {

        //Set hCoins
        this.hCoins = hCoins;


    }

    /**
     *
     * Setters for Health of Humanoids
     * @param hHealth
     *
     */

    public void sethHealth(int hHealth) {

        //Set hHealth
        this.hHealth = hHealth;


    }

    // Constructors to initialise the name of Humanoid

    public Humanoids(String hName){

        //Set hName and other instant variable value as 5

         this.hName = hName;
         this.hStrength = 8;
         this.hDexterity = 8 ;
         this.hArmour = 8;
         this.hMoxie = 8 ;
         this.hCoins =  8 ;
         this.hHealth =  8;

    }

    /**
     *
     * Method for Increment the strength of Humanoids by 1
     *
     */


    public void incrementhStrength(){

        if (hStrength +1 < 0){

            System.out.printf(" The Strength Of Humanoids Must be Between 0 and 20 ");

        }

        else{


            hStrength = hStrength + 1;

        }
    }

    /**
     *
     * Method for Increment the Dexterity of Humanoids by 1
     *
     */


    public void incrementhDexterity(){

        if (hDexterity +1 > 0){


            System.out.printf(" The Dexterity of Humanoids must be between 0 and 20 ");


        }

        else{


            hDexterity++;


        }

    }

    /**
     *
     *
     * Method for Increment the Armour of Humanoids by 1
     *
     *
     */


    public void incrementhArmour(){

        if (hArmour +1 > 0){

            System.out.printf(" The Armour of Humanoids must be between 0 and 20 ");

        }
        else{

            hArmour = hArmour + 1;

        }

    }

    /**
     *
     *
     * Method for Increment the Moxie of Humanoids by 1
     *
     *
     */

    public void incrementhMoxie(){

        if (hMoxie +1 > 0){

            System.out.printf(" The Moxie of Humanoids must be between 0 and 20 ");

        }

        else{

            hMoxie++ ;

        }

    }




    /**
     *
     *
     * Method for Decrement the strength of Humanoids by 1
     *
     *
     */

    public void decrementhStrength(){

        if (hStrength  -1 < 0){

            System.out.printf(" The Strength Of Humanoids Must be Between 0 and 20 ");

        }

        else{

            hStrength--;

        }

    }


    /**
     *
     *
     * Method for Decrement the Dexterity of Humanoids by 1
     *
     *
     */

    public void decrementhDexterity(){

        if (hDexterity -1 > 0){

            System.out.printf(" The Dexterity of Humanoids must be between 0 and 20 ");

        }

        else{

            hDexterity = hDexterity -1;

        }

    }

    /**
     *
     *
     * Method for Decrement the Armour of Humanoids by 1
     *
     *
     */

    public void decrementhArmour(){

        if (hArmour -1 > 0){

            System.out.printf(" The Armour of Humanoids must be between 0 and 20 ");

        }

        else{

            hArmour--;

        }

    }

    /**
     *
     *
     * Method for Decrement the Moxie of Humanoids by 1
     *
     *
     */

    public void decrementhMoxie(){

        if (hMoxie -1 > 0){

            System.out.printf(" The Moxie of Humanoids must be between 0 and 20 ");

        }

        else{

            hMoxie = hMoxie - 1;

        }

    }


    /**
     *
     * Check the life Status of Humanoids
     * @return hHealth
     *
     *
     */

    public boolean aLive(){

        return  hHealth > 0;

    }

    /**
     *
     * This is the method for attack the other Humanoids
     * @param other Humanoids which is attacked by the other one.
     *
     */

    public void attackFighter(Humanoids other){

        if (aLive() && other.aLive()){

            int damageLoss = (hStrength + hDexterity + hHealth+ hMoxie) / 4 ;

            if (other.hArmour > 1 ){

                other.hHealth = other.hHealth - (damageLoss /other.hArmour);

            }
            else{

                other.hHealth = other.hHealth - damageLoss;

            }
        }
        else{

            System.out.println(" This humanoid is Not alive it is dead !! ");
        }
    }

    /**
     *
     * Return String Representation of Humanoids
     * @return finalPrint
     *
     */

    @Override
    public String toString() {

        String finalPrint;
        finalPrint=  " CNAME : " + hName ;
        finalPrint =  finalPrint + (aLive() ? " LIVE " : " DEAD ");
        return finalPrint = finalPrint + " COINS :  " + hCoins +
                            " STRENGTH : " + hStrength +
                            " DEXTERITY : "  + hDexterity +
                            " HEALTH : " + hHealth +
                            " MOXIE : " + hMoxie ;

    }
}
