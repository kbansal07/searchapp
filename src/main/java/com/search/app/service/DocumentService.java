package com.search.app.service;

import com.search.app.model.Document;
import com.search.app.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }

    @Cacheable(value = "documents", key = "#query")
    public List<Document> searchDocuments(String query) {
        return documentRepository.search(query);
    }
}