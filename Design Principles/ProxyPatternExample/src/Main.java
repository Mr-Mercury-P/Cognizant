public class Main {
    public static void main(String[] args) {

        Image obj1 = new ProxyImage("Prabhas");
        Image obj2 = new ProxyImage("Puli");

        obj1.display();
        obj2.display();

    }
}