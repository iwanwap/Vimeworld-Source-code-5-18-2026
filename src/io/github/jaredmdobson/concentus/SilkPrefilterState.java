/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;

class SilkPrefilterState {
    final short[] sLTP_shp = new short[512];
    final int[] sAR_shp = new int[17];
    int sLTP_shp_buf_idx = 0;
    int sLF_AR_shp_Q12 = 0;
    int sLF_MA_shp_Q12 = 0;
    int sHarmHP_Q2 = 0;
    int rand_seed = 0;
    int lagPrev = 0;

    SilkPrefilterState() {
    }

    void Reset() {
        Arrays.MemSet(this.sLTP_shp, (short)0, 512);
        Arrays.MemSet(this.sAR_shp, 0, 17);
        this.sLTP_shp_buf_idx = 0;
        this.sLF_AR_shp_Q12 = 0;
        this.sLF_MA_shp_Q12 = 0;
        this.sHarmHP_Q2 = 0;
        this.rand_seed = 0;
        this.lagPrev = 0;
    }
}

