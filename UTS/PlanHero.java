import java.util.List;

/**
 * PlanHero
 */
public class PlanHero extends hero {

    private String hero_plan;

    public PlanHero (String nama, int health, String strength, String special_power_Hero, int Mana_Hero, List<String> alliesHeros){
        super(nama, health, strength, special_power_Hero, Mana_Hero, alliesHeros);
    }

    public String getPlanHero(){
        return this.hero_plan;
    } 

    public void setPlanHero(String hero_plan){
        this.hero_plan = hero_plan;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Hero Plan           : " + hero_plan);

    }
}   