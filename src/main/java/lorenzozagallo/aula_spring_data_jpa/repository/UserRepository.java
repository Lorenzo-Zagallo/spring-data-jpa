package lorenzozagallo.aula_spring_data_jpa.repository;

import lorenzozagallo.aula_spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // vou trabalhar com classe 'User' e o seu Id é do tipo 'Integer'.
}
