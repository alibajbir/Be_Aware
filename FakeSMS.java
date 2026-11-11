public class FakeSMS extends Scam {
    private String senderNumber;

    public FakeSMS(String title, String message, String senderNumber) {
        super(title, message);
        this.senderNumber = senderNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("From number: " + senderNumber);
    }

    @Override
    public boolean detect(int action) {
        return action != 1;
    }

    @Override
    public String getRedFlag() {
        return "Unknown number with a shortened link";
    }
}
