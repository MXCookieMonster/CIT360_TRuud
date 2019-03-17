/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaHold;
/**
 *
 * @author Tyden R
 */
public class CarObject {
        private String manufacturer,model;
	private int id;

	public String getManufacturer() {
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
        
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
