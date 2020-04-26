class Box
{
    double width;
    double height;
    double depth;
    
    
    Box()
    {
        width = 100;
        height = 100;
        depth = 100;
    }
    
    
    double volume()
    {
        return width * height * depth;
    }
}

class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox1 = new Box();
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of the  box is " + vol);
    }
}