package codigo.Command.Ejercicio8;

public class CounterAttackCommand implements ICommand {
    private Character character;

    public CounterAttackCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.run();
        character.jump();
        character.run();
        character.jump();
        character.protect();
        character.hit();
        character.heal();
        character.run();
    }
}

