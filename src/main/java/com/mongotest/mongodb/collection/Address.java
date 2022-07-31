package com.mongotest.mongodb.collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    String address1;
    String address2;
    String city;
}
