package chapter7.reusing.task12;

public class App {
    public static void main(String[] args) {
        Stem stem = new Stem();

        try {
        }
        finally {
            stem.dispose();
        }

    }
}
