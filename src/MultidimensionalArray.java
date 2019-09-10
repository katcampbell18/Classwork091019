public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] newArray = new int[12][12];
        for (int i = 1; i <= newArray.length; i++) {
            for (int j = 1; j <= newArray[i].length; j++) {
                System.out.println(i*j);
                System.out.println("\t");
            }
        }
    }
}
