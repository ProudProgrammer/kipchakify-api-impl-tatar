package org.gaborbalazs.tatarify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.gaborbalazs.kipchakify.KipchakifyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TatarifyServiceTest {

    private TatarifyService underTest;

    @BeforeEach
    void setUp() {
        underTest = new TatarifyService();
    }

    @Test
    void testKipchakify() {
        // GIVEN
        String textToKipchakify = "Nem azért dolgozott-e az elmúlt nyolc évben a társadalom, hogy soha többé ne legyen olyan kormányfője Magyarországnak, aki nyugodtan kijelentheti: rajta kívül nincs más alternatíva. Aki ezt állítja, az nem kormányozni, hanem uralkodni akar.";
        String expected = "Nüm üzürt dülgüzütt-ü üz ülmült nyülc üvbün ü türsüdülüm, hügy sühü tübbü nü lügyün ülyün kürmünyfüjü Mügyürürszügnük, ükü nyügüdtün küjülünthütü: rüjtü küvül nüncs müs ültürnütüvü. Ükü üzt üllütjü, üz nüm kürmünyüznü, hünüm ürülküdnü ükür.";

        // WHEN
        String actual = underTest.kipchakify(textToKipchakify);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void testKipchakifyWhenInputIsNull() {
        // GIVEN
        String textToKipchakify = null;
        Class expectedException = KipchakifyException.class;

        // WHEN

        // THEN
        assertThrows(expectedException, () -> underTest.kipchakify(textToKipchakify));
    }

    @Test
    void testKipchakifyWhenInputLengthIsLessThanOne() {
        // GIVEN
        String textToKipchakify = "";
        Class expectedException = KipchakifyException.class;

        // WHEN

        // THEN
        assertThrows(expectedException, () -> underTest.kipchakify(textToKipchakify));
    }
}
