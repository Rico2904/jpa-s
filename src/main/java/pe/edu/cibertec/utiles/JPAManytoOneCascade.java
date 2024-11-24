package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Categoria;
import pe.edu.cibertec.domain.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAManytoOneCascade {


    public static void main(String[] args) {
        //referenciar a la unidad de persistencia se copiaaaaaa
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //Crear categoria
        Categoria categoria = new Categoria("C100","Matematica",null );
        // crear libro
        Libro libro=new Libro("A20","titulo20","Autor20",new Date(),200.23,categoria );


        //referenciar lista de libros en categoria
        categoria.setLibros((Arrays.asList(libro)));

        //persist
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();


    }


}
