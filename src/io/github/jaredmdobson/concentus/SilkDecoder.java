/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.SilkChannelDecoder;
import io.github.jaredmdobson.concentus.StereoDecodeState;

class SilkDecoder {
    final SilkChannelDecoder[] channel_state = new SilkChannelDecoder[2];
    final StereoDecodeState sStereo = new StereoDecodeState();
    int nChannelsAPI = 0;
    int nChannelsInternal = 0;
    int prev_decode_only_middle = 0;

    SilkDecoder() {
        for (int c2 = 0; c2 < 2; ++c2) {
            this.channel_state[c2] = new SilkChannelDecoder();
        }
    }

    void Reset() {
        for (int c2 = 0; c2 < 2; ++c2) {
            this.channel_state[c2].Reset();
        }
        this.sStereo.Reset();
        this.nChannelsAPI = 0;
        this.nChannelsInternal = 0;
        this.prev_decode_only_middle = 0;
    }
}

