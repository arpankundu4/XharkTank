package com.crio.xharktank.service;

import com.crio.xharktank.model.Pitch;
import com.crio.xharktank.model.PostResponse;
import com.crio.xharktank.repo.PitchesRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Log4j2
@Service
// Service class for pitches
// implements PitchesService interface
// overrides pitches service methods
public class PitchesServiceImpl implements PitchesService {

    @Autowired
    // reference to pitches repo
    // for using its methods here
    private PitchesRepo pitchesRepo;

    @Override
    public PostResponse createPitch(Pitch pitch) {
        pitchesRepo.save(pitch);
        log.info("Persisted pitch to database");
        String id = pitch.getId();
        return new PostResponse(id);
    }

    @Override
    public List<Pitch> showPitches() {
        List<Pitch> pitches = pitchesRepo.findAll();
        log.info("Fetched list of pitches");
        Collections.reverse(pitches);
        log.info("Reversing list for reverse chronological order");
        return pitches;
    }

    @Override
    public Pitch showPitch(String pitchId) throws Exception {
        Optional<Pitch> pitch = pitchesRepo.findById(pitchId);
        if(pitch.isPresent()) {
            log.info("Found pitch");
            return pitch.get();
        } else {
            throw new Exception("Pitch not found");
        }
    }
}
