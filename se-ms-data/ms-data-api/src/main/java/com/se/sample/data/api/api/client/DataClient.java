package com.se.sample.data.api.api.client;

import com.se.sample.data.api.rest.dto.NoteResponse;

public interface DataClient {

    NoteResponse getNoteById(Long id);

}
