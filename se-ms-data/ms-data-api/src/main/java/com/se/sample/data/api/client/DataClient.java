package com.se.sample.data.api.client;

import com.se.sample.data.rest.dto.NoteResponse;

public interface DataClient {

    NoteResponse getNoteById(Long id);

}
