package strategy.ex;

public class ShareByEmail implements ShareBehavior {
    public void share() {
        System.out.println("share by mail");
    }
}
