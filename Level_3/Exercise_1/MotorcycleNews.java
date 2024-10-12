public class MotorcycleNews extends News {
    private String team;
    private boolean isHondaOrYamaha;

    private static final String[] HONDA_YAMAHA_TEAMS = {"Honda", "Yamaha"};

    public MotorcycleNews(String headline, String team) {
        super(headline);
        this.team = team;
        this.isHondaOrYamaha = determineTeamType(team);
    }

    public MotorcycleNews(String headline, boolean isHondaOrYamaha) {
        super(headline);
        this.isHondaOrYamaha = isHondaOrYamaha;
    }

    private boolean determineTeamType(String team) {
        for (String validTeam : HONDA_YAMAHA_TEAMS) {
            if (team.equalsIgnoreCase(validTeam)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculatePrice() {
        double price = 100;
        if (isHondaOrYamaha) price += 50;
        return price;
    }

    @Override
    public int calculateScore() {
        int score = 3;
        if (isHondaOrYamaha) score += 3;
        return score;
    }
}
