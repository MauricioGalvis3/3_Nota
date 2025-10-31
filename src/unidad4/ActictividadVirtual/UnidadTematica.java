package unidad4.ActictividadVirtual;

public class UnidadTematica {
    public final String titulo;
    public final int semanas;

    public UnidadTematica(String titulo, int semanas) {
        this.titulo = titulo;
        this.semanas = semanas;
    }
    @Override public String toString(){
        return titulo + " - " + semanas + " semanas";
    }


}
