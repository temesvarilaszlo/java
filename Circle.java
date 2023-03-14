package plane;

public class Circle
{
    private double x;
    private double y;
    private double radius;

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if (radius <= 0) throw new IllegalArgumentException();
        else this.radius = radius;
    }

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        if (radius <= 0) throw new IllegalArgumentException();
        else this.radius = radius;
    }

    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }

    public void print()
    {
        System.out.println("Középpont: (" + x + "," + y + "), Sugár: " + radius);
    }
}