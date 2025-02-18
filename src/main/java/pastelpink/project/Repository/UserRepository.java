package pastelpink.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pastelpink.project.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.Email = :username AND u.password = :password")
    public User getUserByEmail(@Param("username") String username,@Param("password") String mk);
}
