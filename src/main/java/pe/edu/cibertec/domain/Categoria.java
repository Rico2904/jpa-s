package pe.edu.cibertec.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Categoria { // de preferencia debe tener el mismo nombre ocn mayus y minus que la tabla

    @Id
    private String codigo;
    private String nombre;

    // como es de 1 a muchos , es una lista
    @OneToMany(mappedBy = "categoria",cascade = { CascadeType.PERSIST,CascadeType.REMOVE})//  a parte hay que poner el campo que es llave foranea
    private List<Libro> libros;// tambien tiene que tner getters an setters


    public Categoria() {
    }


    public Categoria(String codigo) {
        this.codigo = codigo;
    }

    public Categoria(String codigo, String nombre, List<Libro> libros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
