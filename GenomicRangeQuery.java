public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] occurrences = new int[S.length() + 1][4];

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'A')
                occurrences[i + 1][0] = 1;
            else if (c == 'C')
                occurrences[i + 1][1] = 1;
            else if (c == 'G')
                occurrences[i + 1][2] = 1;
            else
                occurrences[i + 1][3] = 1;
        }

        for (int i = 2; i < occurrences.length; i++)
            for (int j = 0; j < 4; j++)
                occurrences[i][j] += occurrences[i - 1][j];

        for (int i = 0; i < P.length; i++) {
            int queryStart = P[i] + 1, queryEnd = Q[i] + 1;

            for (int j = 0; j < 4; j++) {
                if (occurrences[queryEnd][j] - occurrences[queryStart - 1][j] > 0) {
                    P[i] = j + 1;
                    break;
                }
            }
        }
        return P;
    }
}
