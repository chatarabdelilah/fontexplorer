package be.thomasmore.music.repositories;

import be.thomasmore.music.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
