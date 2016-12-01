import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Enemy {
    private String name, nEnemiesLevel, nSpeed, animation;
    public ArrayList<Tile> tiles= new ArrayList<>();
    private String enemy="fuegoenemigo.png";
    private int ancho;
    private int largo;
    private int px1;
    private int py1;
    private Image image;

    public Enemy(String name, String nEnemiesLevel, String nSpeed, String animation, int ancho, int largo, int px, int py) {
        this.name = name;
        this.nEnemiesLevel = nEnemiesLevel;
        this.nSpeed = nSpeed;
        this.animation = animation;
        this.ancho = ancho;
        this.largo = largo;
        this.px1 = px1;
        this.py1 = py1;
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(enemy));
        image = image_icon.getImage();
    }

    
 
    public void MoveAttack(){
                    try{
                        for (int i = 0; i < ancho-1; i++) {
                            if(px1>=0&&px1<=largo-1){
                                if(px1!=/*obstaculo*/){
                        mat[px1][py1]=/*Diseño tablero*/;
                        px1=px1-1;
                        mat[px1][py1]=/*Diseño personaje*/;
                                } 
                    }
                            
                        }
                       
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException a){
                        System.out.println("No se puede jugar fuera de la matriz");
                    }
                }


    }

