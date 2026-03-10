package be.thomasmore.font.repositories;

import be.thomasmore.font.model.Font;
import org.springframework.data.repository.CrudRepository;

public interface FontRepository extends CrudRepository<Font, Integer> {
}
