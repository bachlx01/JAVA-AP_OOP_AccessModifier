public class Circle {
    private Double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        Double area = this.radius*2*Math.PI;
        return area;
    }
}
