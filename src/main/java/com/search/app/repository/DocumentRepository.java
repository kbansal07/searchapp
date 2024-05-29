package com.search.app.repository;

import com.search.app.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    @Query("SELECT d FROM Document d WHERE " +
            "LOWER(d.title) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(d.content) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(d.author) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<Document> search(@Param("query") String query);
}
