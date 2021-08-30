/**
 *
 * This is the Class for the Fighter .
 *
 * @ author Utsavkumar Mukeshbhai Patel(000820474)
 * @ author Hetarth Sanjaykumar Barot (000825604)
 *
 *
 */

public class Fighter extends Human {

    /**
     *
     * Constructor to initialize specific ablilities of Fighter
     * @param fName
     * @param fStrength
     * @param fDexterity
     * @param fArmour
     * @param fMoxie
     * @param fCoins
     * @param fHealth
     * @param noFriends
     *
     */

    public Fighter(String fName , int fStrength , int fDexterity, int fArmour , int fMoxie , int fCoins , int fHealth,Elfs noFriends ){

        super(fName,fStrength,fDexterity,fArmour,fMoxie,fCoins,fHealth,noFriends);
    }


    /**
     *
     * Constructor to initialize the name of the Fighter
     * @param fName
     *
     */

    public Fighter(String fName){

        super(fName);

    }

    /**
     *
     * Method to attack other Fighter
     * @param other Humanoids which is attacked by the other Fighter .
     *
     */

    @Override
    public void attackFighter(Humanoids other) {
        if (aLive() && other.aLive()) {


            int damageLoss = ((getHStrength() + getHDexterity() + getHHealth()) /3 ) * 2 ;

            if (other.getHArmour() > 1 ) {

                other.sethHealth(other.getHHealth() - (damageLoss /  other.getHArmour()));

            }
            else {

                other.sethHealth(other.getHHealth() - damageLoss);

            }
        }
    }

    /**
     *
     * String Representation of Fighter
     * @return finalPrint
     *
     */

    public String toString() {
        String finalPrint = " CNAME : FIGHTERS " +super.toString();
        return finalPrint;
    }



}
