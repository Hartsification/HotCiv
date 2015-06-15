package hotciv.visual;

import minidraw.framework.*;

import javax.swing.*;

import hotciv.framework.*;
import hotciv.framework.HotCivFactory;
import hotciv.view.*;

/** Factory for visual testing of various dSoftArk template code */
class HotCivFactory4 implements HotCivFactory, Factory {
	private Game game;
	public HotCivFactory4(Game g) { game = g; }

	public DrawingView createDrawingView( DrawingEditor editor ) {
		DrawingView view = 
				new MapView(editor, game);
		return view;
	}

	public Drawing createDrawing( DrawingEditor editor ) {
		return new CivDrawing( editor, game );
	}

	public JTextField createStatusField( DrawingEditor editor ) {
		JTextField f = new JTextField("dSoftArk template code");
		f.setEditable(false);
		return f;
	}

	public ActionStrategy getActionStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	public AgeStrategy getAgeStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	public SetupStrategy getSetupStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	public WinnerStrategy getWinnerStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	public AttackStrategy getAttackStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	public GrowthStrategy getGrowthStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductionStrategy getProductionStrategy() {
		// TODO Auto-generated method stub
		return null;
	}
}
