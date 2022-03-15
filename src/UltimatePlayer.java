public class UltimatePlayer extends Person {

    private static int jerseyNumber = 1;
    private int jersey;
    private String position;

    public UltimatePlayer(String first, String last, String pos) {
        super(first, last);
        jersey = jerseyNumber;
        jerseyNumber++;
        position = pos;
    }

    public UltimatePlayer() {

    }

    public int getJersey() {
        return jersey;
    }
}
