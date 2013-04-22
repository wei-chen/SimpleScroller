import javax.swing.JFrame;

public class Frame extends JFrame {

    public Frame() {
        add(new Board());
        setTitle("Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 280);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        new Frame();
    }
}
