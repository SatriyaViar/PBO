/**
 * character
 */
public class character {

    public String nama;
    public int health;
    public String strength;

    public character (String nama, int health, String strength){
        this.nama = nama;
        this.health = health;
        this.strength = strength;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public String getStrength(){
        return strength;
    }

    public void setStrength(String strength){
        this.strength = strength;
    }

    public void displayinfo(){
        System.out.println("Nama                : " + nama);
        System.out.println("Health              : " + health);
        System.out.println("Strength            : " + strength);
    }
} 