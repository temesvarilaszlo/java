class PointMain
{
    public static void main(String[] args)
    {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(6, 8);

        p1.print();
        p1.move(3, 1);
        p1.print();
        p1.mirror(0,0);
        p1.mirror(p2);
        p1.print();

        Point origo = new Point();
        System.out.println(p2.distance(origo));
    }
}