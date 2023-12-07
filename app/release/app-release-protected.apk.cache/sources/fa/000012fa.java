package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.xU;

/* loaded from: classes.dex */
public final class xP extends xU.setX {
    private boolean setIconTintList = true;

    @Override // o.xU.setX
    @Nullable
    public final xU<vH, ?> MenuHostHelper$$ExternalSyntheticLambda0(Type type, Annotation[] annotationArr, C0624yh c0624yh) {
        if (type == vH.class) {
            if (C0629ym.setY(annotationArr, yN.class)) {
                return setY.setY;
            }
            return setX.setX;
        } else if (type == Void.class) {
            return setUnboundedRipple.setY;
        } else {
            if (this.setIconTintList && type == nX.class) {
                try {
                    return setIconTintList.setX;
                } catch (NoClassDefFoundError unused) {
                    this.setIconTintList = false;
                    return null;
                }
            }
            return null;
        }
    }

    @Override // o.xU.setX
    @Nullable
    public final xU<?, vF> setY(Type type) {
        if (vF.class.isAssignableFrom(C0629ym.setIconTintList(type))) {
            return xP$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return null;
    }

    /* loaded from: classes.dex */
    static final class setUnboundedRipple implements xU<vH, Void> {
        static final setUnboundedRipple setY = new setUnboundedRipple();

        setUnboundedRipple() {
        }

        @Override // o.xU
        public final /* synthetic */ Void setY(vH vHVar) {
            vHVar.close();
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class setIconTintList implements xU<vH, nX> {
        static final setIconTintList setX = new setIconTintList();

        setIconTintList() {
        }

        @Override // o.xU
        public final /* synthetic */ nX setY(vH vHVar) {
            vHVar.close();
            return nX.setX;
        }
    }

    /* loaded from: classes.dex */
    static final class setY implements xU<vH, vH> {
        static final setY setY = new setY();

        setY() {
        }

        @Override // o.xU
        public final /* bridge */ /* synthetic */ vH setY(vH vHVar) {
            return vHVar;
        }
    }

    /* loaded from: classes.dex */
    static final class setX implements xU<vH, vH> {
        static final setX setX = new setX();

        setX() {
        }

        @Override // o.xU
        public final /* synthetic */ vH setY(vH vHVar) {
            return setX(vHVar);
        }

        private static vH setX(vH vHVar) {
            try {
                return C0629ym.setY(vHVar);
            } finally {
                vHVar.close();
            }
        }
    }
}