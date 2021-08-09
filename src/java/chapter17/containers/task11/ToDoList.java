package chapter17.containers.task11;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToDoList extends PriorityQueue<ToDoList.ClassOneInt> {
    static class ClassOneInt implements Comparable<ClassOneInt> {
        private Integer num;
        public static Random random = new Random();

        public ClassOneInt() {
            this.num = random.nextInt(100);
        }

        @Override
        public String toString() {
            return "ClassOneInt{" +
                    "num=" + num +
                    '}';
        }

        @Override
        public int compareTo(ClassOneInt classOneInt) {
            return (num < classOneInt.num ? -1 : (num == classOneInt.num ? 0 : 1));
        }

        public Integer getNum() {
            return num;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!( o instanceof ClassOneInt )) return false;
            ClassOneInt that = (ClassOneInt) o;
            return Objects.equals(num, that.num);
        }

        @Override
        public int hashCode() {
            return Objects.hash(num);
        }
    }

    public static void main(String[] args) {
        Queue<ClassOneInt> priorityQue = new PriorityQueue<>();
        for(int i = 0; i < 20; i++){
            priorityQue.offer(new ClassOneInt());
        }
        System.out.println("Before poll()");
        System.out.println(priorityQue);

        System.out.println("After poll()");
        for (int i = 0; i < priorityQue.size(); i++){
            System.out.print(priorityQue.poll() + ", ");
        }
    }
}
