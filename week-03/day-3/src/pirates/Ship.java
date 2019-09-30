package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirates> team = new ArrayList<>();
  Random random = new Random();
  Pirates captain;

  public Ship() {
  }

  public void fillShip() {
    for (int i = 0; i < (random.nextInt(50)); i++) {
      team.add(new Pirates());
    }
    team.add(captain = new Pirates());
  }

  public int shipScore(Ship ship) {
    int alivePirate = 0;
    for (int i = 0; i < ship.team.size(); i++) {
      if (ship.team.get(i).alive) {
        alivePirate++;
      }
    }
    return alivePirate - ship.captain.drunkLevel;
  }

  public int alivePirates(Ship ship) {
    int alivePirate = 0;
    for (int i = 0; i < ship.team.size(); i++) {
      if (ship.team.get(i).alive) {
        alivePirate++;
      }
    }
    return alivePirate;
  }

  public boolean battle(Ship otherShip) {
    if (this.shipScore(this) > otherShip.shipScore(otherShip)) {
      randomLosses(otherShip);
      partyTime(this);
      return true;
    } else {
      randomLosses(this);
      partyTime(otherShip);
      return false;
    }
  }

  public void randomLosses(Ship loserShip) {
    int spontaneousDeaths = random.nextInt(loserShip.team.size());
    for (int i = 0; i < spontaneousDeaths; i++) {
      loserShip.team.get(i).die();
    }
  }

  public void partyTime(Ship winnerShip) {
    int spontaneousRum = random.nextInt(winnerShip.team.size());
    winnerShip.captain.drinkSomeRum();
    for (int i = 0; i < spontaneousRum; i++) {
      winnerShip.team.get(i).drinkSomeRum();
    }
  }

  public void shipStatus() {
    System.out.print("The captain consumed " + this.captain.drunkLevel + " rums and he is ");
    if (this.captain.alive) {
      System.out.println("alive.");
    } else {
      System.out.println("dead.");
    }
    // Ez így szabályos...? :)
    System.out.println("There is " + alivePirates(this)
        + " pirates are alive.");
  }
}