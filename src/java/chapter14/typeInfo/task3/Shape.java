package chapter14.typeInfo.task3;
 abstract class Shape {
     void draw(){
         System.out.println(this + ".draw()");
     }
     abstract public String toString();
}
