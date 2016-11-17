package Porahuika;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

/**
 * Created by spencer on 08.01.16.
 */
public class ActionsEASY  {


    boolean multiply() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultMultiply=false;
        int firstNumber = (int)(Math.random()*3);
        int secondNumber = (int)(Math.random()*3);
        System.out.println(firstNumber+" помножити на "+secondNumber);
        int resultTrue = firstNumber*secondNumber;
        System.out.println("Введіть відповідь: ");
        int userResult=-1;
        try {
            userResult = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            //System.out.println("Введіть відповідь: ");
        }


        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            try {
                userResult = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                //System.out.println("Введіть відповідь: ");
            }

        }
        return resultMultiply;
    }

    boolean addition () throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultAddition=false;
        int firstNumber = (int)(Math.random()*10);
        int secondNumber = (int)(Math.random()*10);
        System.out.println(firstNumber+" додати "+secondNumber);
        int resultTrue = firstNumber+secondNumber;
        System.out.println("Введіть відповідь: ");
        int userResult= -1;
        try {
            userResult = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            //System.out.println("Введіть відповідь: ");
        }
        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            try {
                userResult = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                //System.out.println("Введіть відповідь: ");
            }
        }

        return resultAddition;
    }

    boolean subtraction () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultSubstraction=false;
        int firstNumber = (int)(Math.random()*10);
        int secondNumber = (int)(Math.random()*10);
        int resultTrue = firstNumber+secondNumber;
        if (firstNumber>=secondNumber){
            resultTrue=firstNumber-secondNumber;
            System.out.println(firstNumber+" відняти "+secondNumber);
        } else if (secondNumber>=firstNumber){
            resultTrue=secondNumber-firstNumber;
            System.out.println(secondNumber+" відняти "+firstNumber);
        }
        System.out.println("Введіть відповідь: ");
        int userResult= -1;
        try {
            userResult = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            //System.out.println("Введіть відповідь: ");
        }
        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            try {
                userResult = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                //System.out.println("Введіть відповідь: ");
            }
        }

        return resultSubstraction;
    }

    boolean division ( ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean resultDivision = false;

        int firstNumber = (int)((Math.random()*47)+3);
        int secondNumber = (int)((Math.random()*9)+1);
        while ((firstNumber%secondNumber)!=0){
            firstNumber = (int)((Math.random()*47)+3);
            secondNumber = (int)((Math.random()*9)+1);
        }
        int resultTrue=firstNumber/secondNumber;
        System.out.println(firstNumber+" поділити на "+secondNumber);
        System.out.println("Введіть відповідь: ");
        int userResult= -1;
        try {
            userResult = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            //System.out.println("Введіть відповідь: ");
        }
        while (userResult!=resultTrue){
            System.out.println("Відповідь не вірна, введіть відповідь ЩЕ РАЗ");
            try {
                userResult = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                //System.out.println("Введіть відповідь: ");
            }
        }

        return resultDivision;
    }

}
