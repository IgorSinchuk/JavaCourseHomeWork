package prog.kiev.ua.homework.Module3.TextHW;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igorsinchuk on 7/27/17.
 */
public class Text {

    public String header;
    public List<String> word = new ArrayList<>();

    public void addText(String text) {
        word.add(text);
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void printer() {
        System.out.println(header);
        for (String s : word) {
            System.out.println(s + " ");
        }
    }
}
