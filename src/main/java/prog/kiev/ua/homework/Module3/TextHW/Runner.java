package prog.kiev.ua.homework.Module3.TextHW;

import java.util.Scanner;

/**
 * Created by igorsinchuk on 7/29/17.
 */
public class Runner {

    public static void main(String[] args) {
        Text text = new Text();
        text.addText("Hi!");
        text.addText("You");
        text.addText("suppose");
        text.addText("to");
        text.addText("see");
        text.addText("this.");
        text.setHeader("----");

        Sentence sentence = new Sentence();
        sentence.addText("Demo");
        sentence.addText("sample");
        sentence.setHeader("-----");


        Word word = new Word();
        word.setWord("Demo");
        word.setHeader("----");

        text.printer();
        sentence.printer();
        word.printer();

    }
}
