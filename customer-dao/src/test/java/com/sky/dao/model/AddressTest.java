package com.sky.dao.model;

import org.hamcrest.core.Is;
import org.junit.Test;

import static com.sky.dao.model.AddressBuilder.anAddress;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;

public class AddressTest {

    @Test
    public void getPropertyId() {
        final String expectedPropertyId = "propertyId";
        Address address = anAddress().withPropertyId(expectedPropertyId).build();
        assertThat(expectedPropertyId, is(address.getPropertyId()));
    }
}