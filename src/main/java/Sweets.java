import java.awt.*;

public class Sweets extends GameElements{
    @Override
    public int getSpeedX(GameElements sweet){
        return 0;
    }

    @Override
    public int getSpeedY(GameElements sweet){
        return 0;
    }

    @Override
    public Image draw() {
        return null; //будет возвращать картинку точки из файла, возможно будет возвращать рандомную по цвету точку из файла
    }
}
