package hotciv.factory;

import hotciv.framework.AgingStrategy;
import hotciv.framework.WinnerStrategy;
import hotciv.variant.AgingStrategyBeta;
import hotciv.variant.WinnerStrategyBeta;

public class BetaFactory extends AlphaFactory {
	@Override
	public AgingStrategy getAgingStrategy() {
		return new AgingStrategyBeta();
	}

	@Override
	public WinnerStrategy getWinnerStrategy() {
		return new WinnerStrategyBeta();
	}
}
