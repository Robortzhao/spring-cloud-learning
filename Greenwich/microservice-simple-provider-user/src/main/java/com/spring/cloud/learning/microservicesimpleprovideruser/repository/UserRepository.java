package com.spring.cloud.learning.microservicesimpleprovideruser.repository;

import com.spring.cloud.learning.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhaoyanhai
 * @description Dao
 * @date 2019/10/5
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
