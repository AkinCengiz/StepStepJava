package ClassTrials.TV;

public class NationalChannel extends Channel{
    private boolean isState;

    public NationalChannel(String name, int no, boolean isState) {
        super(name, no);
        this.setState(isState);
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
    }
}
