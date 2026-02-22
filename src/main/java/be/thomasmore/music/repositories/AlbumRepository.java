package be.thomasmore.music.repositories;

import be.thomasmore.music.model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Integer> {
}
