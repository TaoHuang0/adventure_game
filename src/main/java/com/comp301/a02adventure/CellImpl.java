package com.comp301.a02adventure;

import java.util.Optional;

public class CellImpl implements Cell {
  private Position pos;
  private String name;
  private String description;
  private boolean flag;
  private Inventory chest;

  public CellImpl(int x, int y, String name, String description) {
    System.out.println("a");
    if (name == null || description == null) {
      throw new IllegalArgumentException("No name or no description");
    }
    this.name = name;
    this.description = description;
    this.flag = false;
    pos = new PositionImpl(x, y);
  }

  public CellImpl(int x, int y) {
    this(x, y, "", "");
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    System.out.println("b");
    return this.description;
  }

  public Position getPosition() {
    System.out.println("c");
    return pos;
  }

  public Inventory getChest() {
    System.out.println("d");
    return chest;
  }

  public boolean getIsVisited() {
    System.out.println("e");
    return flag;
  }

  public boolean hasChest() {
    System.out.println("e");
    if (this.chest != null) {
      return true;
    } else {
      return false;
    }
  }

  public void setName(String name) {
    System.out.println("f");
    if (name != null) {
      this.name = name;
    } else {
      throw new IllegalArgumentException("Name not valid");
    }
  }

  public void setDescription(String description) {
    System.out.println("g");
    if (description != null) {
      this.description = description;
    } else {
      throw new IllegalArgumentException("Name not valid");
    }
  }

  public void setChest(Inventory chest) {
    System.out.println("h");
    if (chest != null) {
      this.chest.transferFrom(chest);
    }
  }

  public void visit() {
    System.out.println("i");
    flag = true;
  }
}
