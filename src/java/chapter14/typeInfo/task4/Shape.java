package chapter14.typeInfo.task4;
 abstract class Shape {
     void draw(){
         System.out.println(this + ".draw()");
     }
     abstract public String toString();
}
