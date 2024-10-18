import java.util.List;

/**
 * hero
 */
public class hero extends character {

    private String special_power_Hero;
    public int Mana_Hero;
    //private String hero_plan;
    private List<String> alliesHeros; 
    //private Weapon weapon;

    public hero (String nama, int health, String strength, String special_power_Hero, int Mana_Hero, List<String> alliesHeros){
        super(nama, health, strength);
        this.special_power_Hero = special_power_Hero;
        this.Mana_Hero = Mana_Hero;
        //this.hero_plan = hero_plan;
        this.alliesHeros = alliesHeros;
        //this.weapon = weapon;
    }

    /* public hero (String nama, int health, String strength, String special_power_Hero, int Mana_Hero, String hero_plan, Weapon weapon){
        super(nama, health, strength);
        this.special_power_Hero = special_power_Hero;
        this.Mana_Hero = Mana_Hero;
        this.hero_plan = hero_plan;
        //this.weapon = weapon; 
    } */

    public String getSpecialPower(){
        return special_power_Hero;
    }

    public void setSpecialPower(String special_power_Hero){
        this.special_power_Hero = special_power_Hero;
    }

    public List<String> getAllies_Hero(){
        return alliesHeros;
    }

    public void setAllies_Hero(List<String> allieshero){
        this.alliesHeros = allieshero; 
    }

    public int call_allies_hero(){
        if (this.Mana_Hero > 50) {
            this.Mana_Hero -= 50;
            System.out.println("Allies              : " + this.alliesHeros);
        } else {
            System.out.println("Mananya habis, tidak bisa memanggil Allies");
        }
        return this.Mana_Hero;
    }


    @Override
    public void displayinfo(){
        System.out.println();
        super.displayinfo();
        System.out.println("Special Power       : " + this.special_power_Hero);
        call_allies_hero();
        System.out.println("Mana Hero           : " + this.Mana_Hero);
        //System.out.println("Hero Plan           : " + this.hero_plan);
        
    }
}