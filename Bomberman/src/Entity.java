import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Point;

/**
 * User: fergsmyth
 * Date: 19/09/2012
 * Time: 21:26
 */
public abstract class Entity {
    Image entityImage;
    Point location;

    public Entity(Image image, Point location){
        setLocation(location);
        setImage(image);
    }
    public void setImage(Image image){
        this.entityImage = image;
    }

    public void setLocation(Point newLocation){
        this.location = newLocation;
    }

    public void draw(){
        entityImage.draw(location.getX(), location.getY());
    }

    public void setX(float x){
        location.setX(x);
    }

    public void setY(float y){
        location.setY(y);
    }

    public float getX(){
        return location.getX();
    }

    public float getY(){
        return location.getY();
    }
}
