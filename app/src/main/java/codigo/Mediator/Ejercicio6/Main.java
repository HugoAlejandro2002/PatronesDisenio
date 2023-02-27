package codigo.Mediator.Ejercicio6;

public class Main {

    public static void main(String[] args) {

        Skype skype = new Skype();

        QA qa1 = new QA(skype);

        qa1.setCi("213123").setName("Carlos");
        qa1.setGrado("Ing. Software");


        QA qa2 = new QA(skype);
        QA qa3 = new QA(skype);

        qa2.setCi("768665").setName("Marcos");
        qa2.setGrado("Ing. Teleinformatico");


        qa3.setCi("86570").setName("Juan");
        qa3.setGrado("Ing Datos");

        DEV dev1 = new DEV(skype);
        DEV dev2 = new DEV(skype);
        DEV dev3 = new DEV(skype);


        dev1.setCi("56854").setName("Mateo");
        dev2.setCi("6575567").setName("Ander");
        dev3.setCi("598670").setName("Saurio");

        dev1.setLenguaje("Java");
        dev2.setLenguaje("Python");
        dev3.setLenguaje("Typescript");

        SM sm1 = new SM(skype);
        SM sm2 = new SM(skype);
        SM sm3 = new SM(skype);

        sm1.setCi("90834509").setName("Nauter");
        sm1.setCertificaciones(new String[]{"Certi Scrum", "Certi AWS", "Certi JavaScript"});
        sm2.setCi("242334509").setName("Lada");
        sm2.setCertificaciones(new String[]{"Certi PHP", "Certi Ing. Software"});
        sm3.setCi("95685656").setName("Lucia");
        sm3.setCertificaciones(new String[]{"Certi Agile", "Certi LESS"});

        skype.addPersonasChat(qa1).addPersonasChat(qa2).addPersonasChat(qa3).addPersonasChat(dev1).addPersonasChat(dev2)
                .addPersonasChat(dev3).addPersonasChat(sm1).addPersonasChat(sm2).addPersonasChat(sm3);



        qa1.send("Error en el Frontend...");
        dev2.send("Backend enviado a produccion...");
        sm3.send("Preparense para el Stand-Up...");






    }

}
