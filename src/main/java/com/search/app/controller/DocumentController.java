package com.search.app.controller;

import com.search.app.model.Document;
import com.search.app.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return documentService.saveDocument(document);
    }

    @GetMapping("/search")
    public List<Document> searchDocuments(@RequestParam String query) {
        return documentService.searchDocuments(query);
    }
}