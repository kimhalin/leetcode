class UnionFind {
    int N;
    int[] nodes;
    public UnionFind(int n) {
        this.N = n;
        nodes = new int[this.N];
        for (int i = 0; i < n; i++)
            nodes[i] = i;
    }

    public boolean isConnected(int u, int v) {
        return find(u) == find(v);
    }

    public void union(int u, int v) {
        int x = find(v);
        int y = find(u);
        nodes[x] = y;
    }

    public int find(int u) {
        int x = u;
        while (nodes[x] != x) {
            x = nodes[x];
        }

        return x;
    }

}

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }

        return uf.isConnected(source, destination);
    }
}