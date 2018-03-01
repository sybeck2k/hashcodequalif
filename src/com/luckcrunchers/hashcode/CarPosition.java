package com.luckcrunchers.hashcode;

public class CarPosition {
  private int time;
  private Point position;

  public CarPosition(int time, Point position) {
    this.time = time;
    this.position = position;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public Point getPosition() {
    return position;
  }

  public void setPosition(Point position) {
    this.position = position;
  }
}
