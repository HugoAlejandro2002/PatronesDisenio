package codigo.Command.Ejercicio8;

public class HealCommand implements ICommand {
    private Character character;

    public HealCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.heal();
    }
}
