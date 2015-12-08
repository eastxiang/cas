package org.jasig.cas.services.web.factory;

import org.jasig.cas.services.RegisteredService;
import org.jasig.cas.services.web.beans.RegisteredServiceEditBean.ServiceData;

/**
 * Factory used to convert {@link RegisteredService} from/to {@link ServiceData}.
 *
 * @author Daniel Frett
 * @since 4.2
 */
public interface RegisteredServiceFactory {
    /**
     * Create a {@link ServiceData} bean from the provided {@link RegisteredService}.
     *
     * @param svc service being converted
     * @return the data bean representing the provided service
     */
    ServiceData createServiceData(RegisteredService svc);

    /**
     * Create a {@link RegisteredService} object from the provided {@link ServiceData} data bean.
     *
     * @param data the data bean being converted
     * @return the registered service created from the provided data bean
     */
    RegisteredService createRegisteredService(ServiceData data);
}
