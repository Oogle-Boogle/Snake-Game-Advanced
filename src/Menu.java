import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JComponent implements ActionListener {

    JFrame frame;
    Container container;

    JPanel titlePanel, buttonPannels;
    JLabel titleLabel, titleUnder, creditLabel;

    JButton startbtn, hiscorebtn, exitbtn;

    Font text = new Font("Ink Free", Font.BOLD, 30);

    Border emptyBorder = BorderFactory.createEmptyBorder();

    GridBagConstraints c = new GridBagConstraints();

    Image background = Toolkit.getDefaultToolkit().getImage("imgs/bg.gif");

    public static void main(String[] args) {
        new Menu();
    }

    //Constructor
    public Menu() {
        frame = new JFrame();
        frame.setIconImage(new ImageIcon("imgs/Icon.png").getImage());

        frame.setSize(800, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake Game | Advanced v1.0");
//        frame.getContentPane().setBackground(Color.BLACK);

        frame.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, this);
            }
        });
        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(5, 0, 5, 0);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;

        frame.setResizable(false);
        frame.setLayout(null);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        container = frame.getContentPane();

        titlePanel = new JPanel();
        titlePanel.setBounds(150, 50, 500, 100);
//        titlePanel.setBackground(Color.BLACK);
        titlePanel.setBackground(new Color(0, 0, 0, 0));
        titleLabel = new JLabel("Snake Game");
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Ink Free", Font.BOLD, 80));

        titleUnder = new JLabel("Do you have what it takes?");
        titleUnder.setBounds(250, 75, 500, 200);
        titleUnder.setForeground(Color.RED);
        titleUnder.setFont(new Font("Ink Free", Font.BOLD, 25));

        creditLabel = new JLabel("Created by Oogle");
        creditLabel.setBounds(600, 425, 200, 100);
        creditLabel.setForeground(Color.WHITE);
        creditLabel.setFont(new Font("Ink Free", Font.PLAIN, 20));

        buttonPannels = new JPanel();
        buttonPannels.setLayout(new GridLayout());
        buttonPannels.setBounds(150, 300, 500, 100);
        buttonPannels.setOpaque(false);

        startbtn = new JButton("Start");
        startbtn.setBorder(emptyBorder);
        startbtn.setSize(300, 150);
        startbtn.setBounds(0, 0, 300, 150);
        startbtn.setContentAreaFilled(false);
        startbtn.setBorderPainted(false);
        startbtn.setOpaque(false);
        startbtn.setForeground(Color.RED);
        startbtn.setFont(text);
        startbtn.addActionListener(this);
//        startbtn.addActionListener(e -> new GameFrame());

        hiscorebtn = new JButton("Hiscores");
        hiscorebtn.setBorder(emptyBorder);
        hiscorebtn.setSize(300, 150);
        hiscorebtn.setBounds(0, 0, 300, 150);
        hiscorebtn.setOpaque(false);
        hiscorebtn.setContentAreaFilled(false);
        hiscorebtn.setBorderPainted(false);
        hiscorebtn.setForeground(Color.RED);
        hiscorebtn.setFont(text);
        hiscorebtn.addActionListener(this);
//        hiscorebtn.addActionListener(e -> new Hiscores());

        exitbtn = new JButton("Exit");
        exitbtn.setBorder(emptyBorder);
        exitbtn.setSize(300, 150);
        exitbtn.setBounds(0, 0, 300, 150);
        exitbtn.setOpaque(false);
        exitbtn.setContentAreaFilled(false);
        exitbtn.setBorderPainted(false);
        exitbtn.setForeground(Color.RED);
        exitbtn.setFont(text);
        exitbtn.addActionListener(this);
//        exitbtn.addActionListener(e -> System.exit(0));

        titlePanel.add(titleLabel);
        buttonPannels.add(startbtn);
        buttonPannels.add(hiscorebtn);
        buttonPannels.add(exitbtn);

        container.add(titlePanel);
        container.add(titleUnder);
        container.add(creditLabel);
        container.add(buttonPannels);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hiscorebtn){
            frame.dispose();
            new Hiscores();
            System.out.println("Opened highscores");
        } else if (e.getSource() == startbtn) {
            frame.dispose();
            new GameFrame();
        } else if (e.getSource() == exitbtn) {
            System.exit(0);
            System.out.println("Closed the program. Thanks for playing.");
        }
    }
}
