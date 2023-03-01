package codigo.Memento.Ejercicio7;

public class Main {

    public static void main(String[] args) {

        AlmacenamientoBaseDeDatos almacenamientoBaseDeDatos = new AlmacenamientoBaseDeDatos();
        VersionadorBaseDeDatos versionadorBaseDeDatos = new VersionadorBaseDeDatos();

        BaseDeDatos baseDeDatos;

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Dalas", "3324332", 19), new Persona("Javi", "7649576", 76),
        new Persona("Roberto", "389043", 32)});

        versionadorBaseDeDatos.setBackup(baseDeDatos);
        almacenamientoBaseDeDatos.createBackup("BackupMayo", versionadorBaseDeDatos.createBackup());

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Dalas", "3324332", 19), new Persona("Javi", "7649576", 76),
                new Persona("Roberto", "389043", 32) ,new Persona("Pole", "3947532", 21), new Persona("Argos", "9823423", 67),
        new Persona("Marlos", "8439543", 54), new Persona("Nauter", "2480239", 34), new Persona("Lada", "237823", 31)});

        versionadorBaseDeDatos.setBackup(baseDeDatos);
        almacenamientoBaseDeDatos.createBackup("BackupJunio", versionadorBaseDeDatos.createBackup());

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Dalas", "3324332", 19), new Persona("Javi", "7649576", 76),
                new Persona("Roberto", "389043", 32) ,new Persona("Pole", "3947532", 21), new Persona("Argos", "9823423", 67),
                new Persona("Marlos", "8439543", 54), new Persona("Nauter", "2480239", 34), new Persona("Lada", "237823", 31),
        new Persona("Johnny", "34578032", 34), new Persona("Jose", "4358792", 84), new Persona("Sonic", "38443232", 43),
        new Persona("LOL", "3287290", 16)});

        versionadorBaseDeDatos.setBackup(baseDeDatos);
        almacenamientoBaseDeDatos.createBackup("BackupAgosto", versionadorBaseDeDatos.createBackup());

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Dalas", "3324332", 19), new Persona("Javi", "7649576", 76),
                new Persona("Roberto", "389043", 32) ,new Persona("Pole", "3947532", 21), new Persona("Argos", "9823423", 67),
                new Persona("Marlos", "8439543", 54), new Persona("Nauter", "2480239", 34), new Persona("Lada", "237823", 31),
                new Persona("Johnny", "34578032", 34), new Persona("Jose", "4358792", 84), new Persona("Sonic", "38443232", 43),
                new Persona("LOL", "3287290", 16), new Persona("Tadeo", "83495803", 83), new Persona("Josh", "39485093", 13),
        new Persona("Yousef", "3453531", 45)});

        versionadorBaseDeDatos.setBackup(baseDeDatos);
        almacenamientoBaseDeDatos.createBackup("BackupSeptiembre", versionadorBaseDeDatos.createBackup());

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Dalas", "3324332", 19), new Persona("Javi", "7649576", 76),
                new Persona("Roberto", "389043", 32) ,new Persona("Pole", "3947532", 21), new Persona("Argos", "9823423", 67),
                new Persona("Marlos", "8439543", 54), new Persona("Nauter", "2480239", 34), new Persona("Lada", "237823", 31),
                new Persona("Johnny", "34578032", 34), new Persona("Jose", "4358792", 84), new Persona("Sonic", "38443232", 43),
                new Persona("LOL", "3287290", 16), new Persona("Tadeo", "83495803", 83), new Persona("Josh", "39485093", 13),
                new Persona("Yousef", "3453531", 45), new Persona("Uriel", "1082348092", 52), new Persona("Shur", "345354321", 27),
        new Persona("Yoshi", "354645", 6)});

        versionadorBaseDeDatos.setBackup(baseDeDatos);
        almacenamientoBaseDeDatos.createBackup("BackupDiciembre", versionadorBaseDeDatos.createBackup());

        baseDeDatos.showInfo();

        baseDeDatos = versionadorBaseDeDatos.restoreBackup(almacenamientoBaseDeDatos.getBackup("BackupJunio"));

        baseDeDatos.showInfo();





    }

}


