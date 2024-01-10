class JointSet {
    int n;
    int[] parent;

    public JointSet(int n) {
        this.n = n;
        this.parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public boolean isConnected(int u, int v) {
        return find(u) == find(v);
    }

    public void union(int u, int v) {
        int a = find(u);
        int b = find(v);

        this.parent[a] = b;
    }

    public int find(int u) {
        int x = u;
        while (x != this.parent[x]) {
            x = this.parent[x];
        }

        this.parent[u] = x;
        return x;
    }
}

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        JointSet set = new JointSet(n);

        for (int[] edge : edges) {
            set.union(edge[0], edge[1]);
        }

        return set.isConnected(source, destination);
    }
}