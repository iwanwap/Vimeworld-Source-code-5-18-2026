/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  vRa
 */
import java.util.ArrayList;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public final class fua_1 {
    private static final Random I = new Random();

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void J(float f2, float f3, float f4, float f5) {
        float d2 = f5;
        float a2 = f2;
        double d3 = I.nextDouble();
        double d4 = (double)a2 * d3;
        d3 = (double)a2 * (oua.i - d3);
        switch (I.nextInt(AQa.P)) {
            case 0: {
                void b2;
                void c2;
                GL11.glRotatef((float)d4, (float)c2, (float)b2, d2);
                GL11.glRotatef((float)d3, (float)c2, (float)b2, d2);
                return;
            }
            case 1: {
                void b2;
                void c2;
                GL11.glRotatef((float)d4, (float)c2, (float)b2, d2);
                GL11.glRotated(d3, (double)c2, (double)b2, d2);
                return;
            }
            case 2: {
                void b2;
                void c2;
                GL11.glRotated(d4, (double)c2, (double)b2, d2);
                GL11.glRotatef((float)d3, (float)c2, (float)b2, d2);
                return;
            }
            case 3: {
                void b2;
                void c2;
                GL11.glRotated(d4, (double)c2, (double)b2, d2);
                GL11.glRotated(d3, (double)c2, (double)b2, d2);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void f(double c2, double b2, double a2) {
        double d2 = I.nextDouble() * Bta.c + kTa.B;
        double d3 = I.nextDouble() * Bta.c + kTa.B;
        double d4 = I.nextDouble() * Bta.c + kTa.B;
        double d5 = d2 == aSa.V ? aSa.V : c2 / d2;
        double d6 = d3 == aSa.V ? aSa.V : b2 / d3;
        b2 = d4 == aSa.V ? aSa.V : a2 / d4;
        switch (I.nextInt(AQa.P)) {
            case 0: {
                GL11.glScalef((float)d2, (float)d3, (float)d4);
                GL11.glScalef((float)d5, (float)d6, (float)b2);
                return;
            }
            case 1: {
                GL11.glScalef((float)d2, (float)d3, (float)d4);
                GL11.glScaled(d5, d6, b2);
                return;
            }
            case 2: {
                GL11.glScaled(d2, d3, d4);
                GL11.glScalef((float)d5, (float)d6, (float)b2);
                return;
            }
            case 3: {
                GL11.glScaled(d2, d3, d4);
                GL11.glScaled(d5, d6, b2);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void J(double d2, double c2, double b2, double a2) {
        double d3 = I.nextDouble();
        double d4 = d2 * d3;
        d3 = d2 * (oua.i - d3);
        switch (I.nextInt(AQa.P)) {
            case 0: {
                GL11.glRotatef((float)d4, (float)c2, (float)b2, (float)a2);
                GL11.glRotatef((float)d3, (float)c2, (float)b2, (float)a2);
                return;
            }
            case 1: {
                GL11.glRotatef((float)d4, (float)c2, (float)b2, (float)a2);
                GL11.glRotated(d3, c2, b2, a2);
                return;
            }
            case 2: {
                GL11.glRotated(d4, c2, b2, a2);
                GL11.glRotatef((float)d3, (float)c2, (float)b2, (float)a2);
                return;
            }
            case 3: {
                GL11.glRotated(d4, c2, b2, a2);
                GL11.glRotated(d3, c2, b2, a2);
                return;
            }
        }
    }

    public static void J(int n2) {
        int n3;
        int n4;
        int n5 = n2;
        int a322 = Integer.bitCount(n5);
        if (a322 <= vRa.d) {
            GL11.glClear(n5);
            return;
        }
        if (a322 == uqa.g) {
            a322 = Integer.lowestOneBit(n5);
            int n6 = n5 ^ a322;
            if (I.nextBoolean()) {
                GL11.glClear(a322);
                GL11.glClear(n6);
                return;
            }
            GL11.glClear(n6);
            GL11.glClear(a322);
            return;
        }
        ArrayList<Integer> a322 = new ArrayList<Integer>();
        int n7 = n4 = n5;
        while (n7 != 0) {
            n3 = Integer.lowestOneBit(n4);
            a322.add(n3);
            n7 = n4 ^= n3;
        }
        if (a322.isEmpty()) {
            GL11.glClear(n5);
            return;
        }
        n3 = I.nextInt(a322.size());
        int a322 = (Integer)a322.get(n3);
        n4 = n5 ^ a322;
        if (I.nextBoolean()) {
            GL11.glClear(a322);
            GL11.glClear(n4);
            return;
        }
        GL11.glClear(n4);
        GL11.glClear(a322);
    }

    public fua_1() {
        fua_1 a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void J(double c2, double b2, double a2) {
        double d2 = I.nextDouble();
        double d3 = I.nextDouble();
        double d4 = I.nextDouble();
        double d5 = c2 * d2;
        double d6 = b2 * d3;
        double d7 = a2 * d4;
        d2 = c2 * (oua.i - d2);
        b2 *= oua.i - d3;
        a2 *= oua.i - d4;
        switch (I.nextInt(AQa.P)) {
            case 0: {
                GL11.glTranslatef((float)d5, (float)d6, (float)d7);
                GL11.glTranslatef((float)d2, (float)b2, (float)a2);
                return;
            }
            case 1: {
                GL11.glTranslatef((float)d5, (float)d6, (float)d7);
                GL11.glTranslated(d2, b2, a2);
                return;
            }
            case 2: {
                GL11.glTranslated(d5, d6, d7);
                GL11.glTranslatef((float)d2, (float)b2, (float)a2);
                return;
            }
            case 3: {
                GL11.glTranslated(d5, d6, d7);
                GL11.glTranslated(d2, b2, a2);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void f(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        double d2 = I.nextDouble() * Bta.c + kTa.B;
        double d3 = I.nextDouble() * Bta.c + kTa.B;
        double d4 = I.nextDouble() * Bta.c + kTa.B;
        double d5 = d2 == aSa.V ? aSa.V : (double)a2 / d2;
        double d6 = d3 == aSa.V ? aSa.V : (double)b2 / d3;
        double d7 = d4 == aSa.V ? aSa.V : (double)c2 / d4;
        switch (I.nextInt(AQa.P)) {
            case 0: {
                GL11.glScalef((float)d2, (float)d3, (float)d4);
                GL11.glScalef((float)d5, (float)d6, (float)d7);
                return;
            }
            case 1: {
                GL11.glScalef((float)d2, (float)d3, (float)d4);
                GL11.glScaled(d5, d6, d7);
                return;
            }
            case 2: {
                GL11.glScaled(d2, d3, d4);
                GL11.glScalef((float)d5, (float)d6, (float)d7);
                return;
            }
            case 3: {
                GL11.glScaled(d2, d3, d4);
                GL11.glScaled(d5, d6, d7);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void J(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        double d2 = I.nextDouble();
        double d3 = I.nextDouble();
        double d4 = I.nextDouble();
        double d5 = (double)a2 * d2;
        double d6 = (double)b2 * d3;
        double d7 = (double)c2 * d4;
        d2 = (double)a2 * (oua.i - d2);
        d3 = (double)b2 * (oua.i - d3);
        d4 = (double)c2 * (oua.i - d4);
        switch (I.nextInt(AQa.P)) {
            case 0: {
                GL11.glTranslatef((float)d5, (float)d6, (float)d7);
                GL11.glTranslatef((float)d2, (float)d3, (float)d4);
                return;
            }
            case 1: {
                GL11.glTranslatef((float)d5, (float)d6, (float)d7);
                GL11.glTranslated(d2, d3, d4);
                return;
            }
            case 2: {
                GL11.glTranslated(d5, d6, d7);
                GL11.glTranslatef((float)d2, (float)d3, (float)d4);
                return;
            }
            case 3: {
                GL11.glTranslated(d5, d6, d7);
                GL11.glTranslated(d2, d3, d4);
                return;
            }
        }
    }
}

