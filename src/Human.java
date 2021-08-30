/**
 * This is the Class for the Human
 *
 * @ author Utsavkumar Mukeshbhai Patel(000820474)
 * @ author Hetarth Sanjaykumar Barot (000825604)
 *
 */

public class Human extends Humanoids {

    // Ultimately Represent Life time Enemy
    private Elfs notFriends;

    /**
     *
     * Constructor to display the specific characteristics of Human
     *
     * @param huName
     * @param huStrength
     * @param huDexterity
     * @param huArmour
     * @param huMoxie
     * @param huCoins
     * @param huHealth
     * @param notFriends
     *
     */

    public Human(String huName , int huStrength , int huDexterity, int huArmour , int huMoxie , int huCoins , int huHealth, Elfs notFriends ){

        super(huName,huStrength,huDexterity,huArmour,huMoxie,huCoins,huHealth);
        this.notFriends = notFriends;
    }

    //Getters

    /**
     *
     * Getters for notFriends Elves
     * @return notFriends
     *
     */
    public Elfs getNotFriends() {
        return notFriends;
    }

    /**
     *
     * Constructor to initialise name of the Human
     * @param huName of the Human
     *
     */

    public Human(String huName){
        super(huName);
    }

    /**
     *
     * String Representation of Human Specific Characteristics
     * @return finalPrint
     *
     */

    public String toString(){
        String finalPrint;
        return finalPrint = " CNAME : HUMANS " + super.toString();

    }

}
