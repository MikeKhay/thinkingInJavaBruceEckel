package chapter5.initialization.task22;

public class App {
    public static void main(String[] args) {

        SwichMoney
                uan = new SwichMoney(Money.UAN),
                dollar = new SwichMoney(Money.DOLLAR),
                euro = new SwichMoney(Money.EURO),
                zloty = new SwichMoney(Money.ZLOTY),
                ruble = new SwichMoney(Money.RUBLE),
                crown = new SwichMoney(Money.CROWN);

        uan.swichAllMoney();
        dollar.swichAllMoney();
        euro.swichAllMoney();
        zloty.swichAllMoney();
        ruble.swichAllMoney();
        crown.swichAllMoney();
    }
}
