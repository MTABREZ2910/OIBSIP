import java.util.Scanner;

class RandomNumberGuess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Welcome to Random Number Guess");
        System.out.println("--------------------------------------");
        System.out.println("You will be having 10 chances to find the number\n"
        		+ "There will be 3 rounds");
        System.out.println("Enter a number beween 1 to 100");
        int input,count=0;
        for (int i = 1; i <=3; i++) {
        int random = (int) ((Math.random() * 100) + 1);
        System.out.println("----------");
        System.out.println("Round-"+i);
        System.out.println("----------");
        boolean gussed = false;
        System.out.println(random);
        for (int j = 1; j < 11; j++) {
            System.out.println("Chance-" + j + ":");
            input = sc.nextInt();
            if (input == random) {
                System.out.println("Congratulations you won!!!!!!!!!!!!!!!!!");
                gussed = true;
                count++;
                break;
            } else if (input < random)
                System.out.println("Lower!");
            else
                System.out.println("Higher");
        }
        if (!gussed) {
            System.out.println("The number was " + random);
        }
        }
        System.out.println("You won "+count+" rounds out of 3 rounds");
        System.out.println("Thanks for playing the game");
    }
}