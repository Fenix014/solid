package optare.solid.lsp3;

public class Square implements IRectangle {

    private int width;

    Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.getWidth();
    }

    public int calculateArea() {
        return this.getHeight() * this.getWidth();
    }
}