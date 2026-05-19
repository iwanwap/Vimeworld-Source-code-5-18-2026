/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  DQa
 *  EQa
 *  ERa
 *  JSa
 *  Jy
 *  Lqa
 *  NTa
 *  QFa
 *  TQa
 *  Tpa
 *  Vua
 *  WE
 *  Wsa
 *  XSa
 *  XTa
 *  Ysa
 *  Zpa
 *  aqa
 *  hTa
 *  jRa
 *  pua
 *  qD
 *  uOa
 *  uRa
 *  vRa
 *  wra
 *  yra
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class LE_1 {
    private String A;
    private static final ze[] I = new ze[uSa.E];

    public int J(String string) {
        String b2 = string;
        LE_1 a2 = this;
        if (b2 == null) {
            return pua.o;
        }
        int n2 = Config.J(b2, pua.o);
        if (n2 < 0) {
            a2.f(Lqa.O + (String)b2);
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private IBlockState J(Block block, int n2) {
        void b2;
        LE_1 lE_1 = this;
        try {
            void a22;
            void v0 = b2;
            Object c2 = v0.J((int)a22);
            if (v0 == QFa.Ia && a22 > XTa.W) {
                IBlockState a22 = b2.J(a22 & XTa.W);
                c2 = c2.J(BlockDoublePlant.VARIANT, a22.J(BlockDoublePlant.VARIANT));
            }
            return c2;
        }
        catch (IllegalArgumentException c2) {
            return b2.J();
        }
    }

    private WE J(String string) {
        String b2 = string;
        LE_1 a2 = this;
        if (b2 == null) {
            return null;
        }
        if (b2.indexOf(wra.e) >= 0) {
            String[] stringArray = Config.J(b2, Vua.m);
            if (stringArray.length != uqa.g) {
                a2.f(JSa.G + (String)b2);
                return null;
            }
            int n2 = Config.J(stringArray[uSa.E], pua.o);
            int n3 = Config.J(stringArray[vRa.d], pua.o);
            if (n2 >= 0 && n3 >= 0) {
                return new WE(n2, n3);
            }
            a2.f(new StringBuilder().insert(3 & 4, JSa.G).append(b2).toString());
            return null;
        }
        int n4 = Config.J(b2, pua.o);
        if (n4 < 0) {
            a2.f(new StringBuilder().insert(3 ^ 3, DPa.Fa).append(b2).toString());
            return null;
        }
        int n5 = n4;
        return new WE(n5, n5);
    }

    public Jy J(String string) {
        int n2;
        String a2;
        LE_1 lE_1 = this;
        if ((a2 = a2.toLowerCase()).equals(Bta.x)) {
            return Jy.B;
        }
        Jy[] jyArray = Jy.J();
        int n3 = n2 = uSa.E;
        while (n3 < jyArray.length) {
            LE_1 b2 = jyArray[n2];
            if (b2 != null && ((Jy)b2).Ma.replace(Tpa.E, Mqa.y).toLowerCase().equals(a2)) {
                return b2;
            }
            n3 = ++n2;
        }
        return null;
    }

    public void f(String string) {
        String b2 = string;
        LE_1 a2 = this;
        Config.J(new StringBuilder().insert(3 ^ 3, Mqa.y).append(a2.A).append(Xpa.E).append(b2).toString());
    }

    public qD J(String string) {
        int n2;
        String[] b2 = string;
        LE_1 a2 = this;
        if (b2 == null) {
            return null;
        }
        qD qD2 = new qD();
        b2 = Config.J((String)b2, uRa.p);
        int n3 = n2 = uSa.E;
        while (n3 < b2.length) {
            String string2 = b2[n2];
            if ((string2 = a2.J(string2)) == null) {
                return null;
            }
            qD2.J((WE)string2);
            n3 = ++n2;
        }
        return qD2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(IBlockState iBlockState, Map<IProperty, List<Comparable>> map) {
        void a2;
        LE_1 lE_1 = this;
        for (Object c2 : a2.keySet()) {
            void b2;
            List list = (List)a2.get(c2);
            if ((c2 = b2.J(c2)) == null) {
                return uSa.E != 0;
            }
            if (list.contains(c2)) continue;
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public String f(String string) {
        void a2;
        LE_1 lE_1 = this;
        Object b2 = a2;
        int n2 = ((String)b2).lastIndexOf(uOa.F);
        if (n2 >= 0) {
            b2 = a2.substring(n2 + vRa.d);
        }
        if ((a2 = ((String)b2).lastIndexOf(Bpa.Ha)) >= 0) {
            b2 = ((String)b2).substring(uSa.E, a2);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static int f(String string, int n2) {
        void a2;
        String string2 = string;
        if (string2 == null) {
            return (int)a2;
        }
        string2 = string2.trim();
        try {
            int b2 = Integer.parseInt(string2, ERa.C) & Wsa.K;
            return b2;
        }
        catch (NumberFormatException b2) {
            return (int)a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(Block block, String[] stringArray) {
        int n2;
        int c22;
        Object object;
        int n3;
        void b2;
        void a2;
        LE_1 lE_1 = this;
        if (((void)a2).length <= 0) {
            return null;
        }
        Collection<IProperty> collection = a2[uSa.E];
        if (lE_1.f((String)((Object)collection))) {
            return lE_1.J((String)((Object)collection));
        }
        collection = b2.J().J();
        HashMap<IProperty, List<Comparable>> hashMap = new HashMap<IProperty, List<Comparable>>();
        int n4 = n3 = uSa.E;
        while (n4 < ((void)a2).length) {
            LE_1 c22 = a2[n3];
            if (((String)((Object)c22)).length() > 0) {
                String[] stringArray2 = Config.J((String)((Object)c22), vTa.S);
                if (stringArray2.length != uqa.g) {
                    lE_1.f(aqa.W + (String)((Object)c22));
                    return null;
                }
                object = stringArray2[uSa.E];
                String[] stringArray3 = stringArray2[vRa.d];
                IProperty iProperty = tE.J((String)object, collection);
                if (iProperty == null) {
                    lE_1.f(new StringBuilder().insert(2 & 5, TQa.G).append((String)object).append(sOa.ha).append(b2).toString());
                    return null;
                }
                ArrayList<Comparable> arrayList = (ArrayList<Comparable>)hashMap.get(object);
                if (arrayList == null) {
                    arrayList = new ArrayList<Comparable>();
                    hashMap.put(iProperty, arrayList);
                }
                stringArray3 = Config.J((String)stringArray3, yra.t);
                int n5 = uSa.E;
                while (n5 < stringArray3.length) {
                    int n6;
                    String string = stringArray3[n6];
                    Comparable comparable = LE_1.J(iProperty, string);
                    if (comparable == null) {
                        lE_1.f(new StringBuilder().insert(5 >> 3, Ysa.D).append(string).append(qsa.C).append((String)object).append(sOa.ha).append(b2).toString());
                        return null;
                    }
                    arrayList.add(comparable);
                    n5 = ++n6;
                }
            }
            n4 = ++n3;
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n7 = c22 = uSa.E;
        while (n7 < ERa.C) {
            int n8 = c22;
            try {
                LE_1 lE_12 = lE_1;
                object = lE_12.J((Block)b2, n8);
                if (lE_12.J((IBlockState)object, hashMap)) {
                    arrayList.add(n8);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
            n7 = ++c22;
        }
        if (arrayList.size() == ERa.C) {
            return null;
        }
        int[] c22 = new int[arrayList.size()];
        int n9 = n2 = uSa.E;
        while (n9 < c22.length) {
            int n10 = n2++;
            c22[n10] = (Integer)arrayList.get(n10);
            n9 = n2;
        }
        return c22;
    }

    public static Comparable J(String string, Class clazz) {
        Class b2 = clazz;
        String a2 = string;
        return (Comparable)(b2 == String.class ? a2 : (b2 == Boolean.class ? (Serializable)Boolean.valueOf(a2) : (Serializable)(b2 == Float.class ? (Number)Float.valueOf(a2) : (Number)(b2 == Double.class ? (Number)Double.valueOf(a2) : (Number)(b2 == Integer.class ? (Number)Integer.valueOf(a2) : (Number)(b2 == Long.class ? Long.valueOf(a2) : null))))));
    }

    public LE_1(String string) {
        LE_1 a2;
        String b2 = string;
        LE_1 lE_1 = a2 = this;
        lE_1.A = null;
        lE_1.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static Comparable J(IProperty iProperty, String string) {
        void a2;
        IProperty iProperty2 = iProperty;
        Object b2 = iProperty2.J();
        if ((b2 = LE_1.J((String)a2, (Class)b2)) == null) {
            Collection collection = iProperty2.J();
            b2 = LE_1.J((String)a2, collection);
        }
        return b2;
    }

    public ze[] f(String string) {
        int n2;
        String[] b2 = string;
        LE_1 a2 = this;
        if (b2 == null) {
            return null;
        }
        ArrayList<ze> arrayList = new ArrayList<ze>();
        b2 = Config.J((String)b2, Tpa.E);
        int n3 = n2 = uSa.E;
        while (n3 < b2.length) {
            ze[] zeArray = b2[n2];
            if ((zeArray = a2.J((String)zeArray)) == null) {
                return I;
            }
            arrayList.addAll(Arrays.asList(zeArray));
            n3 = ++n2;
        }
        ArrayList<ze> arrayList2 = arrayList;
        ze[] zeArray = arrayList2.toArray(new ze[arrayList2.size()]);
        return zeArray;
    }

    public DZ J(String string) {
        Object b2 = string;
        LE_1 a2 = this;
        if (!((String)(b2 = ((String)b2).toLowerCase())).equals(vsa.Ha) && !((String)b2).equals(Nta.T)) {
            if (!((String)b2).equals(JSa.z) && !((String)b2).equals(dsa.a)) {
                if (((String)b2).equals(hTa.d)) {
                    return DZ.NORTH;
                }
                if (((String)b2).equals(vsa.k)) {
                    return DZ.SOUTH;
                }
                if (((String)b2).equals(Zpa.D)) {
                    return DZ.EAST;
                }
                if (((String)b2).equals(NTa.U)) {
                    return DZ.WEST;
                }
                Config.J(new StringBuilder().insert(3 ^ 3, DQa.M).append((String)b2).toString());
                return null;
            }
            return DZ.UP;
        }
        return DZ.DOWN;
    }

    public boolean f(String string) {
        String b2 = string;
        LE_1 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (b2.length() < vRa.d) {
            return uSa.E != 0;
        }
        return Character.isDigit(b2.charAt(uSa.E));
    }

    public Jy[] J(String string) {
        int n2;
        String[] b2 = string;
        LE_1 a2 = this;
        if (b2 == null) {
            return null;
        }
        b2 = Config.J((String)b2, Tpa.E);
        ArrayList<Jy> arrayList = new ArrayList<Jy>();
        int n3 = n2 = uSa.E;
        while (n3 < b2.length) {
            String string2 = b2[n2];
            Jy jy = a2.J(string2);
            if (jy == null) {
                a2.f(sSa.U + string2);
            } else {
                arrayList.add(jy);
            }
            n3 = ++n2;
        }
        ArrayList<Jy> arrayList2 = arrayList;
        Jy[] jyArray = arrayList2.toArray(new Jy[arrayList2.size()]);
        return jyArray;
    }

    public boolean J(String[] stringArray) {
        Object b2 = stringArray;
        String[] a2 = this;
        if (((String[])b2).length < uqa.g) {
            return uSa.E != 0;
        }
        if (((String)(b2 = b2[vRa.d])).length() < vRa.d) {
            return uSa.E != 0;
        }
        if (a2.f((String)b2)) {
            return uSa.E != 0;
        }
        if (!((String)b2).contains(vTa.S)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean[] J(String string, boolean[] blArray) {
        int n2;
        int n3;
        String[] b2;
        EnumSet<DZ> c2 = (EnumSet<DZ>)blArray;
        LE_1 a2 = this;
        if (b2 == null) {
            return c2;
        }
        c2 = EnumSet.allOf(DZ.class);
        b2 = Config.J((String)b2, uRa.p);
        int n4 = n3 = uSa.E;
        while (n4 < b2.length) {
            String string2 = b2[n3];
            if (string2.equals(APa.Q)) {
                c2.add(DZ.NORTH);
                c2.add(DZ.SOUTH);
                c2.add(DZ.WEST);
                c2.add(DZ.EAST);
            } else if (string2.equals(JSa.H)) {
                c2.addAll(Arrays.asList(DZ.values()));
            } else {
                DZ dZ2 = a2.J(string2);
                if (dZ2 != null) {
                    c2.add(dZ2);
                }
            }
            n4 = ++n3;
        }
        boolean[] blArray2 = new boolean[DZ.values().length];
        int n5 = n2 = uSa.E;
        while (n5 < blArray2.length) {
            int n6 = n2++;
            blArray2[n6] = c2.contains((Object)DZ.values()[n6]);
            n5 = n2;
        }
        return blArray2;
    }

    public void J(String string) {
        String b2 = string;
        LE_1 a2 = this;
        Config.f(new StringBuilder().insert(3 & 4, Mqa.y).append(a2.A).append(Xpa.E).append(b2).toString());
    }

    public ze[] J(String string) {
        int n2;
        String[] stringArray;
        String[] b2 = string;
        LE_1 a2 = this;
        if (b2 == null) {
            return null;
        }
        if ((b2 = b2.trim()).length() <= 0) {
            return null;
        }
        b2 = Config.J((String)b2, Era.Aa);
        Block[] blockArray = APa.m;
        int n3 = uSa.E;
        if (b2.length > vRa.d && a2.J(b2)) {
            stringArray = b2;
            blockArray = b2[uSa.E];
            n3 = vRa.d;
        } else {
            blockArray = APa.m;
            n3 = uSa.E;
            stringArray = b2;
        }
        String string2 = stringArray[n3];
        b2 = Arrays.copyOfRange(b2, n3 + vRa.d, b2.length);
        blockArray = a2.J((String)blockArray, string2);
        if (blockArray == null) {
            return null;
        }
        ze[] zeArray = new ze[blockArray.length];
        int n4 = n2 = uSa.E;
        while (n4 < blockArray.length) {
            Object object = blockArray[n2];
            int n5 = Block.J((Block)object);
            int[] nArray = null;
            if (b2.length > 0 && (nArray = a2.J((Block)object, b2)) == null) {
                return null;
            }
            object = new ze(n5, nArray);
            zeArray[n2++] = object;
            n4 = n2;
        }
        return zeArray;
    }

    public static boolean J(String a2) {
        if (a2 == null) {
            return uSa.E != 0;
        }
        return a2.toLowerCase().equals(oQa.l);
    }

    /*
     * WARNING - void declaration
     */
    public int J(String string, int n2) {
        void a2;
        String c2 = string;
        LE_1 b2 = this;
        if (c2 == null) {
            return (int)a2;
        }
        int n3 = Config.J(c2, pua.o);
        if (n3 < 0) {
            b2.f(Lqa.O + (String)c2);
            return (int)a2;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(String string) {
        int b22;
        int n2;
        void a2;
        LE_1 lE_1 = this;
        if (a2 == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String[] stringArray = Config.J((String)a2, uRa.p);
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            String b22 = stringArray[n2];
            if (b22.contains(Vua.m)) {
                String[] stringArray2 = Config.J(b22, Vua.m);
                if (stringArray2.length != uqa.g) {
                    lE_1.f(jRa.Ca + (String)b22 + EQa.x + (String)a2);
                } else {
                    int n4 = Config.J(stringArray2[uSa.E], pua.o);
                    int n5 = Config.J(stringArray2[vRa.d], pua.o);
                    if (n4 >= 0 && n5 >= 0 && n4 <= n5) {
                        int n6 = n4 = n4;
                        while (n6 <= n5) {
                            arrayList.add(n4++);
                            n6 = n4;
                        }
                    } else {
                        lE_1.f(new StringBuilder().insert(3 & 4, jRa.Ca).append(b22).append(EQa.x).append((String)a2).toString());
                    }
                }
            } else {
                int n7 = Config.J(b22, pua.o);
                if (n7 < 0) {
                    lE_1.f(new StringBuilder().insert(2 & 5, Lqa.O).append(b22).append(EQa.x).append((String)a2).toString());
                } else {
                    arrayList.add(n7);
                }
            }
            n3 = ++n2;
        }
        int[] nArray = new int[arrayList.size()];
        int n8 = b22 = uSa.E;
        while (n8 < nArray.length) {
            int n9 = b22++;
            nArray[n9] = (Integer)arrayList.get(n9);
            n8 = b22;
        }
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    public String J(String string) {
        void a2;
        LE_1 lE_1 = this;
        int b2 = a2.lastIndexOf(uOa.F);
        if (b2 < 0) {
            return Mqa.y;
        }
        return a2.substring(uSa.E, b2);
    }

    public static Comparable J(String string, Collection collection) {
        Iterator b2 = collection;
        String a2 = string;
        b2 = b2.iterator();
        while (b2.hasNext()) {
            Object e2 = b2.next();
            if (!String.valueOf(e2).equals(a2)) continue;
            return (Comparable)e2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Block[] J(String string, String string2) {
        void b2;
        Object c2;
        void a2;
        Object object = this;
        if (((LE_1)object).f((String)a2)) {
            int n2;
            int[] nArray = ((LE_1)object).J((String)a2);
            c2 = nArray;
            if (nArray == null) {
                return null;
            }
            Block[] blockArray = new Block[((Object)c2).length];
            int n3 = n2 = uSa.E;
            while (n3 < ((Object)c2).length) {
                Object object2 = c2[n2];
                Block block = Block.f((int)object2);
                if (block == null) {
                    ((LE_1)object).f(XSa.G + (int)object2);
                    return null;
                }
                blockArray[n2++] = block;
                n3 = n2;
            }
            return blockArray;
        }
        c2 = new StringBuilder().insert(5 >> 3, (String)b2).append(Era.Aa).append((String)a2).toString();
        Block block = Block.J((String)c2);
        if (block == null) {
            ((LE_1)object).f(new StringBuilder().insert(3 & 4, KQa.E).append((String)c2).toString());
            return null;
        }
        Block[] blockArray = new Block[vRa.d];
        blockArray[uSa.E] = block;
        Block[] blockArray2 = blockArray;
        return blockArray;
    }
}

