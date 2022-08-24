
public class factoryPattern {
    public static void main(String args[])
    {
        factoryPattern fp = new factoryPattern();
        fp.getShape("circle");
        fp.getShape("rectangle");
        fp.getShape("square");
    }
    public void getShape(String shape)
    {
        if(shape == "circle")
        {
            circle c = new circle();
            c.draw();
        }
        else if(shape == "rectangle")
        {
            rectangle r = new rectangle();
            r.draw();
        }
        else if(shape == "square")
        {
            square s = new square();
            s.draw();
        }
    }
}
class circle
{
    public void draw()
    {
        System.out.println("circle drawn");
    }
}
class rectangle
{
    public void draw()
    {
        System.out.println("rectangle drawn");
    }
}
class square
{
    public void draw()
    {
        System.out.println("square drawn");
    }
}
