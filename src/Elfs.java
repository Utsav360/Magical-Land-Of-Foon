/**
 *
 * This is the Class for the Elves or Elfs .
 *
 * @ author Utsavkumar Mukeshbhai Patel(000820474)
 * @ author Hetarth Sanjaykumar Barot (000825604)
 *
 */

public class Elfs extends Humanoids {

    // Represent ElfOfClan as clan and friends of Hobbits

    private ElfOfClan clan;

    private Hobbits friends;


    /**
     *
     * Constructor to Initialise all Member Variables
     * @param eName
     * @param eStrength
     * @param eDexterity
     * @param eArmour
     * @param eMoxie
     * @param eCoins
     * @param eHealth
     * @param friends
     * @param clan
     *
     */


    public Elfs(String eName , int eStrength , int eDexterity, int eArmour , int eMoxie , int eCoins , int eHealth, Hobbits friends ,ElfOfClan clan ){

        super(eName,eStrength,eDexterity,eArmour,eMoxie,eCoins,eHealth);
        this.clan =clan;
        this.friends = friends;
    }

    /**
     *
     * Constructor to Initialize Name of Elfs
     * @param eName of the Elfs
     *
     */

    public Elfs (String eName){
        super(eName);
    }

    //Getters

    /**
     *
     * Getters for friend of hobbits
     * @return friends
     *
     */

    public Hobbits getFriends() {

        return friends;

    }

    /**
     *
     * Getters for clan of Elfs
     * @return clan value
     *
     */

    public ElfOfClan getClan() {

        return clan;

    }

    //Setters

    /**
     *
     * Setters for the friend of Hobbits
     * @param friends
     *
     */


    public void setFriends(Hobbits friends) {

        this.friends = friends;

    }

    /**
     *
     * String Representation of Elfs
     * @return finalPrint
     *
     */

    public String toString(){

        String finalPrint;
        return finalPrint= " CNAME : ELVES " +super.toString();

    }
}
