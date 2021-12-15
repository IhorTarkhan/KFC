package org.example.sandbox;

import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    NodeList<String> nodeList= new NodeList<>();
    nodeList.add("ggg");
    nodeList.add("hgdfcasdt");
    nodeList.add("hfdasgv");
    System.out.println(nodeList.get(0));
    System.out.println(nodeList.get(1));
    System.out.println(nodeList.get(2));
  }
}
