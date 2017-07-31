package prog.kiev.ua.homework.Module3.TextHW;

/**
 * Created by igorsinchuk on 7/27/17.
 */
public class Word extends Text {

    private String word;

    public void setWord(String word) {
        this.word = word;
    }


    public void printer() {
        System.out.println(word);
    }
}
