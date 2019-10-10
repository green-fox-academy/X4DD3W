package pirates;

import java.util.Random;

public class Pirates {

  int drunkLevel = 0;
  boolean alive = true;
  boolean passedOut = false;
  Random luck = new Random();

  public Pirates() {

  }

  public void drinkSomeRum() {
    if (!alive) {
      System.out.println("The pirates is dead.");
    } else {
      drunkLevel++;
    }
  }

  public void howsItGoingMate() {
    if (!alive) {
      System.out.println("The pirates is dead.");
    } else if (drunkLevel <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passOut();
    }
  }

  public void passOut() {
    drunkLevel = 0;
    passedOut = true;
    System.out.println("The pirate is passed out.");
  }

  public void die() {
    alive = false;
  }

  public void brawl(Pirates otherPirate) {
    if (otherPirate.alive) {
      int rng = luck.nextInt(3);
      switch (rng) {
        case 1:
          this.die();
          break;
        case 2:
          otherPirate.die();
          break;
        case 3:
          this.passOut();
          otherPirate.passOut();
          break;
      }
    }
  }
}