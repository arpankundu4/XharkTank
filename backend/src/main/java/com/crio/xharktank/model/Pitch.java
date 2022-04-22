package com.crio.xharktank.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

// Model class for pitches data

@Data
@Document(collection = "pitches")
public class Pitch {

    @Id
    // auto generated id
    private String id;

    @NotEmpty
    // name of the entrepreneur posting the pitch
    private String entrepreneur;

    @NotEmpty
    // title of the pitch
    private String pitchTitle;

    @NotEmpty
    // business Idea for the Product they wish to develop
    private String pitchIdea;

    @NotNull @Positive
    // ask Expected Amount for investment
    // should be > 0
    private float askAmount;

    @NotNull @Positive @Max(100)
    // percentage of Equity to be diluted
    // should be > 0 and <= 100
    private float equity;

    // list of investor offers associated with the pitch
    // initially an empty list
    private List<Offer> offers = new ArrayList<>();

    // method for adding offer to offers list
    public void addToOffersList(Offer offer) {
        this.offers.add(offer);
    }

}
