public abstract class Scam implements Detectable {
    private String title;
    private String message;

    public Scam(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("----- " + title + " -----");
        System.out.println(message);
    }

    public abstract String getRedFlag();
}