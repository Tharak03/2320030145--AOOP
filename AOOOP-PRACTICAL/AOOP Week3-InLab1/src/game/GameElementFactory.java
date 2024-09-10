package game;

public interface GameElementFactory {
	Enemy createEnemy();
    Weapon createWeapon();
    PowerUp createPowerUp();
}
