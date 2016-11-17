package Porahuika;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by spencer on 28.01.16.
 */
public class ScoreWriter {


    public void writeScore(String name, long score){


        try(FileWriter writer = new FileWriter("/home/spencer/IdeaProjects/JavaRushHomeWork/src/Porahuika/scores.txt", true))
        {
            // запись всей строки
            String text = name+" переміг з результатом "+score+" секунд(у/и)" +"\n";
            writer.write(text );

            writer.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}


