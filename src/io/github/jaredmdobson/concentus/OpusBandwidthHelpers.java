/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.OpusBandwidth;

class OpusBandwidthHelpers {
    OpusBandwidthHelpers() {
    }

    static int GetOrdinal(OpusBandwidth bw2) {
        switch (bw2) {
            case OPUS_BANDWIDTH_NARROWBAND: {
                return 1;
            }
            case OPUS_BANDWIDTH_MEDIUMBAND: {
                return 2;
            }
            case OPUS_BANDWIDTH_WIDEBAND: {
                return 3;
            }
            case OPUS_BANDWIDTH_SUPERWIDEBAND: {
                return 4;
            }
            case OPUS_BANDWIDTH_FULLBAND: {
                return 5;
            }
        }
        return -1;
    }

    static OpusBandwidth GetBandwidth(int ordinal) {
        switch (ordinal) {
            case 1: {
                return OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
            }
            case 2: {
                return OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND;
            }
            case 3: {
                return OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND;
            }
            case 4: {
                return OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND;
            }
            case 5: {
                return OpusBandwidth.OPUS_BANDWIDTH_FULLBAND;
            }
        }
        return OpusBandwidth.OPUS_BANDWIDTH_AUTO;
    }

    static OpusBandwidth MIN(OpusBandwidth a2, OpusBandwidth b2) {
        if (OpusBandwidthHelpers.GetOrdinal(a2) < OpusBandwidthHelpers.GetOrdinal(b2)) {
            return a2;
        }
        return b2;
    }

    static OpusBandwidth MAX(OpusBandwidth a2, OpusBandwidth b2) {
        if (OpusBandwidthHelpers.GetOrdinal(a2) > OpusBandwidthHelpers.GetOrdinal(b2)) {
            return a2;
        }
        return b2;
    }

    static OpusBandwidth SUBTRACT(OpusBandwidth a2, int b2) {
        return OpusBandwidthHelpers.GetBandwidth(OpusBandwidthHelpers.GetOrdinal(a2) - b2);
    }
}

