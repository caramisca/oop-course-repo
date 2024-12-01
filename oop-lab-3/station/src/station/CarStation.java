package station;

import dining.Dineable;
import refueling.Refuelable;
import queue.Queue;
import model.Car;


public class CarStation {
    private Refuelable refuelingService;
    private Dineable diningService;
    private Queue<Car> queue;

    public CarStation(Refuelable refuelingService, Dineable diningService, Queue<Car> queue) {
        this.refuelingService = refuelingService;
        this.diningService = diningService;
        this.queue = queue;
    }

    public void addCar(Car car) {
        queue.enqueue(car);
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();
            if (car.isDining()) {
                diningService.serveDinner(car.getId());
            }
            refuelingService.refuel(car.getId());
        }
    }
    public Queue<Car> getQueue() {
        return queue;
    }
}
