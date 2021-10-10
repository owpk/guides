package org.owpk.profile.mock;

public class ConfigB implements Config {
    private ConfigA configA;

    public ConfigB(ConfigA configA) {
        this.configA = configA;
    }

    @Override
    public String configure() {
        return "Configuring with profile: " + configA.getName();
    }
}