/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EU
 *  GS
 *  Oqa
 *  Tpa
 *  Ut
 *  ad
 *  kC
 *  vB
 *  vRa
 */
import java.awt.Color;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class wu_1
extends vB {
    private final eF I;

    public static boolean J(MiniDotItem a2) {
        if (a2.hideWithHelmet || a2.hideWithChestplate || a2.hideWithLeggings || a2.hideWithBoots || a2.collection == EU.WINTER || a2.collection == EU.SUMMER || a2.collection == EU.SPRING || a2.collection == EU.FALL) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public wu_1(MiniDotItem miniDotItem) {
        StringBuilder stringBuilder;
        void a2;
        wu_1 wu_12 = this;
        super(uSa.E, uSa.E, uSa.E, uSa.E, new Color(uSa.E, uSa.E, uSa.E, uSa.E), null);
        wu_1 wu_13 = wu_12;
        wu_13.I = new eF(Oqa.COLUMN, tTa.h, uSa.E != 0);
        StringBuilder b2 = new StringBuilder();
        if (a2.hideWithHelmet) {
            b2.append(Ut.HIDE_WITH_HELMET.getSymbol()).append(Tpa.E);
        }
        if (a2.hideWithChestplate) {
            b2.append(Ut.HIDE_WITH_CHESTPLATE.getSymbol()).append(Tpa.E);
        }
        if (a2.hideWithLeggings) {
            b2.append(Ut.HIDE_WITH_LEGGINGS.getSymbol()).append(Tpa.E);
        }
        if (a2.hideWithBoots) {
            b2.append(Ut.HIDE_WITH_BOOTS.getSymbol()).append(Tpa.E);
        }
        switch (GS.I[a2.collection.ordinal()]) {
            case 1: {
                Object object = b2;
                while (false) {
                }
                stringBuilder = object;
                ((StringBuilder)object).append(Ut.WINTER.getSymbol()).append(Tpa.E);
                break;
            }
            case 2: {
                Object object = b2;
                stringBuilder = object;
                ((StringBuilder)object).append(Ut.SUMMER.getSymbol()).append(Tpa.E);
                break;
            }
            case 3: {
                Object object = b2;
                stringBuilder = object;
                ((StringBuilder)object).append(Ut.SPRING.getSymbol()).append(Tpa.E);
                break;
            }
            case 4: {
                b2.append(Ut.FALL.getSymbol()).append(Tpa.E);
            }
            default: {
                stringBuilder = b2;
            }
        }
        stringBuilder.deleteCharAt(b2.lastIndexOf(Tpa.E));
        wu_12.I.f((ad)new kC(uSa.E, uSa.E, null, b2.toString(), Color.WHITE));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        wu_1 a2;
        int c2 = n3;
        wu_1 wu_12 = a2 = this;
        wu_1 wu_13 = a2;
        wu_13.J(wu_13.I.l());
        wu_13.f(wu_13.I.J());
        wu_13.I.C((double)a2.I);
        wu_12.I.l(a2.J);
        super.J((int)b2, c2);
        wu_12.I.J((int)b2, c2);
    }
}

