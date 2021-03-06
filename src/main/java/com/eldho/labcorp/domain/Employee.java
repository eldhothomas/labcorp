package com.eldho.labcorp.domain;

public class Employee {

	String id;
	String type;
	Integer totalWorkDays = 0;
	Float totalVacationDays = (float) 0;

	public Employee(String id, String type) {
		this.id = id; 
		this.type = type;
	}

	public void work(Integer workDays) {
	};

	public void takeVacation(Float vacationDays) {
		this.totalVacationDays = this.totalVacationDays - vacationDays;
		if (this.totalVacationDays < 0) {
			this.totalVacationDays = (float) 0;
		}
	}

	public String getId() {
		return this.id;
	}
	
	public String getType() {
		return this.type;
	}
	
	public Integer getTotalWorkDays() {
		return this.totalWorkDays;
	}
	
	public Float getTotalVacationDays() {
		return this.totalVacationDays;
	}

	/**
	 * 1. Calculates the vacation days for the number of days worked 
	 * and add it to the total vacation days.
	 * 2. Add the work days to total work days. 
	 * 
	 * @param workDays
	 * @param vacationDaysPerYear
	 */
	public void calculateVacationDays(Integer workDays, Integer vacationDaysPerYear) {
		this.totalVacationDays = this.totalVacationDays + (workDays * (float) vacationDaysPerYear / (float) 260);
		this.totalWorkDays = this.totalWorkDays + workDays;
	}

}


