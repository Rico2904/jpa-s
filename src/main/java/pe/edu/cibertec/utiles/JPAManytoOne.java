package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Categoria;
import pe.edu.cibertec.domain.Libro;

import java.util.Date;

public class JPAManytoOne {


    public static void main(String[] args) {
        //referenciar a la unidad de persistencia se copiaaaaaa
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // crear libro
        Libro libro=new Libro("A20","titulo20","Autor20",new Date(),200.23,null );


        //referenciar categoria
        Categoria categoria = em.find(Categoria.class, "C1");
        libro.setCategoria(categoria);

        //persist
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();


    }


}
