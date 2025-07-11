package Tree;

public class DistancebetweenTwoNodes {

    static Node lca(Node root, int p, int q) {

        if (root == null || root.data == p || root.data == q)
            return root;

        Node leftLca = lca(root.left, p, q);
        Node rightLca = lca(root.right, p, q);

        if (leftLca != null && rightLca != null)
            return root;

        return (leftLca != null) ? leftLca : rightLca;
    }

    static int findLevel(Node root, int x, int length) {
        if (root == null)
            return -1;

        if (root.data == x)
            return length;

        int left = findLevel(root.left, x, length++);
        if (left == -1)
            left = findLevel(root.right, x, length++);


        return left;
    }

    static int findDistance(Node root, int p, int q) {
        Node lca = lca(root, p, q);
        int d1 = findLevel(root, p, 1);
        int d2 = findLevel(root, q, 1);


        return d1 + d2;
    }


    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(3);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(7);

        System.out.println(findDistance(root, 2, 7));
    }
}
