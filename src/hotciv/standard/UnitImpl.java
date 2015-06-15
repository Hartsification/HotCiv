package hotciv.standard;
import hotciv.framework.*;

public abstract class UnitImpl implements Unit {
	UnitGeneric unitGeneric;
	
	protected UnitImpl(String type, Player owner, int moveCount, int defense, int attack) {
		unitGeneric = new UnitGeneric(type, owner, moveCount, defense, attack);
	}
	
	public static Unit produceUnit(String type, Player owner) {
		if(type.equals(GameConstants.ARCHER)) {
			return new UnitArcher(owner);
		} else if(type.equals(GameConstants.LEGION)) {
			return new UnitLegion(owner);
		} else if(type.equals(GameConstants.SETTLER)) {
			return new UnitSettler(owner);
		} else {
			return null;
		}
	}
	
	public String getTypeString() {
		return unitGeneric.type;
	}

	public Player getOwner() {
		return unitGeneric.owner;
	}

	public int getMoveCount() {
		return unitGeneric.moveCount;
	}

	public int getDefensiveStrength() {
		return unitGeneric.defense;
	}

	public int getAttackingStrength() {
		return unitGeneric.attack;
	}
	
	public void performAction() {
		// do nothing
	}
	
	public void resetMoveCount() {
		unitGeneric.resetMoveCount();
	}
	
	public boolean canMove() {
		return unitGeneric.canMove();
	}
	
	public void hasMoved() {
		unitGeneric.hasMoved();
	}

	public boolean equals(Object o) {
		if (o == null) { return false; }
		UnitImpl other = (UnitImpl) o;
		return unitGeneric.equals(other.getUnitGeneric());
	}

	public Unit getUnitGeneric() {
		return unitGeneric;
	}
	
	public class UnitGeneric implements Unit {
		protected String type;
		protected Player owner;
		protected int moveCount;
		protected int defense;
		protected int attack;
		
		public UnitGeneric(String type, Player owner, int moveCount, int defense, int attack) {
			this.type = type;
			this.owner = owner;
			this.moveCount = moveCount;
			this.defense = defense;
			this.attack = attack;
		}
		
		public String getTypeString() {
			return type;
		}

		public Player getOwner() {
			return owner;
		}

		public int getMoveCount() {
			return moveCount;
		}

		public int getDefensiveStrength() {
			return defense;
		}

		public int getAttackingStrength() {
			return attack;
		}

		public void resetMoveCount() {
			moveCount = 1;
		}

		public boolean equals(Object o) {
			if (o == null) { return false; }
			if (o.getClass() != UnitGeneric.class) { return false; }
			UnitGeneric other = (UnitGeneric) o;
			return type.equals(other.type) &&
					owner.equals(other.owner) &&
					moveCount == other.moveCount &&
					defense == other.defense &&
					attack == other.attack;
		}

		public void performAction() {}

		public Unit getUnitGeneric() {
			return null;
		}

		public boolean canMove() {
			return moveCount > 0;
		}
		
		public void hasMoved() {
			moveCount = 0;
		}
	}
}
