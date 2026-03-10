package be.thomasmore.font.repositories;

import be.thomasmore.font.model.Font;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FontRepository extends CrudRepository<Font, Integer> {
    @Query("SELECT f FROM Font f WHERE " +
    "(:name IS NULL OR LOWER(f.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
            "(:category IS NULL OR LOWER(f.category) LIKE LOWER(CONCAT('%', :category, '%'))) AND " +
            "(:license IS NULL OR LOWER(f.license) LIKE LOWER(CONCAT('%', :license, '%'))) AND " +
            "(:yearFrom IS NULL OR f.year >= :yearFrom) AND " +
            "(:yearTo IS NULL OR f.year <= :yearTo) AND " +
            "(:archived IS NULL OR f.archived = :archived)"
    )
    List<Font> findByFilter(@Param("name") String name,
                            @Param("category") String category,
                            @Param("license") String license,
                            @Param("yearFrom") Integer yearFrom,
                            @Param("yearTo") Integer yearTo,
                            @Param("archived") Boolean archived
    );
}