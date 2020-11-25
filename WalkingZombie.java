public class WalkingZombie extends Zombie{
    
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        if(level == 1){
            health = (health + (int)(health*0.2));
        }
        else if(level == 2){
            health = (health + (int)(health*0.3));
        }
        else if(level == 3){
            health = (health + (int)(health*0.4));
        }
    }
    
    @Override
    public void destroyed(){
        health = (health - (int)(health*0.2));
    }
    
    @Override
    public String getZombieInfo(){
        return "Walking Zombie Data = \n"+
                "Health = "+health+"\nLevel  = "+level+"\n";
        
    }
}
