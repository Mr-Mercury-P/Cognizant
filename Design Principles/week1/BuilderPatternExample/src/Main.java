public class Main {
    public static void main(String[] args) {
        Computer obj = new Computer.Builder()
                .setCpu(4)
                .setRam(16)
                .setStorage(512).build();
        System.out.println(obj.cpu);
        System.out.println(obj.ram);
        System.out.println(obj.storage);
    }
}