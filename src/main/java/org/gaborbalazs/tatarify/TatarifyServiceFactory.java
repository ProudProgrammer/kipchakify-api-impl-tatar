package org.gaborbalazs.tatarify;

import org.gaborbalazs.kipchakify.KipchakifyService;
import org.gaborbalazs.kipchakify.KipchakifyServiceFactory;

public class TatarifyServiceFactory implements KipchakifyServiceFactory {

    @Override
    public KipchakifyService createKipchakifyService() {
        return new TatarifyService();
    }
}
