public class Zombie implements Destroyable {
    
    protected int health;
    protected int level;
    
    public void heal(){
        System.out.println("Zombie menyembuhkan diri!");
    }
    
    public void destroyed(){
        System.out.println("Zombie telah dihancurkan!");
    }
    
    public String getZombieInfo(){
        return "Health = "+health+"\n"+
                "Level = "+level;
    }

}
