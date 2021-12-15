package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.service.impl.SimpleCondimentsServiceImpl;

public class CondimentsServiceFactory {
    private static CondimentsService singleton;

    public static synchronized CondimentsService getInstance() {
        if (singleton == null) {
            singleton = new SimpleCondimentsServiceImpl();
        }
        return singleton;
    }
}
