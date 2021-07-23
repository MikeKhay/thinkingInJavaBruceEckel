package chapter14.typeInfo.task5;
 abstract class Shape {

     void draw(){
         System.out.println(this + ".draw()");
     }

     static void rotate(Shape shape){
         if(shape instanceof Circle){
             System.out.println("The object shape is an instance of the class Circle");
             shape.draw();
         }
         else{
             System.out.println("The object shape is not an instance of the class Circle");
         }
     }

     abstract public String toString();
}
