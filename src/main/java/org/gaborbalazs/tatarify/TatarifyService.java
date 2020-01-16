package org.gaborbalazs.tatarify;

import org.gaborbalazs.kipchakify.KipchakifyException;
import org.gaborbalazs.kipchakify.KipchakifyService;

public class TatarifyService implements KipchakifyService {

    @Override
    public String kipchakify(String s) throws KipchakifyException {
        if (s == null || s.length() < 1) {
            throw new KipchakifyException("Cün nüt küpchüküfy!");
        }
        return s.replaceAll("[aáeéiíoóöőuúű]", "ü").replaceAll("[AÁEÉIÍOÓÖŐUÚŰ]", "Ü");
    }
}
