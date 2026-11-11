public class FraudCall extends Scam {
    private String claimedEntity;

    public FraudCall(String title, String message, String claimedEntity) {
        super(title, message);
        this.claimedEntity = claimedEntity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Caller claims to be: " + claimedEntity);
    }

    @Override
    public boolean detect(int action) {
        return action == 3;
    }

    @Override
    public String getRedFlag() {
        return "Asks for OTP or card number by phone";
    }
}