import java.util.Random;

public class GraRzutKostkaPIO {
    public static void main(String[] args) {

        Random dice = new Random();
        Player player = new Player();

        int number;
        int guess;

        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Dice: " + number);

            guess = player.guess();
            System.out.println("Gracz: " + guess);

            if (guess == number) {
                System.out.println("Great!");
            } else {
                System.out.println("Wrong!");
            }
        } while (number != guess);
    }
}
