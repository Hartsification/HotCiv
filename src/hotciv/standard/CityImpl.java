package hotciv.standard;
import hotciv.framework.*;

public class CityImpl implements City{
	Player owner;
	int size;
	int productionAmount;
	int foodAmount;
	String production;
	String workFocus;
	
	public CityImpl(Player owner, int size, String production, String workFocus) {
		this.owner = owner;
		this.production = production;
		this.workFocus = workFocus;
		productionAmount = 0;
		foodAmount = 0;
		this.size = size;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public void changeOwner(Player player) {
		owner = player;
	}

	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public String getProduction() {
		return production;
	}

	public int getProductionAmount() {
		return productionAmount;
	}
	
	public void setProduction(String production) {
		this.production= production; 
	}
	
	public void addProduction(int amount) {
		productionAmount += amount;
	}
	
	public Unit produce() {
		int cost = GameConstants.getCostForUnitType(production);
		if(productionAmount >= cost) {
			productionAmount -= cost; 
			return UnitImpl.produceUnit(production, owner);
		} else {
			return null;
		}
	}
	
	public String getWorkforceFocus() {
		return workFocus;
	}
	
	public void setWorkforceFocus(String workFocus) {
		this.workFocus = workFocus;
	}
	
	public boolean equals(Object o) {
		if (o == null) { return false; }
		if (o.getClass() != CityImpl.class) { return false; }
		CityImpl other = (CityImpl) o;
		return owner.equals(other.owner) &&
				size == other.size &&
				production == other.production &&
				workFocus == other.workFocus;
	}

	public void addFood(int amount) {
		foodAmount += amount;
	}

	public void resetFood() {
		foodAmount = 0;
	}

	public int getFood() {
		return foodAmount;
	}
}
