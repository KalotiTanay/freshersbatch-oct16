abstract class shapes{
    public abstract void draw();
}

class line extends shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a line");
    }
}

class Rectangle extends shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class cube extends shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a cube");
    }
}

public class drawShapes {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        cube c1 = new cube();
        line l1 = new line();

        r1.draw();;
        c1.draw();;
        l1.draw();
    }
}
