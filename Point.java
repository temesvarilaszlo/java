public class Point
{
    private double x;
    private double y;

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point() {}
    
    public void move(double dx, double dy)
    {
        x += dx;
        y += dy;
    }

    public void mirror(double cx, double cy)
    {
        double dx = (cx - x) * 2;
        double dy = (cy - x) * 2;
        move(dx, dy);
    }

    public void mirror(Point other)
    {
        double dx = (other.x - x) * 2;
        double dy = (other.y - x) * 2;
        move(dx, dy);
    }

    public double distance(Point other)
    {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public void print()
    {
        System.out.println("(" + x + "," + y + ")");
    }
}