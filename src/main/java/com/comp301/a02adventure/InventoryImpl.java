package com.comp301.a02adventure;

import java.util.List;
import java.util.ArrayList;

public class InventoryImpl implements Inventory {
  private ArrayList<Item> itemslist;

  public InventoryImpl() {
    ArrayList<Item> items = new ArrayList<Item>();
    this.itemslist = items;
  }

  public boolean isEmpty() {
    return this.itemslist.isEmpty();
  }

  public int getNumItems() {
    return this.itemslist.size();
  }

  public List<Item> getItems() {
    List<Item> cloned_list = new ArrayList<Item>();
    cloned_list.addAll(this.itemslist);
    return cloned_list;
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
