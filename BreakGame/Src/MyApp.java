import javax.swing.JFrame;


public class MyApp {
    public static void main(String[] args) {
        JFrame GameFrame = new JFrame();
        GamePlay gameplay = new GamePlay();
        GameFrame.setBounds(10,10,700,600);
        GameFrame.setTitle("BrickGame");
        GameFrame.setResizable(false);
        GameFrame.setVisible(true);
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.add(gameplay);
        GameFrame.setLocationRelativeTo(null);

    }

}