public class FakeWebsite extends Scam {
    private String fakeUrl;

    public FakeWebsite(String title, String message, String fakeUrl) {
        super(title, message);
        this.fakeUrl = fakeUrl;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("You opened: " + fakeUrl);
    }

    @Override
    public boolean detect(int action) {
        return action == 2 || action == 3;
    }

    @Override
    public String getRedFlag() {
        return "The domain imitates a real website and asks for your card details";
    }
}