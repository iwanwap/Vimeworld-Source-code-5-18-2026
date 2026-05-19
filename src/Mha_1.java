/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  EQa
 *  Lga
 *  OCa
 *  Oc
 *  Qc
 *  RPa
 *  TQa
 *  Tpa
 *  VQa
 *  WIa
 *  aGa
 *  aQa
 *  aSa
 *  bFa
 *  eAa
 *  fia
 *  hra
 *  iha
 *  kPa
 *  ld
 *  oGa
 *  pQa
 *  vL
 *  vRa
 */
import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public abstract class Mha_1
implements Qc {
    private static Oc theAdmin;

    public static void setAdminCommander(Oc a2) {
        theAdmin = a2;
    }

    public static long parseLong(String a2) throws WIa {
        try {
            return Long.parseLong(a2);
        }
        catch (NumberFormatException numberFormatException) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            throw new WIa(kTa.z, objectArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static List<String> func_175771_a(String[] stringArray, int n2, XF xF2) {
        Object c2;
        void b2;
        void a2;
        String[] stringArray2 = stringArray;
        if (a2 == null) {
            return null;
        }
        int n3 = stringArray2.length - vRa.d;
        if (n3 == b2) {
            c2 = Integer.toString(a2.getX());
        } else if (n3 == b2 + vRa.d) {
            c2 = Integer.toString(a2.getY());
        } else {
            if (n3 != b2 + uqa.g) {
                return null;
            }
            c2 = Integer.toString(a2.getZ());
        }
        String[] stringArray3 = new String[vRa.d];
        stringArray3[uSa.E] = c2;
        return Lists.newArrayList(stringArray3);
    }

    public static iha parseCoordinate(double d2, String string, boolean bl) throws WIa {
        double c2;
        boolean b2 = bl;
        String a2 = string;
        return Mha_1.parseCoordinate(c2, a2, lQa.s, RPa.Da, b2);
    }

    public static double parseDouble(String b2, double a2) throws WIa {
        return Mha_1.parseDouble(b2, a2, Bra.o);
    }

    /*
     * WARNING - void declaration
     */
    public static int parseInt(String string, int n2, int n3) throws WIa {
        void a2;
        void b2;
        String string2 = string;
        int c2 = Mha_1.parseInt(string2);
        if (c2 < b2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = c2;
            objectArray[vRa.d] = (int)b2;
            throw new WIa(yta.f, objectArray);
        }
        if (c2 > a2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = c2;
            objectArray[vRa.d] = (int)a2;
            throw new WIa(uSa.U, objectArray);
        }
        return c2;
    }

    public static bFa getCommandSenderAsPlayer(u a2) throws aGa {
        if (a2 instanceof bFa) {
            return (bFa)a2;
        }
        throw new aGa(Bra.s, new Object[uSa.E]);
    }

    /*
     * WARNING - void declaration
     */
    public static void notifyOperators(u objectArray, Qc qc2, int n2, String string, Object ... objectArray2) {
        Object[] objectArray3 = objectArray;
        objectArray = objectArray2;
        Object[] a2 = objectArray3;
        if (theAdmin != null) {
            u e2;
            void b2;
            void c2;
            void d2;
            theAdmin.J((u)a2, (Qc)d2, (int)c2, (String)b2, (Object[])e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static ld getChatComponentFromNthArg(u u2, String[] stringArray, int n2, boolean bl) throws aGa {
        void c2;
        void b2;
        void d2;
        u u3 = u2;
        CY cY2 = new CY(Mqa.y);
        void v0 = d2 = b2;
        while (v0 < ((void)c2).length) {
            void a2;
            if (d2 > b2) {
                cY2.J(Tpa.E);
            }
            CY cY3 = new CY((String)c2[d2]);
            if (a2 != false) {
                ld ld2 = fia.J((u)u3, (String)c2[d2]);
                if (ld2 == null) {
                    if (fia.J((String)c2[d2])) {
                        throw new aGa();
                    }
                } else {
                    cY3 = ld2;
                }
            }
            cY2.J((ld)cY3);
            v0 = ++d2;
        }
        return cY2;
    }

    public static String getPlayerName(u u2, String string) throws aGa {
        String b2 = string;
        u a2 = u2;
        try {
            return Mha_1.getPlayer(a2, b2).J();
        }
        catch (aGa aGa2) {
            if (fia.J((String)b2)) {
                throw aGa2;
            }
            return b2;
        }
    }

    public static List<String> getListOfStringsMatchingLastWord(String[] stringArray, String ... stringArray2) {
        String[] b2 = stringArray2;
        String[] a2 = stringArray;
        return Mha_1.getListOfStringsMatchingLastWord(a2, Arrays.asList(b2));
    }

    public static long parseLong(String c2, long b2, long a2) throws WIa {
        long l2 = Mha_1.parseLong(c2);
        if (l2 < b2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = l2;
            objectArray[vRa.d] = b2;
            throw new WIa(yta.f, objectArray);
        }
        if (l2 > a2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = l2;
            objectArray[vRa.d] = a2;
            throw new WIa(uSa.U, objectArray);
        }
        return l2;
    }

    public static double parseDouble(double d2, String string, boolean bl) throws WIa {
        double c2;
        boolean b2 = bl;
        String a2 = string;
        return Mha_1.parseDouble(c2, a2, lQa.s, RPa.Da, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static List<String> getListOfStringsMatchingLastWord(String[] stringArray, Collection<?> collection) {
        void a2;
        String[] stringArray2 = stringArray;
        String string = stringArray2[stringArray2.length - vRa.d];
        ArrayList<String> arrayList = Lists.newArrayList();
        if (!a2.isEmpty()) {
            for (String string2 : Iterables.transform(a2, Functions.toStringFunction())) {
                if (!Mha_1.doesStringStartWith(string, string2)) continue;
                arrayList.add(string2);
            }
            if (arrayList.isEmpty()) {
                for (String string2 : a2) {
                    if (!(string2 instanceof ResourceLocation) || !Mha_1.doesStringStartWith(string, ((ResourceLocation)((Object)string2)).J())) continue;
                    arrayList.add(String.valueOf(string2));
                }
            }
        }
        return arrayList;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        Mha_1 a2 = this;
        return uSa.E != 0;
    }

    public static int parseInt(String string, int n2) throws WIa {
        int b2 = n2;
        String a2 = string;
        return Mha_1.parseInt(a2, b2, vqa.F);
    }

    public static boolean parseBoolean(String a2) throws oGa {
        if (!a2.equals(oQa.l) && !a2.equals(TQa.h)) {
            if (!a2.equals(MRa.E) && !a2.equals(GPa.J)) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2;
                throw new oGa(EQa.fa, objectArray);
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static double parseDouble(double d2, String string, int n2, int n3, boolean bl) throws WIa {
        void b2;
        void c2;
        double d3;
        double e2;
        String string2 = string;
        boolean d4 = string2.startsWith(kPa.x);
        if (d4 && Double.isNaN(e2)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = e2;
            throw new WIa(kTa.z, objectArray);
        }
        double d5 = d3 = d4 ? e2 : aSa.V;
        if (!d4 || string2.length() > vRa.d) {
            void a2;
            boolean bl2 = string2.contains(VQa.ja);
            if (d4) {
                string2 = string2.substring(vRa.d);
            }
            d3 += Mha_1.parseDouble(string2);
            if (!bl2 && !d4 && a2 != false) {
                d3 += kTa.B;
            }
        }
        if (c2 != false || b2 != false) {
            if (d3 < (double)c2) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = d3;
                objectArray[vRa.d] = (int)c2;
                throw new WIa(aQa.s, objectArray);
            }
            if (d3 > (double)b2) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = d3;
                objectArray[vRa.d] = (int)b2;
                throw new WIa(Jpa.c, objectArray);
            }
        }
        return d3;
    }

    public int getRequiredPermissionLevel() {
        return AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    public static bFa getPlayer(u u2, String string) throws aGa {
        u u3;
        void a2;
        u u4 = u2;
        u b2 = fia.J((u)u4, (String)a2);
        if (b2 == null) {
            try {
                u3 = b2 = OCa.J().J().J(UUID.fromString((String)a2));
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        u3 = b2;
        if (u3 == null) {
            b2 = OCa.J().J().J((String)a2);
        }
        if (b2 == null) {
            throw new aGa();
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static List<String> func_181043_b(String[] stringArray, int n2, XF xF2) {
        Object c2;
        void b2;
        void a2;
        String[] stringArray2 = stringArray;
        if (a2 == null) {
            return null;
        }
        int n3 = stringArray2.length - vRa.d;
        if (n3 == b2) {
            c2 = Integer.toString(a2.getX());
        } else {
            if (n3 != b2 + vRa.d) {
                return null;
            }
            c2 = Integer.toString(a2.getZ());
        }
        String[] stringArray3 = new String[vRa.d];
        stringArray3[uSa.E] = c2;
        return Lists.newArrayList(stringArray3);
    }

    public static double parseDouble(String a2) throws WIa {
        try {
            double d2 = Double.parseDouble(a2);
            if (!Doubles.isFinite(d2)) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2;
                throw new WIa(kTa.z, objectArray);
            }
            return d2;
        }
        catch (NumberFormatException numberFormatException) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            throw new WIa(kTa.z, objectArray);
        }
    }

    public static int parseInt(String a2) throws WIa {
        try {
            return Integer.parseInt(a2);
        }
        catch (NumberFormatException numberFormatException) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            throw new WIa(kTa.z, objectArray);
        }
    }

    public boolean canCommandSenderUseCommand(u u2) {
        u b2 = u2;
        Mha_1 a2 = this;
        return b2.J(a2.getRequiredPermissionLevel(), a2.getCommandName());
    }

    public static Block getBlockByText(u u2, String string) throws WIa {
        Object b2 = string;
        u a2 = u2;
        if (Block.blockRegistry.J((ResourceLocation)(b2 = new ResourceLocation((String)b2))) == false) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            throw new WIa(uua.K, objectArray);
        }
        Block block = Block.blockRegistry.J((ResourceLocation)b2);
        if (block == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            throw new WIa(uua.K, objectArray);
        }
        return block;
    }

    /*
     * Unable to fully structure code
     */
    public static String joinNiceString(Object[] var0) {
        var2_2 = var0;
        var1_3 = new StringBuilder();
        v0 = a = uSa.E;
        while (v0 < var2_2.length) {
            var3_4 = var2_2[a].toString();
            if (a <= 0) ** GOTO lbl15
            if (a == var2_2.length - vRa.d) {
                v1 = var1_3;
                v2 = v1;
                v1.append(sSa.P);
            } else {
                var1_3.append(TOa.n);
lbl15:
                // 2 sources

                v2 = var1_3;
            }
            v2.append(var3_4);
            v0 = ++a;
        }
        return var1_3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static String buildString(String[] stringArray, int n2) {
        void a2;
        void b2;
        String[] stringArray2 = stringArray;
        StringBuilder stringBuilder = new StringBuilder();
        void v0 = b2 = a2;
        while (v0 < stringArray2.length) {
            if (b2 > a2) {
                stringBuilder.append(Tpa.E);
            }
            String string = stringArray2[b2];
            stringBuilder.append(string);
            v0 = ++b2;
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static void notifyOperators(u u2, Qc qc2, String string, Object ... objectArray) {
        void b2;
        void c2;
        Object[] d2 = objectArray;
        u a2 = u2;
        Mha_1.notifyOperators(a2, (Qc)c2, uSa.E, (String)b2, d2);
    }

    public List<String> getCommandAliases() {
        return Collections.emptyList();
    }

    public static vL func_175768_b(u u2, String string) throws Lga {
        String b2 = string;
        u a2 = u2;
        return Mha_1.getEntity(a2, b2, vL.class);
    }

    public static String joinNiceStringFromCollection(Collection<String> a2) {
        Collection<String> collection = a2;
        return Mha_1.joinNiceString(collection.toArray(new String[collection.size()]));
    }

    /*
     * Unable to fully structure code
     */
    public static ld join(List<ld> var0) {
        var2_2 = var0;
        var1_3 = new CY(Mqa.y);
        v0 = a = uSa.E;
        while (v0 < var2_2.size()) {
            if (a <= 0) ** GOTO lbl15
            if (a == var2_2.size() - vRa.d) {
                v1 = var1_3;
                v2 = v1;
                v1.J(sSa.P);
            } else {
                if (a > 0) {
                    var1_3.J(TOa.n);
                }
lbl15:
                // 4 sources

                v2 = var1_3;
            }
            v2.J(var2_2.get(a++));
            v0 = a;
        }
        return var1_3;
    }

    /*
     * WARNING - void declaration
     */
    public static iha parseCoordinate(double d2, String string, int n2, int n3, boolean bl) throws WIa {
        void b2;
        void c2;
        double e2;
        String string2 = string;
        boolean d3 = string2.startsWith(kPa.x);
        if (d3 && Double.isNaN(e2)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = e2;
            throw new WIa(kTa.z, objectArray);
        }
        double d4 = aSa.V;
        if (!d3 || string2.length() > vRa.d) {
            void a2;
            boolean bl2 = string2.contains(VQa.ja);
            if (d3) {
                string2 = string2.substring(vRa.d);
            }
            d4 += Mha_1.parseDouble(string2);
            if (!bl2 && !d3 && a2 != false) {
                d4 += kTa.B;
            }
        }
        if (c2 != false || b2 != false) {
            if (d4 < (double)c2) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = d4;
                objectArray[vRa.d] = (int)c2;
                throw new WIa(aQa.s, objectArray);
            }
            if (d4 > (double)b2) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = d4;
                objectArray[vRa.d] = (int)b2;
                throw new WIa(Jpa.c, objectArray);
            }
        }
        return new iha(d4 + (d3 ? e2 : aSa.V), d4, d3);
    }

    public static List<vL> func_175763_c(u u2, String string) throws Lga {
        String b2 = string;
        u a2 = u2;
        if (fia.J((String)b2)) {
            return fia.J((u)a2, (String)b2, vL.class);
        }
        vL[] vLArray = new vL[vRa.d];
        vLArray[uSa.E] = Mha_1.func_175768_b(a2, b2);
        return Lists.newArrayList(vLArray);
    }

    /*
     * WARNING - void declaration
     */
    public static ld getChatComponentFromNthArg(u u2, String[] stringArray, int n2) throws oGa, aGa {
        void b2;
        int c2 = n2;
        u a2 = u2;
        return Mha_1.getChatComponentFromNthArg(a2, (String[])b2, c2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static XF parseBlockPos(u u2, String[] stringArray, int n2, boolean bl) throws WIa {
        void a2;
        void b2;
        void c2;
        u u3 = u2;
        Object d2 = u3.J();
        return new XF(Mha_1.parseDouble(d2.getX(), (String)c2[b2], lQa.s, RPa.Da, (boolean)a2), Mha_1.parseDouble(d2.getY(), (String)c2[b2 + vRa.d], uSa.E, hra.Ja, uSa.E != 0), Mha_1.parseDouble(d2.getZ(), (String)c2[b2 + uqa.g], lQa.s, RPa.Da, (boolean)a2));
    }

    public static boolean doesStringStartWith(String string, String string2) {
        String a2;
        String b2 = string2;
        String string3 = a2 = string;
        return b2.regionMatches(vRa.d != 0, uSa.E, string3, uSa.E, string3.length());
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends vL> T getEntity(u u2, String string, Class<? extends T> clazz) throws Lga {
        void a2;
        UUID b22;
        u u3 = u2;
        u c2 = fia.J((u)u3, (String)((Object)b22), (Class)a2);
        OCa oCa2 = OCa.J();
        if (c2 == null) {
            c2 = oCa2.J().J((String)((Object)b22));
        }
        if (c2 == null) {
            try {
                b22 = UUID.fromString((String)((Object)b22));
                c2 = oCa2.J(b22);
                if (c2 == null) {
                    c2 = oCa2.J().J(b22);
                }
            }
            catch (IllegalArgumentException b22) {
                throw new Lga(pQa.E, new Object[uSa.E]);
            }
        }
        if (c2 != null && a2.isAssignableFrom(c2.getClass())) {
            return (T)c2;
        }
        throw new Lga();
    }

    public static eAa getItemByText(u u2, String string) throws WIa {
        Object b2 = string;
        u a2 = u2;
        eAa eAa2 = (eAa)eAa.C.J(b2 = new ResourceLocation((String)b2));
        if (eAa2 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            throw new WIa(VPa.g, objectArray);
        }
        return eAa2;
    }

    public int compareTo(Qc qc2) {
        Mha_1 b2 = qc2;
        Mha_1 a2 = this;
        return a2.getCommandName().compareTo(b2.getCommandName());
    }

    public static String getEntityName(u u2, String string) throws Lga {
        String b2 = string;
        u a2 = u2;
        try {
            return Mha_1.getPlayer(a2, b2).J();
        }
        catch (aGa aGa2) {
            try {
                return Mha_1.func_175768_b(a2, b2).J().toString();
            }
            catch (Lga lga2) {
                if (fia.J((String)b2)) {
                    throw lga2;
                }
                return b2;
            }
        }
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        Object d2 = xF2;
        Mha_1 a2 = this;
        return null;
    }

    public static double parseDouble(String c2, double b2, double a2) throws WIa {
        double d2;
        double d3 = Mha_1.parseDouble(c2);
        if (d2 < b2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = d3;
            objectArray[vRa.d] = b2;
            throw new WIa(aQa.s, objectArray);
        }
        if (d3 > a2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = d3;
            objectArray[vRa.d] = a2;
            throw new WIa(Jpa.c, objectArray);
        }
        return d3;
    }

    public Mha_1() {
        Mha_1 a2;
    }
}

