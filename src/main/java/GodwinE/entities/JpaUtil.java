package GodwinE.entities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static EntityManagerFactory entitiManagerFactory;

    static {
        try {
            entitiManagerFactory = Persistence.createEntityManagerFactory("simpljpa");
        } catch(Throwable ex){
            System.err.println("Initial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntitiManagerFactory(){
        return entitiManagerFactory;
    }
}
