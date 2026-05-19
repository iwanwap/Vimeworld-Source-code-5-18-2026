/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 */
package ru.vimeworld.configuration;

import ru.obfuscator.KeepClassName;

public class ConfigurationContainer<T>
implements D,
KeepClassName {
    public final String content;
    public T config;

    public String J() {
        ConfigurationContainer a2;
        return a2.content;
    }

    public ConfigurationContainer(String string) {
        String b2 = string;
        ConfigurationContainer a2 = this;
        a2.content = b2;
    }

    public T J() {
        ConfigurationContainer a2;
        return a2.config;
    }
}

