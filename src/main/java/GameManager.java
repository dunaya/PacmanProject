public class GameManager {
    public static int currentDirection;
    public static int score;
    public static int lives;
    public static int currentFrameRate;
    public static int currentLevel = 0;
    public static int currentSweetsLeft;
    public static int getLevel(){
        return currentLevel;
    }
    public void startLevel(){
        //call LevelBuilder
    }
    public void levelUp(){
        currentLevel++;
        startLevel();
    }
    public void death(){
        lives--;
        //LeverBuilder if (lives<0)
        //Board.move(Pacman) => Pacman.position = initial(for this level)
    }
    public void eatingSweet(){
        currentSweetsLeft--;
        if (currentSweetsLeft == 0) levelUp();
        //if (currentSweetsLeft < *придумать значение*) currentFrameRate++ // currentFrameRate - скорость отображения, нужно реализовать ее влияние на
        //Pacman.speedX, Pacman.speedY, Ghosts.speedX, Ghosts.speedY
    }
    //infinLoop - цикл, где будет идти проверка встречи пакмана с точкой(Sweet) => eatingSweet() или с привидением => death()
}
