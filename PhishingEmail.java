public class PhishingEmail extends Scam {
    private String senderAddress;

    public PhishingEmail(String title, String message, String senderAddress) {
        super(title, message);
        this.senderAddress = senderAddress;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("From: " + senderAddress);
    }

    @Override
    public boolean detect(int action) {
        return action != 1;
    }

    @Override
    public String getRedFlag() {
        return "Sender address does not match the real company";
    }
}