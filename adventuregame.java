import java.util.Scanner; //set a scanner that will have input when user input something
import java.util.Random; // a random system

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
        System.out.println("Wet from an unforgiving rain and covered in the mud of his own grave, Dudley stands atop an " );
        System.out.println("altar gripping a revolver buried in its stone face. Ignoring the pain, the confusion, and the fear, " );
        System.out.println( "Dudley tightens his wretched skeleton fingers around the pearl handle and begins to pull. An unholy ");
        System.out.println( "strength pulses through his corroded muscles —the revolver budges. In his lifetime Dudley saw kings, " );
        System.out.println("holy men, the righteous, and the profane all try freeing the gun from the stone. All spoke of entitlement " );
        System.out.println( "and fate. All tried to wrest the revolver from its stone sheath and all failed. Now, in the wake of his resurrection " );
        System.out.println("with the fog of consciousness setting in and memories of the void fading: Dudley knows he will not leave empty-handed.\n" );
        System.out.println("                                       ");
        System.out.println( "His slippery fingers strangle the revolver, it wiggles like a loose tooth and in a pale flash is freed " );
        System.out.println( "from the stone. Mad laughter echoes into the night sky as Dudley twirls his prize on the end of his trigger finger." );
        System.out.println(" Aiming at the ground Dudley fires three times, each shot lifting him higher and higher into the sky. " );
        System.out.println("The cylinder cycles but never empties Landing on his back Dudley stares at the wicked weapon in his gnarled hands. " );
        System.out.println("He knows that the revenge he promised those who betrayed him would finally be fulfilled. The only question " );
        System.out.println( "is who first and how bad was he gonna make 'em hurt? .");  // Introduction of the game
        System.out.println("Hello Dudley, Your current HP is: " + PlayerHealth + ", let's start the game!");  // Welcome sentence
        System.out.println("                                       ");

        GAME:
        // The game is set for the first while loop
        while (running) {    //while loop to run the game
            System.out.println("------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t#" + enemy + " appeared! #\n"); //random enemy name base from line 12

            while (enemyHealth > 0) {
                System.out.println("\tYour Hp:" + PlayerHealth);
                System.out.println("\t" + enemy + "'s HP:" + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1.Attack");
                System.out.println("\t2.Drink health potion");
                System.out.println("\t3.Leave!");    // make 3 choice when enemy Health is > 0

                String input = in.nextLine(); // user will input a variable
                if (input.equals("1")) {   // if user input 1
                    int damageDealt = rand.nextInt(maxPlayerAttackDamage);
                    int damageTaken = rand.nextInt(maxEnemyAttackDamage);  // random damage range from setting (line 14 and 18) for user and enemy

                    enemyHealth -= damageDealt;
                    PlayerHealth -= damageTaken;  // enemy health and player health minus by the attack damage

                    System.out.println("------------------------------");
                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " HP damage.");
                    System.out.println("\t> You receive the damage is " + damageTaken + " HP. From the " + enemy + " .");
                    //shows the users how many hp left for player and enemy

                    // these one is to do when player health is < 1 the system will automatically heal player if there has health potion left.
                    //if not the game is finished
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

                else if (input.equals("2")) { // if user input 2
                        if (healthyPotions > 0) {   // if there has health potion left
                            PlayerHealth += healthPotionHeal;  //player health will heal from the health potion
                            healthyPotions --; // health potion will decrease one

                            System.out.println("------------------------------");
                            System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHeal +  "HP."
                                                + "\n\t> You have " + healthyPotions + " health potions left.\n"); // here is to show the users how many health potions left and current health of users.
                        }
                        else {
                            System.out.println("------------------------------");
                            System.out.println("\t> You have no health potions left! Defeat enemies for a change to get one!");
                        }   // this one is to explain when there have on health potions.
                        continue;
                    }

                else if (
                        input.equals("3")) {  // if user input 3
                        System.out.println("------------------------------");
                        System.out.println("\tYou run away from the " + enemy + "!");
                        continue GAME;  // the game will go back to the top while loop if not add game it will go back to the while loop of enemyHealth > 0
                        }

                else {
                        System.out.println("------------------------------");
                        System.out.println("\tInvalid command!");
                        } // if not put anything above system will show Invalid command
                }

            if(PlayerHealth < 1){
                System.out.println("------------------------------");
                System.out.println("Your limp out of the jail, weak from battle.");
                break;  // when player health <1, the player died the game finish.
            }

            System.out.println("------------------------------");
            System.out.println(" # " + enemy + " was defeated! #");
            System.out.println(" #  You have " + PlayerHealth + " HP left. #"); // if user beat the enemy the system will show current player hp left.

            if(rand.nextInt(100)< dropHealthPotion){
                healthyPotions++;
                System.out.println("------------------------------");
                System.out.println(" # The " + enemy + " dropped a health potion! #");
                System.out.println(" # You have " + healthyPotions + " health potions. #");
            }  //this random system is to show how the health potion generate.

            System.out.println("------------------------------");
            System.out.println("What would you like to now?");
            System.out.println("1. Continue fighting.");
            System.out.println("2. Exit jail.");   //ask other 2 condition for users

            String input = in.nextLine();

            while (! input.equals("1") && !input.equals("2")){  // if the users not even input 1 or 2 the system will show Invalid command
                System.out.println("------------------------------");
                System.out.println("Invalid command!");
                input=in.nextLine();
            }

            if(input.equals("1")){  // if users input 1 it will continue the game.
                System.out.println("------------------------------");
                System.out.println("You continue on your adventure.");
            }
            else if(input.equals("2")){  // if users input 2 the game will stop.
                System.out.println("------------------------------");
                System.out.println("You exit the jail, successful from your adventure!");
                break;
            }
        }
        System.out.println("------------------------------");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("------------------------------");  //ending sentence
    }
}
