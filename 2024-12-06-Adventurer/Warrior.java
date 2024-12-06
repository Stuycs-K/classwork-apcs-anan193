public class Warrior extends Adventurer {
    private int special;
    private int specialMax;
    
    public Warrior(String name) {
        super(name);
        special = 0;
        specialMax = 100;
    }

    public Warrior(String name, int hp) {
        super(name,hp);
    }
    
    public String getSpecialName() {
        return "Rage";
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int n) {
        special = n;
    }

    public int getSpecialMax() {
        return specialMax;
    }

    public String attack(Adventurer other) {
        other.setHP(other.getHP()-5);
        return getName() + " attacked " + other.getName();
    }


    //heall or buff the target adventurer
    public String support(Adventurer other) {
        other.setmaxHP(getmaxHP() + 10);
        return getName() + " used support on " + other.getName();
    }
  
    //heall or buff self
    public String support() {
        setmaxHP(getmaxHP() + 10);
        return getName() + " used support on " + getName();
    }
  
    //hurt or hinder the target adventurer, consume some special resource
    public String specialAttack(Adventurer other) {
        other.setHP(other.getHP()-10);
        setSpecial(getSpecial()-20);
        return getName() + " used special attack on " + other.getName();
    }
}