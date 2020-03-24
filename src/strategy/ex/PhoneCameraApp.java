package strategy.ex;

import strategy.ducks.FlyBehavior;

public abstract class PhoneCameraApp {
    public void take(){};
    abstract void edit();
    public void save(){};

    ShareBehavior shareBehavior;

    public void setShareBehavior(ShareBehavior sb) {
        shareBehavior = sb;
    }

    public void performShare() {
        shareBehavior.share();
    }
}
