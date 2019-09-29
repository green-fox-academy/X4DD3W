package pirates;

public class BattleApp {

  public static void main(String[] args) {

    Pirates jack = new Pirates();
    Pirates william = new Pirates();

    Ship flyingDutchman = new Ship();
    flyingDutchman.fillShip();

    Ship dyingGull = new Ship();
    dyingGull.fillShip();

    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.howsItGoingMate();

    william.brawl(jack);

    flyingDutchman.battle(dyingGull);
    flyingDutchman.shipStatus();
    dyingGull.shipStatus();

  }
}
