package com.example.controller;

import com.example.model.DiaryEntry;
import com.example.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diary")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @PostMapping
    public ResponseEntity<DiaryEntry> createDiaryEntry(@RequestBody DiaryEntry diaryEntry) {
        DiaryEntry createdEntry = diaryService.saveDiaryEntry(diaryEntry);
        return ResponseEntity.ok(createdEntry);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiaryEntry> getDiaryEntry(@PathVariable Long id) {
        DiaryEntry diaryEntry = diaryService.getDiaryEntryById(id);
        return ResponseEntity.ok(diaryEntry);
    }

    @GetMapping
    public ResponseEntity<List<DiaryEntry>> getAllDiaryEntries() {
        List<DiaryEntry> diaryEntries = diaryService.getAllDiaryEntries();
        return ResponseEntity.ok(diaryEntries);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DiaryEntry> updateDiaryEntry(@PathVariable Long id, @RequestBody DiaryEntry diaryEntry) {
        DiaryEntry updatedEntry = diaryService.updateDiaryEntry(id, diaryEntry);
        return ResponseEntity.ok(updatedEntry);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiaryEntry(@PathVariable Long id) {
        diaryService.deleteDiaryEntry(id);
        return ResponseEntity.noContent().build();
    }
}