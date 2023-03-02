package codigo.Command.Ejercicio8;

public class Invoker {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
