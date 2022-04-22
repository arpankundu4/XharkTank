package com.crio.xharktank.model;

import lombok.AllArgsConstructor;
import lombok.Data;

// Model class for response containing created id
// on successful post request
@Data
@AllArgsConstructor
public class PostResponse {
    // id of created pitch or offer
    // depending on the usage
    private String id;
}
