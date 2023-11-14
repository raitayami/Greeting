package com.sparta.tr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {

    @ParameterizedTest
    @ValueSource(ints = {2,7,11})
    @DisplayName("Check that returns U and PG are available ")
    public void checkForU_PG(int ageOfViewer){
        Assertions.assertEquals("U & PG films are available.",
                FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13,14})
    @DisplayName("Check that returns U and PG and 12 are available")
    public void checkForU_PG_12(int ageOfViewer){
        Assertions.assertEquals("U, PG, & 12 films are available.",
                FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Check that returns U and PG and 12 and 15 are available")
    public void checkForU_PG_12_15(int ageOfViewer){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",
                FilmClassifications.availableClassifications(ageOfViewer));
    }

    @Test
    @DisplayName("All films are available.")
    public void checkForAll(){
        Assertions.assertEquals("All films are available.",
                FilmClassifications.availableClassifications(200));
    }

}
