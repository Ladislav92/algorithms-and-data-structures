package com.ladislav;

/**
 * Created by Ladislav on 4/17/2017.
 */
public class BinarySearchTree<K extends Comparable<K>, V> {

    private Node<K, V> root;

    public void put(K key, V value) {

        if (key == null) {
            throw new NullPointerException();
        }

        root = put(root, key, value);
    }


    private Node<K, V> put(Node<K, V> root, K key, V value) {

        if (root == null) {
            return new Node<>(key, value);
        }

        int comparison = key.compareTo(root.key);

        if (comparison > 0) {
            root.right = put(root.right, key, value);
        } else if (comparison < 0) {
            root.right = put(root.left, key, value);
        } else {
            root.value = value;
        }
        return root;
    }

    public V get(K key) {

        if (key == null) {
            throw new NullPointerException();
        }

        return get(key, root);
    }

    private V get(K key, Node<K, V> root) {

        if (root == null) {
            return null;
        }

        int comparison = key.compareTo(root.key);

        if (comparison > 0) return get(key, root.right);

        else if (comparison < 0) return get(key, root.left);

        else return root.value;

    }

    public void delete(K key) {
        throw new UnsupportedOperationException();
    }

    public Iterable<K> iterator() {
        throw new UnsupportedOperationException();
    }


    private class Node<K, V> {

        K key;
        V value;

        Node<K, V> left;
        Node<K, V> right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }
}
