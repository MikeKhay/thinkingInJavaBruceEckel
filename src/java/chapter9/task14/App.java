package chapter9.task14;

public class App {
    static void interNumOne(InterNum1 interNum1){
        interNum1.sayHello();
        interNum1.sayHi();
    }
    static void interNumTwo(InterNum2 interNum2){
        interNum2.sayHowAreYou();
        interNum2.sayWhereAreYou();
    }
    static void interNumThree(InterNum3 interNum3){
        interNum3.sayWhatDoYouDo();
        interNum3.sayWhatDoYouThink();
    }
    static void interNumFour(InterNum4 interNum4){
        interNum4.sayGoodBay();
    }

    public static void main(String[] args) {
        ImplementFourInter implementFourInter = new ImplementFourInter();
        interNumOne(implementFourInter);
        interNumTwo(implementFourInter);
        interNumThree(implementFourInter);
        interNumFour(implementFourInter);
    }
}
