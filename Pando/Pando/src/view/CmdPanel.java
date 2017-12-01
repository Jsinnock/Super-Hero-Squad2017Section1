package view;

import java.awt.event.ActionListener;
import javax.swing.*;


@SuppressWarnings("serial")
public class CmdPanel extends JPanel {

	private JButton saveGame=new JButton("Save Game");

	private JButton loadGame=new JButton("Load Game");

	private JButton exitGame=new JButton("Exit Game");

	//private ActionEvent toStartMenu;
	
	public CmdPanel(){
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		add(saveGame);
		add(loadGame);
		add(exitGame);
		
	}
	public void addController(ActionListener c){
		saveGame.addActionListener(c);
		loadGame.addActionListener(c);
		exitGame.addActionListener(c);
	}

	public JButton getSaveButton() {
		return saveGame;
	}
	public JButton getLoadButton() {
		return loadGame;
	}
	public JButton getExitButton() {
		return exitGame;
	}

}
