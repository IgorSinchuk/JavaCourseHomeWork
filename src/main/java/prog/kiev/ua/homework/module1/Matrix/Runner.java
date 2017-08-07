package prog.kiev.ua.homework.module1.Matrix;

/**
 * Created by igor on 8/7/17.
 */
public class Runner {

        public static void main(String[] args) {
            int[][] matrix000 = Tool.generateMatrix();
            int[][] matrix090l = Tool.turnMatrix(matrix000, 90, Side.LEFT);
            int[][] matrix180l = Tool.turnMatrix(matrix000, 180, Side.LEFT);
            int[][] matrix270l = Tool.turnMatrix(matrix000, 270, Side.LEFT);

            System.out.println("Source matrix:");
            System.out.println(Tool.matrixToString(matrix000));
            System.out.println("Counterclockwise by 90 degrees");
            System.out.println(Tool.matrixToString(matrix090l));
            System.out.println("Counterclockwise by 180 degrees");
            System.out.println(Tool.matrixToString(matrix180l));
            System.out.println("Counterclockwise by 270 degrees");
            System.out.println(Tool.matrixToString(matrix270l));
        }
}
