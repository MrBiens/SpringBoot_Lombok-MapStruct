package com.vn.sbit.idenfity_service.repository;

import com.vn.sbit.idenfity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    boolean existsByUserName(String userName);

}
