package codigo.Command.Ejercicio8;

public class ProtectCommand implements ICommand {
    private Character character;

    public ProtectCommand(Character character) {
        this.character = character;
    }
    
    @Override
    public void execute() {
        character.protect();
    }
}
