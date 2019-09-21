package madhu.webapp.config;

import com.google.inject.Provider;
import madhu.client.Client;

/**
 *
 * @author arpost
 */
public class ClientProvider implements Provider<Client> {
    
    private final String serviceUrl;

    public ClientProvider(String inServiceUrl) {
        this.serviceUrl = inServiceUrl;
    }

    @Override
    public Client get() {
        return new Client(this.serviceUrl);
    }
}
