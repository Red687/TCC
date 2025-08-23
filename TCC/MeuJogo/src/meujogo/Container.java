package meujogo;

import javax.swing.JFrame;
import meujogo.metodo.Fase;

public class Container extends JFrame {
    
    public Container() {
        add(new Fase());
        setTitle("Meu Jogo");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Container();
    }
}