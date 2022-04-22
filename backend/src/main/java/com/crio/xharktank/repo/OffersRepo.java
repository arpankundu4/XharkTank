package com.crio.xharktank.repo;

import com.crio.xharktank.model.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;

// offers repo interface
// makes available all MongoRepository methods
public interface OffersRepo extends MongoRepository<Offer, String> {
}
