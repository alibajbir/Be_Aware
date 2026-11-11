import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Platform platform = new Platform();


        PhishingEmail s1 = new PhishingEmail("Al-Qutaibi Bank Email",
                "Your account is suspended! Click to verify.",
                "support@qutaibi-secure123.com");
        platform.addScam(s1);


        FakeSMS s2 = new FakeSMS("Al-Mashqas Exchange SMS",
                "Your package is on hold. Pay 100000 Southern YER.",
                "+967 770 123 456");
        platform.addScam(s2);


        FakeWebsite s3 = new FakeWebsite("Kuraimi Login Page",
                "The page asks for your username and card number.",
                "www.kuraimi-login-fake.com");
        platform.addScam(s3);


        FraudCall s4 = new FraudCall("Bank Call",
                "Tell me the code sent to your phone.",
                "Bank Security Department");
        platform.addScam(s4);


        System.out.print("Enter your name: ");
        String userName = in.nextLine();
        Learner learner = new Learner(userName);

        for (int i = 0; i < platform.getCount(); i++) {
            Scam s = platform.getScam(i);
            s.display();
            System.out.println("1) Click   2) Ignore   3) Report");
            System.out.print("Your choice: ");
            int choice = in.nextInt();

            boolean result = platform.play(learner, s, choice);
            if (result == true) {
                System.out.println("Correct! +10");
            } else {
                System.out.println("Wrong! Red flag: " + s.getRedFlag());
            }
            System.out.println();
        }

        AwarenessProfile p = learner.getProfile();
        System.out.println(learner.getName()
                + " | Points: " + p.getPoints()
                + " | Level: " + p.getLevel());
    }
}