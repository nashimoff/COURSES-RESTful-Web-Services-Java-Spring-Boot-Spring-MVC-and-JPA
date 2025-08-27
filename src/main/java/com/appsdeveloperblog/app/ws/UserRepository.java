package com.appsdeveloperblog.app.ws;

import com.appsdeveloperblog.app.ws.io.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
//public interface UserRepository extends CrudRepository <UserEntity, Long>{
    UserEntity findByEmail(String email);
}
