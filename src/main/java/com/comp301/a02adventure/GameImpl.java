package com.comp301.a02adventure;

import java.util.List;

public class GameImpl implements Game {
  private Map map;
  private Player player;

  public GameImpl(Map map, Player player) {
    if(map == null || player == null) {
      throw new IllegalArgumentException("Invalid name or player");
    }
    this.map = map;
    this.player = player;
  }

  public Position getPlayerPosition() {
    return this.player.getPosition();
  }

  public String getPlayerName() {
    return this.player.getName();
  }

  public List<Item> getPlayerItems() {
    List<Item> temp = player.getInventory().getItems();
    return temp;
  }

  public boolean getIsWinner() {
    if (map.getNumItems() <= 0) {
      return true;
    } else {
      return false;
    }
  }

  public void printCellInfo() {
    System.out.println("Location: " + map.getCell(player.getPosition()).getName());
    System.out.println(map.getCell(player.getPosition()).getDescription());
    if (map.getCell(player.getPosition()).getIsVisited() == true) {
      System.out.println("You have already visited this location.");
    }
    if (map.getCell(player.getPosition()).hasChest() == true) {
      System.out.println("You found a chest! Type 'open' to see what's inside, or keep moving.");
    }
    map.getCell(player.getPosition()).visit();
  }

  public void openChest() {
    if (map.getCell(player.getPosition()).hasChest() == true) {
      printCellInfo();
    }
  }

  public boolean canMove(Direction direction) {
    if (player.getPosition().getNeighbor(direction).getX() < map.getWidth()
        && player.getPosition().getNeighbor(direction).getY() < map.getHeight()
        && map.getCell(
                player.getPosition().getNeighbor(direction).getX(),
                player.getPosition().getNeighbor(direction).getY())
            != null) {
      return true;
    } else {
      return false;
    }
  }

  public void move(Direction direction) {
    if (canMove(direction)) {
      player.move(direction);
      System.out.println(map.getCell(player.getPosition()));

    } else {
      System.out.println("You can't go that way! Try another direction.");
    }
  }
}