package com.se.sample.api.api.client;

import com.se.sample.api.rest.dto.NoteResponse;

public interface DataClient {

    NoteResponse getNoteById(Long id);

}
