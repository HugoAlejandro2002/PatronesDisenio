package codigo.Command.Ejercicio8;

public class RegenerationCommand implements ICommand {
    private Character character;

    public RegenerationCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.protect();
        character.heal();
    }
}

