package hotciv.common;

import java.util.ArrayList;

import hotciv.framework.ProductionStrategy;
import hotciv.framework.Tile;

public class ProductionStrategyAlpha implements ProductionStrategy {

	public int getProductionIncrease(int populationSize, ArrayList<Tile> surroundingTiles) {
		return 6;
	}

	public int getFoodIncrease(int populationSize, ArrayList<Tile> surroundingTiles) {
		return 0;
	}
}
