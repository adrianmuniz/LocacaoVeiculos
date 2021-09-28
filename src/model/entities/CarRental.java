package model.entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date finish;
	
	private Vehicle vehile;
	private Invoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(Date start, Date finish, Vehicle vehile) {
		this.start = start;
		this.finish = finish;
		this.vehile = vehile;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVehile() {
		return vehile;
	}

	public void setVehile(Vehicle vehile) {
		this.vehile = vehile;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	
	
	
}
