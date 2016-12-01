import java.util.ArrayList;

public class World {
  private int number, width, height;
  public ArrayList<Enemy> enemies= new ArrayList<>();
  public ArrayList<Objective> objects= new ArrayList<>();
  public ArrayList<Obstacle> obstacles= new ArrayList<>();

    public World(int number, int width, int height) {
        this.number = number;
        this.width = width;
        this.height = height;
    }

    World() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Objective> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Objective> objects) {
        this.objects = objects;
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }

    public void setObstacles(ArrayList<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

}
