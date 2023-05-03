package collector;

import org.junit.jupiter.api.Test;
import writertoFile.WriterToCSVFile;

import java.nio.file.Path;
import java.nio.file.Paths;

class ReaderExcelAnalysisPartsTest {
    long m = System.currentTimeMillis();

    ReaderExcelAnalysisParts readerExcelAnalysisParts = new ReaderExcelAnalysisParts("W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\initial datas\\Analysis parts\\Analysis parts 2023 .xlsx");
    private final Path path = Paths.get("W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\BDs\\Analysis");

    @Test
    void getAnalysisparts() {System.out.println(System.currentTimeMillis() - m);
    }
    @Test
    void writeAnalysistoCSV() {

        String filename = "Analysis";
        WriterToCSVFile.writToFile(readerExcelAnalysisParts.getAnalysispartsList(),path, filename);
        System.out.println(System.currentTimeMillis() - m);
    }
}