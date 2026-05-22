package com.cf.PedidosController.repositories;

import com.cf.PedidosController.enums.UserRole;
import com.cf.PedidosController.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

    public UserDetails findByLogin (String username);
}
