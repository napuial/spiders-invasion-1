public class Spider {

    final private String SKIN;
    final private Integer SKIN_LENGTH;

    public Spider(SpidersCatalog chosenSpider) {
        SKIN = chosenSpider.getSKIN_PATTERN();
        SKIN_LENGTH = SKIN.length();
    }

    public String getSKIN() {
        return SKIN;
    }

    public Integer getSKIN_LENGTH() {
        return SKIN_LENGTH;
    }
}
