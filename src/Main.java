public class Main {
    public static void main(String[] args) {

        Spider spider1 = new Spider(SpidersCatalog.SPIDER1);
        Spider spider2 = new Spider(SpidersCatalog.SPIDER2);
        Spider spider3 = new Spider(SpidersCatalog.SPIDER3);

        System.out.println("SPIDER 1 SKIN: " + spider1.getSKIN() +
                " SPIDER 1 LENGTH: " + spider1.getSKIN_LENGTH());

        System.out.println("SPIDER 2 SKIN: " + spider2.getSKIN() +
                " SPIDER 2 LENGTH: " + spider2.getSKIN_LENGTH());

        System.out.println("SPIDER 3 SKIN: " + spider3.getSKIN() +
                " SPIDER 3 LENGTH: " + spider3.getSKIN_LENGTH());
    }
}