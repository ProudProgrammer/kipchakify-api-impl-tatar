package org.gaborbalazs.kipchakify;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TatarManager implements KipchakManager {

    private static final Set<Kipchak> KIPCHAKS = new HashSet<>();

    @Override
    public void add(Kipchak kipchak) {
        KIPCHAKS.add(kipchak);
    }

    @Override
    public boolean contains(Kipchak kipchak) {
        return KIPCHAKS.contains(kipchak);
    }

    @Override
    public boolean remove(Kipchak kipchak) {
        return KIPCHAKS.remove(kipchak);
    }

    @Override
    public Set<Kipchak> retrieveAll() {
        return Collections.unmodifiableSet(KIPCHAKS);
    }
}
