package com.comp301.a02adventure;

import java.util.List;

public class GameImpl implements Game {
  private Map map;
  private Player player;

  public GameImpl(Map map, Player player) {
    if (map == null || player == null) {
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
    return map.getNumItems() == 0;
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
    if (map.getCell(player.getPosition()).hasChest() == false) {
      System.out.println("No chest to open, sorry!");
    } else if (map.getCell(player.getPosition()).getChest().isEmpty() == true) {
      System.out.println("The chest is empty.");
    } else if (map.getCell(player.getPosition()).hasChest() == true
        && map.getCell(player.getPosition()).getChest().isEmpty() == false) {
      System.out.println(
          "You collected these items: " + map.getCell(player.getPosition()).getChest().getItems());
      player.getInventory().transferFrom(map.getCell(player.getPosition()).getChest());
    }
  }

  public boolean canMove(Direction direction) {
    if (player.getPosition().getNeighbor(direction).getX() < map.getWidth()
        && player.getPosition().getNeighbor(direction).getY() < map.getHeight()
        && player.getPosition().getNeighbor(direction).getX() >= 0
        && player.getPosition().getNeighbor(direction).getY() >= 0
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
      printCellInfo();
    } else {
      System.out.println("You can't go that way! Try another direction.");
    }
  }
}
