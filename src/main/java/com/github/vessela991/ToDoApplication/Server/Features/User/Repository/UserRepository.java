package com.github.vessela991.ToDoApplication.Server.Features.User.Repository;

import com.github.vessela991.ToDoApplication.Server.Data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
