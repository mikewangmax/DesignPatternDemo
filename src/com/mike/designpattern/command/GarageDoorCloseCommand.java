
public class GarageDoorCloseCommand implements Command{

	@Override
	public void execute() {
       System.out.println("GarageDoorCloseCommand execute");		
	}

	@Override
	public void undo() {
		
	}

}
