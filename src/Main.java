
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("233233","Deja de ser tu", 2000,true, "Joe Dispenza", "2222222");
        Revista revista1 = new Revista("3444445", "Tu", 2020, false, 3,"famosos");

        System.out.println(libro1.mostrarInfo());
        System.out.println(revista1.mostrarInfo());

        SistemaBiblioteca sistema = new SistemaBiblioteca();
        sistema.registrarMaterial(libro1);
        sistema.mostrarCatalogo();

    }
}

