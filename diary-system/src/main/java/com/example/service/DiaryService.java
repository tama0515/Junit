package com.example.service;

import com.example.model.DiaryEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DiaryService {

    private final List<DiaryEntry> diaryEntries = new ArrayList<>();

    public List<DiaryEntry> getAllEntries() {
        return new ArrayList<>(diaryEntries);
    }

    public Optional<DiaryEntry> getEntryById(int id) {
        return diaryEntries.stream()
                .filter(entry -> entry.getId() == id)
                .findFirst();
    }

    public void addEntry(DiaryEntry entry) {
        diaryEntries.add(entry);
    }

    public void updateEntry(int id, DiaryEntry updatedEntry) {
        for (int i = 0; i < diaryEntries.size(); i++) {
            DiaryEntry entry = diaryEntries.get(i);
            if (entry.getId() == id) {
                diaryEntries.set(i, updatedEntry);
                return;
            }
        }
    }

    public void deleteEntry(int id) {
        diaryEntries.removeIf(entry -> entry.getId() == id);
    }
}