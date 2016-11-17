package Porahuika;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by spencer on 08.01.16.
 */
public class ActionsTestOneThread {

    boolean multiply() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultMultiply=false;
        int firstNumber = (int)(Math.random()*50);
        int secondNumber = (int)(Math.random()*50);
        System.out.println(firstNumber+" помножити на "+secondNumber);
        int resultTrue = firstNumber*secondNumber;
        System.out.println("Введіть відповідь: ");
        int userResult= 0;
        try {
            userResult = resultTrue;
        } catch (NumberFormatException e) {
            System.out.println("Введіть номер завдання!");
        }
        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            userResult = Integer.parseInt(reader.readLine());
        }
        return resultMultiply;
    }

    boolean addition () throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultAddition=false;
        int firstNumber = (int)(Math.random()*1000);
        int secondNumber = (int)(Math.random()*1000);
        System.out.println(firstNumber+" додати "+secondNumber);
        int resultTrue = firstNumber+secondNumber;
        System.out.println("Введіть відповідь: ");
        int userResult= 0;
        try {
            userResult = resultTrue;
        } catch (NumberFormatException e) {
            System.out.println("Введіть номер завдання!");
        }
        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            userResult = Integer.parseInt(reader.readLine());
        }

        return resultAddition;
    }

    boolean subtraction () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultSubstraction=false;
        int firstNumber = (int)(Math.random()*10000);
        int secondNumber = (int)(Math.random()*10000);
        int resultTrue = firstNumber+secondNumber;
        if (firstNumber>=secondNumber){
            resultTrue=firstNumber-secondNumber;
            System.out.println(firstNumber+" відняти "+secondNumber);
        } else if (secondNumber>=firstNumber){
            resultTrue=secondNumber-firstNumber;
            System.out.println(secondNumber+" відняти "+firstNumber);
        }
        System.out.println("Введіть відповідь: ");
        int userResult = 0;
        try {
            userResult = resultTrue;
        } catch (NumberFormatException e) {
            System.out.println("Введіть номер завдання!");
        }
        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            userResult = Integer.parseInt(reader.readLine());
        }

        return resultSubstraction;
    }

    boolean division ( ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultDivision = false;

        int firstNumber = (int)((Math.random()*470)+30);
        int secondNumber = (int)((Math.random()*97)+3);
        while ((firstNumber%secondNumber)!=0){
            firstNumber = (int)((Math.random()*470)+30);
            secondNumber = (int)((Math.random()*97)+3);
        }
        int resultTrue=firstNumber/secondNumber;
        System.out.println(firstNumber+" поділити на "+secondNumber);
        System.out.println("Введіть відповідь: ");
        int userResult = 0;
        try {
            userResult = resultTrue;
        } catch (NumberFormatException e) {
            System.out.println("Введіть номер завдання!");
        }
        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            userResult = Integer.parseInt(reader.readLine());
        }

        return resultDivision;
    }

}
