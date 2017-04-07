package com.gmail.lizaiatsenko;

import java.util.Date;

public class Main {

	public static void main(String[] args){
		CarService service = new CarService();
      Car car1 = new Car();
       car1.setName("Citroen‎");
       car1.setCost(30000);
       car1.setReleaseDate(new Date());
       Car car = service.addCar(car1);
      Car carFromDB = service.getCar(car.getId());
      System.out.println(carFromDB.getName()+ carFromDB.getCost());
	}
}
