package com.se.ms.data.rest;


import com.se.ms.data.config.ControllerConstants;
import com.se.ms.data.dao.models.Note;
import com.se.ms.data.dao.repository.NoteRepository;
import com.se.ms.data.exception.ResourceNotFoundException;
import com.se.ms.data.rest.dto.NoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(ControllerConstants.NoteControllerApi)
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping(ControllerConstants.NotesAllApi)
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/notes/{id}")
    public NoteResponse getNoteById(@PathVariable(value = "id") Long noteId) {
         // TODO: add logger
        //TODO: implement

        //  return noteRepository.findById(noteId)
        //          .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        return new NoteResponse(0l, "TEST");
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id") Long noteId,
                           @Valid @RequestBody Note noteDetails) {

        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Note updatedNote = noteRepository.save(note);
        return updatedNote;
    }

    // Delete a Note
    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return ResponseEntity.noContent().build();
    }
}
