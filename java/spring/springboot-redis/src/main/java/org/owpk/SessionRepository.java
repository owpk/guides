package org.owpk;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Vorobyev Vyacheslav
 */
public interface SessionRepository extends CrudRepository<UserSession, String> {

}
