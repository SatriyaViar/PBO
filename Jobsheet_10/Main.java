public class Main {
    public static void main(String[] args) {
        TV tv = new TV("LED", 20, 5000000, "Hitam", "Samsung");
        SmartFridge fridge = new SmartFridge(10, 15, 10000000.0, "Putih","LG");
        Kipas kipas = new Kipas("Standing", 200000, "Silver", "Miyako");

        System.out.println(tv.getInfo());
        System.out.println(fridge.getInfo());
        System.out.println(kipas.getInfo());
    }
}