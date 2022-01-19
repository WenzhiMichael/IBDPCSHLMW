import java.util.Scanner;
import java.util.Random;

public class adventuregame {
    public static void main(String[] args) {

        // system objects
        Scanner in = new Scanner(System.in); // in for input. Based a system to help us to put users input.
        Random rand = new Random(); // Random number generator

        //Game variables
        String[] enemies = {"Ghast", "Zombie", "Slime", "Skeleton", "Enderman",}; // Set enemy variables
        int maxEnemyHealth = 75;  // set max enemy health
        int maxEnemyAttackDamage = 20;  // set max enemy attack damage

        //Player vaiables
        int PlayerHealth = 200;  // set max player health
        int maxPlayerAttackDamage = 50;  // set max player attack damage
        int healthyPotions = 1;  // set starting game of amount of healthyPotions give to the players
        int healthPotionHeal = 50; // set amount of health potion can be healed but still it random between 1-50
        int dropHealthPotion = 75; // percentage
        String Username;

        boolean running = true; //helping the while loop.

        //Main game
        System.out.println("------------------------------");
        System.out.println("Welcome to Adventure Game.");  // Introduction of the game

        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        Username = input.next();                         // This is part is ask for users name


        System.out.println("Hello " + Username + ". Your HP is: " + PlayerHealth + ", let's start the game!");  // Welcome sentence

        GAME:
        // The game is set for the first while loop
        while (running) {    //while loop to run the game
            System.out.println("------------------------------------------------------------------");
            System.out.println("You are in the middle of the building.");
            System.out.println("There are 5 rooms in front of you.");
            System.out.println("");
            System.out.println("What do you want to do?");
            System.out.println("");
            System.out.println("\t1: Room 1");
            System.out.println("\t2: Room 2");
            System.out.println("\t3: Room 3");
            System.out.println("\t4: Room 4");
            System.out.println("\t5: Room 5");
            System.out.println("\t6: Room 6");
            System.out.println("\t7: Room 7");
            System.out.println("------------------------------------------------------------------");
            //Starting to explain the environment of the game.

            String input = in.nextInt();
            if (input.equals("1")) {
                System.out.println("------------------------------------------------------------------");
                int enemyHealth = rand.nextInt(maxEnemyHealth);
                String enemy = enemies[rand.nextInt(enemies.length)];
                System.out.println("\t#" + enemy + " has appeared! #\n");

                while (enemyHealth > 0) {
                    System.out.println("\tYour HP: " + PlayerHealth + ".");
                    System.out.println("\t" + enemy + "'s HP is : " + enemyHealth + ".");
                    System.out.println("\n\tWhat would you like to do?");
                    System.out.println("\t1: Attack!");
                    System.out.println("\t2: Drink health potion.");
                    System.out.println("\t3: Run!");
                }

                String input = in.nextInt();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(maxPlayerAttackDamage);
                    int damageTaken = rand.nextInt(maxEnemyAttackDamage);

                    enemyHealth -= damageDealt;
                    PlayerHealth -= damageTaken;

                    System.out.println("------------------------------------------------------------------");
                    System.out.println("\t> Your strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> Your receive " + damageTaken + " damage from " + enemy + " .");

                    if (PlayerHealth < 1) {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("\t You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                }

                else if (input.equals("2")) {
                        if (healthyPotions > 0) {
                            PlayerHealth += healthPotionHeal;
                            healthyPotions--;

                            System.out.println("------------------------------------------------------------------");
                            System.out.println("\t> Your drink a health potion, healing yourself for " + healthPotionHeal +
                                    " . Now your total health is " + PlayerHealth + " hp." + "You have " + healthyPotions + " health potion/s left.");

                        }
                        else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("\t> You have no health potion left! Defeat an enemies for a change to get one! \n");
                        }
                }

                else if (input.equals("3")){

                }

                else {
                }
            }

            else if (input.equals("2")) {

            }

            else if (input.equals("3")) {

                }

            else if (input.equals("4")) {

                }

            else if (input.equals("5")) {

                }

            else if (input.equals("6")) {

                }

            else if (input.equals("7")) {

                }

            else {
                }

            }
        }
    }