package meujogo.metodo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Player {
    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int largura, altura;
}

public Player() {
    this.x = 100;
    this.y = 100;
}
    
public void load() {
    ImageIcon referencia = new ImageIcon("res\\player.png");
    imagem = referencia.getImage();
    
    largura = imagem.getWidth(null);
    altura = imagem.getHeight(null);
}   

public void update() {
    x += dx;
    y += dy;
}

public void keyPressed(KeyEvent tecla) {
    int codigo = tecla.getKeyCode();

    if (codigo == KeyEvent.VK_LEFT) {
        dx = -3;
    }
    if (codigo == KeyEvent.VK_RIGHT) {
        dx = 3;
    }
    if (codigo == KeyEvent.VK_UP) {
        dy = -3;
    }
    if (codigo == KeyEvent.VK_DOWN) {
        dy = 3;
    }
}

public void keyReleased(KeyEvent tecla) {
    int codigo = tecla.getKeyCode();

    if (codigo == KeyEvent.VK_LEFT) {
        dx = 0;
    }
    if (codigo == KeyEvent.VK_RIGHT) {
        dx = 0;
    }
    if (codigo == KeyEvent.VK_UP) {
        dy = 0;
    }
    if (codigo == KeyEvent.VK_DOWN) {
        dy = 0;
    }
}






/*public class Player {
    private int x;
    private int y;
    private int vida;

    public Player(int x, int y, int vida) {
        this.x = x;
        this.y = y;
        this.vida = vida;
    }

    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void tomarDano(int dano) {
        vida -= dano;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVida() {
        return vida;
    }
}
