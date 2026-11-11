public class AwarenessProfile {
    private int points;

    public void addPoints(int p) {
        if (p > 0) {
            points = points + p;
        }
    }

    public void addPoints() {
        addPoints(10);
    }

    public int getPoints() {
        return points;
    }

    public String getLevel() {
        String level;
        if (points < 20) {
            level = "Beginner";
        } else if (points < 40) {
            level = "Aware";
        } else {
            level = "Expert";
        }
        return level;
    }
}