package binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(1);
        bst.add(0);
        bst.add(5);
        bst.add(5);
        bst.add(2);
        bst.add(6);

        System.out.println(bst.contains(-2));

        Deque<Integer> queue = new LinkedList<Integer>();
        queue.offerFirst(10);
        queue.offerFirst(100);
        queue.offerFirst(-1);
        while (!queue.isEmpty()){
            System.out.println(queue.pollFirst());
        }

        List<Integer> values =  bst.sortBST();
        for(Integer i : values){
            System.out.println(i);
        }
        System.out.println(values);
    }
}
