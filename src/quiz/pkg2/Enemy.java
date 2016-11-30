package quiz.pkg2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
 
    public void MoveAttack(){
                    try{
                        for (int i = 0; i < casillas-1; i++) {
                            if(dx1>=0&&dx1<=casillas-1){
                                if(dx1!=/*obstaculo*/){
                        mat[dx1][dy1]=/*Diseño tablero*/;
                        dx1=dx1-1;
                        mat[dx1][dy1]=/*Diseño personaje*/;
                                } 
                    }
                            
                        }
                       
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException a){
                        System.out.println("No se puede jugar fuera de la matriz");
                    }
                }


    }

