package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC0239il;
import o.iJ;
import o.il$MenuHostHelper$$ExternalSyntheticLambda1;
import o.jg;

/* renamed from: o.il  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0239il<MessageType extends AbstractC0239il<MessageType, BuilderType>, BuilderType extends il$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> extends hU<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0239il<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    int memoizedSerializedSize = -1;
    protected C0256jb unknownFields = C0256jb.MenuHostHelper$$ExternalSyntheticLambda0();

    /* renamed from: o.il$setIconTintList */
    /* loaded from: classes.dex */
    public enum setIconTintList {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected abstract Object setX(setIconTintList seticontintlist);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setCenterIfNoTextEnabled() {
        this.memoizedHashCode = 0;
    }

    public final BuilderType setZ() {
        return (BuilderType) setX(setIconTintList.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MessageType setMaxEms() {
        return (MessageType) setX(setIconTintList.NEW_MUTABLE_INSTANCE);
    }

    public String toString() {
        return iI.MenuHostHelper$$ExternalSyntheticLambda1(this, super.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return iU.setX().setIconTintList(getClass()).setY(this, (AbstractC0239il) obj);
        }
        return false;
    }

    public final <MessageType extends AbstractC0239il<MessageType, BuilderType>, BuilderType extends il$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> BuilderType setTextAlignment() {
        return (BuilderType) setX(setIconTintList.NEW_BUILDER);
    }

    @Override // o.iK
    public final boolean setTextScaleX() {
        return setX(this, true);
    }

    @Override // o.hU
    final int setNavigationOnClickListener() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.hU
    public final void setIconTintList(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    @Override // o.iJ
    public final void setX(hX hXVar) {
        C0230ib c0230ib;
        iY iconTintList = iU.setX().setIconTintList(getClass());
        if (hXVar.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            c0230ib = hXVar.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            c0230ib = new C0230ib(hXVar);
        }
        iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(this, c0230ib);
    }

    @Override // o.iJ
    public final int setOnNavigationItemSelectedListener() {
        return MenuHostHelper$$ExternalSyntheticLambda0(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object ViewPager$SavedState$1() {
        return setX(setIconTintList.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends AbstractC0239il<?, ?>> T setIconTintList(Class<T> cls) {
        AbstractC0239il<?, ?> abstractC0239il = defaultInstanceMap.get(cls);
        if (abstractC0239il == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0239il = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0239il == null) {
            abstractC0239il = (T) ((AbstractC0239il) ji.MenuHostHelper$$ExternalSyntheticLambda1(cls)).setX(setIconTintList.GET_DEFAULT_INSTANCE);
            if (abstractC0239il == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0239il);
        }
        return (T) abstractC0239il;
    }

    /* renamed from: o.il$setX */
    /* loaded from: classes.dex */
    static final class setX implements ij$MenuHostHelper$$ExternalSyntheticLambda0<setX> {
        final boolean MenuHostHelper$$ExternalSyntheticLambda1;
        final int setIconTintList;
        final boolean setX;
        final jg.setIconTintList setY;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            int i = ((setX) obj).setIconTintList;
            return 0;
        }

        @Override // o.ij$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setX() {
            return this.setIconTintList;
        }

        @Override // o.ij$MenuHostHelper$$ExternalSyntheticLambda0
        public final jg.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setY;
        }

        @Override // o.ij$MenuHostHelper$$ExternalSyntheticLambda0
        public final jg$MenuHostHelper$$ExternalSyntheticLambda1 setY() {
            throw null;
        }

        @Override // o.ij$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean setIconTintList() {
            return this.setX;
        }

        @Override // o.ij$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ij$MenuHostHelper$$ExternalSyntheticLambda0
        public final iJ.setY MenuHostHelper$$ExternalSyntheticLambda0(iJ.setY sety, iJ iJVar) {
            return ((il$MenuHostHelper$$ExternalSyntheticLambda1) sety).MenuHostHelper$$ExternalSyntheticLambda0((AbstractC0239il) iJVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object setY(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final <T extends AbstractC0239il<T, ?>> boolean setX(T t, boolean z) {
        byte byteValue = ((Byte) t.setX(setIconTintList.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = iU.setX().setIconTintList(t.getClass()).MenuHostHelper$$ExternalSyntheticLambda0(t);
        if (z) {
            t.setX(setIconTintList.SET_MEMOIZED_IS_INITIALIZED);
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* renamed from: o.il$setY */
    /* loaded from: classes.dex */
    public static class setY<T extends AbstractC0239il<T, ?>> extends hT<T> {
        private final T setY;

        public setY(T t) {
            this.setY = t;
        }
    }

    public static <T extends AbstractC0239il<?, ?>> void setY(Class<T> cls, T t) {
        t.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(cls, t);
    }

    @Override // o.iK
    public final /* synthetic */ iJ setIconSize() {
        return (AbstractC0239il) setX(setIconTintList.GET_DEFAULT_INSTANCE);
    }

    @Override // o.hU
    final int MenuHostHelper$$ExternalSyntheticLambda0(iY iYVar) {
        int x;
        int x2;
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            if (iYVar == null) {
                x2 = iU.setX().setIconTintList(getClass()).setX(this);
            } else {
                x2 = iYVar.setX(this);
            }
            if (x2 >= 0) {
                return x2;
            }
            StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
            sb.append(x2);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (iYVar == null) {
            x = iU.setX().setIconTintList(getClass()).setX(this);
        } else {
            x = iYVar.setX(this);
        }
        setIconTintList(x);
        return x;
    }

    public int hashCode() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return iU.setX().setIconTintList(getClass()).setY(this);
        }
        if (this.memoizedHashCode == 0) {
            this.memoizedHashCode = iU.setX().setIconTintList(getClass()).setY(this);
        }
        return this.memoizedHashCode;
    }

    @Override // o.iJ
    public final /* synthetic */ iJ.setY setAnimationFromJson() {
        return (il$MenuHostHelper$$ExternalSyntheticLambda1) setX(setIconTintList.NEW_BUILDER);
    }

    @Override // o.iJ
    public final /* synthetic */ iJ.setY setLayoutDirection() {
        return ((il$MenuHostHelper$$ExternalSyntheticLambda1) setX(setIconTintList.NEW_BUILDER)).MenuHostHelper$$ExternalSyntheticLambda0(this);
    }
}