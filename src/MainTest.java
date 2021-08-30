/**
 *
 *
 * This is the Assignment -6 program which is based on the inheritance,
 * Association , overriding and  constructors.
 * This Program was created on 28th july 2020.
 *
 *
 * @ quthor Utsavkumar Mukeshbhai Patel (000820474)
 * @ author Hetarth Sanjaykumar Barot (000825604)
 *
 *
 */

// This is the MainTest class

public class MainTest {

    /**
     *
     * This is the main method Class
     * @param args
     *
     */

    public static void main(String[] args) {

       //Display the Group Member names
       System.out.println(" This Group Assignment is Prepared by Utsavkumar Mukeshbhai Patel (000820474) & Hetarth Sanjaykumar Barot (000825604)\n ");

       // Display the Life status of Humanoids
       System.out.println(" HUMANOIDS IS NOT DEAD !");

       // 2 Hobbits objects
       Hobbits h1 = new Hobbits(" H0BBIT 1 ");
       Hobbits h2 = new Hobbits(" H0BBIT 2 " ,20,20,20,20,20,20);

       // 2 Elfs objects
       Elfs e1 = new Elfs(" ELVES 1 ");
       Elfs e2 = new Elfs( " ELVES 2 " ,20,20,20,20,20,20,h1,ElfOfClan.City);

       // 2 Fighter objects
       Fighter f1 = new Fighter(" FIGHTER 1 ");
       Fighter f2 = new Fighter(" FIGHTER 2 " ,20,20,20,20,20,20,e2);

       //2 Wizard Objects
       Wizard w1 = new Wizard(" WIZARD 1 ");
       Wizard w2 = new Wizard( " WIZARD 2 " ,20,20,20,20,20,20,e1,20);

       // hobbit1 theftMoney of fighter 2
       h1.theftMoney(f2);

       // hobbit2 theftMoney of Wizard 1
       h2.theftMoney(w1);

       // Fighter1 attack Wizard 1
       f1.attackFighter(w1);

       // Fighter2 attack Elfs 1
       f2.attackFighter(e2);

       // Fighter2 attack Fighter1
       f2.attackFighter(f1);

       // Fighter2 attack Fighter 1
       f2.attackFighter(f1);

       //Wizard1 Spell healing power to be alive
       w1.healingSpell();

       //Wizard2 attack Elfs 1
       w2.attackFighter(e1);

       //Display the Hobbits , Elfs , Wizards with their current state and characteristics
       System.out.println(h1);
       System.out.println(h2);
       System.out.println(e1);
       System.out.println(e2);
       System.out.println(f1);
       System.out.println(f2);
       System.out.println(w1);
       System.out.println(w2);


    }
}
