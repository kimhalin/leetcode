class Solution {
    int count = 0;
    String[] str = new String[] {"a", "e", "i", "o", "u"};
    public int countVowelStrings(int n) {
        String[] str = new String[] {"a", "e", "i", "o", "u"};
        for (int i = 0; i < 5; i++) {
            recurr(n, 1, str[i], i);
        }
        return count;
    }

    public void recurr(int n, int num, String s, int alphabet) {
        if (num >= n) {
            count++;
            return;
        }

        for (int i = alphabet; i < 5; i++) {
            recurr(n, num + 1, s + str[i], i);
        }
    }
}