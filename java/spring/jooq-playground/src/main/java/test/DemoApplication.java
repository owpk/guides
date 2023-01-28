package test;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.InsertOnDuplicateSetMoreStep;
import org.jooq.InsertOnDuplicateSetStep;
import org.jooq.Param;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.tables.Users;
import test.tables.records.UsersRecord;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private final DSLContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        String phone = "12345";
        String email = "aasd@mail.ru";
        String newPhone = "123456";
        var s = ctx.insertInto(Users.USERS)
                .set(Users.USERS.PHONE, phone)
                .set(Users.USERS.EMAIL, email);

        InsertOnDuplicateSetStep<UsersRecord> step = s
                .onConflict(Users.USERS.EMAIL)
                .doUpdate();

        if (phone != null) {
            step
                    .set(Users.USERS.PHONE, newPhone)
                    .set(Users.USERS.EMAIL, "REPLACED BY CONFLICTING EMAIL")
                    .execute();
        } else {
            s.execute();
        }
    }

    static <T> Object convertToDatabaseType(Param<T> param) {
        return param.getBinding().converter().to(param.getValue());
    }
}