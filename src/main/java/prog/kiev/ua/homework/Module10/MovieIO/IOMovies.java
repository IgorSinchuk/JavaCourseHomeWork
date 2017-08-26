package prog.kiev.ua.homework.Module10.MovieIO;

import java.io.*;

/**
 * Created by igorsinchuk on 8/24/17.
 */
public class IOMovies extends Movies {

    private final String textFile = "movies.txt";
    private final String binaryFile = "movies_binary.txt";

    public IOMovies() {
        super();
    }

    public void writeMovies() throws IOException{
       try (Writer writer = new BufferedWriter(new FileWriter(textFile))) {
            for (Movie movie : super.movies) {
                String f = movie.getName() + ";" + movie.getReleaseDate();
                writer.write(f);
            }

        } catch (IOException e) {
           e.printStackTrace();
       }
    }

    public Movies readMovie() throws IOException {
        Movies movies = new Movies();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = bufferedReader.readLine()) !=null) {
                String [] token = line.split(";");
                movies.addMovie(new Movie(token[0], Integer.parseInt(token[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }

    public void writerStream() throws FileNotFoundException {
        File file = new File(binaryFile);
        try (FileOutputStream output = new FileOutputStream(file)) {
            try (ObjectOutputStream out = new ObjectOutputStream(output)) {
                out.writeObject(movies.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String readStream() {
        File inputFile = new File(binaryFile);
        String movies = null;
        try (FileInputStream fis = new FileInputStream(inputFile)) {
            try (ObjectInputStream in = new ObjectInputStream(fis)) {
                movies = (String)in.readObject();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
}
