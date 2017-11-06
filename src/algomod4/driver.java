/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algomod4;

/**
 *
 * @author asus
 */
public class driver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
//        bst.coutArray();
        bst.insert(2);
        bst.insert(9);
        bst.insert(1);
        bst.insert(4);
        bst.insert(11);
        bst.insert(12);
        bst.insert(0);
        System.out.println("");
        bst.tampilArray();
        System.out.println("");
        bst.searchPaths(0);
        System.out.println("");
        bst.delete(1);
        bst.delete(11);
        bst.delete(5);
        System.out.print("Isi Array = ");
        bst.tampilArray();
        System.out.println("");
        bst.coutArray();
        bst.searchPaths(1);
        bst.printPath();
    }
}
