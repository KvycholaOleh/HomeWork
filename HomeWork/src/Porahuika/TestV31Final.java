package Porahuika;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by spencer on 19.01.16.
 */
public class TestV31Final {
    public static final int MSECOND = 1000;
    public static void trueAnswer(long timeSpent) {
        System.out.println("Відповідь вірна ВІТАЄМО!");
        System.out.println("Ви думали " + (timeSpent / MSECOND) + " секунд(и)");
    }


    public static void main(String[] args) throws Exception {
        ScoreWriter scoreWriter = new ScoreWriter();


        long totalTime=0;
        int GAME_NUMBER=0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "Перемножити два числа");
        menu.put(2, "Додати два числа");
        menu.put(3, "Відняти два числа");
        menu.put(4, "Поділити два числа");

        ActionsHARD actionsHARD = new ActionsHARD();
        ActionsNORMAL actionsNORMAL = new ActionsNORMAL();
        ActionsEASY actionsEASY = new ActionsEASY();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть ваше ім’я: ");
        String name = reader.readLine();

            while (set.size()!=4){
                System.out.println("Виберіть завдання : ");
                System.out.println();

                for (int j = 1; j < 5; j++) {

                    if (menu.get(j) != (null)) System.out.println("  " + j + ". " + menu.get(j));
                }

                try {
                    GAME_NUMBER = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException e) {
                    //System.out.println("Vvedy normalno");
                }

                if (GAME_NUMBER>0 && GAME_NUMBER<5) {

                    while (set.contains(GAME_NUMBER))
                    {
                        System.out.println("Це завдання вже виконано, виберіть інше!");
                        for (int l = 1; l < 5; l++)
                        {
                            if (menu.get(l) != (null))
                                System.out.println("  " + l + ". " + menu.get(l));
                        }
                        try {
                            GAME_NUMBER = Integer.parseInt(reader.readLine());
                        } catch (NumberFormatException e) {
                            //System.out.println("Vvedy norm");
                        }
                    }

                }
                    if (GAME_NUMBER>0 && GAME_NUMBER<5) {
                        set.add(GAME_NUMBER);
                        menu.remove(GAME_NUMBER);

                    switch (GAME_NUMBER) {
                        case 1:
                            long startTime = System.currentTimeMillis();
                            actionsEASY.multiply();
                            long finishTime = System.currentTimeMillis() - startTime;
                            trueAnswer(finishTime);
                            System.out.println("Ви виконали "+set.size()+" завдання");
                            System.out.println();
                            totalTime += finishTime / MSECOND;
                            break;
                        case 2:
                            startTime = System.currentTimeMillis();
                            actionsNORMAL.addition();
                            finishTime = System.currentTimeMillis() - startTime;
                            trueAnswer(finishTime);
                            System.out.println("Ви виконали "+set.size()+" завдання");
                            System.out.println();
                            totalTime += finishTime / MSECOND;
                            break;
                        case 3:
                            startTime = System.currentTimeMillis();
                            actionsNORMAL.subtraction();
                            finishTime = System.currentTimeMillis() - startTime;
                            trueAnswer(finishTime);
                            System.out.println("Ви виконали "+set.size()+" завдання");
                            System.out.println();
                            totalTime += finishTime / MSECOND;
                            break;
                        case 4:
                            startTime = System.currentTimeMillis();
                            actionsEASY.division();
                            finishTime = System.currentTimeMillis() - startTime;
                            trueAnswer(finishTime);
                            System.out.println("Ви виконали "+set.size()+" завдання");
                            System.out.println();
                            totalTime += finishTime / MSECOND;
                            break;

                    }


                } else System.out.println("Такого не існує");

            }

        System.out.println("Загальний час : " +totalTime+" секунд(и).");
        scoreWriter.writeScore(name,totalTime);

    }



    }

