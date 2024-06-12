package aajkamaengakal.jornalApp.controller;

import aajkamaengakal.jornalApp.entity.JournalEntry;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

 private Map<Long, JournalEntry> journalEntries = new HashMap<>();

 @GetMapping
 public List<JournalEntry> getAll() {
  return new ArrayList<>(journalEntries.values());
 };

 @PostMapping
 public boolean createEntry(@RequestBody JournalEntry myEntry) {
  journalEntries.put(myEntry.getId(), myEntry);
  return true;
 }

 @PutMapping("/id/{id}")
 public JournalEntry updateJournalById(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
  return journalEntries.put(id, myEntry);
 }
 
 @GetMapping("id/{myId}")
 public JournalEntry getJournalEntryById(@PathVariable Long myId) {
  return journalEntries.get(myId); 
 }

 @DeleteMapping("id/{myId}")
 public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {
  return journalEntries.remove(myId);
 }
}
