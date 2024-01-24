class Solution {
    boolean[][] visited;
    int[] dx = new int[] {0, 0, -1, 1};
    int[] dy = new int[] {-1, 1, 0, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        visited = new boolean[image.length][image[0].length];
        
        flood(image, sr, sc, image[sr][sc], color);

        return image;
    }

    public void flood(int[][]image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return;
        if (visited[sr][sc] == true)
            return;
        if (image[sr][sc] != color) {
            visited[sr][sc] = true;
            return;
        }

        image[sr][sc] = newColor;
        visited[sr][sc] = true;
        for (int i = 0; i < 4; i++) {
            flood(image, sr + dx[i], sc + dy[i], color, newColor);
        }
    }
}