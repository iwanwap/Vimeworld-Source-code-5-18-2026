/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.SilkChannelEncoder;
import io.github.jaredmdobson.concentus.SilkEncoderControl;
import io.github.jaredmdobson.concentus.SilkTables;

class LTPScaleControl {
    LTPScaleControl() {
    }

    static void silk_LTP_scale_ctrl(SilkChannelEncoder psEnc, SilkEncoderControl psEncCtrl, int condCoding) {
        if (condCoding == 0) {
            int round_loss = psEnc.PacketLoss_perc + psEnc.nFramesPerPacket;
            psEnc.indices.LTP_scaleIndex = (byte)Inlines.silk_LIMIT(Inlines.silk_SMULWB(Inlines.silk_SMULBB(round_loss, psEncCtrl.LTPredCodGain_Q7), 51), 0, 2);
        } else {
            psEnc.indices.LTP_scaleIndex = 0;
        }
        psEncCtrl.LTP_scale_Q14 = SilkTables.silk_LTPScales_table_Q14[psEnc.indices.LTP_scaleIndex];
    }
}

