package test;

import lombok.RequiredArgsConstructor;
import org.jooq.Param;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    private EntityManager em;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws InterruptedException {
    }

    static List<Object[]> nativeQuery(EntityManager em, org.jooq.Query query, Class<?> type) {
        Query result = em.createNativeQuery(query.getSQL(), type);
        int i = 1;
        for (Param<?> param : query.getParams().values())
            if (!param.isInline())
                result.setParameter(i++, convertToDatabaseType(param));
        return result.getResultList();
    }

    static <T> Object convertToDatabaseType(Param<T> param) {
        return param.getBinding().converter().to(param.getValue());
    }
}