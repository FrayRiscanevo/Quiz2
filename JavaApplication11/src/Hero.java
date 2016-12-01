import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Hero {
    private String name, animation;
    private int lives, score;
    public ArrayList<Action> actions= new ArrayList<>();
    private Image image;
    private String heroe="heroe.jpg";
    private int dx1;
    private int dy1;
    private int ancho;
    private int largo;

    public Hero() {
        this.name = name;
        this.animation = animation;
        this.lives = lives;
        this.score = score;
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(heroe));
        image = image_icon.getImage();
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

    public void Victory(){
        for (int i = 0; i <= /*numero de objetivos*/; i++) {
          if(/*Posicion jugador x*/==/*posicion objetivo[i] x*/&&/*Posicion jugador y*/==/*posicion objetivo[i] y*/){
                        objetivo++;
                        }  
          if(objetivo==/*numero de objetivos*/){
              System.out.println("El jugador a ganado");
          }
        }
    }
    public void Defeat(){
        if(/*Posicion jugador x*/==/*posicion enemigo x*/&&/*Posicion jugador y*/==/*posicion enemigo y*/){
                        System.out.println("el jugador 1 choco con el enemigo");
                        }
    
    }
    public void MoveUp(){
     ventana.addKeyListener(new KeyListener() {
                
                @Override
                public void keyTyped(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    try{
                    if(e.getKeyCode()==KeyEvent.VK_UP){
                        System.out.println("Movimiento hacia arriba");
                        if(dy1>=0&&dy1<=largo-1){
                        mat[dx1][dy1]=c1;
                        dy1=dy1-1;
                        mat[dx1][dy1]=p1;
                        }
                    }
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException a){
                        System.out.println("No se puede jugar fuera de la matriz");
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
    }
    public void MoveDown(){
                ventana.addKeyListener(new KeyListener() {
                
                @Override
                public void keyTyped(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    try{
                    if(e.getKeyCode()==KeyEvent.VK_DOWN){
                        System.out.println("Movimiento hacia abajo");
                        if(dy1>=0&&dy1<=-1){
                        mat[dx1][dy1]=c1;
                        dy1=dy1+1;
                        mat[dx1][dy1]=p1;
                        }
                    }
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException a){
                        System.out.println("No se puede jugar fuera de la matriz");
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });

}
    public void MoveLeft(){
                ventana.addKeyListener(new KeyListener() {
                
                @Override
                public void keyTyped(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    try{
                    
                    if(e.getKeyCode()==KeyEvent.VK_LEFT){
                        System.out.println("Movimiento hacia la izquierda");
                        if(dx1>=0&&dx1<ancho-1){
                        mat[dx1][dy1]=c1;
                        dx1=dx1-1;
                        mat[dx1][dy1]=p1+10;
                        }
                    }
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException a){
                        System.out.println("No se puede jugar fuera de la matriz");
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
    }
    public void MoveRight(){
                ventana.addKeyListener(new KeyListener() {
                
                @Override
                public void keyTyped(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    try{
                    
                    if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                        System.out.println("Movimiento hacia la derecha");
                        if(dx1>=0&&dx1<=ancho-1){
                        mat[dx1][dy1]=c1;
                        dx1=dx1+1;
                        mat[dx1][dy1]=p1;
                        }
                    }
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException a){
                        System.out.println("No se puede jugar fuera de la matriz");
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
   }
}
