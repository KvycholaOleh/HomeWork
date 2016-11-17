package Porahuika;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by spencer on 19.01.16.
 */
public class TestV3STABLE {
    public static final int MSECOND = 1000;
    public static int GAME_NUMBER = 0;
    public static void trueAnswer(long timeSpent) {
        System.out.println("Відповідь вірна ВІТАЄМО!");
        System.out.println("Ви думали " + (timeSpent / MSECOND) + " секунд(и)");
    }

    public static void main(String[] args) throws Exception {
        long totalTime=0;

        ArrayList<Integer> list = new ArrayList();
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "Перемножити два числа");
        menu.put(2, "Додати два числа");
        menu.put(3, "Відняти два числа");
        menu.put(4, "Поділити два числа");

        ActionsHARD action = new ActionsHARD();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 5; i++) {
            System.out.println("Виберіть завдання : ");

            for (int j = 1; j < 5; j++) {

                if (menu.get(j) != (null)) System.out.println("  " + j + ". " + menu.get(j));
            }

            GAME_NUMBER = Integer.parseInt(reader.readLine());

            for (int z=0;z<5;z++)
            {

                for (Integer listElement : list)
                {
                    while (listElement == GAME_NUMBER)
                    {
                        System.out.println("Це завдання вже виконано, виберіть інше!");
                        for (int l = 1; l < 5; l++)
                        {
                            if (menu.get(l) != (null))
                                System.out.println("  " + l + ". " + menu.get(l));
                        }
                        GAME_NUMBER = Integer.parseInt(reader.readLine());

                    }
                }
            }

                switch (GAME_NUMBER) {
                    case 1:

                        long startTime = System.currentTimeMillis();
                        action.multiply();
                        long finishTime = System.currentTimeMillis() - startTime;
                        trueAnswer(finishTime);
                        totalTime+=finishTime/MSECOND;
                        break;
                    case 2:
                        startTime = System.currentTimeMillis();
                        action.addition();
                        finishTime = System.currentTimeMillis() - startTime;
                        trueAnswer(finishTime);
                        totalTime+=finishTime/MSECOND;
                        break;
                    case 3:
                        startTime = System.currentTimeMillis();
                        action.subtraction();
                        finishTime = System.currentTimeMillis() - startTime;
                        trueAnswer(finishTime);
                        totalTime+=finishTime/MSECOND;
                        break;
                    case 4:
                        startTime = System.currentTimeMillis();
                        action.division();
                        finishTime = System.currentTimeMillis() - startTime;
                        trueAnswer(finishTime);
                        totalTime+=finishTime/MSECOND;
                        break;

                }
                list.add(GAME_NUMBER);
                menu.remove(GAME_NUMBER);
            }
        System.out.println("Загальний час : " +totalTime+" секунд(и).");

        }

    }
