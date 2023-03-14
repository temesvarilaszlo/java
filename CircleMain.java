package plane.but.not.flying;
import plane.PublicCircle;
import plane.Circle;

public class CircleMain
{
    public static void main(String[] args)
    {
        PublicCircle c = new PublicCircle();
        System.out.println("Kör területe: " + c.getArea());
        c.x = 5;
        c.y = 2;
        c.radius = 10;
        System.out.println("Kör területe: " + c.getArea());

        try
        {
        Circle c1 = new Circle(2,3,1);
        c1.print();
        System.out.println("Kör2 területe: " + c1.getArea());
        c1.setX(5);
        c1.setY(6);
        c1.setRadius(-1);
        System.out.println("Kör2 területe: " + c1.getArea());
        c1.print();
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Nem lehet 0 vagy kisebb a sugár!!");
        }
    }
}