package hotciv.standard;
import hotciv.framework.*;

public class TileImpl implements Tile{
	Position position;
	String type;
	Unit unit;
	City city;

	public TileImpl(Position p, String t) {
		position = p;
		type = t;
		unit = null;
		city = null;
	}

	public Position getPosition() {
		return position;
	}

	public String getTypeString() {
		return type;
	}

	public void changeTypeString(String newType) {
		this.type = newType;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public void removeUnit() {
		this.unit = null;
	}

	public Unit getUnit() {
		return unit;
	}

	public void addCity(City city) {
		this.city = city;
	}

	public City getCity() {
		return city;
	}

	public boolean equals(Object o) {
		if (o == null) { return false; }
		if (o.getClass() != TileImpl.class) { return false; }
		TileImpl other = (TileImpl) o;
		return position.equals(other.position) && type.equals(other.type);
	}
}
