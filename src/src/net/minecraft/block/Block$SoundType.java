/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NQa
 */
package net.minecraft.block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Block$SoundType {
    public final String soundName;
    public final float volume;
    public final float frequency;

    public String l() {
        Block$SoundType a2;
        return new StringBuilder().insert(5 >> 3, IPa.j).append(a2.soundName).toString();
    }

    public String f() {
        Block$SoundType a2;
        return a2.l();
    }

    public float f() {
        Block$SoundType a2;
        return a2.volume;
    }

    /*
     * WARNING - void declaration
     */
    public Block$SoundType(String string, float f2, float f3) {
        void b2;
        void c2;
        Block$SoundType a2;
        float d2 = f3;
        Block$SoundType block$SoundType = a2 = this;
        a2.soundName = c2;
        block$SoundType.volume = b2;
        block$SoundType.frequency = d2;
    }

    public String J() {
        Block$SoundType a2;
        return new StringBuilder().insert(3 & 4, NQa.b).append(a2.soundName).toString();
    }

    public float J() {
        Block$SoundType a2;
        return a2.frequency;
    }
}

