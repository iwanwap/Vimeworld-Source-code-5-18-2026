/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.ByteString;
import com.google.protobuf.CanIgnoreReturnValue;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.UnmodifiableLazyStringList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList
extends AbstractProtobufList<String>
implements LazyStringList,
RandomAccess {
    private static final LazyStringArrayList EMPTY_LIST = new LazyStringArrayList(false);
    @Deprecated
    public static final LazyStringList EMPTY = EMPTY_LIST;
    private final List<Object> list;

    public static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    public LazyStringArrayList() {
        this(10);
    }

    private LazyStringArrayList(boolean isMutable) {
        super(isMutable);
        this.list = Collections.emptyList();
    }

    public LazyStringArrayList(int initialCapacity) {
        this(new ArrayList<Object>(initialCapacity));
    }

    public LazyStringArrayList(LazyStringList from) {
        this.list = new ArrayList<Object>(from.size());
        this.addAll(from);
    }

    public LazyStringArrayList(List<String> from) {
        this(new ArrayList<Object>(from));
    }

    private LazyStringArrayList(ArrayList<Object> list) {
        this.list = list;
    }

    public LazyStringArrayList mutableCopyWithCapacity(int capacity) {
        if (capacity < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList<Object> newList = new ArrayList<Object>(capacity);
        newList.addAll(this.list);
        return new LazyStringArrayList(newList);
    }

    @Override
    public String get(int index) {
        Object o2 = this.list.get(index);
        if (o2 instanceof String) {
            return (String)o2;
        }
        if (o2 instanceof ByteString) {
            ByteString bs2 = (ByteString)o2;
            String s2 = bs2.toStringUtf8();
            if (bs2.isValidUtf8()) {
                this.list.set(index, s2);
            }
            return s2;
        }
        byte[] ba2 = (byte[])o2;
        String s3 = Internal.toStringUtf8(ba2);
        if (Internal.isValidUtf8(ba2)) {
            this.list.set(index, s3);
        }
        return s3;
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public String set(int index, String s2) {
        this.ensureIsMutable();
        Object o2 = this.list.set(index, s2);
        return LazyStringArrayList.asString(o2);
    }

    @Override
    public void add(int index, String element) {
        this.ensureIsMutable();
        this.list.add(index, element);
        ++this.modCount;
    }

    @Override
    private void add(int index, ByteString element) {
        this.ensureIsMutable();
        this.list.add(index, element);
        ++this.modCount;
    }

    @Override
    private void add(int index, byte[] element) {
        this.ensureIsMutable();
        this.list.add(index, element);
        ++this.modCount;
    }

    @Override
    @CanIgnoreReturnValue
    public boolean add(String element) {
        this.ensureIsMutable();
        this.list.add(element);
        ++this.modCount;
        return true;
    }

    @Override
    public void add(ByteString element) {
        this.ensureIsMutable();
        this.list.add(element);
        ++this.modCount;
    }

    @Override
    public void add(byte[] element) {
        this.ensureIsMutable();
        this.list.add(element);
        ++this.modCount;
    }

    @Override
    public boolean addAll(Collection<? extends String> c2) {
        return this.addAll(this.size(), c2);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c2) {
        this.ensureIsMutable();
        Collection<? extends String> collection = c2 instanceof LazyStringList ? ((LazyStringList)c2).getUnderlyingElements() : c2;
        boolean ret = this.list.addAll(index, collection);
        ++this.modCount;
        return ret;
    }

    @Override
    public boolean addAllByteString(Collection<? extends ByteString> values) {
        this.ensureIsMutable();
        boolean ret = this.list.addAll(values);
        ++this.modCount;
        return ret;
    }

    @Override
    public boolean addAllByteArray(Collection<byte[]> c2) {
        this.ensureIsMutable();
        boolean ret = this.list.addAll(c2);
        ++this.modCount;
        return ret;
    }

    @Override
    public String remove(int index) {
        this.ensureIsMutable();
        Object o2 = this.list.remove(index);
        ++this.modCount;
        return LazyStringArrayList.asString(o2);
    }

    @Override
    public void clear() {
        this.ensureIsMutable();
        this.list.clear();
        ++this.modCount;
    }

    @Override
    public Object getRaw(int index) {
        return this.list.get(index);
    }

    @Override
    public ByteString getByteString(int index) {
        Object o2 = this.list.get(index);
        ByteString b2 = LazyStringArrayList.asByteString(o2);
        if (b2 != o2) {
            this.list.set(index, b2);
        }
        return b2;
    }

    @Override
    public byte[] getByteArray(int index) {
        Object o2 = this.list.get(index);
        byte[] b2 = LazyStringArrayList.asByteArray(o2);
        if (b2 != o2) {
            this.list.set(index, b2);
        }
        return b2;
    }

    @Override
    public void set(int index, ByteString s2) {
        this.setAndReturn(index, s2);
    }

    private Object setAndReturn(int index, ByteString s2) {
        this.ensureIsMutable();
        return this.list.set(index, s2);
    }

    @Override
    public void set(int index, byte[] s2) {
        this.setAndReturn(index, s2);
    }

    private Object setAndReturn(int index, byte[] s2) {
        this.ensureIsMutable();
        return this.list.set(index, s2);
    }

    private static String asString(Object o2) {
        if (o2 instanceof String) {
            return (String)o2;
        }
        if (o2 instanceof ByteString) {
            return ((ByteString)o2).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[])o2);
    }

    private static ByteString asByteString(Object o2) {
        if (o2 instanceof ByteString) {
            return (ByteString)o2;
        }
        if (o2 instanceof String) {
            return ByteString.copyFromUtf8((String)o2);
        }
        return ByteString.copyFrom((byte[])o2);
    }

    private static byte[] asByteArray(Object o2) {
        if (o2 instanceof byte[]) {
            return (byte[])o2;
        }
        if (o2 instanceof String) {
            return Internal.toByteArray((String)o2);
        }
        return ((ByteString)o2).toByteArray();
    }

    @Override
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override
    public void mergeFrom(LazyStringList other) {
        this.ensureIsMutable();
        for (Object o2 : other.getUnderlyingElements()) {
            if (o2 instanceof byte[]) {
                byte[] b2 = (byte[])o2;
                this.list.add(Arrays.copyOf(b2, b2.length));
                continue;
            }
            this.list.add(o2);
        }
    }

    @Override
    public List<byte[]> asByteArrayList() {
        return new ByteArrayListView(this);
    }

    @Override
    public List<ByteString> asByteStringList() {
        return new ByteStringListView(this);
    }

    @Override
    public LazyStringList getUnmodifiableView() {
        if (this.isModifiable()) {
            return new UnmodifiableLazyStringList(this);
        }
        return this;
    }

    private static class ByteArrayListView
    extends AbstractList<byte[]>
    implements RandomAccess {
        private final LazyStringArrayList list;

        ByteArrayListView(LazyStringArrayList list) {
            this.list = list;
        }

        @Override
        public byte[] get(int index) {
            return this.list.getByteArray(index);
        }

        @Override
        public int size() {
            return this.list.size();
        }

        @Override
        public byte[] set(int index, byte[] s2) {
            Object o2 = this.list.setAndReturn(index, s2);
            ++this.modCount;
            return LazyStringArrayList.asByteArray(o2);
        }

        @Override
        public void add(int index, byte[] s2) {
            this.list.add(index, s2);
            ++this.modCount;
        }

        @Override
        public byte[] remove(int index) {
            String o2 = this.list.remove(index);
            ++this.modCount;
            return LazyStringArrayList.asByteArray(o2);
        }
    }

    private static class ByteStringListView
    extends AbstractList<ByteString>
    implements RandomAccess {
        private final LazyStringArrayList list;

        ByteStringListView(LazyStringArrayList list) {
            this.list = list;
        }

        @Override
        public ByteString get(int index) {
            return this.list.getByteString(index);
        }

        @Override
        public int size() {
            return this.list.size();
        }

        @Override
        public ByteString set(int index, ByteString s2) {
            Object o2 = this.list.setAndReturn(index, s2);
            ++this.modCount;
            return LazyStringArrayList.asByteString(o2);
        }

        @Override
        public void add(int index, ByteString s2) {
            this.list.add(index, s2);
            ++this.modCount;
        }

        @Override
        public ByteString remove(int index) {
            String o2 = this.list.remove(index);
            ++this.modCount;
            return LazyStringArrayList.asByteString(o2);
        }
    }
}

