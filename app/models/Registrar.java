package models;

import play.db.jpa.Model;
import javax.persistence.Entity;

public class Registrar extends Employee {

	private long RegistrarID;

	public Registrar(long regid) {
		RegistrarID=regid;
	}

	public long getRegID() {
		return RegistrarID;
	}

	public void setRegID(long RegistrarID) {
		this.RegistrarID=RegistrarID;
	}

}
