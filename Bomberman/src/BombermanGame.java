import org.newdawn.slick.*;
import org.newdawn.slick.geom.Point;

import java.util.ArrayList;
import java.util.Collection;

public class BombermanGame extends BasicGame{

    Bomberman bombermen;
    Image background;

    public BombermanGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        background = new Image("Bomberbackground.jpeg");
        Image bomberman = new Image("BombermanOpaque.png");
        Point bombermanLocation = new Point(40, 60);
        bombermen = new Bomberman(bomberman, bombermanLocation);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        Input controller = gameContainer.getInput();
        if(controller.isKeyDown(Input.KEY_A)){
            bombermen.setX(bombermen.getX() - 1);
        } else if(controller.isKeyDown(Input.KEY_D)){
            bombermen.setX(bombermen.getX() + 1);
        } else if(controller.isKeyDown(Input.KEY_W)){
            bombermen.setY(bombermen.getY() - 1);
        } else if(controller.isKeyDown(Input.KEY_S)){
            bombermen.setY(bombermen.getY() + 1);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        background.draw();
        bombermen.draw();
    }
}
