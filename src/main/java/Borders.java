import java.awt.*;

public class Borders extends GameElements{
    @Override
    public int getSpeedX(GameElements border){
        return 0;
    }

    @Override
    public int getSpeedY(GameElements border){
        return 0;
    }

    @Override
    public Image draw() {
        return null; //будет возвращать картинку кирпичика из файла, возможно реализую различные виды границ
    }
}
