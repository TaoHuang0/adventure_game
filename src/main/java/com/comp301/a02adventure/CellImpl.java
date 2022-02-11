package com.comp301.a02adventure;

public class CellImpl implements Cell {
  private Position pos;
  private String name;
  private String description;
  private Inventory chest;
  private boolean flag;

  public CellImpl(int x, int y, String name, String description) {
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
      Inventory treasure = chest;
      this.chest = treasure;
    } else {
      throw new IllegalArgumentException("Chest not exist");
    }
  }

  public void visit() {
    flag = true;
  }
}
