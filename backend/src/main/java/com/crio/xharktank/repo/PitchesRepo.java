package com.crio.xharktank.repo;

import com.crio.xharktank.model.Pitch;
import org.springframework.data.mongodb.repository.MongoRepository;

// pitches repo interface
// makes available all MongoRepository methods
public interface PitchesRepo extends MongoRepository<Pitch, String> {
}
