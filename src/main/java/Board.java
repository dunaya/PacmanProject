public class Board{
    public static GameElements[][] mapElements;
    public int x1;
    public int y1; // эти две переменные будут зависеть от действия юзера
    int level = GameManager.getLevel();
    //здесь будет подгружаться файл с данными игровой карты в зависимости от текущего уровня
    public void moveGameElement(GameElements el, int x1, int y1){
        el.position = new Integer[2];
        el.position[0] = x1;
        el.position[1] = y1;
    }
    public GameElements getElementByPosition(int x, int y){
        return mapElements[x][y];
    }
}
