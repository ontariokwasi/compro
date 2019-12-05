package lab4_command.problem;

public class Controller {
	private Lab4 view;
	private CommandManager cmdmgr;
	private VStack model;
	Controller(Lab4 view, VStack model){
		this.view = view;
		this.cmdmgr = new CommandManager();
		this.model = model;
	}

	void JButtonPush_actionPerformed(java.awt.event.ActionEvent event)
	{
		view.setPushString("");
		view.showPushDialog();
	    cmdmgr.submit(new PushCommand(model, view.getPushString())); //pass on command execution to CM
		view.update();	 
	}

	void JButtonPop_actionPerformed(java.awt.event.ActionEvent event)
	{
		cmdmgr.submit(new PopCommand(model)); //pass on command execution to CM
		view.update();	
			 
	}

	void JButtonUndo_actionPerformed(java.awt.event.ActionEvent event)
	{
		cmdmgr.undo();
		view.update();	
			 
	}

	void JButtonRedo_actionPerformed(java.awt.event.ActionEvent event)
	{
		cmdmgr.redo();
		view.update();	
			 
	}
	
}
