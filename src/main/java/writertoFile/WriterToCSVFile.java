package writertoFile;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class WriterToCSVFile {
    private CSVWriter writer;
    private List<String[]> list;



    public static void writToFile(List<String[]> list, Path paths, String fileNamecsv) {
        File file = new File(String.valueOf(paths)+"\\"+fileNamecsv+".scv");
        try(CSVWriter writer = new CSVWriter(new FileWriter(file))) {
            writer.writeAll(list);

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
