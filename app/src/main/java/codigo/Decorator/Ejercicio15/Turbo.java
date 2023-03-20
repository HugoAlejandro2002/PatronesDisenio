package codigo.Decorator.Ejercicio15;

public class Turbo extends Accesorio{
    private String modeloTurbo;

    public Turbo(IAutomovil iAutomovil, String modeloTurbo) {
        super(iAutomovil);
        this.modeloTurbo = modeloTurbo;
    }

    @Override
    public void decorarAutomovil(IAutomovil iAutomovil){
        System.out.println("--- Agregando Turbo ---");
        super.decorarAutomovil(iAutomovil);
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("--- Turbo ---");
        System.out.println("* Modelo Turbo: "+modeloTurbo);
    }

    @Override
    public void realizarAccion(){
        super.realizarAccion();
        System.out.println("--- Turbo: Aumentando Velocidad ---");
    }

}
