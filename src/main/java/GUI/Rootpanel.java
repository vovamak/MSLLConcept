package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.List;

public class Rootpanel extends JFrame {
    public JPanel getRootPanel() {
        return rootpanel;
    }

    private JPanel rootpanel;
    private JTable showtable;
    private JComboBox genreCombo;
    private JComboBox typeCombo;
    private JTextField minVotes;
    private JButton button1;
    private JButton button2;

    public Rootpanel(List<String[]> cells) {
       createTable(cells);

        createTypeCombo();
        createGenreCombo();


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        AnalyzPanel.createGUI(cells);
                    }
                });
            }
        });
    }

    private void createTable(List<String[]> cells) {

        Object[][] data = new Object[cells.size()][11];
        for (int i = 0; i < cells.size(); i++) {
            data[i] = cells.get(i);
        }


        TableColumnModel column = showtable.getColumnModel();
         column.getColumn(0).setMinWidth(200);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < 11; i++) {
            column.getColumn(i).setCellRenderer(cellRenderer);
//

        }



    }



    public static void createGUI(List<String[]> cells) {
    Rootpanel rootpanel = new Rootpanel(cells);
    JPanel root = rootpanel.getRootPanel();
    JFrame frame =new JFrame();
    frame.setDefaultCloseOperation( JFrame .EXIT_ON_CLOSE);
    frame.setContentPane(root);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    }
    private void  createGenreCombo(){
       genreCombo.setModel(new DefaultComboBoxModel(new String[]{"Action", "Fantasy","Drama","sci-Fi"}));


    }
    private   void  createTypeCombo(){
        typeCombo.setModel(new DefaultComboBoxModel(new String[]{"Amovie","tvSeries"}));




    }




}
