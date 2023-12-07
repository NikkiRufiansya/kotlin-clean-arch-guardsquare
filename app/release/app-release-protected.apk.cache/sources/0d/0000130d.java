package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Objects;
import javax.annotation.Nullable;
import o.C0619yc;
import o.InterfaceC0541vk;

/* loaded from: classes.dex */
public abstract class xV<ResponseT, ReturnT> extends yo<ReturnT> {
    private final xU<vH, ResponseT> MenuHostHelper$$ExternalSyntheticLambda1;
    private final InterfaceC0541vk.setY setX;
    private final C0625yi setY;

    @Nullable
    protected abstract ReturnT setIconTintList(xT<ResponseT> xTVar, Object[] objArr);

    public static <ResponseT> xU<vH, ResponseT> MenuHostHelper$$ExternalSyntheticLambda0(C0624yh c0624yh, Method method, Type type) {
        try {
            return c0624yh.MenuHostHelper$$ExternalSyntheticLambda1(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(method, e, "Unable to create converter for %s", type);
        }
    }

    public xV(C0625yi c0625yi, InterfaceC0541vk.setY sety, xU<vH, ResponseT> xUVar) {
        this.setY = c0625yi;
        this.setX = sety;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = xUVar;
    }

    @Override // o.yo
    @Nullable
    public final ReturnT MenuHostHelper$$ExternalSyntheticLambda1(Object[] objArr) {
        return setIconTintList(new C0618yb(this.setY, objArr, this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1), objArr);
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList<ResponseT> extends xV<ResponseT, Object> {
        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private final xQ<ResponseT, xT<ResponseT>> setIconTintList;

        public setIconTintList(C0625yi c0625yi, InterfaceC0541vk.setY sety, xU<vH, ResponseT> xUVar, xQ<ResponseT, xT<ResponseT>> xQVar) {
            super(c0625yi, sety, xUVar);
            this.setIconTintList = xQVar;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }

        @Override // o.xV
        protected final Object setIconTintList(xT<ResponseT> xTVar, Object[] objArr) {
            xT<ResponseT> MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(xTVar);
            oK oKVar = (oK) objArr[objArr.length - 1];
            try {
                C0444rx c0444rx = new C0444rx(oP.setY(oKVar), 1);
                C0444rx c0444rx2 = c0444rx;
                c0444rx2.setIconTintList((InterfaceC0377pk<? super Throwable, nX>) new C0619yc.setY(MenuHostHelper$$ExternalSyntheticLambda1));
                MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(new C0619yc.setIconTintList(c0444rx2));
                Object MenuHostHelper$$ExternalSyntheticLambda0 = c0444rx.MenuHostHelper$$ExternalSyntheticLambda0();
                if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
                    pN.setY(oKVar, "");
                }
                return MenuHostHelper$$ExternalSyntheticLambda0;
            } catch (Exception e) {
                return C0619yc.setX(e, oKVar);
            }
        }
    }

    public static <ResponseT, ReturnT> xQ<ResponseT, ReturnT> setX(C0624yh c0624yh, Method method, Type type, Annotation[] annotationArr) {
        try {
            Objects.requireNonNull(type, "returnType == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            int indexOf = c0624yh.MenuHostHelper$$ExternalSyntheticLambda0.indexOf(null) + 1;
            int size = c0624yh.MenuHostHelper$$ExternalSyntheticLambda0.size();
            for (int i = indexOf; i < size; i++) {
                xQ<ResponseT, ReturnT> xQVar = (xQ<ResponseT, ReturnT>) c0624yh.MenuHostHelper$$ExternalSyntheticLambda0.get(i).MenuHostHelper$$ExternalSyntheticLambda0(type, annotationArr);
                if (xQVar != null) {
                    return xQVar;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = c0624yh.MenuHostHelper$$ExternalSyntheticLambda0.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(c0624yh.MenuHostHelper$$ExternalSyntheticLambda0.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } catch (RuntimeException e) {
            throw C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(method, e, "Unable to create call adapter for %s", type);
        }
    }
}