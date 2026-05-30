package be.thomasmore.font.repositories;

import be.thomasmore.font.model.FontCollection;
import org.springframework.data.repository.CrudRepository;

public interface FontCollectionRepository extends CrudRepository<FontCollection, Integer> {
}
