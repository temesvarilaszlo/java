class Complex
{
    private double r;
    private double i;

    public Complex(double r, double i)
    {
        this.r = r;
        this.i = i;
    }

    public void print()
    {
        if (i >= 0)
        {
            System.out.println(r + " + " + i + "i");
        }
        else System.out.println(r + " " + i + "i");
    }

    public double abs()
    {
        return Math.sqrt(r*r + i*i);
    }

    public void add(Complex other)
    {
        this.r += other.r;
        this.i += other.i;
    }

    public void sub(Complex other)
    {
        this.r -= other.r;
        this.i -= other.i;
    }

    public void mul(Complex other)
    {
        this.r += this.r * other.r - this.i * other.i;
        this.i += this.r * other.i - this.i * other.r;
    }
}