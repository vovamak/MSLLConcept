package model;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

class ReaderCSVTest {

    String AFLStatisicFile = "W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\BDs\\Statistic\\AFL.scv";

    String AnalysisFile = "W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\BDs\\Analysis\\Analysis.scv";



    @Test
    void getListStaticFile() {
        long m = System.currentTimeMillis();
        ReaderCSV readerCSV = new ReaderCSV(AFLStatisicFile);
        String testString = "240396";
        List<String[]>list = readerCSV.getList();
        System.out.println("AFLStatisicFile -"+ (double)(System.currentTimeMillis() - m)/1000);

        Assert.assertEquals(testString,list.get(0)[0]);






    }
    @Test
    void getListAnalysisFile() {
        long m = System.currentTimeMillis();
        ReaderCSV readerCSV = new ReaderCSV(AnalysisFile);
        String testString = "P196698";
        List<String[]>list = readerCSV.getList();
        System.out.println("AnalysisFile -"+ (double)(System.currentTimeMillis() - m)/1000);

        Assert.assertEquals(testString,list.get(4)[0]);






    }
}