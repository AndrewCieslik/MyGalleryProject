import java.util.List;

public class RemoteControl {  //class name: Name, not name
    public static final int length = 15;
    public static final int width = 5;
    public static final int thickness =3;
    public static final List<String> buttons =List.of("1","2","3","4","5","6","7","8","9","power","volumeUp","volumeDown","channelUp","channelDown");

    private int currentVolume;
    private int currentChannel;

    public void volumeUp() {
        currentVolume++;
    }
    public void volumeDown() {
        currentVolume--;
    }
    public void channelUp() {
        currentChannel++;
    }
    public void channelDown() {
        currentChannel--;
    }
    //konwencja narzuca ze nie odwolujemy sie bezposrednio do zmiennych, dlatego uzywamy gettery i settery

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }
}
