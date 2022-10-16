package com.masai.Model;

import javax.persistence.Entity;

@Entity
public class ConractualEmployee extends Employee {
	private int noOfWorkingDays;
	private int costofperday;
	private String mobileNumber;

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getCostofperday() {
		return costofperday;
	}

	public void setCostofperday(int costofperday) {
		this.costofperday = costofperday;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "ConractualEmployee{" + "noOfWorkingDays=" + noOfWorkingDays + ", costofperday=" + costofperday
				+ ", mobileNumber='" + mobileNumber + '\'' + "} " + super.toString();
	}
}