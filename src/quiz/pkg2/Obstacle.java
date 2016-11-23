package quiz.pkg2;

import java.util.ArrayList;

public class Obstacle {
    private String name, nObstaclesLevel;
    public ArrayList<Tile> tiles= new ArrayList<>();

    public Obstacle(String name, String nObstaclesLevel) {
        this.name = name;
        this.nObstaclesLevel = nObstaclesLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnObstaclesLevel() {
        return nObstaclesLevel;
    }

    public void setnObstaclesLevel(String nObstaclesLevel) {
        this.nObstaclesLevel = nObstaclesLevel;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

}
