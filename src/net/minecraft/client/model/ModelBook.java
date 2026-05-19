/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NQa
 *  NTa
 *  Oz
 *  cT
 *  jpa
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  vL
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelBook
extends ModelBase {
    public cT pagesLeft;
    public cT pagesRight;
    public cT coverLeft;
    public cT bookSpine;
    public cT flippingPageRight;
    public cT flippingPageLeft;
    public cT coverRight;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g2;
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelBook a2;
        float f9 = f7;
        ModelBook modelBook = a2 = this;
        modelBook.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelBook.coverRight.C((float)h2);
        modelBook.coverLeft.C((float)h2);
        modelBook.bookSpine.C((float)h2);
        modelBook.pagesRight.C((float)h2);
        modelBook.pagesLeft.C((float)h2);
        modelBook.flippingPageRight.C((float)h2);
        modelBook.flippingPageLeft.C((float)h2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void e2;
        void f8;
        void d2;
        float h2 = f2;
        ModelBook g2 = this;
        h2 = (Oz.d((float)(h2 * WRa.e)) * Nra.e + oQa.z) * d2;
        ModelBook modelBook = g2;
        modelBook.coverRight.rotateAngleY = pua.j + h2;
        modelBook.coverLeft.rotateAngleY = -h2;
        modelBook.pagesRight.rotateAngleY = h2;
        modelBook.pagesLeft.rotateAngleY = -h2;
        float f9 = h2;
        modelBook.flippingPageRight.rotateAngleY = f9 - f9 * kta.v * f8;
        float f10 = h2;
        modelBook.flippingPageLeft.rotateAngleY = f10 - f10 * kta.v * e2;
        modelBook.pagesRight.rotationPointX = Oz.d((float)h2);
        modelBook.pagesLeft.rotationPointX = Oz.d((float)h2);
        modelBook.flippingPageRight.rotationPointX = Oz.d((float)h2);
        modelBook.flippingPageLeft.rotationPointX = Oz.d((float)h2);
    }

    public ModelBook() {
        ModelBook a2;
        ModelBook modelBook = a2;
        ModelBook modelBook2 = a2;
        modelBook.coverRight = new cT((ModelBase)a2).f(uSa.E, uSa.E).J(NSa.b, CRa.M, JPa.N, uua.p, NTa.C, uSa.E);
        modelBook2.coverLeft = new cT((ModelBase)a2).f(ERa.C, uSa.E).J(JPa.N, CRa.M, JPa.N, uua.p, NTa.C, uSa.E);
        modelBook.pagesRight = new cT((ModelBase)a2).f(uSa.E, NTa.C).J(JPa.N, NQa.m, ERa.L, tTa.h, Yqa.i, vRa.d);
        modelBook.pagesLeft = new cT((ModelBase)a2).f(lqa.s, NTa.C).J(JPa.N, NQa.m, yta.n, tTa.h, Yqa.i, vRa.d);
        modelBook.flippingPageRight = new cT((ModelBase)a2).f(osa.c, NTa.C).J(JPa.N, NQa.m, JPa.N, tTa.h, Yqa.i, uSa.E);
        modelBook.flippingPageLeft = new cT((ModelBase)a2).f(osa.c, NTa.C).J(JPa.N, NQa.m, JPa.N, tTa.h, Yqa.i, uSa.E);
        modelBook.bookSpine = new cT((ModelBase)a2).f(lqa.s, uSa.E).J(vqa.T, CRa.M, JPa.N, uqa.g, NTa.C, uSa.E);
        modelBook.coverRight.J(JPa.N, JPa.N, vqa.T);
        modelBook.coverLeft.J(JPa.N, JPa.N, pqa.r);
        modelBook.bookSpine.rotateAngleY = jpa.f;
    }
}

