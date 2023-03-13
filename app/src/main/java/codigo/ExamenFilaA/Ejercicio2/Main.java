package codigo.ExamenFilaA.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Chat c = new Chat();

        Estudiante a = new Estudiante("hugo", c, "876");
        Estudiante b = new Estudiante("ander", c, "678");
        Estudiante c1 = new Estudiante("cristian", c, "566");

        Docente d = new Docente("romuolo", c, "7876");
        Docente e = new Docente("laguna", c, "5676");
        Docente f = new Docente("jjuan", c, "56789");

        Administrativo g = new Administrativo("mateo", c, "Director");
        Administrativo h = new Administrativo("messi", c, "Psicologo");
        Administrativo i = new Administrativo("adhemar", c, "Profesor");

        c.addPersona(a).addPersona(b).addPersona(c1)
        .addPersona(d).addPersona(e).addPersona(f)
        .addPersona(g).addPersona(h).addPersona(i);

        a.send("Jijijijjaja", "docentes");
        a.send("No", "administrativos");
        a.send("Tarea", "x");

        d.send("test", "x");

        g.send("feriado", "x");
    }
}
