import java.util.List;

/**
 * PlanHero
 */
public class PlanVillain extends villain {

    private String villain_plan;

    public PlanVillain(String name, int health, String strength,String special_power_Vilain, int Mana_villain, List<String> MinionsVillain){
        super(name, health, strength, special_power_Vilain, Mana_villain, MinionsVillain);
    }

    public String getPlanvillain(){
        return this.villain_plan;
    } 

    public void setPlanvillain(String villain_plan){
        this.villain_plan = villain_plan;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Villain Plan        : " + villain_plan);
    }
}   