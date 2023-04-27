public class Spider {

    final private Integer ID;
    final private Integer FIRST_LEG_INDEX;
    final private String SKIN;
    private Integer health;

    public Spider(Integer id, Integer firstLegIndex, SpidersCatalog spider) {
        ID = id;
        FIRST_LEG_INDEX = firstLegIndex;
        SKIN = spider.getSKIN_PATTERN();
        health = spider.getHEALTH();
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getFIRST_LEG_INDEX() {
        return FIRST_LEG_INDEX;
    }

    public String getSKIN() {
        return SKIN;
    }
}
