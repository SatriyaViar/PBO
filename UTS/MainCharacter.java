import java.util.Arrays;

/**
 * MainCharacter
 */
public class MainCharacter {

    public static void main(String[] args) {
        
        // Membuat object Hero 
        PlanHero planHero1 = new PlanHero("Plan Hero 1", 150, "Api", "Semburan Api Kesucian", 100, Arrays.asList("Joko Sumbil", "Batman", "Tony Stark"));
        planHero1.setPlanHero("Memusnahkan Kejahatan dialam semesta");

        PlanHero planHero2 = new PlanHero("Plan Hero 2", 200, "Angin", "Angin Topan Menuju Langit Tujuh", 50, Arrays.asList("Hulk", "Captain Amerika", "Wanda"));
        planHero2.setPlanHero("Mencegah Villain Memusnahkan Bumi");

        // Membuat object Villain
        PlanVillain planVillain1 = new PlanVillain("Plan Villain 1", 150, "Kapak Kematian", "Kapak Tak Ujung Henti", 100, Arrays.asList("Harley", "Bane"));
        planVillain1.setPlanvillain("Menguasai Universe");
        
        PlanVillain PlanVillain2 = new PlanVillain("Baskoro Aji", 300, "Listrik Amatir", "Badai Petir Membara", 50, Arrays.asList("Bimo Angkoro", "Setyo Rumekso", "Dursasana"));
        PlanVillain2.setPlanvillain("Memusnahkan Makhluk Hidup Bumi");

        // Menampilkan informasi karakter Hero
        System.out.println("Character Hero: ");
        
       // hero1.displayinfo();
        planHero1.displayinfo(); // Menampilkan info PlanHero
        planHero2.displayinfo();

        System.out.println();
        
        // Menampilkan informasi karakter Villain
        System.out.println("Character Villain: ");
        planVillain1.displayinfo(); // Menampilkan info PlanVillain

        PlanVillain2.displayinfo();
    }
}
