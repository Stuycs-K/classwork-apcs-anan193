public class Driver {
    public static void main(String[] args) {
        Adventurer p1 = new Warrior("Bob",10);
        Adventurer p2 = new Warrior("Alice",20);
        System.out.println("p1's HP and maxHP: " + p1.getHP() + " " + p1.getmaxHP());
        System.out.println("p2's HP and maxHP: " + p2.getHP() + " " + p2.getmaxHP());
        System.out.println(p1.support());
        System.out.println("p1's HP and maxHP: " + p1.getHP() + " " + p1.getmaxHP());
        System.out.println("p2's HP and maxHP: " + p2.getHP() + " " + p2.getmaxHP());
        System.out.println(p2.attack(p1));
        System.out.println("p1's HP and maxHP: " + p1.getHP() + " " + p1.getmaxHP());
        System.out.println("p2's HP and maxHP: " + p2.getHP() + " " + p2.getmaxHP());
    }
}