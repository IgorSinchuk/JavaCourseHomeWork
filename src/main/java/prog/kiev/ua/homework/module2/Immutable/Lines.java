package prog.kiev.ua.homework.module2.Immutable;

import java.util.ArrayList;

/**
 * Created by igorsinchuk on 7/26/17.
 */
public class Lines {

    private ArrayList<Line> lines;


    Lines() {
        lines = new ArrayList<>();
    }

    void add(Line line) {
        lines.add(line);
    }

    double sumLength() {
        double summ = 0;
        for (Line line : lines) {
            summ += line.getLength();
        }

        return summ;
    }

    Line longestLine () {
        double length = -1;
        Line longestLine = null;
        for (Line line : lines) {
            if (length < line.getLength()) {
                length = line.getLength();
                longestLine = line;
            }
        }

        return longestLine;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            stringBuilder.append("Line ").append(i).append("; length is ").append(lines.get(i).getLength()).append("\n");
        }
        return stringBuilder.toString();
    }
}
