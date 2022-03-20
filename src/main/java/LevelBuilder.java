public class LevelBuilder {
    public String filePath;
    public void buildBorders(){
        //Board.mapElements = new GameElements[][] from file
    }
    public void buildSweets(){
        // Board.mapElements[x][y] = Sweets sweet; x, y возьмутся из файла, вероятнее всего расставление конфет(точек) будет в цикле
    }
    public void buildGhosts(){
        //нужное количество и расстановка внутри прямоугольника привидений
    }
    public void buildPacman(){
        //поставить пакмана на позицию, указанную в файле
    }
    public static Board getBoard(){
        return null; //здесь планируется работающий строитель Board
    }
}
