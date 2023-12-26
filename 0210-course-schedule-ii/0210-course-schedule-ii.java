class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        int[] answer = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[pre][ready] == 0)
                indegree[ready]++;
            matrix[pre][ready] = 1;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }
        int index = 0;
        while(!q.isEmpty()) {
            int course = q.poll();
            answer[index++] = course;
            for (int i =0; i < numCourses; i++) {
                if (matrix[course][i] == 1) {
                    if (--indegree[i] == 0)
                        q.offer(i);
                }
            }
        }

        if (index == numCourses) return answer;
        return new int[0];
    }
}