public class TextsStorage {

    final public static String INTRODUCTION_PART1 = "In the corner of the room,";
    final public static String INTRODUCTION_PART2 = "there are spiders...";
    final public static String ENGAGE = "\u001B[36m!!! MAKE THEM BOOM !!!\u001B[0m";
    final public static String AWAITING_COORDINATES = "Coordinates: ";
    final public static String WRONG_VALIDATION = "\u001B[36mVALIDATION FAILED!\u001B[0m" +
            "\nCoordinates should contain a LETTER (A-T)\nand a NUMBER (1-5)";
    final public static String BREAKING_GAME = "EXIT";
    final public static String EMPTY_CELL = "\u001B[36mYOU MISSED. TRY AGAIN!\u001B[0m";
    final public static String REPEATED_CELL = "\u001B[36mTRY ANOTHER ONE!\u001B[0m";
    final public static String HIT_CELL = "\u001B[36mTHE SPIDER IS HURT!\u001B[0m";
    final public static String ELIMINATED_SPIDER = "\u001B[36mTHE SPIDER HAS BEEN ELIMINATED!\u001B[0m";
    final public static String ELIMINATED_SPIDERS = "ALL SPIDERS HAVE BEEN ELIMINATED!";
    final public static String COMPLETE_GAME = "\u001B[36m!!! YOU BOOMED THEM !!!\u001B[0m";
    final public static String FORFEIT_GAME = "\u001B[36mTHE SPIDERS OVERTOOK THE ROOM," +
            "\nIN THE AREA IS THE DOOM!\u001B[0m";
    final public static String CYAN_DOT = "\u001B[36m. \u001B[0m";
    final public static String ANIMATION_FRAME_STAY = "/\\o.o/\\   /\\\\O.O//\\   /\\\\Oo.oO//\\";
    final public static String ANIMATION_FRAME_MOVE_LEFT = "\\\\o.o/\\   \\\\\\O.O//\\   \\\\\\Oo.oO//\\";
    final public static String ANIMATION_FRAME_MOVE_RIGHT = "/\\o.o//   /\\\\O.O///   /\\\\Oo.oO///";

    public static String makeSpaces(Integer amountOfSpaces) {
        StringBuilder spaces = new StringBuilder();
        for(int i = amountOfSpaces; i >= 0; i--) {
            spaces.append(" ");
        }
        return spaces.toString();
    }

    public static String generateIntroduction() {
        return new StringBuilder(CYAN_DOT.repeat(INTRODUCTION_PART1.length() / 2))
                .append("\n")
                .append(CYAN_DOT)
                .append(INTRODUCTION_PART1)
                .append("\n")
                .append(CYAN_DOT)
                .append(INTRODUCTION_PART2)
                .append("\n")
                .append(CYAN_DOT.repeat(INTRODUCTION_PART1.length() / 3)).toString();
    }

    public static String generateForfeit() {
        return new StringBuilder("\n")
                .append(makeSpaces(10))
                .append(SpidersCatalog.SPIDER1.getSKIN_PATTERN())
                .append("\n")
                .append(TextsStorage.FORFEIT_GAME).toString();
    }
}
