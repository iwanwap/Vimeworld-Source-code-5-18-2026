/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XM
 */
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Ib
extends MessageLiteOrBuilder {
    public boolean hasVisibility();

    public int getElementsCount();

    public XM getElements(int var1);

    public List<XM> getElementsList();

    public yl getVisibility();
}

