
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("233233","Deja de ser tu", 2000,false, "Joe Dispenza", "2222222");
        Libro libro2 = new Libro("789099","El poder del ahora", 2020,true, "Joe Dispenza", "5678809");

        Revista revista1 = new Revista("3444445", "Tu", 2020, false, 3,"famosos");
        Revista revista2 = new Revista("5785758", "Yambal", 2026, true, 2,"ventas");

        System.out.println(libro1.mostrarInfo());
        System.out.println(revista1.mostrarInfo());

        SistemaBiblioteca sistema = new SistemaBiblioteca();
        sistema.registrarMaterial(libro1);
        sistema.mostrarCatalogo();
        sistema.registrarMaterial(libro1);
        sistema.registrarMaterial(libro2);
        sistema.registrarMaterial(revista1);
        sistema.registrarMaterial(revista2);
        System.out.println(sistema.buscarMaterial("233233"));
        System.out.println(sistema.buscarMaterial("3444445"));
        System.out.println(sistema.buscarMaterial("90909090"));

        sistema.agregarEspera("233233", "Cristian");
        sistema.agregarEspera("233233", "Laura");
        sistema.agregarEspera("233233", "Pedro");

        System.out.println(sistema.siguienteEnEspera("233233"));
        System.out.println(sistema.siguienteEnEspera("233233"));
        System.out.println(sistema.siguienteEnEspera("233233"));

        sistema.registrarMiembro("Ana");
        sistema.registrarMiembro("Sofia");
        sistema.registrarMiembro("Pepito");

        System.out.println(sistema.tieneMembresía("Ana"));
        System.out.println(sistema.tieneMembresía("Lola"));

        sistema.mostrarCatalogo();



    }
}

