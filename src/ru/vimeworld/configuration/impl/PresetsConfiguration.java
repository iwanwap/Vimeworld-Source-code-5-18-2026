/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  VT
 */
package ru.vimeworld.configuration.impl;

import java.util.HashMap;
import java.util.Map;
import ru.obfuscator.KeepClassName;

public final class PresetsConfiguration
implements D,
KeepClassName {
    private final Map<String, VT> presets;

    public Map<String, VT> J() {
        PresetsConfiguration a2;
        return a2.presets;
    }

    public VT J(String string) {
        String b2 = string;
        PresetsConfiguration a2 = this;
        return a2.presets.get(b2);
    }

    public PresetsConfiguration() {
        PresetsConfiguration a2;
        PresetsConfiguration presetsConfiguration = a2;
        presetsConfiguration.presets = new HashMap<String, VT>();
    }
}

