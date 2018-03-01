package com.luckcrunchers.hashcode;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  private static int R; // rows
  private static int C; // cols
  private static int F; // veichles
  private static int N; // number of rides
  private static int B; // bonus points per bonus
  private static int T; //steps

  private static Map<Integer, Point>      carPositionsPerTime;
  private static Map<Integer, List<Ride>> listOfRidesPerCar;

  public static void main(String[] args) {

    InputStream file = Main.class.getResourceAsStream("a_example.in");

    Scanner sc = new Scanner(file);

    R = sc.nextInt();
    C = sc.nextInt();
    F = sc.nextInt();
    N = sc.nextInt();
    B = sc.nextInt();
    T = sc.nextInt();

    carPositionsPerTime = new HashMap<>();

    //init
    for(int i=0; i<F; i++) {
      carPositionsPerTime.put(i, new Point(0,0));
    }

    listOfRidesPerCar = new HashMap<>();

    PriorityQueue<Ride> pq = new PriorityQueue<>((r1, r2) -> r1.getEarliestStart() - r2.getEarliestStart());
    List<Ride> rides = new ArrayList<>(N);

    int id = 0;
    while (N-->0) {
      Point start = new Point(sc.nextInt(), sc.nextInt());
      Point end   = new Point(sc.nextInt(), sc.nextInt());
      int earliestStart = sc.nextInt();
      int deadline      = sc.nextInt();
      Ride r = new Ride(id++, start, end, earliestStart, deadline);
      rides.add(r);
      pq.add(r);
    }

    while (!pq.isEmpty()) {
      Ride r = pq.poll();
      Integer carId = findCar(r.getEarliestStart(), r.getStart());
      if (carId == null) {
        // cannot satisfy this ride!
      } else {
        addRideToCar(carId, r);
        // update this car position

      }
    }

    sc.close();

  }

  // find the car that is closest to the startPoint at that time
  // returns the car ID
  private static Integer findCar(int time, Point startPoint) {
    return null;
  }

  private static void addRideToCar(int cardId, Ride ride) {
    List<Ride> r = listOfRidesPerCar.getOrDefault(cardId, new ArrayList<>());
    r.add(ride);
    listOfRidesPerCar.put(cardId, r);
  }
}
