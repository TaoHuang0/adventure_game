package com.comp301.a02adventure;

public class MapImpl implements Map {
  private int width, height, numItems;
  private Cell[][] objects;

  public MapImpl(int width, int height, int numItems) {
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Negative width or height is not allowed");
    }
    this.width = width;
    this.height = height;
    this.numItems = numItems;
    this.objects = new Cell[width][height];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        objects[i][j] = new CellImpl(i, j);
      }
    }
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public Cell getCell(int x, int y) {
    if (x > width || y > height) {
      throw new IndexOutOfBoundsException("x or y not valid");
    }
    return objects[x][y];
  }

  public Cell getCell(Position position) {
    if (position.getX() > width || position.getY() > height) {
      throw new IndexOutOfBoundsException("x or y not valid");
    }
    Cell temp = new CellImpl(position.getX(), position.getY());
    return temp;
  }

  public void initCell(int x, int y) {
    if (x >= width || y >= height) {
      throw new IndexOutOfBoundsException("x or y not valid");
    }
    objects[x][y] = new CellImpl(x, y);
  }

  public int getNumItems() {
    return numItems;
  }
}
