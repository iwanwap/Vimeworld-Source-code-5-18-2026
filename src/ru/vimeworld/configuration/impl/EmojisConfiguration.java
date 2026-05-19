/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  rE
 */
package ru.vimeworld.configuration.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.obfuscator.KeepClassName;
import ru.vimeworld.minidot.atlas.emoji.Emoji;

public final class EmojisConfiguration
implements D,
KeepClassName {
    private final transient Map<Character, Emoji> byChar;
    private final List<String> atlases = Collections.singletonList(Mqa.y);
    private final transient Map<String, List<Emoji>> byCategory;
    private final transient Map<Integer, Emoji> byId;
    private final List<Emoji> emojis;

    public List<Emoji> f(String string) {
        String b2 = string;
        EmojisConfiguration a2 = this;
        return a2.byCategory.get(b2);
    }

    public Emoji J(char c2) {
        char b2 = c2;
        EmojisConfiguration a2 = this;
        return a2.byChar.get(Character.valueOf(b2));
    }

    public static /* synthetic */ List J(String a2) {
        return new ArrayList();
    }

    public void J() {
        Iterator<Emoji> iterator;
        EmojisConfiguration emojisConfiguration;
        EmojisConfiguration emojisConfiguration2 = emojisConfiguration = this;
        emojisConfiguration2.byCategory.clear();
        emojisConfiguration2.byId.clear();
        Iterator<Emoji> iterator2 = iterator = emojisConfiguration2.emojis.iterator();
        while (iterator2.hasNext()) {
            D a2 = iterator.next();
            EmojisConfiguration emojisConfiguration3 = emojisConfiguration;
            emojisConfiguration.byId.put(a2.J(), (Emoji)a2);
            emojisConfiguration3.byChar.put(Character.valueOf(a2.J()), (Emoji)a2);
            String string = a2.J();
            emojisConfiguration3.byCategory.computeIfAbsent(string, rE.J()).add((Emoji)a2);
            iterator2 = iterator;
        }
    }

    public Map<String, List<Emoji>> J() {
        EmojisConfiguration a2;
        return a2.byCategory;
    }

    public List<Emoji> f() {
        EmojisConfiguration a2;
        return a2.emojis;
    }

    public Emoji J(int n2) {
        int b2 = n2;
        EmojisConfiguration a2 = this;
        return a2.byId.get(b2);
    }

    public EmojisConfiguration() {
        EmojisConfiguration a2;
        EmojisConfiguration emojisConfiguration = a2;
        emojisConfiguration.emojis = new ArrayList<Emoji>();
        a2.byCategory = new HashMap<String, List<Emoji>>();
        a2.byId = new HashMap<Integer, Emoji>();
        a2.byChar = new HashMap<Character, Emoji>();
    }

    public List<String> J() {
        EmojisConfiguration a2;
        return a2.atlases;
    }
}

