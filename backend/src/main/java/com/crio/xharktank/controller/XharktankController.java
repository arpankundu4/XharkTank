package com.crio.xharktank.controller;

import com.crio.xharktank.model.Offer;
import com.crio.xharktank.model.Pitch;
import com.crio.xharktank.model.PostResponse;
import com.crio.xharktank.service.OffersService;
import com.crio.xharktank.service.PitchesService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Log4j2
@CrossOrigin
@RestController
public class XharktankController {

    @Autowired
    // reference to pitches service
    // for using its methods here
    private PitchesService pitchesService;

    @Autowired
    // reference to offers service
    // for using its methods here
    private OffersService offersService;

    // controller method for posting a pitch
    // returns
    // (1) id json response with status code 201 if pitch created successfully
    // (2) status code 400 if invalid request body

    @PostMapping("/pitches")
    @ResponseBody
    public ResponseEntity<PostResponse> postPitch(@RequestBody @Valid Pitch pitch) {
        log.info("Create new pitch request");
        try {
            PostResponse response = pitchesService.createPitch(pitch);
            log.info("Pitch created successfully");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Create pitch request failed : " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // controller method for fetching all pitches (in reverse chronological order)
    // returns
    // (1) json response of list of pitches with status code 200
    // (2) empty list if no pitches are available

    @GetMapping("/pitches")
    public ResponseEntity<List<Pitch>> getPitches() {
        log.info("Fetch all pitches request");
        List<Pitch> pitches = pitchesService.showPitches();
        log.info("All pitches fetched successfully");
        return new ResponseEntity<>(pitches, HttpStatus.OK);
    }

    // controller method for fetching a single pitch
    // returns
    // (1) json response of pitch with status code 200 if pitch exists
    // (2) status code 404 if pitch not found

    @GetMapping("/pitches/{pitch_id}")
    public ResponseEntity<Pitch> getPitch(@PathVariable("pitch_id") String pitchId) {
        log.info("Fetch pitch by id request");
        try {
            Pitch pitch = pitchesService.showPitch(pitchId);
            log.info("Fetched pitch successfully");
            return new ResponseEntity<>(pitch, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Pitch fetch request failed : " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // controller method for posting a counter offer to a pitch
    // returns
    // (1) id json response with status code 201 if offer created successfully
    // (2) status code 400 if invalid request body
    // (3) status code 404 if pitch not found

    @PostMapping("/pitches/{pitch_id}/makeOffer")
    public ResponseEntity<PostResponse> postOffer(@PathVariable("pitch_id") String pitchId, @RequestBody @Valid Offer offer) {
        log.info("Make counter offer request");
        try {
            PostResponse response = offersService.postOffer(offer, pitchId);
            log.info("Counter offer created successfully");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Make counter offer request failed : " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
