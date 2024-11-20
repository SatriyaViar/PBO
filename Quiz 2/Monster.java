public class Monster extends DamageableObject {

    private int threatLevel; 
    private String color;

    
    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth, maxHealth); // Health awal sama dengan maxHealth
        this.threatLevel = threatLevel;
        this.color = color;
    }

    int getThreatLevel() {
        return threatLevel;
    }

    public String getColor() {
        return color;
    }

    public String makeNoise() {
        if (threatLevel >= 5) { 
            return "Monster " + Getname() + " (" + color + ") Growls loudly!";
        } else if (threatLevel >= 3) { 
            return "Monster " + Getname() + " (" + color + ") Screams!";
        } else { 
            return "Monster " + Getname() + " (" + color + ") Growls faint";
        }
    }

    @Override
    public void OnKilled(){
        System.out.println(name + "Has Been Kill");
    }
}
