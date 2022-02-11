package com.comp301.a02adventure;

import java.util.List;
import java.util.ArrayList;

public class InventoryImpl implements Inventory {
  private ArrayList<Item> itemslist;

  public InventoryImpl() {
    this.itemslist = null;
  }

  public boolean isEmpty() {
    return this.itemslist == null;
  }

  public int getNumItems() {
    if (this.itemslist.size() != 0) {
      return this.itemslist.size();
    } else {
      throw new IllegalArgumentException("No value");
    }
  }

  public List<Item> getItems() {
    List<Item> temp = (List<Item>) this.itemslist.clone();
    return temp;
  }

  public void addItem(Item item) {
    if (item.getName() != null) {
      this.itemslist.add(item);
    }
  }

  public void removeItem(Item item) {
    this.itemslist.remove(item);
  }

  public void clear() {
    this.itemslist.clear();
  }

  public void transferFrom(Inventory other) {
    this.itemslist.addAll(other.getItems());
    other.clear();
  }
}
