/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  D
 *  EQa
 *  FPa
 *  JSa
 *  NTa
 *  SOa
 *  SRa
 *  Zpa
 *  aQa
 *  bSa
 *  dQa
 *  hTa
 *  hqa
 *  hra
 *  pPa
 *  ura
 *  vRa
 *  wOa
 *  yra
 */
package net.minecraft.block;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.CustomBlock$1;
import net.minecraft.block.CustomBlock$CustomBlockMaterial;
import net.minecraft.block.CustomBlock$CustomBlockTool;
import net.minecraft.block.CustomBlock$CustomBlockType;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CustomBlock
implements D {
    private final int burnSpeed;
    private final CustomBlock$CustomBlockMaterial material;
    private final float resistance;
    private final boolean requiresTool;
    private final String baseBlock;
    private final List<String> textures;
    private final CustomBlock$CustomBlockType type;
    private final int extraId;
    private final boolean transparent;
    private final Map<String, String> localizedNames;
    private final String textualId;
    private final float lightLevel;
    private final int ignitionSpeed;
    private final float hardness;
    private final CustomBlock$CustomBlockTool tool;
    private final int numericId;

    public float l() {
        CustomBlock a2;
        return a2.hardness;
    }

    /*
     * Unable to fully structure code
     */
    public Map<String, String> f() {
        var1_1 = this;
        a = new HashMap<K, V>();
        switch (CustomBlock$1.$SwitchMap$net$minecraft$block$CustomBlock$CustomBlockType[var1_1.type.ordinal()]) {
            case 1: {
                while (false) {
                }
                if (var1_1.textures.size() == vRa.d) {
                    var2_2 = var1_1.textures.get(uSa.E);
                    v0 = a.put(Nta.T, var2_2);
                    v1 = a;
                    a.put(dsa.a, var2_2);
                    v1.put(hTa.d, var2_2);
                    a.put(Zpa.D, var2_2);
                    a.put(vsa.k, var2_2);
                    a.put(NTa.U, var2_2);
                    a.put(SRa.l, var2_2);
                    return v1;
                }
                if (var1_1.textures.size() == uua.p) {
                    v2 = a.put(Nta.T, var1_1.textures.get(uSa.E));
                    v3 = a;
                    a.put(dsa.a, var1_1.textures.get(vRa.d));
                    v3.put(hTa.d, var1_1.textures.get(uqa.g));
                    a.put(Zpa.D, var1_1.textures.get(yRa.d));
                    a.put(vsa.k, var1_1.textures.get(AQa.P));
                    a.put(NTa.U, var1_1.textures.get(tTa.h));
                    a.put(SRa.l, var1_1.textures.get(uqa.g));
                    return v3;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, Jqa.Aa).append(var1_1.textualId).append(hqa.Ga).append(var1_1.textures.size()).toString());
            }
            case 2: {
                if (var1_1.textures.size() == AQa.P) {
                    var2_3 = var1_1.textures.get(yRa.d);
                    v4 = a.put(Nta.T, var1_1.textures.get(uSa.E));
                    v5 = a;
                    a.put(dsa.a, var1_1.textures.get(vRa.d));
                    v5.put(hTa.d, var1_1.textures.get(uqa.g));
                    a.put(Zpa.D, var2_3);
                    a.put(vsa.k, var2_3);
                    a.put(NTa.U, var2_3);
                    a.put(SRa.l, var2_3);
                    return v5;
                }
                if (var1_1.textures.size() == uua.p) {
                    v6 = a.put(Nta.T, var1_1.textures.get(uSa.E));
                    v7 = a;
                    a.put(dsa.a, var1_1.textures.get(vRa.d));
                    v7.put(hTa.d, var1_1.textures.get(uqa.g));
                    a.put(Zpa.D, var1_1.textures.get(yRa.d));
                    a.put(vsa.k, var1_1.textures.get(AQa.P));
                    a.put(NTa.U, var1_1.textures.get(tTa.h));
                    a.put(SRa.l, var1_1.textures.get(uqa.g));
                    return v7;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, Jqa.Aa).append(var1_1.textualId).append(ypa.u).append(var1_1.textures.size()).toString());
            }
            case 3: {
                if (var1_1.textures.size() == uqa.g) {
                    v8 = a;
                    a.put(dQa.y, var1_1.textures.get(uSa.E));
                    v8.put(wsa.i, var1_1.textures.get(vRa.d));
                    return v8;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, Jqa.Aa).append(var1_1.textualId).append(yOa.m).append(var1_1.textures.size()).toString());
            }
            case 4: {
                if (var1_1.textures.size() != vRa.d) ** GOTO lbl98
                v9 = var1_1;
                v10 = v9;
                a.put(wua.h, v9.textures.get(uSa.E));
                a.put(Tqa.S, var1_1.textures.get(uSa.E));
                ** GOTO lbl101
lbl98:
                // 1 sources

                throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, Jqa.Aa).append(var1_1.textualId).append(uSa.Ia).append(var1_1.textures.size()).toString());
            }
            case 5: {
                v10 = var1_1;
lbl101:
                // 2 sources

                if (v10.textures.size() == vRa.d) {
                    var2_4 = var1_1.textures.get(uSa.E);
                    v11 = a.put(vsa.Ha, var2_4);
                    v12 = a;
                    a.put(JSa.z, var2_4);
                    v12.put(dQa.y, var2_4);
                    return v12;
                }
                if (var1_1.textures.size() == yRa.d) {
                    v13 = a.put(vsa.Ha, var1_1.textures.get(uSa.E));
                    v14 = a;
                    a.put(JSa.z, var1_1.textures.get(vRa.d));
                    v14.put(dQa.y, var1_1.textures.get(uqa.g));
                    return v14;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, Jqa.Aa).append(var1_1.textualId).append(hpa.i).append(var1_1.textures.size()).toString());
            }
            case 6: {
                if (var1_1.textures.size() == vRa.d) {
                    var2_5 = var1_1.textures.get(uSa.E);
                    v15 = a.put(vsa.Ha, var2_5);
                    v16 = a;
                    a.put(JSa.z, var2_5);
                    v16.put(dQa.y, var2_5);
                    a.put(Nta.T, var2_5);
                    a.put(dsa.a, var2_5);
                    a.put(hTa.d, var2_5);
                    a.put(Zpa.D, var2_5);
                    a.put(vsa.k, var2_5);
                    a.put(NTa.U, var2_5);
                    a.put(SRa.l, var2_5);
                    return v16;
                }
                if (var1_1.textures.size() == yRa.d) {
                    var2_6 = var1_1.textures.get(uSa.E);
                    var4_7 = var1_1.textures.get(vRa.d);
                    var3_8 = var1_1.textures.get(uqa.g);
                    v17 = a.put(vsa.Ha, var2_6);
                    v18 = a;
                    a.put(JSa.z, var4_7);
                    v18.put(dQa.y, var3_8);
                    a.put(Nta.T, var2_6);
                    a.put(dsa.a, var4_7);
                    a.put(hTa.d, var3_8);
                    a.put(Zpa.D, var3_8);
                    a.put(vsa.k, var3_8);
                    a.put(NTa.U, var3_8);
                    a.put(SRa.l, var3_8);
                    return v18;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, Jqa.Aa).append(var1_1.textualId).append(Jpa.Y).append(var1_1.textures.size()).toString());
            }
            case 7: {
                if (var1_1.textures.size() == vRa.d) {
                    v19 = a;
                    v19.put(Zra.Z, var1_1.textures.get(uSa.E));
                    return v19;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, Jqa.Aa).append(var1_1.textualId).append(Zra.Ia).append(var1_1.textures.size()).toString());
            }
            case 8: {
                if (var1_1.textures.size() == vRa.d) {
                    v20 = a;
                    v20.put(JSa.H, var1_1.textures.get(uSa.E));
                    return v20;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, Jqa.Aa).append(var1_1.textualId).append(Xpa.q).append(var1_1.textures.size()).toString());
            }
            case 9: {
                if (var1_1.textures.size() == vRa.d) {
                    v21 = a;
                    v21.put(EQa.Ga, var1_1.textures.get(uSa.E));
                    return v21;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, Jqa.Aa).append(var1_1.textualId).append(SOa.c).append(var1_1.textures.size()).toString());
            }
            case 10: {
                break;
            }
            case 11: {
                break;
            }
        }
        return a;
    }

    public int C() {
        CustomBlock a2;
        return a2.burnSpeed;
    }

    public String l() {
        CustomBlock a2;
        return a2.baseBlock;
    }

    public int l() {
        CustomBlock a2;
        return a2.extraId;
    }

    public float f() {
        CustomBlock a2;
        return a2.lightLevel;
    }

    public int f() {
        CustomBlock a2;
        return a2.numericId;
    }

    public boolean f() {
        CustomBlock a2;
        return a2.requiresTool;
    }

    public CustomBlock$CustomBlockMaterial J() {
        CustomBlock a2;
        return a2.material;
    }

    public String f() {
        CustomBlock customBlock = this;
        Object object = customBlock.f();
        StringBuilder a2 = new StringBuilder();
        Object object2 = object = object.entrySet().iterator();
        while (object2.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            if (a2.length() != 0) {
                a2.append(yra.t);
            }
            a2.append((String)entry.getKey()).append(vTa.S).append((String)entry.getValue());
            object2 = object;
        }
        return Base64.getEncoder().encodeToString(a2.toString().getBytes(StandardCharsets.UTF_8));
    }

    public static Map<String, String> J(String string) {
        int n2;
        String string2 = string;
        String[] a2 = new String(Base64.getDecoder().decode(string2), StandardCharsets.UTF_8).split(yra.t);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        int n3 = a2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            String[] stringArray = a2[n2].split(vTa.S, uqa.g);
            hashMap.put(stringArray[uSa.E], stringArray[vRa.d]);
            n4 = ++n2;
        }
        return hashMap;
    }

    public boolean J() {
        CustomBlock a2;
        return a2.transparent;
    }

    public CustomBlock$CustomBlockType J() {
        CustomBlock a2;
        return a2.type;
    }

    public CustomBlock$CustomBlockTool J() {
        CustomBlock a2;
        return a2.tool;
    }

    public Map<String, String> J() {
        CustomBlock a2;
        return a2.localizedNames;
    }

    public String toString() {
        CustomBlock a2;
        return new StringBuilder().insert(2 & 5, bSa.n).append((Object)a2.type).append(aQa.R).append(a2.textualId).append((char)CRa.L).append(WPa.K).append(a2.numericId).append(Yua.P).append(a2.localizedNames).append(wOa.J).append((Object)a2.material).append(Cra.Ga).append(a2.baseBlock).append((char)CRa.L).append(Bra.Ka).append(a2.transparent).append(eta.Z).append(a2.hardness).append(Wqa.S).append(a2.resistance).append(FPa.ga).append(a2.lightLevel).append(hra.Q).append(a2.extraId).append(Psa.p).append((Object)a2.tool).append(ura.Ka).append(a2.requiresTool).append(pPa.m).append(a2.ignitionSpeed).append(Iqa.c).append(a2.burnSpeed).append(tSa.I).append(a2.textures).append((char)ySa.Z).toString();
    }

    public int J() {
        CustomBlock a2;
        return a2.ignitionSpeed;
    }

    public String J() {
        CustomBlock a2;
        return a2.textualId;
    }

    public List<String> J() {
        CustomBlock a2;
        return a2.textures;
    }

    public float J() {
        CustomBlock a2;
        return a2.resistance;
    }

    /*
     * WARNING - void declaration
     */
    public CustomBlock(CustomBlock$CustomBlockType customBlock$CustomBlockType, String string, int n2, Map<String, String> map, CustomBlock$CustomBlockMaterial customBlock$CustomBlockMaterial, String string2, boolean bl2, float f2, float f3, float f4, CustomBlock$CustomBlockTool customBlock$CustomBlockTool, int n3, boolean bl3, int n4, int n5, List<String> list) {
        List<String> q2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void g2;
        void h2;
        void i2;
        void j2;
        void l2;
        void k2;
        void m2;
        void n6;
        void o2;
        void p2;
        CustomBlock a2;
        CustomBlock customBlock = list2;
        List<String> list2 = list;
        CustomBlock customBlock2 = a2 = customBlock;
        CustomBlock customBlock3 = a2;
        CustomBlock customBlock4 = a2;
        CustomBlock customBlock5 = a2;
        CustomBlock customBlock6 = a2;
        CustomBlock customBlock7 = a2;
        CustomBlock customBlock8 = a2;
        CustomBlock customBlock9 = a2;
        customBlock9.type = p2;
        customBlock9.textualId = o2;
        customBlock8.numericId = n6;
        customBlock8.localizedNames = m2;
        customBlock7.baseBlock = k2;
        customBlock7.material = l2;
        customBlock6.transparent = j2;
        customBlock6.hardness = i2;
        customBlock5.resistance = h2;
        customBlock5.lightLevel = g2;
        customBlock4.tool = f5;
        customBlock4.extraId = e2;
        customBlock3.requiresTool = d2;
        customBlock3.ignitionSpeed = c2;
        customBlock2.burnSpeed = b2;
        customBlock2.textures = q2;
    }
}

