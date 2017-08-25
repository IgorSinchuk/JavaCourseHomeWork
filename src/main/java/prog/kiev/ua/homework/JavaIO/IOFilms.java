package prog.kiev.ua.homework.JavaIO;

import java.io.*;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class IOFilms extends Films {

    private final String fileName = "/IdeaProjects/JavaCourseHomeWork/prog/kiev/src/JavaIO/films.txt";
    private final String binfileName = "/IdeaProjects/JavaCourseHomeWork/prog/kiev/ua/src/JavaIO/films_binary.txt";
    public IOFilms(){
        super();
    }


    public void writeFilms() throws IOException {

        try (Writer writer = new FileWriter(fileName)){

            for (Film film : super.films) {
                String f = film.getName() + ";"+film.getYear() ;
                writer.write(f);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Films readFilms() throws IOException {
        Films films = new Films();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line=reader.readLine())!=null){
                String[] token = line.split(";");
                films.addFilm(new Film(token[0],Integer.parseInt(token[1])));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return films;

    }

    public void writeStream() throws FileNotFoundException {
        File file = new File(binfileName);
        try(FileOutputStream output = new FileOutputStream(file)) {
            try (ObjectOutputStream out = new ObjectOutputStream(output)){
                out.writeObject(films.toString());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String readStream(){
        File inputFile = new File(binfileName);
        String films = null;
        try(FileInputStream fis = new FileInputStream(inputFile)){
            try (ObjectInputStream in  = new ObjectInputStream(fis)){
                films = (String)in.readObject();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return films;
    }
}
