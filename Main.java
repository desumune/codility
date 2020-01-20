public class Main {
    public static void main(String[] args) {
        NumberSolitare solution = new NumberSolitare();

        int[] A = {-5,2};

        System.out.println(solution.solution(A));
    }

    private static void printArray(int[] A) {
        System.out.print("[");
        for(int i = 0; i < A.length - 1; i++)
            System.out.print(A[i] + ", ");
        System.out.println(A[A.length - 1] + "]");
    }
}
