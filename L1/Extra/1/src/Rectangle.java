public class Rectangle {
    public float length=1 , width=1;
    public void setLength (float tmp) {
        if (tmp>=0.0 && tmp<=20.0)
            length = tmp;
        else {
            System.out.println("Number Not Between 0.0 & 20.0!");
            System.exit(0);
        }
    }
    public void setWidth (float tmp) {
        if (tmp>=0.0 && tmp<=20.0)
            width = tmp;
        else {
            System.out.println("Number Not Between 0.0 & 20.0!");
            System.exit(0);
        }
    }
    public float getLength () {
        return length;
    }
    public float getWidth () {
        return width;
    }
    public void perimeter () {
        System.out.println("Perimeter: " + 2*(length +width));
    }
    public void area () {
        System.out.println("Area: " + length *width);
    }
}