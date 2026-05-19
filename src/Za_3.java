/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XM
 *  Zo
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Za_3
extends MessageLiteOrBuilder {
    public boolean getOverflow();

    public boolean hasMaskImagePath();

    public int getElementsCount();

    public List<XM> getElementsList();

    public String getMaskImagePath();

    public boolean hasScrollbarColor();

    public boolean hasScrollbarBackground();

    public boolean hasScrollSpeedMultiplier();

    public XM getMaskElement();

    public boolean hasScrollbar();

    public int getScrollbarValue();

    public XM getElements(int var1);

    public ByteString getMaskImagePathBytes();

    public Zo getScrollbar();

    public boolean hasOverflow();

    public int getMaskImageResource();

    public boolean hasMaskElement();

    public boolean getFixIterateHover();

    public int getScrollbarBackground();

    public float getScrollSpeedMultiplier();

    public boolean hasMaskImageResource();

    public boolean hasFixIterateHover();

    public PO getMaskImageCase();

    public int getScrollbarColor();
}

