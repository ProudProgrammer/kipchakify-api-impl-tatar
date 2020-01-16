package org.gaborbalazs.tatarify;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gaborbalazs.kipchakify.KipchakifyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TatarifyServiceFactoryTest {

    private TatarifyServiceFactory underTest;

    @BeforeEach
    void setUp() {
        underTest = new TatarifyServiceFactory();
    }

    @Test
    void createKipchakifyService() {
        // GIVEN

        // WHEN
        KipchakifyService kipchakifyService = underTest.createKipchakifyService();

        // THEN
        assertTrue(kipchakifyService instanceof TatarifyService);
    }
}
