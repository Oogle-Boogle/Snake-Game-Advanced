import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Hiscores extends JFrame implements ActionListener {
    Container container;

    JPanel titlePanel, buttonPannels;
    JLabel titleLabel, titleUnder, creditLabel;

    JButton mainMenubtn;

    Font text = new Font("Ink Free", Font.BOLD, 30);

    Border emptyBorder = BorderFactory.createEmptyBorder();

    String username;

    /**
     * TODO - Store highscores here. When hit the GameOver screen make the player input a name and display here.
     *
     */

    public Hiscores() {
        new JFrame();
        this.setIconImage(new ImageIcon("imgs/Icon.png").getImage());

        this.setSize(800, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Snake Game | Advanced v1.0");
        this.getContentPane().setBackground(Color.BLACK);


        this.setResizable(false);
        this.setLayout(null);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        container = this.getContentPane();

        titlePanel = new JPanel();
        titlePanel.setBounds(150, 50, 500, 100);
//        titlePanel.setBackground(Color.BLACK);
        titlePanel.setBackground(new Color(0, 0, 0, 0));
        titleLabel = new JLabel("Hiscores");
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Ink Free", Font.BOLD, 80));

        titleUnder = new JLabel("Can you beat the player who stands at #1 ?");
        titleUnder.setBounds(200, 75, 500, 200);
        titleUnder.setForeground(Color.RED);
        titleUnder.setFont(new Font("Ink Free", Font.BOLD, 20));

        creditLabel = new JLabel("Created by Oogle");
        creditLabel.setBounds(600, 425, 200, 100);
        creditLabel.setForeground(Color.WHITE);
        creditLabel.setFont(new Font("Ink Free", Font.PLAIN, 20));

        buttonPannels = new JPanel();
        buttonPannels.setLayout(new GridLayout());
        buttonPannels.setBounds(150, 425, 500, 100);
        buttonPannels.setOpaque(false);

        mainMenubtn = new JButton("Main Menu");
        mainMenubtn.setBorder(emptyBorder);
        mainMenubtn.setSize(300, 150);
        mainMenubtn.setBounds(0, 0, 300, 150);
        mainMenubtn.setContentAreaFilled(false);
        mainMenubtn.setBorderPainted(false);
        mainMenubtn.setOpaque(false);
        mainMenubtn.setForeground(Color.RED);
        mainMenubtn.setFont(text);
        mainMenubtn.addActionListener(this);

        titlePanel.add(titleLabel);
        buttonPannels.add(mainMenubtn);

        container.add(titlePanel);
        container.add(titleUnder);
        container.add(creditLabel);
        container.add(buttonPannels);
    }

    public static void main(String[] args) {
        new Hiscores();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mainMenubtn) {
            this.dispose();
            new Menu();
        }
    }
}
