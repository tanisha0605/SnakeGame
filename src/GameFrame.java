import javax.swing.*;

public class GameFrame extends JFrame  {
    JButton resetButton;

  GameFrame(){

      this.add(new GamePanel());

      this.setVisible(true);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.pack();
      this.setResizable(false);
      this.setTitle("Snake Game");

      }

  }






