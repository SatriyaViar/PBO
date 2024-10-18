import java.util.List;

/**
 * villain
 */
public class villain extends character {

    private String special_power_Vilain;
    private int Mana_villain;
    //private String evil_plan;
    private List<String> MinionsVillain;

    public villain(String name, int health, String strength,String special_power_Vilain, int Mana_villain, List<String> MinionsVillain){
        super(name, health, strength);
        this.special_power_Vilain = special_power_Vilain;
        this.Mana_villain = Mana_villain;
        //this.evil_plan = evil_plan;
        this.MinionsVillain = MinionsVillain;
    }

    public String getSpecialPower(){
        return special_power_Vilain;
    }

    public void setSpecialPower(String special_power_Vilain){
        this.special_power_Vilain = special_power_Vilain;
    }
    
    public List<String> getMinions_Villain(){
        return MinionsVillain;
    }

    public void setMinnions_Villain(List<String>MinionsVillain){
        this.MinionsVillain = MinionsVillain;
    }

    public int summon_Minions(){
        if (this.Mana_villain > 50) {
            this.Mana_villain -= 50;
            System.out.println("Minions Villain     : " + this.MinionsVillain);
        } else {
            System.out.println("Mananya habis, tidak bisa memanggil Allies");
        }
        return this.Mana_villain;
    }

    @Override
    public void displayinfo(){
        System.out.println();
        super.displayinfo();
        System.out.println("Special Power       : " + this.special_power_Vilain);
        summon_Minions();
        System.out.println("Mana Villain        : " + this.Mana_villain);
        //System.out.println("Evil Plan           : " + this.evil_plan);
        
    }
}