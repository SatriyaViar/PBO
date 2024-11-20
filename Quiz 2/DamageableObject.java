abstract class DamageableObject extends GameObject{

    public int Maxhealth;
    private int Health;

    public DamageableObject(String name, int PosX, int PosY, int Maxhealth, int Health){
        super(name, PosX, PosY);
        this.Maxhealth = Maxhealth;
        this.Health = Health;    
    }

    public boolean IsDead(){
        return Health <= 0;
    }


    public void TakeDamage(int damage){
        if (PosX == PosY) {
            Health = Maxhealth - damage;
            System.out.println("Name             : " + name);
            System.out.println("Took Damage      : " + damage + " Damage");
            System.out.println("Remaining Health : " + Health);
        
            if (IsDead()) {
                OnKilled();
            }
        }else{
            System.out.println("Dont Lose The Monster, Take Them !!!");
        }
    }   

    public abstract void OnKilled();
}