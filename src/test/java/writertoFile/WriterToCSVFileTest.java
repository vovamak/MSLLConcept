package writertoFile;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WriterToCSVFileTest {
    private final List<String[]> lists= new ArrayList<>();


    private final Path path = Paths.get("W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\BDs\\PartNumber");
    private final String name = "BCD20";

    @Test
    void writToFile() {
        lists.add(new String[] {"240406","M25988-1-012","SBAF3","1","ATECH"," 27-178-00-01 FOR BCD/H0317034","EA","299577"});

       WriterToCSVFile.writToFile(lists,path,name);


    }
}