import org.newdawn.slick.SlickException;

/**
 * User: fergsmyth
 * Date: 19/09/2012
 * Time: 20:37
 */
public class BombermanDriver {
    public static void main(String args[]){
        try {
            BombermanContainer container = new BombermanContainer(new BombermanGame("Bomberman"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
