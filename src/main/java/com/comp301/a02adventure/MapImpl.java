package com.comp301.a02adventure;

public class MapImpl implements Map {
  private int width, height, numItems;
  private Cell[][] objects;

  public MapImpl(int width, int height, int numItems) {
    System.out.println("a");
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Negative width or height is not allowed");
    }
    this.width = width;
    this.height = height;
    this.numItems = numItems;
    this.objects = new Cell[width][height];
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public Cell getCell(int x, int y) {
    System.out.println("b");
    if (x >= width || y >= height || x < 0 || y < 0) {
      throw new IndexOutOfBoundsException("x or y not valid");
    }
    return objects[x][y];
  }

  public Cell getCell(Position position) {
    System.out.println("c");
    if (position.getX() >= width
        || position.getY() >= height
        || position.getX() < 0
        || position.getY() < 0) {
      throw new IndexOutOfBoundsException("x or y not valid");
    }
    Cell temp = new CellImpl(position.getX(), position.getY());
    return temp;
  }

  public void initCell(int x, int y) {
    System.out.println("d");
    if (x >= width || y >= height || x < 0 || y < 0) {
      throw new IndexOutOfBoundsException("x or y not valid");
    }
    objects[x][y] = new CellImpl(x, y);
  }

  public int getNumItems() {
    System.out.println("e");
    return numItems;
  }
}
