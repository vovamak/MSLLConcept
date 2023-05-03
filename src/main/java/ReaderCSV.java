import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ReaderCSV {
    public String getFileName() {
        return fileName;
    }

    public List<String[]> getList() {
        return Collections.unmodifiableList(list);
    }

    private String fileName;
    private List<String[]> list;


    public ReaderCSV(String fileName) {
        this.fileName = fileName;
        readFromFile();
    }

    private void readFromFile() {
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            list = reader.readAll();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }


    }
}
