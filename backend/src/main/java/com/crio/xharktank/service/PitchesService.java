package com.crio.xharktank.service;

import com.crio.xharktank.model.Offer;
import com.crio.xharktank.model.Pitch;
import com.crio.xharktank.model.PostResponse;

import java.util.List;

// interface for pitches service
// contains prototypes for service methods
public interface PitchesService {

    // service method for persisting pitch to database
    // takes Pitch object as argument
    // returns PostResponse object containing id
    PostResponse createPitch(Pitch pitch);

    // service method for fetching all pitches from db
    // returns list of Pitch objects
    // in reverse chronological order
    List<Pitch> showPitches();

    // service method for fetching a single pitch from db
    // identified by pitchId
    // returns Pitch object if pitch found
    // throws exception if pitch not found
    Pitch showPitch(String pitchId) throws Exception;

}
