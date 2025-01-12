package DataOnly;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Overriding clone() method of Object class
	public Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
	public String Model;
	public String Number;
	public List<String> Targets;

	public Boolean isPriority;
	public Boolean isBus;
	public Boolean isTaxi;

	public Car(String Model, String Number, ArrayList<String> Targets) {
		this.Model = Model;
		this.Number = Number;
		this.Targets = new ArrayList<String>();
		this.Targets.addAll(Targets);
		this.isPriority = false;
		this.isTaxi = false;
		this.isBus = false;
	}
	
	public Car(String Model, String Number, String[] Targets) {
		this.Model = Model;
		this.Number = Number;
		this.Targets = new ArrayList<String>();
		for (String string : Targets) {
			this.Targets.add(string);
		}
		this.isPriority = false;
		this.isTaxi = false;
		this.isBus = false;
	}

	public Car(String Model, String Number, ArrayList<String> Targets, boolean isTaxi, boolean isBus, boolean isPriority) {
		this.Model = Model;
		this.Number = Number;
		this.Targets = new ArrayList<String>();
		this.Targets.addAll(Targets);
		this.isPriority = isPriority;
		this.isTaxi = isTaxi;
		this.isBus = isBus;
	}

	public Car(String Model, String Number, String[] Targets, boolean isTaxi, boolean isBus, boolean isPriority) {
		this.Model = Model;
		this.Number = Number;
		this.Targets = new ArrayList<String>();
		for (String string : Targets) {
			this.Targets.add(string);
		}
		this.isPriority = isPriority;
		this.isTaxi = isTaxi;
		this.isBus = isBus;
	}

	public String toString() {
		return Model + "-" + Number;
	}
};

