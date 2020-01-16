package org.gaborbalazs.tatarify;

import org.gaborbalazs.kipchakify.KipchakifyProvider;
import org.gaborbalazs.kipchakify.KipchakifyServiceFactory;

public class TatarifyProvider implements KipchakifyProvider {

    @Override
    public KipchakifyServiceFactory createKipchakifyServiceFactory() {
        return new TatarifyServiceFactory();
    }
}
