package collector;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReaderEXCELAllProjects {

    private EXCELMainCollector EXCELMainCollector;

    private String patch= "W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Project\\";



    public List<String[]> getALLstatisticAFL() {
        return Collections.unmodifiableList(allstatistic);
    }

    private  List<String[]> allstatistic ;


    public ReaderEXCELAllProjects(OperatorFleet operatorFleet){
        String path= String.format("%s\\%s",patch,operatorFleet );
        allstatistic = new ArrayList<>();

        try {
            List<Path> fileList = Files.walk(Paths.get(path))
                    .filter(Files::isRegularFile).toList();

            fileList.forEach(path1 -> readFromFile(path1));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
    private void readFromFile(Path path) {
        EXCELMainCollector = new EXCELMainCollector(path.toString(), null, (short) 8);
        allstatistic.addAll(EXCELMainCollector.getList()) ;



    }

}
