public class Platform {
    private Scam[] scams = new Scam[10];
    private int count = 0;

    public void addScam(Scam s) {
        if (count < scams.length) {
            scams[count] = s;
            count++;
        } else {
            System.out.println("Platform is full");
        }
    }

    public int getCount() {
        return count;
    }

    public Scam getScam(int index) {
        if (index >= 0 && index < count) {
            return scams[index];
        }
        return null;
    }

    public boolean play(Learner learner, Scam scam, int action) {
        if (action < 1 || action > 3) {
            return false;
        }
        boolean correct = scam.detect(action);
        if (correct) {
            learner.getProfile().addPoints();
        }
        return correct;
    }
}
