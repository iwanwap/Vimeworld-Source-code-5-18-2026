/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.ChannelLayout;

class OpusMultistream {
    OpusMultistream() {
    }

    static int validate_layout(ChannelLayout layout) {
        int max_channel = layout.nb_streams + layout.nb_coupled_streams;
        if (max_channel > 255) {
            return 0;
        }
        for (int i2 = 0; i2 < layout.nb_channels; ++i2) {
            if (layout.mapping[i2] < max_channel || layout.mapping[i2] == 255) continue;
            return 0;
        }
        return 1;
    }

    static int get_left_channel(ChannelLayout layout, int stream_id, int prev) {
        int i2;
        int n2 = i2 = prev < 0 ? 0 : prev + 1;
        while (i2 < layout.nb_channels) {
            if (layout.mapping[i2] == stream_id * 2) {
                return i2;
            }
            ++i2;
        }
        return -1;
    }

    static int get_right_channel(ChannelLayout layout, int stream_id, int prev) {
        int i2;
        int n2 = i2 = prev < 0 ? 0 : prev + 1;
        while (i2 < layout.nb_channels) {
            if (layout.mapping[i2] == stream_id * 2 + 1) {
                return i2;
            }
            ++i2;
        }
        return -1;
    }

    static int get_mono_channel(ChannelLayout layout, int stream_id, int prev) {
        int i2;
        int n2 = i2 = prev < 0 ? 0 : prev + 1;
        while (i2 < layout.nb_channels) {
            if (layout.mapping[i2] == stream_id + layout.nb_coupled_streams) {
                return i2;
            }
            ++i2;
        }
        return -1;
    }
}

