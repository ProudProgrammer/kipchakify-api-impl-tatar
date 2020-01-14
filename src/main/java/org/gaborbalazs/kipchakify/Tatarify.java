package org.gaborbalazs.kipchakify;

public class Tatarify implements Kipchakify {

    @Override
    public String kipchakify(String s) throws KipchakifyException {
        if (s == null || s.length() < 1) {
            throw new KipchakifyException("Cün nüt küpchüküfy!");
        }
        return s.replaceAll("a|e|i|o|u", "ü");
    }
}
