package chapter5.initialization.task22;

public class SwichMoney {

    Money money;

    public SwichMoney(Money money){
        this.money = money;
    }

    public void swichAllMoney(){
        switch (money){
            case UAN:
                System.out.println("It is Uar");
                break;
            case EURO:
                System.out.println("It is Euro");
                break;
            case CROWN:
                System.out.println("It is Crown");
                break;
            case RUBLE:
                System.out.println("It is Ruble");
                break;
            case ZLOTY:
                System.out.println("It is Zloty");
                break;
            case DOLLAR:
                System.out.println("It is Dollar");
                break;
            default:
                System.out.println("It isn't money");
        }
    }

}
