package org.example.sandbox;

public class NodeList<T> {

  private Node<T> root;

  public void add(T t) {
    Node<T> node = new Node<>(t);

    if (root != null) {
      Node<T> i = root;
      while (i.nextNode != null) {
        i = i.nextNode;
      }
      i.nextNode = node;
    } else {
      root = node;
    }
  }

  public T get(int index) {
    Node<T> node = root;
    for (int i = 0; i < index; i++) {
      node = node.nextNode;
    }
    return node.t;
  }
}
