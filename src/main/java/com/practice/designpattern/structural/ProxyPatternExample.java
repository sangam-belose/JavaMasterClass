package com.practice.designpattern.structural;

public class ProxyPatternExample {
	public static void main(String[] args) {
		OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("prime");
		officeInternetAccess.grantAccess();
	}
}

interface OfficeInternetAccess {
	void grantAccess();
}

class RealInternetAccess implements OfficeInternetAccess {

	private String employeeName;

	public RealInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantAccess() {
		System.out.println("Internet Access is granted to " + employeeName);
	}
}

class ProxyInternetAccess implements OfficeInternetAccess {

	private String employeeName;

	private RealInternetAccess realInternetAccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantAccess() {
		if (getRole(employeeName) > 4) {
			realInternetAccess = new RealInternetAccess(employeeName);
			realInternetAccess.grantAccess();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}
	}

	public int getRole(String emplName) {
		// Check role from the database based on Name and designation
		// return job level or job designation.
		return 4;
	}
}
