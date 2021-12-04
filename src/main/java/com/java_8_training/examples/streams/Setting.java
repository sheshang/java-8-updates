package com.java_8_training.examples.streams;

import java.util.Optional;

public class Setting
{
    static Optional<Setting> lookupSettingByName(final String name)
    {
        return Optional.ofNullable(System.getProperty(name))
            .map(Setting::new);
    }

    private final String value;

    Setting(final String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public String toString()
    {
        return "[value="+value+"]";
    }
}

