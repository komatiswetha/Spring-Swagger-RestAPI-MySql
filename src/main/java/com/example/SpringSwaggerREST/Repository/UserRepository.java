package com.example.SpringSwaggerREST.Repository;

import com.example.SpringSwaggerREST.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User,Long> {


}
