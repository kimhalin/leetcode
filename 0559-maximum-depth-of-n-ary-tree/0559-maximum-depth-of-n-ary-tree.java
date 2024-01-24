/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int answer = 0;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                Node node = q.poll();

                for (Node tmp : node.children) {
                    q.offer(tmp);
                }
            }
            answer++;
        }
        return answer;
    }
}