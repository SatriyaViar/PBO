public class GameObject {

    public String name;
    public int PosX;
    public int PosY;

    public GameObject(String name, int PosX, int PosY){
        this.name = name;
        this.PosX = PosX;
        this.PosY = PosY;
    }

    public String Getname(){
        return name;
    }

    public void Despawn(){
        System.out.println(name + "Has Ben Eliminated");
    }
}