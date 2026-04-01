package be.thomasmore.font.repositories;

import be.thomasmore.font.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Integer> {
}
