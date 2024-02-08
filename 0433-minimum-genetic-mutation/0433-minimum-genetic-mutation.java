class Solution {
    boolean[] visited;
    int answer = Integer.MAX_VALUE;
    public int minMutation(String startGene, String endGene, String[] bank) {
        // 돌연변이는 하나의 문자가 변경된 것
        visited = new boolean[bank.length];
        dfs(startGene, endGene, bank, 0);
        if (answer == Integer.MAX_VALUE)
            return -1;
        return answer;
    }

    public void dfs(String startGene, String endGene, String[] bank, int cnt) {
        if (startGene.equals(endGene)) {
            answer = Math.min(answer, cnt);
            return;
        }
            
        for (int i = 0; i < bank.length; i++) {
            if (!visited[i] && check(bank[i], startGene)) {
                visited[i] = true;
                dfs(bank[i], endGene, bank, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public boolean check(String s1, String s2) {
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                cnt++;
        }

        return cnt <= 1;
    }
}