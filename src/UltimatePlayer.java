import java.util.Locale;

public class UltimatePlayer extends Player {
        private static int jerseyNumber = 1;
        private int jersey;
        private String position;

        public UltimatePlayer(String firstName, String lastName, String position) {
            super(firstName, lastName);
            jersey = jerseyNumber;
            if (position.toLowerCase().equals("handler") || position.toLowerCase().equals("cutter")) {
                this.position = position;
            } else {
                this.position = "handler";
            }
            jerseyNumber++;
        }

        public UltimatePlayer() {
            super();
            position = "handler";
            jersey = 0;
        }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   Jersey #: " + jersey + "\n   Position: " + position;
    }
}
