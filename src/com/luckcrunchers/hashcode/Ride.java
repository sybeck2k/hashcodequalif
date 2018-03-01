package com.luckcrunchers.hashcode;

public class Ride {
  private Point start;
  private Point end;

  private int earliestStart;
  private int deadline;

  private int id;

  public Ride(int id, Point start, Point end, int earliestStart, int deadline) {
    this.start = start;
    this.end = end;
    this.earliestStart = earliestStart;
    this.deadline = deadline;
    this.id = id;
  }

  public Point getStart() {
    return start;
  }

  public void setStart(Point start) {
    this.start = start;
  }

  public Point getEnd() {
    return end;
  }

  public void setEnd(Point end) {
    this.end = end;
  }

  public int getEarliestStart() {
    return earliestStart;
  }

  public void setEarliestStart(int earliestStart) {
    this.earliestStart = earliestStart;
  }

  public int getDeadline() {
    return deadline;
  }

  public void setDeadline(int deadline) {
    this.deadline = deadline;
  }

  public int getId() {
    return id;
  }
}
