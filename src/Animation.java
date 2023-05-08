public class Animation {

    final private static Integer MAX_AMOUNT_OF_FRAMES = 11;
    private static Integer currentFrame = 0;

    public static void run() throws InterruptedException {
        System.out.println(TextsStorage.generateIntroduction());
        Thread.sleep(1500);
        for(int i = MAX_AMOUNT_OF_FRAMES; i >= 0; i--) {
            Animation.animation();
            Thread.sleep(500);
        }
        System.out.println(new StringBuilder("\r")
                .append(TextsStorage.makeSpaces(10))
                .append(TextsStorage.ENGAGE + "\n"));
        Thread.sleep(1500);
    }

    private static void generateFrame(Integer numberOfSpaces, String animationFrame) {
        System.out.print(new StringBuilder("\r")
                .append(TextsStorage.makeSpaces(numberOfSpaces))
                .append(animationFrame));
    }

    private static void animation() {
        switch(currentFrame) {
            case 1, 5:
                generateFrame(8, TextsStorage.ANIMATION_FRAME_STAY);
                break;
            case 2:
                generateFrame(10, TextsStorage.ANIMATION_FRAME_MOVE_RIGHT);
                break;
            case 3:
                generateFrame(12, TextsStorage.ANIMATION_FRAME_STAY);
                break;
            case 4:
                generateFrame(10, TextsStorage.ANIMATION_FRAME_MOVE_LEFT);
                break;
            case 6:
                generateFrame(6, TextsStorage.ANIMATION_FRAME_MOVE_LEFT);
                break;
            case 7:
                generateFrame(4, TextsStorage.ANIMATION_FRAME_STAY);
                break;
            default:
                currentFrame = 0;
                generateFrame(6, TextsStorage.ANIMATION_FRAME_MOVE_RIGHT);
        }
        currentFrame++;
    }
}
