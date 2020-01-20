public class Nesting {
    public int solution(String S) {
        int count = 0;

        for(int i = 0; i < S.length(); i++) {
            if(count > S.length() - i)
                return 0;

            if(S.charAt(i) == '(') {
                count++;
                continue;
            }

            if(count > 0)
                count--;
            else
                return 0;
        }
        return 1;
    }
}
