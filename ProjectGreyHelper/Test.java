package ProjectGreyHelper;

public class Test{

    public static void main(String[] args){

        String[][] matrix = MyResources.scanNow("ProjectGreyHelper\\Test.csv", ",", 3, 4);

        for (String[] x : matrix) {
            for (String y : x) {
                System.out.print(y + " ");
            }
            System.out.print("\n");
        }

        String[] line = MyResources.scanLine("ProjectGreyHelper\\Test.csv", ",", 1);
        
        for (String x : line) {
            System.out.print(x + " ");
        }

        /*
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 3);
            int y = (int) (Math.random() * 4);
            System.out.print(matrix[x][y] + "\n");
        }
        */
    }
}