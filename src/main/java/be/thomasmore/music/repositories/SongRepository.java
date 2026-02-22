package be.thomasmore.music.repositories;

import be.thomasmore.music.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Integer> {
}
