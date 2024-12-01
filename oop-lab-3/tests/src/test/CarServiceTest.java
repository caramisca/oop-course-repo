package test;

import dining.*;
import refueling.*;
import station.*;
import model.Car;
import queue.*;

public class CarServiceTest {
    public static void main(String[] args) {
        // Create a queue for storing cars
        Queue<Car> carQueue = new ArrayQueue<>();  // Explicitly specify that it's a Queue of Cars

        // Create service instances
        Dineable peopleDinner = new PeopleDinner();
        Dineable robotDinner = new RobotDinner();
        Refuelable electricStation = new ElectricStation();
        Refuelable gasStation = new GasStation();

        // Create a CarStation instance
        CarStation carStation = new CarStation(peopleDinner, electricStation, carQueue);

        // Add some cars to the queue (for testing purposes)
        carStation.addCar(new Car("1", "ELECTRIC", "PEOPLE", false, 30));  // Example Car 1
        carStation.addCar(new Car("2", "GAS", "ROBOTS", true, 40));  // Example Car 2

        // Serve the cars
        carStation.serveCars();
    }
}
