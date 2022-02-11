package com.comp301.a02adventure;

public class PlayerImpl implements Player {
  private String name;
  private Position pos;
  private Inventory chest;

  public PlayerImpl(String name, int startX, int startY) {
    if (name == null) {
      throw new IllegalArgumentException("No name define");
    }
    this.name = name;
    this.pos = new PositionImpl(startX, startY);
    this.chest = new InventoryImpl();
  }

  public Position getPosition() {
    return this.pos;
  }

  public Inventory getInventory() {
    return this.chest;
  }

  public String getName() {
    return this.name;
  }

  public void move(Direction direction) {
    this.pos = pos.getNeighbor(direction);
  }
}
