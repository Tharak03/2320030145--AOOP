package game;

public class GameLevelManager {
	private static GameLevelManager instance;
    private GameElementFactory factory;

    private GameLevelManager() { }

    public static GameLevelManager getInstance() {
        if (instance == null) {
            instance = new GameLevelManager();
        }
        return instance;
    }

    public void setLevelFactory(GameElementFactory factory) {
        this.factory = factory;
    }

    public GameElementFactory getLevelFactory() {
        return factory;
    }

    public void configureGame(Game game) {
        if (factory != null) {
            game.setLevelFactory(factory);
        } else {
            System.out.println("No level factory set.");
        }
    }
}