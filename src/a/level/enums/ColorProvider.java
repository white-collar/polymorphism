package a.level.enums;

public class ColorProvider {
    private Colors color;

    public ColorProvider(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
