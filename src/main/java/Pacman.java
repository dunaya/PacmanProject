import java.awt.*;

public class Pacman extends GameElements{
    public Image drawUp(){
        Image pacmanUp = null;
        return pacmanUp;
    }
    // drawDown, drawLeft, drawRight, images will be imported
    @Override
    public Image draw(){
        if (GameManager.currentDirection == 0){
            return drawUp();
        }
        return drawUp();
        // 1 - drawDown, 2 - drawRight, 3 - drawLeft
    }
}
