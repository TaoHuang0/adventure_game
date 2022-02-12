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
    System.out.println("x " + " y\n");
    if (x >= width || y >= height || x < 0 || y < 0) {
      System.out.println("abc");
      throw new IndexOutOfBoundsException("x or y not valid");
    }
    if (objects[x][y] != null) {
      objects[x][y] = null;
      System.out.println("abcde");
    }
    objects[x][y] = new CellImpl(x, y);
    System.out.println("abcdefg");
  }

  public int getNumItems() {
    return numItems;
  }
}
