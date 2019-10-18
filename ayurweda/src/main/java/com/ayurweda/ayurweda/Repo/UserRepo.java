package com.ayurweda.ayurweda.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayurweda.ayurweda.DAO.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

}
