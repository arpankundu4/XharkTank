package com.crio.xharktank.service;

import com.crio.xharktank.model.Offer;
import com.crio.xharktank.model.PostResponse;

// interface for offers service
// contains prototypes for service methods
public interface OffersService {

    // service method for persisting counter offer to database
    // takes Offer object & pitchId as argument
    // returns PostResponse object containing offer id if pitch found
    // throws exception if pitch not found
    PostResponse postOffer(Offer offer, String pitchId) throws Exception;

}
