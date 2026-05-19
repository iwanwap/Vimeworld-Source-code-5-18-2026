/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CLa
 *  JPa
 *  Kga
 *  LJa
 *  RA
 *  Rja
 *  Yka
 *  Yra
 *  hJa
 *  uQa
 *  vRa
 */
import java.util.ArrayList;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import optifine.Config;
import org.lwjgl.util.vector.Vector3f;

public final class Ue {
    /*
     * WARNING - void declaration
     */
    public static RA J(KLa kLa2, int n2) {
        int n3;
        KLa kLa3 = kLa2;
        ArrayList arrayList = new ArrayList();
        DZ[] b2 = DZ.values();
        ArrayList arrayList2 = new ArrayList(b2.length);
        int n4 = n3 = uSa.E;
        while (n4 < b2.length) {
            void a2;
            DZ dZ2 = b2[n3];
            ArrayList<Yka> arrayList3 = new ArrayList<Yka>();
            arrayList3.add(Ue.J(dZ2, kLa3, (int)a2));
            arrayList2.add(arrayList3);
            n4 = ++n3;
        }
        Kga kga2 = new Kga(arrayList, arrayList2, vRa.d != 0, vRa.d != 0, kLa3, ItemCameraTransforms.DEFAULT);
        return kga2;
    }

    public static RA J(String string, int n2) {
        int b2 = n2;
        String a2 = string;
        return Ue.J(Config.J().J().J(a2), b2);
    }

    /*
     * WARNING - void declaration
     */
    private static Yka J(DZ dZ2, KLa kLa2, int n2) {
        void b2;
        void a232;
        DZ dZ3 = dZ2;
        Vector3f vector3f = new Vector3f(JPa.N, JPa.N, JPa.N);
        Vector3f vector3f2 = new Vector3f(Yra.i, Yra.i, Yra.i);
        float[] fArray = new float[AQa.P];
        fArray[uSa.E] = JPa.N;
        fArray[vRa.d] = JPa.N;
        fArray[uqa.g] = Yra.i;
        fArray[yRa.d] = Yra.i;
        Enum c2 = new hJa(fArray, uSa.E);
        DZ dZ4 = dZ3;
        Rja a232 = new Rja(dZ4, (int)a232, uQa.Y + dZ4.getName(), (hJa)c2);
        c2 = AGa.X0_Y0;
        CLa cLa = null;
        boolean bl = uSa.E;
        boolean bl2 = vRa.d;
        return new LJa().J(vector3f, vector3f2, a232, (KLa)b2, dZ3, (AGa)c2, cLa, bl, bl2);
    }

    public Ue() {
        Ue a2;
    }
}

