package com.crio.xharktank.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

// Model class for offers data

@Data
@Document(collection = "offers")
public class Offer {

    @Id
    // auto generated id
    private String id;

    // pitch id corresponding to this offer
    private String pitchId;

    @NotEmpty
    // name of the investor making a counter offer
    private String investor;

    @NotNull @Positive @Max(100)
    // ask Percentage of Equity for a company
    // should be > 0 and <= 100
    private float equity;

    @NotEmpty
    // comments by the investor
    private String comment;

    @NotNull @Positive
    // amount ready to invest in the idea
    private float amount;

}
