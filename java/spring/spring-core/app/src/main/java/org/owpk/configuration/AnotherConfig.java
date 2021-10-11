package org.owpk;

import org.owpk.profile.mock.ConfigA;
import org.owpk.profile.mock.ConfigB;
import org.owpk.profile.Development;
import org.owpk.profile.Production;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnotherConfig {

    @Bean("cfg1")
    @Development
    public ConfigB createAnotherConfig1() {
        return new ConfigB(new ConfigA("development"));
    }

    @Bean("cfg2")
    @Production
    public ConfigB createAnotherConfig2() {
        return new ConfigB(new ConfigA("production"));
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ConfigA createConfig() {
        return new ConfigA();
    }
}
