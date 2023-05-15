package GUI;

import javax.swing.*;
import java.util.List;

public class AnalyzPanel {

    public JPanel getAnalyzPanel() {
        return analyzPanel;
    }

    private JPanel analyzPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTable table1;


    public static void createGUI(List<String[]> cells) {
        AnalyzPanel rootpanel = new AnalyzPanel();
        JPanel root = rootpanel.getAnalyzPanel();
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

