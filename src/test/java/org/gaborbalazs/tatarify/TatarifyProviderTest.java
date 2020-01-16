package org.gaborbalazs.tatarify;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gaborbalazs.kipchakify.KipchakifyServiceFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TatarifyProviderTest {

    private TatarifyProvider underTest;

    @BeforeEach
    void setUp() {
        underTest = new TatarifyProvider();
    }

    @Test
    void createKipchakifyServiceFactory() {
        // GIVEN

        // WHEN
        KipchakifyServiceFactory kipchakifyServiceFactory = underTest.createKipchakifyServiceFactory();

        // THEN
        assertTrue(kipchakifyServiceFactory instanceof TatarifyServiceFactory);
    }
}
