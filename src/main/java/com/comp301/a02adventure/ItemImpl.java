package com.comp301.a02adventure;

public class ItemImpl implements Item {
  private static String name;

  public ItemImpl(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public boolean equals(Object other) {
    if (this.name == other) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return this.name;
  }
}
