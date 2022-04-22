package com.crio.xharktank.service;

import com.crio.xharktank.model.Offer;
import com.crio.xharktank.model.Pitch;
import com.crio.xharktank.model.PostResponse;
import com.crio.xharktank.repo.OffersRepo;
import com.crio.xharktank.repo.PitchesRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
// Service class for offers
// implements OffersService interface
// overrides offers service methods
public class OffersServiceImpl implements OffersService {

    @Autowired
    // reference to offers repo
    // for using its methods here
    private OffersRepo offersRepo;

    @Autowired
    // reference to pitches repo
    // for using its methods here
    private PitchesRepo pitchesRepo;

    @Override
    public PostResponse postOffer(Offer offer, String pitchId) throws Exception {

        // variable of Optional type to check if pitchId exists
        Optional<Pitch> checkPitch = pitchesRepo.findById(pitchId);

        if(checkPitch.isPresent()) {

            log.info("Found pitch");

            // set pitch id for offer
            offer.setPitchId(pitchId);

            // persist offer to db
            offersRepo.save(offer);
            log.info("Persisted offer to database");

            // add offer to offers list of pitch
            // and persist updated pitch to db
            Pitch pitch = checkPitch.get();
            pitch.addToOffersList(offer);
            pitchesRepo.save(pitch);
            log.info("Persisted updated pitch to database");

            // create & return successful response
            return new PostResponse(offer.getId());

        } else {
            throw new Exception("Pitch not found");
        }
    }
}
