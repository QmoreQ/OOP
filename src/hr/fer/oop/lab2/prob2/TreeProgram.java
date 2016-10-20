package hr.fer.oop.lab2.prob2;

class TreeNode {
    TreeNode left;
    TreeNode right;
    String data;
}

class TreeProgram {

    public static void main(String[] args) {

        TreeNode node = null;

        node = insert(node, "Jasna");
        node = insert(node, "Ana");
        node = insert(node, "Ivana");
        node = insert(node, "Anamarija");
        node = insert(node, "Vesna");
        node = insert(node, "Kristina");

        System.out.println("Writing tree inorder:");


        writeTree(node);

        node = reverseTreeOrder(node);

        System.out.println();
        System.out.println("Writing reversed tree inorder:");
        writeTree(node);

        System.out.println();
        int size = sizeOfTree(node);
        System.out.println("Number of nodes in tree is " + size + ".");

        System.out.println();
        boolean found = containsData(node, "Ivana");
        System.out.println();
        System.out.println("Searched element is found: " + found);
    }

    static int sizeOfTree(TreeNode treeRoot) {
        if (treeRoot == null) {
            return 0;
        }
        return sizeOfTree(treeRoot.left) + sizeOfTree(treeRoot.right) + 1;
    }

    static boolean containsData(TreeNode treeRoot, String data)  {
        if (treeRoot == null) return false;
        int r = treeRoot.data.compareTo(data);
        if (r == 0) return true;
        else if (r > 0) return containsData(treeRoot.left, data);
        else return containsData(treeRoot.right, data);
    }

    static boolean containsData2(TreeNode treeRoot, String data){
        if (treeRoot == null) return  false;
        return treeRoot.data.equals(data) || containsData2(treeRoot.left,data) || containsData2(treeRoot.right,data);




    }

    static TreeNode insert(TreeNode treeRoot, String data) {
        if (treeRoot == null) {
            treeRoot = new TreeNode();
            treeRoot.data = data;
        } else {
            if (treeRoot.data.compareTo(data) < 0) {
                treeRoot.left = insert(treeRoot.left, data);
            }
            if (treeRoot.data.compareTo(data) > 0) {
                treeRoot.right = insert(treeRoot.right, data);
            }
        }
        return treeRoot;
    }

    static void writeTree(TreeNode treeRoot) {
        if (treeRoot != null) {
            writeTree(treeRoot.left);
            System.out.println("'" + treeRoot.data + "'");
            writeTree(treeRoot.right);

        }
    }
    static TreeNode reverseTreeOrder(TreeNode treeRoot){
        TreeNode r = null;
        TreeNode l=null;

        if(treeRoot.left != null){
            l =  reverseTreeOrder(treeRoot.left);
        }
        if(treeRoot.right !=null) {
            r = reverseTreeOrder(treeRoot.right);
        }

        treeRoot.left=r;
        treeRoot.right=l;

        return treeRoot;
    }

}