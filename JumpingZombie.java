public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        if(level == 1){
            health = (health +(int)(health*0.3));
        }
        else if(level == 2){
            health = (health + (int)(health*0.4));
        }
        else if(level == 3){
            health = (health + (int)(health*0.5));
        }
    }
    
    @Override
    public void destroyed(){
        health = (health - (int)(health*0.1));
    }
    
    @Override
    public String getZombieInfo(){
        return "Jumping Zombie Data = \n"+
                "Health = "+health+"\nLevel = "+level+"\n";
    }
}
