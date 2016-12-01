import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Obstacle {
    private String name, nObstaclesLevel;
    public ArrayList<Tile> tiles= new ArrayList<>();
    private String obstacle="obstaculo.png";
    private Image image;
    public Obstacle(String name, String nObstaclesLevel) {
        this.name = name;
        this.nObstaclesLevel = nObstaclesLevel;
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(obstacle));
        image = image_icon.getImage();
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
