import java.util.Scanner;
import java.util.Random;

public class advantagegama {
    public static void main(String[] args) {

        // system objects
        Scanner in = new Scanner(System.in); // in for input. Based a system to help us to put users input.
        Random rand = new Random(); // Random number generator

        //Game variables
        String[] enemies = {"Ghast", "Zombie", "Slime", "Skeleton", "Enderman",}; // Set enemy variables
        int maxEnemyHealth = 100;  // set max enemy health
        int maxEnemyAttackDamage = 40;  // set max enemy attack damage

        //Player variables
        int PlayerHealth = 150;  // set max player health
        int maxPlayerAttackDamage = 50;  // set max player attack damage
        int healthyPotions = 1;  // set starting game of amount of healthyPotions give to the players
        int healthPotionHeal = 50; // set amount of health potion can be healed
        int dropHealthPotion = 20; // percentage

        boolean running = true; //helping the while loop.

        //Main game
        System.out.println("------------------------------");
        System.out.println("Welcome to Adventure Game.");  // Introduction of the game
        System.out.println("Hello warrior, Your current HP is: " + PlayerHealth + ", let's start the game!");  // Welcome sentence

        GAME:
        // The game is set for the first while loop
        while (running) {    //while loop to run the game
            System.out.println("------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t#" + enemy + " appeared! #\n");

            while (enemyHealth > 0) {
                System.out.println("\tYour Hp:" + PlayerHealth);
                System.out.println("\t" + enemy + "'s HP:" + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1.Attack");
                System.out.println("\t2.Drink health potion");
                System.out.println("\t3.Leave!");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(maxPlayerAttackDamage);
                    int damageTaken = rand.nextInt(maxEnemyAttackDamage);

                    enemyHealth -= damageDealt;
                    PlayerHealth -= damageTaken;

                    System.out.println("------------------------------");
                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " HP damage.");
                    System.out.println("\t> You receive the damage is " + damageTaken + " HP. From the " + enemy + " .");


                    if (PlayerHealth < 1 && healthyPotions > 0) {
                        PlayerHealth += healthPotionHeal;
                        System.out.println("------------------------------");
                        System.out.println("\t> You have taken too much damage, you are too weak to go on. But you have "
                                + healthyPotions + " health potions left. Now you current HP is " + PlayerHealth + ".");
                        healthyPotions--;
                        System.out.println("\t>After you used one health potions, now you have " + healthyPotions + " left.");
                        continue;
                    }
                    else if (PlayerHealth < 1 && healthyPotions < 0) {
                        PlayerHealth += healthPotionHeal;
                        System.out.println("------------------------------");
                        System.out.println("\t> You have taken too much damage, you are too weak to go on.");
                        break;
                    }
                }

                else if (input.equals("2")) {
                        if (healthyPotions > 0) {
                            PlayerHealth += healthPotionHeal;
                            healthyPotions --;

                            System.out.println("------------------------------");
                            System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHeal +  "HP."
                                                + "\n\t> You have " + healthyPotions + " health potions left.\n");
                        }
                        else {
                            System.out.println("------------------------------");
                            System.out.println("\t> You have no health potions left! Defeat enemies for a change to get one!");
                        }
                        continue;
                    }

                else if (
                        input.equals("3")) {
                        System.out.println("------------------------------");
                        System.out.println("\tYou run away from the " + enemy + "!");
                        continue GAME;
                        }

                else {
                        System.out.println("------------------------------");
                        System.out.println("\tInvalid command!");
                        }
                }

            if(PlayerHealth < 1){
                System.out.println("------------------------------");
                System.out.println("Your limp out of the dungeon, weak from battle.");
                break;
            }

            System.out.println("------------------------------");
            System.out.println(" # " + enemy + " was defeated! #");
            System.out.println(" #  You have " + PlayerHealth + " HP left. #");

            if(rand.nextInt(100)< dropHealthPotion){
                healthyPotions++;
                System.out.println("------------------------------");
                System.out.println(" # The " + enemy + " dropped a health potion! #");
                System.out.println(" # You have " + healthyPotions + " health potions. #");
            }

            System.out.println("------------------------------");
            System.out.println("What would you like to now?");
            System.out.println("1. Continue fighting.");
            System.out.println("2. Exit dungeon.");

            String input = in.nextLine();

            while (! input.equals("1") && !input.equals("2")){
                System.out.println("------------------------------");
                System.out.println("Invalid command!");
                input=in.nextLine();
            }

            if(input.equals("1")){
                System.out.println("------------------------------");
                System.out.println("You continue on your adventure.");
            }
            else if(input.equals("2")){
                System.out.println("------------------------------");
                System.out.println("You exit the dungeon, successful from your adventure!");
                break;
            }
        }
        System.out.println("------------------------------");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("------------------------------");
    }
}
