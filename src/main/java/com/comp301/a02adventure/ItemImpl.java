package com.comp301.a02adventure;

public class ItemImpl implements Item {
  private String name;

  public ItemImpl(String name) {
    if (name == null) {
      throw new IllegalArgumentException("No item detected.");
    } else {
      this.name = name;
    }
  }

  public String getName() {
    return this.name;
  }

  public boolean equals(Object other) {
    if (other.toString() == null) {
      throw new IllegalArgumentException();
    } else {
      return this.name.equals(other.toString());
    }
  }

  public String toString() {
    return this.name;
  }
}
