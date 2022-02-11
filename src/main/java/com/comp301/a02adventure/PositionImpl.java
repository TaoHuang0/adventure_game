package com.comp301.a02adventure;

import java.util.ArrayList;
import java.util.List;

public class PositionImpl implements Position {
  private final int x;
  private final int y;

  public PositionImpl(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public Position getNeighbor(Direction direction) {
    switch (direction) {
      case NORTH:
        return new PositionImpl(this.x, this.y + 1);
      case SOUTH:
        return new PositionImpl(this.x, this.y - 1);
      case WEST:
        return new PositionImpl(this.x - 1, this.y);
      case EAST:
        return new PositionImpl(this.x + 1, this.y);
    }
    return null;
  }
}
