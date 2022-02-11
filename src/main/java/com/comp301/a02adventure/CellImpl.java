package com.comp301.a02adventure;

public class CellImpl implements Cell {
  private Position pos;
  private String name;
  private String description;
  private Inventory chest;
  private boolean flag;

  public CellImpl(int x, int y, String name, String description) {
    if (name.equals(null) || description.equals(null)) {
      throw new IllegalArgumentException("No name or no description");
    }
    pos = new PositionImpl(x, y);
    this.name = name;
    this.description = description;
    this.flag = false;
    this.chest = null;
  }

  public CellImpl(int x, int y) {
    pos = new PositionImpl(x, y);
    this.name = null;
    this.description = null;
    this.flag = false;
    this.chest = null;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public Position getPosition() {
    return pos;
  }

  public Inventory getChest() {
    if (this.chest != null) {
      return chest;
    } else {
      throw new IllegalArgumentException("No chest exist");
    }
  }

  public boolean getIsVisited() {
    return flag;
  }

  public boolean hasChest() {
    if (this.chest != null) {
      return true;
    } else {
      return false;
    }
  }

  public void setName(String name) {
    if (name != null) {
      this.name = name;
    } else {
      throw new IllegalArgumentException("Name not valid");
    }
  }

  public void setDescription(String description) {
    if (description != null) {
      this.description = description;
    } else {
      throw new IllegalArgumentException("Name not valid");
    }
  }

  public void setChest(Inventory chest) {
    if (chest != null) {
      this.chest = chest;
    } else {
      throw new IllegalArgumentException("Name not valid");
    }
  }

  public void visit() {
    flag = true;
  }
}
