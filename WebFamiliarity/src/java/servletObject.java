/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyden R
 */

//This is an object that will get passed into the servelt
public class servletObject {
        private long newCar;
	private String manufacturer;
	private String model;
	private int year;
	

	public long getNewCar() {
		return newCar;
	}

	public void newCar(long newCar) {
		this.newCar = newCar;
	}

	public String getManufacterer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
