package aircraftcarrier;

public class Aircraft {

  int ammo;
  int maxAmmo;
  int damage;
  String type;

  public Aircraft() {

  }

  public int fight() {
    int damageDealt = this.ammo * this.damage;
    this.ammo = 0;
    return damageDealt;
  }

  public int refill(int useAllAmmo) {
    do {
      useAllAmmo--;
      this.ammo++;
    } while (this.ammo < this.maxAmmo);
    return useAllAmmo;
  }

  public String getType() {
    // It should return the type of the aircraft as a string
    return this.type;
  }

  public void getStatus(/*Aircraft aircraft*/) {
    // It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    System.out.println(
        "Type " + getType() + ", Ammo: " + ammo + ", Base Damage: " + damage + ", All damage: " + (
            ammo
                * damage));
  }

  public boolean isPriority() {
    // It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    return (type.equals("F35"));
  }

}
