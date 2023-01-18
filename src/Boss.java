public class Boss extends GameEntity {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return "Name: " + getBossName() + "   " + "Health:  " + getBossHealth() + "   " + "Damage: " + getBossDamage() + "  " + "Weapon:  " + getWeaponName() + "   " + "WeaponType:  " + getWeaponType();
    }
}


