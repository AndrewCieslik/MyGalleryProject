public class Main {
    public static void main(String[] args){
        RemoteControl remoteControl= new RemoteControl();  //new object of RemoteControl class

        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.channelDown();

        System.out.println(remoteControl.getCurrentVolume());
        System.out.println(remoteControl.getCurrentChannel());

    }
}
