package usuario.sistema;

import usuario.sistema.primario.Usuarios;


public class Principal {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Mathnite!");
        Usuarios Ismail = new Usuarios(123, "Ismail", 1234, 2);
        Usuarios Riad = new Usuarios(1234, "Riad", 1542, 3);
        Usuarios Matheus = new Usuarios(12345, "Matheus", 2367, 1);
        Usuarios Iuri = new Usuarios(123456, "Iuri", 8945, 4);
        System.out.println(Ismail);
        System.out.println(Riad);
        System.out.println(Iuri);
        System.out.println(Matheus);

    }
}
