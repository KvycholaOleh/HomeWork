package Porahuika;

import java.io.IOException;

/**
 * Created by spencer on 03.02.16.
 */
public class TestSpeedActionsOneThread  {

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        ActionsTestOneThread actions = new ActionsTestOneThread();
        actions.multiply();
        actions.addition();
        actions.subtraction();
        actions.division();
        long finishTime = System.currentTimeMillis()-startTime;
        System.out.println(finishTime);

    }

}
