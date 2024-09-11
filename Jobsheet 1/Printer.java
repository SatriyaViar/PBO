/**
 * Printer
 */
public class Printer {
    public static void main(String[] args) {
        
    String Brand1, Brand2, Brand3, Brand4, Brand5, Brand6, Brand7, Brand8, Brand9, Brand10;
    String Model1, Model2, Model3, Model4, Model5, Model6, Model7, Model8, Model9, Model10;
    int levelInk1, levelInk2, levelInk3, levelInk4, levelInk5, levelInk6, levelInk7, levelInk8, levelInk9, levelInk10;

    Brand1 = "Canon";
    Model1 = "Solid Ink Printer";
    levelInk1 = 46;

    Brand2 = "Epson";
    Model2 = "Solid Ink Printer";
    levelInk2 = 70;
    
    Brand3 = "HP";
    Model3 = "Printer Laser";
    levelInk3 = 90;

    Brand4 = "Brother";
    Model4 = "Printer Multi Fungsi";
    levelInk4 = 10;

    Brand5 = "Epson";
    Model5 = "Printer Laser";
    levelInk5 = 60;

    Brand6 = "Samsung";
    Model6 = "Solid Ink Printer";
    levelInk6 = 36;

    Brand7 = "Canon";
    Model7 = "Printer Multi Fungsi";
    levelInk7 = 20;

    Brand8 = "Samsung";
    Model8 = "InkJet";
    levelInk8= 70;

    Brand9 = "Epson";
    Model9 = "Printer 3D";
    levelInk9 = 55;

    Brand10 = "Brother";
    Model10 = "Solid Ink Printer";
    levelInk10 = 73;
    
    printPrinterInfo(Brand1, Model1, levelInk1);
    printPrinterInfo(Brand2, Model2, levelInk2);
    printPrinterInfo(Brand3, Model3, levelInk3);
    printPrinterInfo(Brand4, Model4, levelInk4);
    printPrinterInfo(Brand5, Model5, levelInk5);
    printPrinterInfo(Brand6, Model6, levelInk6);
    printPrinterInfo(Brand7, Model7, levelInk7);
    printPrinterInfo(Brand8, Model8, levelInk8);
    printPrinterInfo(Brand9, Model9, levelInk9);
    printPrinterInfo(Brand10, Model10, levelInk10);
    }
    
    public static int checkInk(int levelInk){
        if (levelInk <= 35) {
            System.out.println("Level Ink Low, Need Refill");
            
        }else if (levelInk <= 70) {
            System.out.println("level Ink Medium");
            
        }else{
            System.out.print("Level Ink Full ");
        }
        return levelInk;
    }

    public static void printPrinterInfo(String brand, String model, int levelInk) {
        System.out.println("Merek: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Kapasitas Ink: " + levelInk);
        System.out.println("Level Ink: " + checkInk(levelInk));
        System.out.println(); 
    }

}
