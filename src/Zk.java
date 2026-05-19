/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NN
 */
public final class Zk {
    public float m;
    public float C;
    public float i;
    public float M;
    public float k;
    public float j;
    public float J;
    public float A;
    public float I;

    public Zk(NN nN) {
        Zk zk2;
        Zk b2 = nN;
        Zk a2 = this;
        Zk zk3 = b2;
        Zk zk4 = a2;
        zk4.m = b2.getX();
        zk4.k = b2.getY();
        a2.C = zk3.getZ();
        if (zk3.hasScale()) {
            a2.M = a2.j = b2.getScale();
            a2.i = a2.j;
            zk2 = a2;
        } else {
            zk2 = a2;
            Zk zk5 = a2;
            Zk zk6 = b2;
            a2.i = zk6.getScaleX();
            zk5.M = zk6.getScaleY();
            zk5.j = b2.getScaleZ();
        }
        zk2.A = b2.getAngleX();
        Zk zk7 = a2;
        zk7.I = b2.getAngleY();
        zk7.J = b2.getAngleZ();
    }
}

