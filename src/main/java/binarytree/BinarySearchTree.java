package binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {

    private TreeNode root = null;

    public BinarySearchTree() {

    }

    public boolean add(int i) {
        TreeNode current = root;
        if (root == null) {
            root = new TreeNode(i);
            return true;
        }
        while (current.getValue() != i) {
            while (i > current.getValue() && current.getRight() != null) {
                current = current.getRight();
            }
            if (current.getRight() == null && i > current.getValue()) {
                current.setRight(new TreeNode(i));
                return true;
            }
            while (i < current.getValue() && current.getLeft() != null) {
                current = current.getLeft();
            }
            if (current.getLeft() == null && i < current.getValue()) {
                current.setLeft(new TreeNode(i));
                return true;
            }
        }
        return false;
    }


    public boolean contains(int i) {
        TreeNode current = root;
        if (root == null) {
            return false;
        }
        while (current.getValue() != i) {
            while (i > current.getValue() && current.getRight() != null) {
                current = current.getRight();
                if (current.getValue() == i) {
                    return true;
                }
            }
            while (i < current.getValue() && current.getLeft() != null) {
                current = current.getLeft();
                if (current.getValue() == i) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public List<Integer> sortBST() {

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        List<Integer> values = new LinkedList<Integer>();
        TreeNode current = root;
        TreeNode temp = null;
        if (root == null) {
            return values;
        }
        while (current != null) {
            stack.offerFirst(current);
            current = current.getLeft();
        }
        current = stack.getFirst();
        while (!stack.isEmpty()) {
            current = stack.pollFirst();
            values.add(current.getValue());
            if (current.getRight() != null) {
                current = current.getRight();
                while (current != null) {
                    stack.offerFirst(current);
                    current = current.getLeft();
                }
            }
        }
        return values;
    }
}

