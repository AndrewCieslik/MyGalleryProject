import java.util.Random;

public class Player {

    Random brain =new Random();

    public int guess() {
        return brain.nextInt(6) +1;
    }
}
