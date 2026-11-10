public abstract class Material implements Catalogable {
    protected String codigo;
    protected String titulo;
    protected int anio;
    protected boolean disponible;


    public Material(String codigo, String titulo, int anio, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public abstract String getTipo();

    public void mostrarInfo (){
        System.out.println(String.format("Tipo: %s%n Titulo: %s%n Año: %d%n Disponible: %b%n",
                getTipo(),
                titulo,
                anio,
                disponible
        ));

        System.out.println("-------------------------------------");
    }
}
