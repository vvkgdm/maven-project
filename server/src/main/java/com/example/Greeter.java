package com.example;
package-info.java 
/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

   public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
