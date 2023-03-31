public enum SpidersCatalog {

    SPIDER1("/\\\\Oo.oO//\\", 1),
    SPIDER2("/\\\\O.O//\\", 2),
    SPIDER3("/\\o.o/\\", 2);

    final private String SKIN_PATTERN;
    final private Integer POPULATION;

    SpidersCatalog(String skinPattern, Integer population) {
        SKIN_PATTERN = skinPattern;
        POPULATION = population;
    }

    public String getSKIN_PATTERN() {
        return SKIN_PATTERN;
    }

    public Integer getPOPULATION() {
        return POPULATION;
    }
}
