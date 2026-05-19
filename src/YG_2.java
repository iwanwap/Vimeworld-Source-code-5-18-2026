/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ki
 *  NTa
 *  YG
 *  eH
 *  gG
 *  ura
 *  vRa
 *  ysa
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class YG_2 {
    private BufferedImage M;
    private static final Executor k = Executors.newSingleThreadExecutor();
    private boolean j;
    private static final YG J = new YG_2();
    private Graphics2D A;
    private boolean I;

    private YG_2() {
        YG_2 a2;
        YG_2 yG_2 = a2;
        yG_2.f();
    }

    private void f() {
        YG_2 yG_2 = this;
        int a2 = ysa.s;
        if (yG_2.M != null) {
            a2 = yG_2.M.getWidth() * uqa.g;
        }
        if (a2 >= ura.V) {
            throw new RuntimeException(vTa.Da);
        }
        YG_2 yG_22 = yG_2;
        int n2 = a2;
        yG_22.M = new BufferedImage(n2, n2, uqa.g);
        yG_22.A = yG_22.M.createGraphics();
        yG_22.A.setBackground(new Color(osa.Ja, osa.Ja, osa.Ja, uSa.E));
        yG_22.A.setPaint(Color.WHITE);
        yG_22.J();
        yG_22.A.clearRect(uSa.E, uSa.E, yG_2.M.getWidth(), yG_2.M.getHeight());
    }

    private void J() {
        YG_2 a2;
        a2.A.setRenderingHint(RenderingHints.KEY_ANTIALIASING, a2.j ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        a2.A.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, a2.j ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        a2.A.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, a2.I ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    }

    public static void l(gG a2) {
        k.execute(eH.J((gG)a2));
    }

    public static /* synthetic */ void f(gG gG2) {
        gG gG3 = gG2;
        try {
            super.J(gG3);
            return;
        }
        catch (Exception a2) {
            OT.b.info(new StringBuilder().insert(3 & 4, xua.F).append(a2.getMessage()).toString());
            return;
        }
    }

    private void J(gG gG2) {
        int n2;
        YG_2 b2 = gG2;
        YG_2 a2 = this;
        if (a2.j != ((gG)b2).j.g || a2.I != ((gG)b2).j.M) {
            YG_2 yG_2 = a2;
            yG_2.j = ((gG)b2).j.g;
            yG_2.I = ((gG)b2).j.M;
            a2.J();
        }
        YG_2 yG_2 = b2;
        while (((gG)yG_2).J.I > a2.M.getWidth() || ((gG)b2).J.i > a2.M.getHeight()) {
            a2.f();
            yG_2 = b2;
        }
        int n3 = ((gG)b2).j.J();
        a2.A.drawGlyphVector(((gG)b2).k, n3 - ((gG)b2).I.x, n3 - ((gG)b2).I.y);
        int[] nArray = new int[((gG)b2).J.I * ((gG)b2).J.i];
        int n4 = n2 = uSa.E;
        while (n4 < ((gG)b2).J.i) {
            int n5 = n2;
            int n6 = n2 * ((gG)b2).J.I;
            a2.M.getRGB(uSa.E, n5, ((gG)b2).J.I, vRa.d, nArray, n6, ((gG)b2).J.I);
            n4 = ++n2;
        }
        YG_2 yG_22 = b2;
        ((gG)b2).j.D.add(new Ki(((gG)yG_22).J, ((gG)yG_22).A, nArray));
        a2.A.clearRect(uSa.E, uSa.E, Math.min(((gG)b2).J.I + NTa.C, a2.M.getWidth()), Math.min(((gG)b2).J.i + NTa.C, a2.M.getHeight()));
    }
}

