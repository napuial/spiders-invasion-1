public enum SpidersCatalog {

    SPIDER1("/\\\\Oo.oO//\\", 3, 1),
    SPIDER2("/\\\\O.O//\\", 2, 2),
    SPIDER3("/\\o.o/\\", 1, 2);

    final private String SKIN_PATTERN;
    final private Integer HEALTH;
    final private Integer POPULATION;

    SpidersCatalog(String skinPattern, Integer health, Integer population) {
        SKIN_PATTERN = skinPattern;
        HEALTH = health;
        POPULATION = population;
    }

    public String getSKIN_PATTERN() {
        return SKIN_PATTERN;
    }

    public Integer getHEALTH() {
        return HEALTH;
    }

    public Integer getPOPULATION() {
        return POPULATION;
    }
}
