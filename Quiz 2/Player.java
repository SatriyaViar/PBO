public class Player extends DamageableObject{

    private int Score;
    private int LivesRemaining;

    Player(String name, int PosX, int PosY, int Maxhealth, int Health, int Score, int LivesRemaining){
        super(name, PosX, PosY, Maxhealth, Health);
        this.Score = Score;
        this.LivesRemaining = LivesRemaining;
    }

    @Override
    public void OnKilled(){
        LivesRemaining --;
        System.out.println( name + " Has been Kill, Lives Remaining: " + LivesRemaining );

        if (LivesRemaining == 0) {
           System.out.println(name + "Has Been Killed, Lives Remaining 0");
           Despawn(); 
        }
    }
}