package a.level.geometry;

import a.level.enums.ColorProvider;
import a.level.enums.Colors;
import a.level.exceptions.Calculator;
import a.level.singleton.DatabaseConnection;



public class Runner {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(300, 400);
//        System.out.println(rectangle);
//
//        ColorProvider colorProvider = new ColorProvider(Colors.GREEN);
//        System.out.println(colorProvider.getColor());
//
//        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
//        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();

        try {
            Calculator calculator = new Calculator(333, 555);
            calculator.getDivision();
            System.out.println(calculator.getAnswer());
        } finally {
            Calculator calculator = new Calculator(444, 777);
            calculator.getDivision();
            System.out.println(calculator.getAnswer());
        }


    }
}
