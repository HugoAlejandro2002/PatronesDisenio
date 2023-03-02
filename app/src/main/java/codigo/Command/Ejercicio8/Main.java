package codigo.Command.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        ICommand runCommand = new RunCommand(character);
        ICommand attackCommand = new AttackCommand(character);
        ICommand regenerationCommand = new RegenerationCommand(character);
        ICommand counterAttackCommand = new CounterAttackCommand(character);

        Invoker invoker = new Invoker();

        System.out.println("Nivel 1:");
        invoker.setCommand(runCommand);
        invoker.run();

        System.out.println("Nivel 2:");
        invoker.setCommand(regenerationCommand);
        invoker.run();

        System.out.println("Nivel 3:");
        invoker.setCommand(attackCommand);
        invoker.run();

        System.out.println("Nivel 4:");
        invoker.setCommand(counterAttackCommand);
        invoker.run();
    }

}
