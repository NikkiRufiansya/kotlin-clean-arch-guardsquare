package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.setLeftStripDrawable;
import o.setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public abstract class setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1<MessageType extends setLeftStripDrawable<MessageType, BuilderType>, BuilderType extends setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> implements setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0 {
    @Override // 
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public abstract BuilderType clone();

    protected abstract BuilderType MenuHostHelper$$ExternalSyntheticLambda1(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public BuilderType setY(setDrawingCacheQuality setdrawingcachequality) {
        if (!setIconSize().getClass().isInstance(setdrawingcachequality)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return (BuilderType) MenuHostHelper$$ExternalSyntheticLambda1((setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>) ((setLeftStripDrawable) setdrawingcachequality));
    }

    private static <T> void setIconTintList(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                StringBuilder sb = new StringBuilder("Element at index ");
                sb.append(list.size() - size);
                sb.append(" is null.");
                String obj = sb.toString();
                for (int size2 = list.size() - 1; size2 >= size; size2--) {
                    list.remove(size2);
                }
                throw new NullPointerException(obj);
            }
            list.add(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static setCloseIconContentDescription setIconTintList(setDrawingCacheQuality setdrawingcachequality) {
        return new setCloseIconContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void setX(Iterable<T> iterable, List<? super T> list) {
        setViewCacheExtension.setIconTintList(iterable);
        if (iterable instanceof ExecutorsRegistrar) {
            List<?> MenuHostHelper$$ExternalSyntheticLambda1 = ((ExecutorsRegistrar) iterable).MenuHostHelper$$ExternalSyntheticLambda1();
            ExecutorsRegistrar executorsRegistrar = (ExecutorsRegistrar) list;
            int size = list.size();
            for (Object obj : MenuHostHelper$$ExternalSyntheticLambda1) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder("Element at index ");
                    sb.append(executorsRegistrar.size() - size);
                    sb.append(" is null.");
                    String obj2 = sb.toString();
                    for (int size2 = executorsRegistrar.size() - 1; size2 >= size; size2--) {
                        executorsRegistrar.remove(size2);
                    }
                    throw new NullPointerException(obj2);
                } else if (obj instanceof setSpeed) {
                    executorsRegistrar.MenuHostHelper$$ExternalSyntheticLambda0((setSpeed) obj);
                } else {
                    executorsRegistrar.add((String) obj);
                }
            }
        } else if (iterable instanceof setAutofillId) {
            list.addAll((Collection) iterable);
        } else {
            setIconTintList(iterable, list);
        }
    }
}