package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.hU;
import o.hU$MenuHostHelper$$ExternalSyntheticLambda0;
import o.hY;

/* loaded from: classes.dex */
public abstract class hU<MessageType extends hU<MessageType, BuilderType>, BuilderType extends hU$MenuHostHelper$$ExternalSyntheticLambda0<MessageType, BuilderType>> implements iJ {
    protected int memoizedHashCode = 0;

    @Override // o.iJ
    public final hY setChipCornerRadius() {
        try {
            hY$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = hY.MenuHostHelper$$ExternalSyntheticLambda1(setOnNavigationItemSelectedListener());
            setX(MenuHostHelper$$ExternalSyntheticLambda1.setX);
            if (MenuHostHelper$$ExternalSyntheticLambda1.setX.setUiOptions() == 0) {
                return new hY.setLayoutAnimation(MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(MenuHostHelper$$ExternalSyntheticLambda1("ByteString"), e);
        }
    }

    public final byte[] setLayoutAnimation() {
        try {
            byte[] bArr = new byte[setOnNavigationItemSelectedListener()];
            hX x = hX.setX(bArr);
            setX(x);
            if (x.setUiOptions() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(MenuHostHelper$$ExternalSyntheticLambda1("byte array"), e);
        }
    }

    int setNavigationOnClickListener() {
        throw new UnsupportedOperationException();
    }

    void setIconTintList(int i) {
        throw new UnsupportedOperationException();
    }

    public int MenuHostHelper$$ExternalSyntheticLambda0(iY iYVar) {
        int navigationOnClickListener = setNavigationOnClickListener();
        if (navigationOnClickListener == -1) {
            int x = iYVar.setX(this);
            setIconTintList(x);
            return x;
        }
        return navigationOnClickListener;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        StringBuilder sb = new StringBuilder("Serializing ");
        sb.append(getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static <T> void MenuHostHelper$$ExternalSyntheticLambda1(Iterable<T> iterable, List<? super T> list) {
        C0243ip.setIconTintList(iterable);
        if (iterable instanceof InterfaceC0249iv) {
            List<?> MenuHostHelper$$ExternalSyntheticLambda1 = ((InterfaceC0249iv) iterable).MenuHostHelper$$ExternalSyntheticLambda1();
            InterfaceC0249iv interfaceC0249iv = (InterfaceC0249iv) list;
            int size = list.size();
            for (Object obj : MenuHostHelper$$ExternalSyntheticLambda1) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder("Element at index ");
                    sb.append(interfaceC0249iv.size() - size);
                    sb.append(" is null.");
                    String obj2 = sb.toString();
                    for (int size2 = interfaceC0249iv.size() - 1; size2 >= size; size2--) {
                        interfaceC0249iv.remove(size2);
                    }
                    throw new NullPointerException(obj2);
                } else if (obj instanceof hY) {
                    interfaceC0249iv.MenuHostHelper$$ExternalSyntheticLambda0((hY) obj);
                } else {
                    interfaceC0249iv.add((String) obj);
                }
            }
        } else if (iterable instanceof iM) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb2 = new StringBuilder("Element at index ");
                    sb2.append(list.size() - size3);
                    sb2.append(" is null.");
                    String obj3 = sb2.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(obj3);
                }
                list.add(t);
            }
        }
    }
}