package com.ladislav;

import java.util.Iterator;

/**
 * Created by Ladislav on 4/21/2017.
 */
public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoubleLinkedList() {
        head = new Node<T>(null);
        tail = new Node<T>(null);
        head.next = tail;
        tail.previous = head;
    }

    public void add(T val) {
        Node<T> x = new Node<>(val);
        x.previous = tail.previous;
        x.next = tail;
        tail.previous.next = x;
        tail.previous = x;
        size++;
    }

    public void addFirst(T val) {
        Node<T> x = new Node<>(val);
        x.next = head.next;
        x.next.previous = x;
        head.next = x;
    }

    public void add(T val, int pos) {
        throw new UnsupportedOperationException("Have to implement");
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        return head.next.value;
    }

    public T getLast() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        return tail.previous.value;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private class Node<T> {

        T value;
        Node<T> previous;
        Node<T> next;

        private Node(T value) {
            this.value = value;
        }
    }

    //TODO Implement me
    private class LinkedListIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException();
        }

        @Override
        public T next() {
            throw new UnsupportedOperationException();
        }
    }
}
