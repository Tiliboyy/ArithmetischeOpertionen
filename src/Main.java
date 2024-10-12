
import Logger.Logger;
import NumberContainer.*;

import java.util.*;

public class Main{

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        Logger.Log("Bitte gieb die erste Zahl ein: ");
        float num1 = scanner.nextFloat();
        Logger.Log("Bitte gieb die zweite Zahl ein: ");
        float num2 = scanner.nextFloat();
        scanner.close();
        List<NumberContainer> results = getNumberContainers(num1, num2);
        for (NumberContainer element : results){
            element.Calculate();
            Logger.Log(element + "\n");
        }
        Logger.Log(" So nh random names Til vom Internet hat dieses ding so hart over complicated");
        Logger.Log(" Das Programm Arithmetische Opertionen wurde beendet. Auf Wiedersehen!");

    }

    private static List<NumberContainer> getNumberContainers(float num1, float num2) {
        var addition = new NumberContainer("Addition (+)", num1, num2, OperatorType.ADDITION);
        var subtraction = new NumberContainer("Subtraktion (-)", num1, num2, OperatorType.SUBTRACTION);
        var multiplication = new NumberContainer("Muliplikation (*)", num1, num2, OperatorType.MULTIPLICATION);
        var division1 = new NumberContainer("Division 1 (/)", num1, num2, OperatorType.DIVISION);
        var division2 = new NumberContainer("Division 2 (\\)", num2,num1 , OperatorType.DIVISION);
        var modulo = new NumberContainer("Modulo (%)", num1, num2, OperatorType.MODULO);
        ArrayList<NumberContainer> results = new ArrayList<NumberContainer>();
        results.add(addition);
        results.add(subtraction);
        results.add(multiplication);
        results.add(division1);
        results.add(division2);
        results.add(modulo);
        return results;
    }
}