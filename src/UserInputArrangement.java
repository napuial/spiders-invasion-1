public class UserInputArrangement {

    private String coordinates;

    public UserInputArrangement(String cords) {
        coordinates = cords.toUpperCase();
    }

    String arrangementCoordinates() {
        try {
            Integer.parseInt("" + coordinates.charAt(0));
            return coordinates;
        } catch (NumberFormatException e) {
            return "" + coordinates.charAt(1) + coordinates.charAt(0);
        }
    }
}
