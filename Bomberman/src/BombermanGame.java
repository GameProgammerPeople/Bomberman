import org.newdawn.slick.*;
import org.newdawn.slick.geom.Point;

import java.util.ArrayList;
import java.util.Collection;

public class BombermanGame extends BasicGame{

    Collection<Bomberman> bombermen = new ArrayList<Bomberman>();
    Image background;

    public BombermanGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        background = new Image("land.jpg");
        Image bomberman = new Image("BombermanSprite.jpeg");
        Point bombermanLocation = new Point(50, 50);
        bombermen.add(new Bomberman(bomberman, bombermanLocation));
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        background.draw();
        for(Bomberman man : bombermen){
            man.draw();
        }
    }
}
