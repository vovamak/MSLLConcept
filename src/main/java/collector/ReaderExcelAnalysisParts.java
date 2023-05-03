package collector;

import java.util.Collections;
import java.util.List;

public class ReaderExcelAnalysisParts {
    private EXCELMainCollector EXCELMainCollector;
   // private String patch= "W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\initial datas\\Analysis parts\\";

    public List<String[]> getAnalysispartsList() {
        return Collections.unmodifiableList(analysisparts);
    }

    private List<String[]> analysisparts ;

    public ReaderExcelAnalysisParts(String filename){
        EXCELMainCollector = new EXCELMainCollector(filename,"Анализ", (short) 12);
        analysisparts=EXCELMainCollector.getList();
    }

}
