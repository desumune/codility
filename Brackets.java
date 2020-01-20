public class Brackets {
    public int solution(String S) {
        StringBuilder stack = new StringBuilder();
        char lookingFor = 'a';

        for(int i = 0; i < S.length(); i++) {
            if(stack.length() > S.length() - i)
                return 0;

            if(S.charAt(i) == '(' || S.charAt(i) == '{' || S.charAt(i) == '[') {
                stack.append(S.charAt(i));
                lookingFor = lookingFor(stack.charAt(stack.length() - 1));
                continue;
            }

            if(S.charAt(i) == lookingFor && stack.length() > 0) {
                stack.deleteCharAt(stack.length() - 1);
                if(stack.length() != 0)
                    lookingFor = lookingFor(stack.charAt(stack.length() - 1));
            }
            else
                return 0;
        }
        return 1;
    }

    private char lookingFor(char c) {
        if(c == '(')
            return ')';
        if(c == '{')
            return '}';
        else
            return ']';
    }
}
