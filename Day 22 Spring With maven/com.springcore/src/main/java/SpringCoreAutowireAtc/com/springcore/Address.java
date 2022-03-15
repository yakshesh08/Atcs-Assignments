package SpringCoreAutowireAtc.com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private int honum;
	private String colony;
	private String dstrct;
	private String state;
	
	public int getHonum() {
		return honum;
	}
	public void setHonum(int honum) {
		this.honum = honum;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getDstrct() {
		return dstrct;
	}
	public void setDstrct(String dstrct) {
		this.dstrct = dstrct;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int honum, String colony, String dstrct, String state) {
		super();
		this.honum = honum;
		this.colony = colony;
		this.dstrct = dstrct;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [honum=" + honum + ", colony=" + colony + ", dstrct=" + dstrct + ", state=" + state + "]";
	}
	

}