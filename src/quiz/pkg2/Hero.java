package quiz.pkg2;

import java.util.ArrayList;

public class Hero {
    private String name, animation;
    private int lives, score;
    public ArrayList<Action> actions= new ArrayList<>();

    public Hero(String name, String animation, int lives, int score) {
        this.name = name;
        this.animation = animation;
        this.lives = lives;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }

    public void Victory(){}
    public void Defeat(){}
    public void MoveUp(){}
    public void MoveDown(){}
    public void MoveLeft(){}
    public void MoveRight(){}
}
