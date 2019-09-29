package pirates;

public class BattleApp {

  public static void main(String[] args) {

    Pirates jack = new Pirates();
    for (int i = 0; i < 5; i++) {
      jack.drinkSomeRum();
    }
    jack.howsItGoingMate();

    Ship flyingDutchman = new Ship();
    flyingDutchman.fillShip();
    flyingDutchman.shipStatus();

    Ship dyingGull = new Ship();
    dyingGull.fillShip();
    dyingGull.shipStatus();

    Pirates william = new Pirates();
    william.brawl(jack);

    flyingDutchman.battle(dyingGull);
    flyingDutchman.shipStatus();
    dyingGull.shipStatus();

  }
}
