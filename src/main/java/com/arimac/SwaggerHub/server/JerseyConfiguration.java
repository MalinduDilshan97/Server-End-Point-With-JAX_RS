package com.arimac.SwaggerHub.server;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        packages("com.arimac.SwaggerHub");
    }

}
