import java.util.Random;

public class Bottle {
    private String name;
    private int content;
    private String mouthPiece;
    private double height;
    private double diameter;
    private int marginalCapacity;
    private int weight;
    private boolean isFilled;
    private long serialNumber;

    public Bottle(String name, int content, String mouthPiece, double height, double diameter,
                  int marginalCapacity, int weight, boolean isFilled) {
        this.name = name;
        this.content = content;
        this.mouthPiece = mouthPiece;
        this.height = height;
        this.diameter = diameter;
        this.marginalCapacity = marginalCapacity;
        this.weight = weight;
        this.isFilled = isFilled;
        this.serialNumber = new Random().nextLong(1000000000L, 9999999999L);
    }

    public boolean equals(Bottle other) {
        return this.serialNumber == other.serialNumber;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getContent() {
        return content;
    }

    public String getMouthPiece() {
        return mouthPiece;
    }

    public double getHeight() {
        return height;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getMarginalCapacity() {
        return marginalCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}
