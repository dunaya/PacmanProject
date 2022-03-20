import java.awt.*;

public abstract class GameElements {
    public int speedX;
    public int speedY;
    public Integer[] position = new Integer[2];

    public int getSpeedX(GameElements element){
        return element.speedX;
    }
    public int getSpeedY(GameElements element){
        return element.speedY;
    }
    public Integer[] getPosition(GameElements element){
        return element.position;
    }

    public abstract Image draw();
}
