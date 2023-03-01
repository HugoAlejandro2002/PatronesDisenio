package codigo.ChainResponsability.Ejercicio8;

public class Main {
    public static void main(String[] args) {
            // Set up the chain of handlers
            HandlerConcretePO handlerDevPO = new HandlerConcretePO();
            HandlerConcreteQA handlerDevQA = new HandlerConcreteQA();
            HandlerConcreteDev handlerDevSenior = new HandlerConcreteDev();
            HandlerConcreteSoporte handlerEquipoSoporte = new HandlerConcreteSoporte();
    
            handlerDevSenior.setNext(handlerEquipoSoporte);
            handlerDevQA.setNext(handlerDevSenior);
            handlerDevPO.setNext(handlerDevQA);
    
            // Test the handler chain with different severities
            Falla falla1 = new Falla("Error en el login", "No permite iniciar sesión", 3);
            Falla falla2 = new Falla("Fallo en la carga de datos", "Los datos no se cargan correctamente", 2);
            Falla falla3 = new Falla("Problema con la barra de navegación", "La barra de navegación no funciona", 1);
            Falla falla4 = new Falla("Error de ortografía en el texto", "Se encontró un error de ortografía en el texto", 0);
            Falla falla5 = new Falla("Problema de prueba", "Este es un problema de prueba", 5);
    
            handlerDevPO.criteriaHandler(falla1);
            handlerDevPO.criteriaHandler(falla2);
            handlerDevPO.criteriaHandler(falla3);
            handlerDevPO.criteriaHandler(falla4);
            handlerDevPO.criteriaHandler(falla5);
        

    }
}
