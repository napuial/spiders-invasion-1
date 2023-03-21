public enum SpidersCatalog {

    SPIDER1("/\\\\Oo.oO//\\"),
    SPIDER2("/\\\\O.O//\\"),
    SPIDER3("/\\o.o/\\");

    final private String SKIN_PATTERN;

    SpidersCatalog(String skinPattern) {
        SKIN_PATTERN = skinPattern;
    }

    public String getSKIN_PATTERN() {
        return SKIN_PATTERN;
    }
}
