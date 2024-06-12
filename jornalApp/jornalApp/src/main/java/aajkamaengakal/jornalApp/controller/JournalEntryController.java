package aajkamaengakal.jornalApp.controller;

import aajkamaengakal.jornalApp.entity.JournalEntry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

 private Map<Long, JournalEntry> journalEntries = new HashMap<>();

 @GetMapping
 public List<JournalEntry> getAll() {
  return new ArrayList<>(journalEntries.values());
 };
}
