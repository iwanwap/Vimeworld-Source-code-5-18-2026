/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  ERa
 *  JPa
 *  NTa
 *  RQa
 *  Sk
 *  Spa
 *  Ssa
 *  XTa
 *  Ypa
 *  hra
 *  lqa
 *  pPa
 *  vRa
 *  wI
 *  wOa
 *  ysa
 */
import io.netty.buffer.Unpooled;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public final class wI_1
extends HashMap<String, Object> {
    private static final byte TYPE_VARINT = 13;
    private static final byte TYPE_UUID = 15;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_STRING_ARRAY = 11;
    private static final byte TYPE_BOOLEAN = 8;
    private static final byte TYPE_LONG_VARINT = 14;
    private static final byte TYPE_LONG_ARRAY = 21;
    private static final byte TYPE_MAP_ARRAY = 12;
    private static final byte TYPE_MAP = 9;
    private static final byte TYPE_FLOAT = 6;
    private static final byte TYPE_VARINT_ARRAY = 16;
    private static final byte TYPE_SIGNED_VARINT_ARRAY = 18;
    private static final byte TYPE_INT_ARRAY = 19;
    private static final byte TYPE_LONG = 3;
    private static final byte TYPE_INT = 1;
    private static final byte TYPE_DOUBLE = 7;
    private static final byte TYPE_SIGNED_VARINT = 17;
    private static final byte TYPE_SHORT = 5;
    private static final byte TYPE_BYTE_ARRAY = 10;
    private static final byte TYPE_STRING = 4;
    private static final byte TYPE_STRING_ARRAY_2D = 20;

    /*
     * WARNING - void declaration
     */
    public int getInt(String string, int n2) {
        Object b2 = this;
        String c2 = string;
        if (((HashMap)b2).get(c2) == null) {
            void a2;
            return (int)a2;
        }
        return ((Number)((HashMap)b2).get(c2)).intValue();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String toString() {
        var3_1 = this;
        if (var3_1.isEmpty()) {
            return Spa.T;
        }
        var4_2 = var3_1.keySet().stream().sorted().collect(Collectors.toList()).iterator();
        var2_3 = new StringBuilder();
        v0 = var4_2;
        var2_3.append((char)JPa.ga);
        while (true) {
            block9: {
                block10: {
                    block8: {
                        a = (String)v0.next();
                        var1_4 = var3_1.get(a);
                        var2_3.append((String)a);
                        var2_3.append((char)tua.w);
                        if (var1_4 != var3_1) break block8;
                        a = wta.k;
                        v1 = var2_3;
                        break block9;
                    }
                    if (!(var1_4 instanceof byte[])) break block10;
                    var5_5 = (byte[])var1_4;
                    a = Sk.J((byte[])var5_5, (int)uSa.E, (int)Math.min(ysa.s, var5_5.length));
                    if (var5_5.length > ysa.s) {
                        a = new StringBuilder().insert(3 >> 2, (String)a).append(oQa.J).append(var5_5.length).append(hpa.b).toString();
                    }
                    ** GOTO lbl39
                }
                v2 = var1_4;
                if (var1_4 instanceof int[]) {
                    a = Arrays.toString((int[])v2);
                    v1 = var2_3;
                } else {
                    v3 = var1_4;
                    if (v2 instanceof Object[]) {
                        a = Arrays.deepToString((Object[])v3);
                        v1 = var2_3;
                    } else {
                        a = String.valueOf(v3);
lbl39:
                        // 2 sources

                        v1 = var2_3;
                    }
                }
            }
            v1.append((String)a);
            if (!var4_2.hasNext()) {
                return var2_3.append((char)ySa.Z).toString();
            }
            var2_3.append((char)Yqa.D).append((char)fPa.i);
            v0 = var4_2;
        }
    }

    public <T extends Enum<T>> T getStringEnum(String string, T t2) {
        String b2;
        wI_1 c2 = t2;
        wI_1 a2 = this;
        if ((b2 = a2.getString(b2)) == null) {
            return (T)c2;
        }
        try {
            return (T)Enum.valueOf(((Enum)((Object)c2)).getDeclaringClass(), b2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return (T)c2;
        }
    }

    private static int readSignedVarInt(Lca lca) {
        Lca lca2 = lca;
        int a2 = lca2.readVarIntFromBuffer();
        return (a2 << tua.U >> tua.U ^ a2) >> vRa.d ^ a2 & ypa.L;
    }

    /*
     * WARNING - void declaration
     */
    public wI getMap(String string, wI wI2) {
        Object c2 = string;
        Object b2 = this;
        if ((c2 = ((HashMap)b2).get(c2)) == null) {
            void a2;
            return a2;
        }
        return (wI_1)c2;
    }

    public UUID getUUID(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (UUID)a2.get(b2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public wI_1(Lca lca) {
        wI_1 wI_12 = this;
        try {
            void a2;
            block27: while (a2.readerIndex() < a2.capacity()) {
                void v0 = a2;
                String string = v0.readStringFromBuffer(hra.Ja);
                switch (v0.readByte()) {
                    case 1: {
                        wI_12.put(string, a2.readInt());
                        continue block27;
                    }
                    case 13: {
                        wI_12.put(string, a2.readVarIntFromBuffer());
                        continue block27;
                    }
                    case 17: {
                        wI_12.put(string, wI_1.readSignedVarInt((Lca)a2));
                        continue block27;
                    }
                    case 2: {
                        wI_12.put(string, a2.readByte());
                        continue block27;
                    }
                    case 3: {
                        wI_12.put(string, a2.readLong());
                        continue block27;
                    }
                    case 14: {
                        wI_12.put(string, Long.valueOf(a2.readVarIntFromBuffer()));
                        continue block27;
                    }
                    case 4: {
                        wI_12.put(string, a2.readStringFromBuffer(BQa.h));
                        continue block27;
                    }
                    case 5: {
                        wI_12.put(string, a2.readShort());
                        continue block27;
                    }
                    case 6: {
                        wI_12.put(string, Float.valueOf(a2.readFloat()));
                        continue block27;
                    }
                    case 7: {
                        wI_12.put(string, a2.readDouble());
                        continue block27;
                    }
                    case 8: {
                        wI_12.put(string, a2.readBoolean());
                        continue block27;
                    }
                    case 15: {
                        wI_12.put(string, new UUID(a2.readLong(), a2.readLong()));
                        continue block27;
                    }
                    case 9: {
                        void v1 = a2;
                        Object[] b2 = new byte[v1.readVarIntFromBuffer()];
                        v1.readBytes((byte[])b2, uSa.E, b2.length);
                        wI_12.put(string, new wI_1((byte[])b2));
                        continue block27;
                    }
                    case 10: {
                        void v2 = a2;
                        Object[] b2 = new byte[v2.readVarIntFromBuffer()];
                        v2.readBytes((byte[])b2, uSa.E, b2.length);
                        wI_12.put(string, b2);
                        continue block27;
                    }
                    case 19: {
                        int n2;
                        Object[] b2 = new int[a2.readVarIntFromBuffer()];
                        int n3 = uSa.E;
                        while (n3 < b2.length) {
                            b2[n2++] = a2.readInt();
                            n3 = n2;
                        }
                        wI_12.put(string, b2);
                        continue block27;
                    }
                    case 16: {
                        int n2;
                        Object[] b2 = new int[a2.readVarIntFromBuffer()];
                        int n4 = uSa.E;
                        while (n4 < b2.length) {
                            b2[n2++] = a2.readVarIntFromBuffer();
                            n4 = n2;
                        }
                        wI_12.put(string, b2);
                        continue block27;
                    }
                    case 18: {
                        int n2;
                        Object[] b2 = new int[a2.readVarIntFromBuffer()];
                        int n5 = uSa.E;
                        while (n5 < b2.length) {
                            b2[n2++] = wI_1.readSignedVarInt((Lca)a2);
                            n5 = n2;
                        }
                        wI_12.put(string, b2);
                        continue block27;
                    }
                    case 11: {
                        int n2;
                        Object[] b2 = new String[a2.readVarIntFromBuffer()];
                        int n6 = uSa.E;
                        while (n6 < b2.length) {
                            b2[n2++] = a2.readStringFromBuffer(BQa.h);
                            n6 = n2;
                        }
                        wI_12.put(string, b2);
                        continue block27;
                    }
                    case 12: {
                        Object[] objectArray;
                        int n2;
                        Object[] b2 = new wI_1[a2.readVarIntFromBuffer()];
                        int n7 = uSa.E;
                        while (n7 < b2.length) {
                            void v8 = a2;
                            objectArray = new byte[v8.readVarIntFromBuffer()];
                            v8.readBytes((byte[])objectArray, uSa.E, objectArray.length);
                            b2[n2++] = new wI_1((byte[])objectArray);
                            n7 = n2;
                        }
                        wI_12.put(string, b2);
                        continue block27;
                    }
                    case 20: {
                        Object[] objectArray;
                        int n2;
                        Object[] b2 = new String[a2.readVarIntFromBuffer()][];
                        int n8 = uSa.E;
                        while (n8 < b2.length) {
                            b2[n2] = new String[a2.readVarIntFromBuffer()];
                            objectArray = b2[n2];
                            int n9 = uSa.E;
                            while (n9 < objectArray.length) {
                                int n10;
                                objectArray[n10++] = (byte)a2.readStringFromBuffer(BQa.h);
                                n9 = n10;
                            }
                            n8 = ++n2;
                        }
                        wI_12.put(string, b2);
                        continue block27;
                    }
                    case 21: {
                        int n2;
                        Object[] b2 = new long[a2.readVarIntFromBuffer()];
                        int n11 = uSa.E;
                        while (n11 < b2.length) {
                            b2[n2++] = a2.readLong();
                            n11 = n2;
                        }
                        wI_12.put(string, b2);
                        continue block27;
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String[] getStringArray(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (String[])a2.get(b2);
    }

    public long getLong(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return ((Number)a2.get(b2)).longValue();
    }

    public int[] getIntArray(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (int[])a2.get(b2);
    }

    public int getInt(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return ((Number)a2.get(b2)).intValue();
    }

    public wI_1(byte[] byArray) {
        Object b2 = byArray;
        Object a2 = this;
        ((wI_1)a2)(new Lca(Unpooled.wrappedBuffer((byte[])b2)));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] toByteArray() {
        var2_2 = this;
        var10_3 = Unpooled.buffer();
        try {
            a = new Lca(var10_3);
lbl5:
            // 23 sources

            for (Map.Entry<K, V> var4_14 : var2_2.entrySet()) {
                a.writeString((String)var4_14.getKey());
                var5_15 = var4_14.getValue();
                var3_13 = var5_15.getClass();
                if (var3_13 != Integer.class) ** GOTO lbl36
                var7_16 = (Integer)var5_15;
                if (var7_16 >= 0 && var7_16 < Bpa.M) {
                    a.writeByte(uua.s);
                    a.writeVarIntToBuffer(var7_16);
                    continue;
                }
                ** GOTO lbl-1000
            }
            ** GOTO lbl-1000
        }
        catch (Exception a) {
            var10_3.release();
            a.printStackTrace();
            return new byte[uSa.E];
        }
lbl-1000:
        // 1 sources

        {
            if (var7_16 >= 0 || var7_16 <= ROa.E) ** GOTO lbl-1000
            a.writeByte(yta.Ka);
            wI_1.writeSignedVarInt(a, var7_16);
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block32: {
                                block31: {
                                    block30: {
                                        block28: {
                                            block29: {
                                                block27: {
                                                    block26: {
                                                        block25: {
                                                            a.writeByte(vRa.d);
                                                            a.writeInt(var7_16);
                                                            ** GOTO lbl5
lbl36:
                                                            // 1 sources

                                                            if (var3_13 != Float.class) break block25;
                                                            v0 = a;
                                                            v0.writeByte(uua.p);
                                                            v0.writeFloat(((Float)var5_15).floatValue());
                                                            ** GOTO lbl5
                                                        }
                                                        if (var3_13 != Byte.class) break block26;
                                                        v1 = a;
                                                        v1.writeByte(uqa.g);
                                                        v1.writeByte(((Byte)var5_15).byteValue());
                                                        ** GOTO lbl5
                                                    }
                                                    if (var3_13 != Short.class) break block27;
                                                    v2 = a;
                                                    v2.writeByte(tTa.h);
                                                    v2.writeShort(((Short)var5_15).shortValue());
                                                    ** GOTO lbl5
                                                }
                                                if (var3_13 != Long.class) break block28;
                                                var7_17 = (Long)var5_15;
                                                if (var7_17 < nqa.i || var7_17 >= Ssa.Ia) break block29;
                                                a.writeByte(hpa.Z);
                                                a.writeVarIntToBuffer((int)var7_17);
                                                ** GOTO lbl5
                                            }
                                            a.writeByte(yRa.d);
                                            a.writeLong(var7_17);
                                            ** GOTO lbl5
                                        }
                                        if (var3_13 != String.class) break block30;
                                        v3 = a;
                                        v3.writeByte(AQa.P);
                                        v3.writeString((String)var5_15);
                                        ** GOTO lbl5
                                    }
                                    if (var3_13 != Double.class) break block31;
                                    v4 = a;
                                    v4.writeByte(XTa.W);
                                    v4.writeDouble((Double)var5_15);
                                    ** GOTO lbl5
                                }
                                if (var3_13 != Boolean.class) break block32;
                                v5 = a;
                                v5.writeByte(Yqa.i);
                                v5.writeBoolean((Boolean)var5_15);
                                ** GOTO lbl5
                            }
                            if (var3_13 != UUID.class) break block33;
                            a.writeByte(Ypa.A);
                            var7_18 = (UUID)var5_15;
                            a.writeLong(var7_18.getMostSignificantBits());
                            a.writeLong(var7_18.getLeastSignificantBits());
                            ** GOTO lbl5
                        }
                        if (var3_13 != wI_1.class) break block34;
                        a.writeByte(WOa.fa);
                        var7_19 = ((wI_1)var5_15).toByteArray();
                        a.writeVarIntToBuffer(var7_19.length);
                        a.writeBytes(var7_19);
                        ** GOTO lbl5
                    }
                    if (var3_13 != byte[].class) break block35;
                    a.writeByte(NTa.C);
                    var7_20 = (byte[])var5_15;
                    a.writeVarIntToBuffer(var7_20.length);
                    a.writeBytes(var7_20);
                    ** GOTO lbl5
                }
                if (var3_13 != int[].class) ** GOTO lbl-1000
                var7_21 = (int[])var5_15;
                if (var7_21.length != 0) break block36;
                a.writeByte(ERa.C);
                a.writeByte(uSa.E);
                ** GOTO lbl5
            }
            var8_26 = vRa.d;
            var9_31 = uSa.E;
            v6 = uSa.E;
            while (v6 < AQa.P && var1_5 < var7_21.length) {
                if (var7_21[var1_5] < 0 || var7_21[var1_5] > Bpa.M) {
                    var8_26 = uSa.E;
                }
                if (var7_21[var1_5] < 0 && var7_21[var1_5] > ROa.E) {
                    var9_31 = vRa.d;
                }
                v6 = ++var1_5;
            }
            if (var8_26 == 0) ** GOTO lbl-1000
            v7 = a;
            v7.writeByte(ERa.C);
            v7.writeVarIntToBuffer(var7_21.length);
            var1_6 = var7_21;
            var11_32 = var7_21.length;
            v8 = uSa.E;
            while (v8 < var11_32) {
                v9 = var1_6[var12_37];
                var13_40 = v9;
                a.writeVarIntToBuffer(v9);
                v8 = ++var12_37;
            }
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            if (var9_31 == 0) ** GOTO lbl-1000
            v10 = a;
            v10.writeByte(yOa.B);
            v10.writeVarIntToBuffer(var7_21.length);
            var1_7 = var7_21;
            var11_32 = var7_21.length;
            v11 = uSa.E;
            while (v11 < var11_32) {
                v12 = var1_7[var12_37];
                var13_40 = v12;
                wI_1.writeSignedVarInt(a, v12);
                v11 = ++var12_37;
            }
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            a.writeByte(wOa.t);
            a.writeVarIntToBuffer(var7_21.length);
            var1_8 = var7_21;
            var11_32 = var7_21.length;
            v13 = uSa.E;
            while (v13 < var11_32) {
                v14 = var1_8[var12_37];
                var13_40 = v14;
                a.writeInt(v14);
                v13 = ++var12_37;
            }
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            if (var3_13 != String[].class) ** GOTO lbl-1000
            a.writeByte(pPa.f);
            var7_22 = (String[])var5_15;
            a.writeVarIntToBuffer(var7_22.length);
            var8_27 = var7_22;
            var9_31 = var7_22.length;
            v15 = uSa.E;
            while (v15 < var9_31) {
                var11_33 = var8_27[var1_9];
                a.writeString(var11_33);
                v15 = ++var1_9;
            }
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            if (var3_13 != String[][].class) ** GOTO lbl-1000
            a.writeByte(kTa.j);
            var7_23 = (String[][])var5_15;
            a.writeVarIntToBuffer(var7_23.length);
            var8_28 = var7_23;
            var9_31 = var7_23.length;
            v16 = uSa.E;
            while (v16 < var9_31) {
                var11_34 = var8_28[var1_10];
                a.writeVarIntToBuffer(var11_34.length);
                var12_38 = var11_34;
                var13_40 = var11_34.length;
                v17 = uSa.E;
                while (v17 < var13_40) {
                    var15_42 = var12_38[var14_41];
                    a.writeString(var15_42);
                    v17 = ++var14_41;
                }
                v16 = ++var1_10;
            }
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            if (var3_13 != wI[].class) ** GOTO lbl-1000
            a.writeByte(lqa.s);
            var7_24 = (wI[])var5_15;
            a.writeVarIntToBuffer(var7_24.length);
            var8_29 = var7_24;
            var9_31 = var7_24.length;
            v18 = uSa.E;
            while (v18 < var9_31) {
                var11_35 = var8_29[var1_11];
                var12_39 = var11_35.toByteArray();
                a.writeVarIntToBuffer(var12_39.length);
                a.writeBytes(var12_39);
                v18 = ++var1_11;
            }
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            if (var3_13 != long[].class) ** GOTO lbl-1000
            var7_25 = (long[])var5_15;
            v19 = a;
            v19.writeByte(wOa.h);
            v19.writeVarIntToBuffer(var7_25.length);
            var8_30 = var7_25;
            var9_31 = var7_25.length;
            v20 = uSa.E;
            while (v20 < var9_31) {
                v21 = var8_30[var1_12];
                var11_36 = v21;
                a.writeLong(v21);
                v20 = ++var1_12;
            }
            ** GOTO lbl5
        }
lbl-1000:
        // 1 sources

        {
            throw new IllegalStateException(new StringBuilder().insert(3 >> 2, RQa.S).append(var3_13).append(dsa.t).append((String)var4_14.getKey()).append(XTa.Z).toString());
        }
lbl-1000:
        // 1 sources

        {
            v22 = var10_3;
            v23 = new byte[v22.writerIndex()];
            var6_4 = v23;
            v22.readBytes(v23);
            var10_3.release();
            return var6_4;
        }
    }

    public short getShort(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return ((Number)a2.get(b2)).shortValue();
    }

    public wI getMap(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (wI_1)a2.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public byte getByte(String string, byte by2) {
        Object b2 = this;
        String c2 = string;
        if (((HashMap)b2).get(c2) == null) {
            void a2;
            return (byte)a2;
        }
        return ((Number)((HashMap)b2).get(c2)).byteValue();
    }

    public wI_1(HashMap<String, Object> hashMap) {
        HashMap b2 = hashMap;
        wI_1 a2 = this;
        super(b2);
    }

    public float getFloat(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return ((Number)a2.get(b2)).floatValue();
    }

    public String getString(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (String)a2.get(b2);
    }

    private static void writeSignedVarInt(Lca lca, int n2) {
        int b2 = n2;
        Lca a2 = lca;
        a2.writeVarIntToBuffer(b2 << vRa.d ^ b2 >> tua.U);
    }

    public byte[] getByteArray(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (byte[])a2.get(b2);
    }

    public wI[] getMapArray(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (wI[])a2.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean getBoolean(String string, boolean bl) {
        Object c2 = string;
        Object b2 = this;
        if ((c2 = ((HashMap)b2).get(c2)) == null) {
            void a2;
            return (boolean)a2;
        }
        return (Boolean)c2;
    }

    /*
     * WARNING - void declaration
     */
    public String getString(String string, String string2) {
        Object c2 = string;
        Object b2 = this;
        if ((c2 = ((HashMap)b2).get(c2)) == null) {
            void a2;
            return a2;
        }
        return (String)c2;
    }

    public boolean getBoolean(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (Boolean)a2.get(b2);
    }

    public double getDouble(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return ((Number)a2.get(b2)).doubleValue();
    }

    /*
     * WARNING - void declaration
     */
    public double getDouble(String string, double d2) {
        Object b2 = this;
        String c2 = string;
        if (((HashMap)b2).get(c2) == null) {
            void a2;
            return (double)a2;
        }
        return ((Number)((HashMap)b2).get(c2)).doubleValue();
    }

    /*
     * WARNING - void declaration
     */
    public float getFloat(String string, float f2) {
        Object b2 = this;
        String c2 = string;
        if (((HashMap)b2).get(c2) == null) {
            void a2;
            return (float)a2;
        }
        return ((Number)((HashMap)b2).get(c2)).floatValue();
    }

    public wI_1() {
        wI_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public long getLong(String string, long l2) {
        Object b2 = this;
        String c2 = string;
        if (((HashMap)b2).get(c2) == null) {
            void a2;
            return (long)a2;
        }
        return ((Number)((HashMap)b2).get(c2)).longValue();
    }

    public long[] getLongArray(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return (long[])a2.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public short getShort(String string, short s) {
        Object b2 = this;
        String c2 = string;
        if (((HashMap)b2).get(c2) == null) {
            void a2;
            return (short)a2;
        }
        return ((Number)((HashMap)b2).get(c2)).shortValue();
    }

    public byte getByte(String string) {
        String b2 = string;
        wI_1 a2 = this;
        return ((Number)a2.get(b2)).byteValue();
    }
}

