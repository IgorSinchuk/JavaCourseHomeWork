package prog.kiev.ua.homework.Module10.MovieIO;

import java.io.*;

/**
 * Created by igorsinchuk on 8/24/17.
 */
public class IOMovies extends Movies {

    private final String textFile = "/Module10/MovieIO/movies.txt";
    private final String binaryFile = "/Module10/MovieIO/movies_binary.txt";

    public IOMovies() {
        super();
    }

    public void writeMovies() throws IOException{
       try (Writer writer = new FileWriter(textFile)) {
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

    public void writetStream() throws FileNotFoundException {
        File file = new File(binaryFile);
        try (FileOutputStream output = new FileOutputStream(file)) {
            try (ObjectOutputStream out = new ObjectOutputStream(output)) {
                out.writeObject(movies.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }

    public String
}
