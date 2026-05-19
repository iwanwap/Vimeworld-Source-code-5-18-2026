/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  JPa
 *  kF
 *  pqa
 *  vRa
 *  wD
 */
package ru.vimeworld.configuration.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import ru.obfuscator.KeepClassName;
import ru.vimeworld.configuration.ConfigurationService;

public final class VoiceChatConfiguration
implements D,
KeepClassName {
    public float voiceChatVolume;
    public byte[] selectedMicrophone;
    public int voiceChatKeyBind;
    public boolean voiceChatKeyBindToggle;
    private boolean soundAndMicroDisabled;
    public boolean enableNoiseSupression;
    public boolean microEnabled;
    public Map<String, wD> playerSettingsMap;
    public boolean soundEnabled;
    public boolean hidePartyMenu;
    public float micVoiceChatVolume;

    public void f() {
        Object a2;
        VoiceChatConfiguration voiceChatConfiguration = this;
        voiceChatConfiguration.voiceChatVolume = Math.max(JPa.N, Math.min(voiceChatConfiguration.voiceChatVolume, Ira.d));
        VoiceChatConfiguration voiceChatConfiguration2 = voiceChatConfiguration;
        voiceChatConfiguration.micVoiceChatVolume = Math.max(JPa.N, Math.min(voiceChatConfiguration2.micVoiceChatVolume, Ira.d));
        if (voiceChatConfiguration2.playerSettingsMap == null) {
            VoiceChatConfiguration voiceChatConfiguration3 = voiceChatConfiguration;
            voiceChatConfiguration3.playerSettingsMap = new HashMap<String, wD>();
        }
        Object object = a2 = voiceChatConfiguration.playerSettingsMap.values().iterator();
        while (object.hasNext()) {
            wD wD2 = (wD)a2.next();
            object = a2;
            wD2.I = Math.max(JPa.N, Math.min(wD2.I, Ira.d));
        }
    }

    public VoiceChatConfiguration() {
        VoiceChatConfiguration a2;
        VoiceChatConfiguration voiceChatConfiguration = a2;
        a2.soundAndMicroDisabled = uSa.E;
        a2.soundEnabled = vRa.d;
        a2.voiceChatVolume = pqa.r;
        a2.micVoiceChatVolume = pqa.r;
        a2.microEnabled = vRa.d;
        a2.voiceChatKeyBindToggle = uSa.E;
        voiceChatConfiguration.hidePartyMenu = uSa.E;
        voiceChatConfiguration.voiceChatKeyBind = Fsa.d;
        voiceChatConfiguration.selectedMicrophone = null;
        voiceChatConfiguration.enableNoiseSupression = vRa.d;
        VoiceChatConfiguration voiceChatConfiguration2 = a2;
        voiceChatConfiguration2.playerSettingsMap = new HashMap<String, wD>();
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        VoiceChatConfiguration a2 = this;
        a2.microEnabled = b2;
        if (a2.microEnabled && !a2.soundEnabled) {
            a2.soundAndMicroDisabled = uSa.E;
            a2.J(vRa.d != 0);
            return;
        }
        VoiceChatConfiguration.J();
    }

    public float J(String string) {
        Object b2 = string;
        VoiceChatConfiguration a2 = this;
        b2 = a2.playerSettingsMap.get(b2);
        float f2 = pqa.r;
        if (b2 != null) {
            f2 = ((wD)b2).I;
        }
        if (a2.soundEnabled) {
            return f2 * a2.voiceChatVolume;
        }
        return JPa.N;
    }

    public void f(float f2) {
        float b2 = f2;
        VoiceChatConfiguration a2 = this;
        a2.voiceChatVolume = b2;
        VoiceChatConfiguration.J();
        if (OT.i.l != null) {
            OT.i.l.f();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, float f2) {
        void a2;
        String c2 = string;
        VoiceChatConfiguration b2 = this;
        b2.playerSettingsMap.compute((String)c2, (BiFunction<String, wD, wD>)kF.J()).I = a2;
        VoiceChatConfiguration.J();
        if (OT.i.l != null) {
            String string2 = c2;
            OT.i.l.J(string2, b2.J(string2));
        }
    }

    public static void J() {
        ConfigurationService.J(VoiceChatConfiguration.class);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        VoiceChatConfiguration b2;
        void a2;
        VoiceChatConfiguration voiceChatConfiguration = this;
        voiceChatConfiguration.micVoiceChatVolume = a2;
        VoiceChatConfiguration.J();
        if (OT.i.l != null && (b2 = OT.i.l.J()) != null) {
            b2.J((float)a2);
        }
    }

    public static /* synthetic */ wD J(String string, wD wD2) {
        String b2 = wD2;
        String a2 = string;
        if (b2 != null) {
            return b2;
        }
        return new wD();
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        VoiceChatConfiguration a2 = this;
        a2.soundEnabled = b2;
        if (a2.soundEnabled) {
            if (a2.soundAndMicroDisabled) {
                VoiceChatConfiguration voiceChatConfiguration = a2;
                voiceChatConfiguration.soundAndMicroDisabled = uSa.E;
                voiceChatConfiguration.microEnabled = vRa.d;
            }
        } else if (a2.microEnabled) {
            VoiceChatConfiguration voiceChatConfiguration = a2;
            voiceChatConfiguration.microEnabled = uSa.E;
            voiceChatConfiguration.soundAndMicroDisabled = vRa.d;
        }
        VoiceChatConfiguration.J();
        if (OT.i.l != null) {
            OT.i.l.f();
        }
    }
}

