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
    return this.itemslist.size();
  }

  public List<Item> getItems() {
    return (List<Item>) this.itemslist.clone();
  }

  public void addItem(Item item) {
    this.itemslist.add(item);
  }

  public void removeItem(Item item) {
    this.itemslist.remove(item);
  }

  public void clear() {
    this.itemslist.clear();
  }

  public void transferFrom(Inventory other) {
    for (int i = 0; i < other.getNumItems(); i++) {
      this.itemslist.addAll(other.getItems());
    }
    other.clear();
  }
}
