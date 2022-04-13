import java.util.ArrayList;

public class UltimateTeam {
    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters() {
        String cutterList = "";
        for (UltimatePlayer player : players) {
            if (player.getPosition().equals("cutter")) {
                cutterList += player.toString() + "\n\n";
            }
        }
        return cutterList;
    }

    public String getHandlers() {
        String handlerList = "";
        for (UltimatePlayer player : players) {
            if (player.getPosition().equals("handler")) {
                handlerList += player.toString() + "\n\n";
            }
        }
        return handlerList;
    }

    @Override
    public String toString() {
        String coachList = "";
        String playerList = "";
        for (Coach coach : coaches) {
            coachList += coach.toString() + "\n\n";
        }
        for (Player player : players) {
            playerList += player.toString() + "\n\n";
        }
        return "COACHES\n" + coachList + "PLAYERS\n" + playerList;
    }
}
