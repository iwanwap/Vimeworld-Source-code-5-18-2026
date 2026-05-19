/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  ISa
 *  JPa
 *  MQa
 *  Ssa
 *  TJa
 *  Xja
 *  YSa
 *  dQa
 *  iJa
 *  kta
 *  mra
 *  pqa
 *  pua
 *  uKa
 *  vQa
 *  vRa
 */
package net.minecraft.client.renderer.block.model;

import org.lwjgl.util.vector.Vector3f;
import ru.obfuscator.KeepClassName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ItemCameraTransforms
implements D,
KeepClassName {
    public final iJa firstPerson;
    public final iJa gui;
    public static final ItemCameraTransforms DEFAULT = new ItemCameraTransforms();
    public final iJa ground;
    public final iJa thirdPerson;
    public final iJa fixed;
    public final iJa head;
    public final boolean isNewFormat;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void f(Xja xja2) {
        void a2;
        ItemCameraTransforms itemCameraTransforms = this;
        ItemCameraTransforms b2 = itemCameraTransforms.J((Xja)a2);
        switch (TJa.I[a2.ordinal()]) {
            case 1: {
                new iJa(new Vector3f(((iJa)b2).rotation.x + ISa.a, ((iJa)b2).rotation.y, ((iJa)b2).rotation.z + Hra.Ga), new Vector3f(-(((iJa)b2).translation.x * MQa.L), -(((iJa)b2).translation.z * MQa.L - dua.a), -(((iJa)b2).translation.y * MQa.L + Fsa.A)), new Vector3f(((iJa)b2).scale.x, ((iJa)b2).scale.y, ((iJa)b2).scale.z)).J();
                return;
            }
            case 2: {
                uKa.J((float)pua.e, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                new iJa(new Vector3f(((iJa)b2).rotation.x, ((iJa)b2).rotation.y, ((iJa)b2).rotation.z), new Vector3f(((iJa)b2).translation.x * MQa.L - dQa.r, ((iJa)b2).translation.y * MQa.L + Ssa.M, ((iJa)b2).translation.z * MQa.L + JPa.T), new Vector3f(((iJa)b2).scale.x, ((iJa)b2).scale.y, ((iJa)b2).scale.z)).J();
                return;
            }
            case 3: {
                uKa.J((float)pua.e, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                uKa.J((float)NSa.B, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                new iJa(new Vector3f(((iJa)b2).rotation.x, ((iJa)b2).rotation.y + Hra.Ga, ((iJa)b2).rotation.z), new Vector3f(-((iJa)b2).translation.x * vQa.m, ((iJa)b2).translation.y * vQa.m, ((iJa)b2).translation.z), new Vector3f(((iJa)b2).scale.x / mra.Ka, ((iJa)b2).scale.y / mra.Ka, ((iJa)b2).scale.z / mra.Ka)).J();
                return;
            }
            case 4: {
                new iJa(new Vector3f(((iJa)b2).rotation.x, ((iJa)b2).rotation.y, ((iJa)b2).rotation.z), new Vector3f(((iJa)b2).translation.x * kta.v, ((iJa)b2).translation.y * kta.v, ((iJa)b2).translation.z * kta.v), new Vector3f(((iJa)b2).scale.x * YSa.G, ((iJa)b2).scale.y * YSa.G, ((iJa)b2).scale.z * YSa.G)).J();
                return;
            }
            case 5: {
                new iJa(new Vector3f(((iJa)b2).rotation.x, ((iJa)b2).rotation.y, ((iJa)b2).rotation.z), new Vector3f(((iJa)b2).translation.x, ((iJa)b2).translation.y, ((iJa)b2).translation.z), new Vector3f(((iJa)b2).scale.x * kta.v, ((iJa)b2).scale.y * kta.v, ((iJa)b2).scale.z * kta.v)).J();
                return;
            }
        }
        b2.J();
    }

    /*
     * Enabled aggressive block sorting
     */
    public iJa J(Xja xja2) {
        ItemCameraTransforms b2 = xja2;
        ItemCameraTransforms a2 = this;
        switch (TJa.I[b2.ordinal()]) {
            case 1: {
                return a2.thirdPerson;
            }
            case 2: {
                return a2.firstPerson;
            }
            case 6: {
                return a2.head;
            }
            case 3: {
                return a2.gui;
            }
            case 4: {
                return a2.ground;
            }
            case 5: {
                return a2.fixed;
            }
        }
        return iJa.DEFAULT;
    }

    public ItemCameraTransforms(ItemCameraTransforms itemCameraTransforms) {
        ItemCameraTransforms a2;
        ItemCameraTransforms b2 = itemCameraTransforms;
        ItemCameraTransforms itemCameraTransforms2 = a2 = this;
        ItemCameraTransforms itemCameraTransforms3 = b2;
        ItemCameraTransforms itemCameraTransforms4 = a2;
        ItemCameraTransforms itemCameraTransforms5 = b2;
        a2.thirdPerson = itemCameraTransforms5.thirdPerson;
        itemCameraTransforms4.firstPerson = itemCameraTransforms5.firstPerson;
        itemCameraTransforms4.head = b2.head;
        a2.gui = itemCameraTransforms3.gui;
        itemCameraTransforms2.ground = itemCameraTransforms3.ground;
        itemCameraTransforms2.fixed = b2.fixed;
        itemCameraTransforms2.isNewFormat = uSa.E;
    }

    public boolean J(Xja xja2) {
        ItemCameraTransforms a2 = this;
        ItemCameraTransforms b2 = xja2;
        if (!a2.J((Xja)b2).equals((Object)iJa.DEFAULT)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public ItemCameraTransforms(iJa iJa2, iJa iJa3, iJa iJa4, iJa iJa5, iJa iJa6, iJa iJa7, boolean bl) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        ItemCameraTransforms a2;
        boolean bl2 = bl;
        ItemCameraTransforms itemCameraTransforms = a2 = this;
        ItemCameraTransforms itemCameraTransforms2 = a2;
        ItemCameraTransforms itemCameraTransforms3 = a2;
        a2.thirdPerson = g2;
        itemCameraTransforms3.firstPerson = f2;
        itemCameraTransforms3.head = e2;
        itemCameraTransforms2.gui = d2;
        itemCameraTransforms2.ground = c2;
        itemCameraTransforms.fixed = b2;
        itemCameraTransforms.isNewFormat = h2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xja xja2) {
        void a2;
        ItemCameraTransforms itemCameraTransforms;
        ItemCameraTransforms itemCameraTransforms2 = itemCameraTransforms = this;
        ItemCameraTransforms b2 = itemCameraTransforms2.J((Xja)a2);
        if (itemCameraTransforms2.isNewFormat) {
            itemCameraTransforms.f((Xja)a2);
            return;
        }
        if (b2 != iJa.DEFAULT) {
            b2.J();
        }
    }

    private ItemCameraTransforms() {
        a2(iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0);
        ItemCameraTransforms a2;
    }
}

