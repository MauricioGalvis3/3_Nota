package unidad4.ActictividadVirtual;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Curso {
    private final String codigo;
    private final String nombre;
    private final List<UnidadTematica> unidadesTematicas;
    private final List<Estudiante> inscritos= new ArrayList<>();

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadesTematicas = new ArrayList<>();
    }

    //composition: el curso esta compuesto por unidades tematicas
    public void agregarUnidadTematica(String titulo ,int semanas){
        unidadesTematicas.add(new UnidadTematica(titulo, semanas));
    }
    //agregacion: el curso tiene estudiantes inscritos
    public void inscribir(Estudiante estudiante){
        Objects.requireNonNull(estudiante, "El estudiante no puede ser nulo");
        if(!inscritos.contains(estudiante)){
            inscritos.add(estudiante);
        }
    }
    public void desinscribir(Estudiante estudiante){
        inscritos.remove(estudiante);
    }
       public List<UnidadTematica> getUnidades() {
            return List.copyOf(unidadesTematicas);
        }
    public List<Estudiante> getInscritos() {
        return List.copyOf(inscritos);
    }


    @Override
    public String toString() {
        return "curso("+ codigo + ", " + nombre + ", unidades=" + unidadesTematicas + ", inscritos=" + inscritos + ')';
    }

}
