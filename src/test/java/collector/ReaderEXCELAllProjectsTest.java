package collector;

import org.junit.jupiter.api.Test;
import writertoFile.WriterToCSVFile;

import java.nio.file.Path;
import java.nio.file.Paths;

class ReaderEXCELAllProjectsTest {
    long m = System.currentTimeMillis();
    ReaderEXCELAllProjects readerEXCELAllProjects = new ReaderEXCELAllProjects(OperatorFleet.AFL);
    private final Path path = Paths.get("W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\BDs\\Statistic");


    @Test
    void getALLstatisticAFL() {

        System.out.println(System.currentTimeMillis() - m);

    }
    @Test
    void writeStatistictoCSV() {

        WriterToCSVFile.writToFile(readerEXCELAllProjects.getALLstatisticAFL(),path,"AFL");
        System.out.println(System.currentTimeMillis() - m);
    }
}