package com.example.demo;

import nu.studer.sample.Tables;
import nu.studer.sample.tables.pojos.SecUserRole;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {

    @Autowired
    DSLContext context;

    public List<SecUserRole> getBooks(){
        return context
                .selectFrom(Tables.SEC_USER_ROLE)
                .fetchInto(SecUserRole.class);
    }

    public void insertBook(SecUserRole role){
        context
                .insertInto(Tables.SEC_USER_ROLE, Tables.SEC_USER_ROLE.ROLE_ID,
                        Tables.SEC_USER_ROLE.USER_ID)
                .values(role.getRoleId(), role.getUserId())
                .execute();
    }
}
