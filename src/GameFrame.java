import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake Game - In-Game | Advanced v1.0");
        this.setIconImage(new ImageIcon("imgs/Icon.png").getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.pack();

        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
