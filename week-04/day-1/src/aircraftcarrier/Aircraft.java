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
    while (ammo < this.maxAmmo) {
      useAllAmmo--;
      ammo++;
    }
    return useAllAmmo;
  }

  public String getType() {
    return this.type;
  }

  public void getStatus() {
    System.out.println(
        "Type " + getType() + ", Ammo: " + ammo + ", Base Damage: " + damage + ", All damage: " + (
            ammo
                * damage));
  }

  public boolean isPriority() {
    return (type.equals("F35"));
  }

}
