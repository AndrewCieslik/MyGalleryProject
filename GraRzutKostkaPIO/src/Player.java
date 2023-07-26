import java.util.Random;

abstract public class Player {

    private String name = "default";

    public abstract int guess();

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {         //!".equals(name) bezpieczne ze wzgledu na null
            this.name = name;
        }
        else {
            System.out.println("Wrong name");
        }
    }
    public Player() {}
    public Player (String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }
}
