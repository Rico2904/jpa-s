package pe.edu.cibertec.queries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.domain.Libro;

import java.math.BigDecimal;
import java.util.List;

public class JPAQuery {

    public static void main(String[] args) {
        //referenciar a la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //select
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l", Libro.class);

        //select where
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor= :autor", Libro.class);
       // query.setParameter("autor", "Claudia");

        //select where  comparativos
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio > :precio", Libro.class);
       // query.setParameter ("precio", 50.0);

        //select where  between
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio between :inicio and :fin", Libro.class);
        //query.setParameter("inicio", 30);
        //query.setParameter("fin", 50);

        //select where  in
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor in ('Cesar','Claudia')", Libro.class);

        //select valores esclaraes - aca se cambia el Libro por String a everything
       // TypedQuery<String> query = em.createQuery("select l.autor from Libro l where l.autor in ('Cesar','Claudia')", String.class);

        //select valores esclaraes - aca se cambia el Libro por String a everything
       // TypedQuery<String> query = em.createQuery("select distinct upper(l.autor) from Libro l where l.autor in ('Cesar','Claudia')", String.class);

        //select order by
       // TypedQuery<Libro> query = em.createQuery("select l.autor from Libro l order by  l.precio", Libro.class);

        //select group by aca cambia a Object[] lo dentro de la list etc
       // TypedQuery<Object[]> query = em.createQuery("select l.autor, count(l) from Libro l group by l.autor", Object[].class);

        //select is null
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where  l.autor is null", Libro.class);

        //select like
        TypedQuery<Libro> query = em.createQuery("select l from Libro l where  l.titulo like 'c%'", Libro.class);

        //obtener resultados
        List<Libro> resultado = query.getResultList();
        resultado.forEach(System.out::println);
    }
}
