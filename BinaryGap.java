public class BinaryGap {

    public int solution(int N) {
        int count = 0;
        int maxCount = count;
        String binary = toBinary(N);

        for(int i = 0; i < binary.length() - 1; i++) {
            if(binary.charAt(i) == '1') {
                while(i < binary.length() - 1 && binary.charAt(i + 1) == '0') {
                    count++;
                    i++;
                    if(i == binary.length() - 1)
                        count = 0;
                }
            }
            if(count > maxCount)
                maxCount = count;
            count = 0;
        }

        return maxCount;
    }

    private String toBinary(int N) {
        StringBuilder binary = new StringBuilder();

        while(N > 0) {
            if(N % 2 != 0) {
                binary.append(1);
            } else
                binary.append(0);
            N = N / 2;
        }

        return binary.reverse().toString();
    }
}
