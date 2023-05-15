//"W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts 2023 R14 05.04.23.xlsx"

import GUI.Rootpanel;
import model.ReaderCSV;

import javax.swing.*;
import java.util.List;

public class Main {
    private List<String[]> list;
    public static void main(String[] args) {
        Main main = new Main();
        String AnalysisFile = "W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\BDs\\Analysis\\Analysis.scv";

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                main.list = new ReaderCSV(AnalysisFile).getList();
            }

        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            Rootpanel.createGUI(main.list);
            }
        });


    }


}
