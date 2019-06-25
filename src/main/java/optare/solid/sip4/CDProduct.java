package optare.solid.sip4;

public class CDProduct implements Product, AgeAware {

    public String getName() {
        return "CD";
    }

    public int getStock() {
        return 10;
    }

    public int getRecommendedAge() {
        return 10;
    }
}