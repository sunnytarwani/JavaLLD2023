package SOLID_DesignPattern.Behavioural.CommandDP;

public class RemoteController {

    private Command command;

    public RemoteController(Command command) {
        this.command = command;
    }

    //Invoker
    public void pressButton(){
        command.execute();
    }
}


/**
 * Person invokes the command by pressing button on remote
 * remote.pressButton();
 * Command call the receiver to execute the final task
 * Remote -> Command -> Receiver Method -> execute the code
 */

/**
 * I will first give the command via the remote
 * and then by remote the request will be received by LightOnCommand Class
 * then it will pass on to execute method which will get us Lighton Method execution
 */