package chapter12.task16;

public class CADSystem extends Shape{

    private Circle c;
    private Triangle t;
    private static Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);

    }

    void dispose(){
//        System.out.println("CADSystem.dispose()");
//        t.dispose();
//        c.dispose();
//        for (int i = lines.length - 1; i >= 0; i--)
//            lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try{
            for(int j = 0; j < lines.length; j++)
                lines[j] = new Line(j, j * j);
            Circle c = new Circle(1);
            Triangle t = new Triangle(1);
            System.out.println("Combined constructor");

//            System.out.println("CADSystem.dispose()");
            t.dispose();
            c.dispose();
            for (int i = lines.length - 1; i >= 0; i--)
                lines[i].dispose();
        }
        finally {
            x.dispose();
        }
    }
}
