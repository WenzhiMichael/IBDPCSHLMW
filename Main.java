import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean iskeepplaying = true;

        while (iskeepplaying) {
            System.out.println("Playing current song.");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes.");
            String userInput = input.next();

            if (userInput.equals("yes"))
            iskeepplaying = false;


        }
        System.out.println("Playing next song.");

    }

}