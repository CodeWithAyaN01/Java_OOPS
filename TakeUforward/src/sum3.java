import java.util.ArrayList;

public class sum3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();
        column.add(1);
        column.add(1);
        column.add(1);
        column.add(1);
        row.add(5);
        row.add(5);
        row.add(5);
        row.add(5);
        matrix.add(column);
        matrix.add(row);
        System.out.println(matrix);
    }
}
