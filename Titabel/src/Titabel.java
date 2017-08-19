
/**
 * Created by Christian on 19-Aug-17.
 */
public class Titabel {

    public static void main(String[] args) {
        tabel(1);
        tabel(3);
        tabel(5);


    }

    public void tabel(int counter){

        System.out.println("The " + counter + " line is:");

        int runthroug_counter = 1;
        while (runthroug_counter <= 10){
            System.out.println("****: " + runthroug_counter*counter);
            runthroug_counter ++;
        }


    }


}
