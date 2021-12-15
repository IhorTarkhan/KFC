package org.example.sandbox;

public class Node<T> {
  T t;
  Node<T> nextNode;

  public Node(T t) {
    this.t = t;
  }
}
