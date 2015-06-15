package hotciv.factory;

import hotciv.common.ActionStrategyAlpha;
import hotciv.common.AgeStrategyAlpha;
import hotciv.common.AttackStrategyAlpha;
import hotciv.common.GrowthStrategyAlpha;
import hotciv.common.ProductionStrategyAlpha;
import hotciv.common.SetupStrategyAlpha;
import hotciv.common.WinnerStrategyAlpha;
import hotciv.framework.ActionStrategy;
import hotciv.framework.AgeStrategy;
import hotciv.framework.AttackStrategy;
import hotciv.framework.HotCivFactory;
import hotciv.framework.GrowthStrategy;
import hotciv.framework.ProductionStrategy;
import hotciv.framework.SetupStrategy;
import hotciv.framework.WinnerStrategy;

public class AlphaFactory implements HotCivFactory {
	
	public ActionStrategy getActionStrategy() {
		return new ActionStrategyAlpha();
	}

	public AgeStrategy getAgeStrategy() {
		return new AgeStrategyAlpha();
	}

	public SetupStrategy getSetupStrategy() {
		return new SetupStrategyAlpha();
	}

	public WinnerStrategy getWinnerStrategy() {
		return new WinnerStrategyAlpha();
	}

	public AttackStrategy getAttackStrategy() {
		return new AttackStrategyAlpha();
	}

	public GrowthStrategy getGrowthStrategy() {
		return new GrowthStrategyAlpha();
	}

	public ProductionStrategy getProductionStrategy() {
		return new ProductionStrategyAlpha();
	}
}
