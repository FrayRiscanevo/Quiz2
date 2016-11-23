package quiz.pkg2;

import java.util.ArrayList;

public class Enemy {
    private String name, nEnemiesLevel, nSpeed, animation;
    public ArrayList<Tile> tiles= new ArrayList<>();

    public Enemy(String name, String nEnemiesLevel, String nSpeed, String animation) {
        this.name = name;
        this.nEnemiesLevel = nEnemiesLevel;
        this.nSpeed = nSpeed;
        this.animation = animation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnEnemiesLevel() {
        return nEnemiesLevel;
    }

    public void setnEnemiesLevel(String nEnemiesLevel) {
        this.nEnemiesLevel = nEnemiesLevel;
    }

    public String getnSpeed() {
        return nSpeed;
    }

    public void setnSpeed(String nSpeed) {
        this.nSpeed = nSpeed;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }
 
    public void MoveAttack(){}
}
