package com.se.ms.data.api.client;

import com.se.ms.data.rest.dto.NoteResponse;

public interface DataClient {

    NoteResponse getNoteById(Long id);

}
