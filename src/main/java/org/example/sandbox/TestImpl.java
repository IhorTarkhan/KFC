package org.example.sandbox;

public class TestImpl implements Test {
  {
    System.out.println(22);
  }

  @Override
  public void f1() {
    System.out.println("f1");
  }

  @Override
  public void f2() {
    System.out.println("f2");
  }
}
