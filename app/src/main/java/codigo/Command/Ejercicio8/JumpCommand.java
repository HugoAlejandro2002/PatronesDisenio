package codigo.Command.Ejercicio8;

public class JumpCommand implements ICommand {
    private Character character;

    public JumpCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();
    }
}
