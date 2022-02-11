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
    if (other == null) {
      throw new IllegalArgumentException();
    }
    return this.name.equals(other);
  }

  public String toString() {
    return this.name;
  }
}
