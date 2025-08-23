package meujogo.metodo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

public class Fase extends JPanel implements ActionListener {
    private Image fundo;
    private Player player;

    public Fase() {
        ImageIcon referencia = new ImageIcon("Blueground.jpg");
        fundo = referencia.getImage();
        
        player = new Player();
        player.load();
    }

    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
    }
}
