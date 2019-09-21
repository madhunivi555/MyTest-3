package madhu.webapp.props;


import org.eurekaclinical.standardapis.props.CasEurekaClinicalProperties;

/**
 * Created by akalsan on 9/15/16.
 */
public class WebappProperties extends CasEurekaClinicalProperties {

    public String getServiceUrl() {
        return getValue("8.service.url");
    }

    public String getUrl() {
        return getValue("8.webapp.url");
    }

    public WebappProperties() {
        super("/etc/3");
    }

    @Override
    public String getProxyCallbackServer() {
        return getValue("8.webapp.callbackserver");
    }
}
