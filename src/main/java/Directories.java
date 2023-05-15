import java.nio.file.Path;
import java.nio.file.Paths;

public class Directories {
    final static Path ROOT_BDs = Paths.get("W:\\OrenFiles\\Ф_01_02_ГИПО_(REN.PRESS)\\Engineering\\Analysis Parts\\Analysis parts Api\\BDs");
    final static Path ALL_PROJECTS_EXCEL = Path.of(ROOT_BDs + "\\Statistic");
    final static Path PRODUCTS_CSV = Path.of(ROOT_BDs + "\\Product");
    final static Path ANALYSIS_CSV= Path.of(ROOT_BDs + "\\Analysis");
}
