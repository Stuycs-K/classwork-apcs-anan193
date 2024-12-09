import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args) {
    Adventurer player = new CodeWarrior("You");
    Adventurer enemy = new CodeWarrior("Enemy");

    while (player.getHP() > 0 && enemy.getHP() > 0) {
      System.out.println(player.toString());
      System.out.println(enemy.toString());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

      Scanner userInput = new Scanner(System.in);
      String input = userInput.nextLine();
      if (input.equals("a") || input.equals("attack")) {
        System.out.println(player.attack(enemy));
      }
      else if (input.equals("sp") || input.equals("special")) {
        System.out.println(player.specialAttack(enemy));
      }
      else if (input.equals("su") || input.equals("support")) {
        System.out.println(player.support(player));
      }
      else if (input.equals("quit")) {
        return;
      }
      else {
        System.out.println("Bad input, try again");
        continue;
      }

      int action = (int) (3 * Math.random());
      if (action == 0) {
        System.out.println(enemy.attack(player));
      }
      else if (action == 1) {
        System.out.println(enemy.specialAttack(player));
      }
      else if (action == 2) {
        System.out.println(enemy.support(enemy));
      }
    }
    if (player.getHP() <= 0) {
      System.out.println("You lost!");
    }
    else if (enemy.getHP() <= 0) {
      System.out.println("You won!");
    }

  }
}
