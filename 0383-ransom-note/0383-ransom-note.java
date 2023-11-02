class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // magazine 다 돌기
        // 배열에 개수 저장
        // ransomNote 돌면서 -1 하기
        // 0이면 false 반환
        int[] num = new int[26];
        for (int i =0; i < magazine.length(); i++) {
            num[magazine.charAt(i) - 97]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int n = ransomNote.charAt(i) - 97;
            if (num[n] == 0)
                return false;
            num[n]--;
        }

        return true;
    }
}