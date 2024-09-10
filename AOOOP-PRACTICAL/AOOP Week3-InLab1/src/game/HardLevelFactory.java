package game;

public class HardLevelFactory implements GameElementFactory {
	public Enemy createEnemy() {
        return new OrcEnemy();
    }

    public Weapon createWeapon() {
        return new SwordWeapon();
    }

    public PowerUp createPowerUp() {
        return new ShieldPowerUp();
    }
}
