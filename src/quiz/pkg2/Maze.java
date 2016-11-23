package quiz.pkg2;

public class Maze extends Game{
    private int time;
    public Screen configureScree= new Screen();
    public Hero heroes= new Hero();
    public World worlds= new World();

    public Maze(int time, String title, String description, String author) {
        super(title, description, author);
        this.time = time;
    }
 
}
