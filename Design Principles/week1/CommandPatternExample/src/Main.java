public class Main {
    public static void main(String[] args) {
        Light obj = new Light();
        Command on = new LightOnCommand(obj);
        Command off = new LightOffCommand(obj);
        RemoteControl remote = new RemoteControl();
        remote.setObj(on);
        remote.button();
        remote.setObj(off);
        remote.button();
    }
}