public class Learner {
    private String name;
    private AwarenessProfile profile;

    public Learner(String name) {
        setName(name);
        this.profile = new AwarenessProfile();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid name");
        }
    }

    public AwarenessProfile getProfile() {
        return profile;
    }
}
