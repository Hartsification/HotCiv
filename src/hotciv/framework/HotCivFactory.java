package hotciv.framework;

public interface HotCivFactory {
	
	public ActionStrategy getActionStrategy(); 
	public AgingStrategy getAgingStrategy(); 
	public SetupStrategy getSetupStrategy(); 
	public WinnerStrategy getWinnerStrategy(); 
	public AttackStrategy getAttackStrategy();
	public GrowthStrategy getGrowthStrategy();
	public ProductionStrategy getProductionStrategy();
}
