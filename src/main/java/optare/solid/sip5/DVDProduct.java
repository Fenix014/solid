package optare.solid.sip5;

public class DVDProduct implements Product {

    public String getName() {
        return "DVD";
    }

    public int getStock() {
        return 30;
    }

    public int getRecommendedAge() {
        throw new UnsupportedOperationException();
    }
}