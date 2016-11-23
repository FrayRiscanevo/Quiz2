package quiz.pkg2;

import java.util.ArrayList;

public class Objective {
  private String name, nObjectivesLevel;
  private int value;
  public ArrayList<Tile> tiles= new ArrayList<>();

    public Objective(String name, String nObjectivesLevel, int value) {
        this.name = name;
        this.nObjectivesLevel = nObjectivesLevel;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnObjectivesLevel() {
        return nObjectivesLevel;
    }

    public void setnObjectivesLevel(String nObjectivesLevel) {
        this.nObjectivesLevel = nObjectivesLevel;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

}
