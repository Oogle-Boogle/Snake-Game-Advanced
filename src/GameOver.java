import javax.swing.*;

public class GameOver extends JFrame {

    /**
     * Ask for the user to input a name
     * Save the score and display it on the hiscores page
     * Store the score so when they next open the program their score hasn't been removed (Probably have to create a local file).
     */

    GameOver() {

//        this.add(new GamePanel());
        this.setTitle("Snake Game - Game Over | Advanced v1.0");
        this.setIconImage(new ImageIcon("imgs/Icon.png").getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.pack();

        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    public void main(String[] args) {
        new GameOver();
    }

}
