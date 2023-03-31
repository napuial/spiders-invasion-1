import java.util.Random;

public class RandomizationUtility {

    public static Integer randomRow(Integer totalRows) {
        Random random = new Random();
        int randomRow = random.nextInt(totalRows);
        return randomRow;
    }

    public static Integer randomIndex(SpidersCatalog spider, Integer totalColumns) {
        Random random = new Random();
        int randomIndex = random.nextInt(totalColumns - spider.getSKIN_PATTERN().length() + 1);
        return randomIndex;
    }
}
