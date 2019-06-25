package optare.solid.lsp3;

public class Rectangle implements IRectangle {

    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public int calculateArea() {
        return width * height;
    }
}