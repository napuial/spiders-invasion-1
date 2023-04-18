public class Spider {

    final private  Integer ID;
    private Integer HEALTH;

    public Spider(Integer id, SpidersCatalog spider) {
        ID = id;
        HEALTH = spider.getHEALTH();
    }

    public Integer getHEALTH() {
        return HEALTH;
    }

    public void setHEALTH(Integer health) {
        HEALTH = health;
    }

    public Integer getID() {
        return ID;
    }
}
