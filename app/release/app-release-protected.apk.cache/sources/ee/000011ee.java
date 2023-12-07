package o;

import java.io.Closeable;
import java.util.Collection;
import o.C0557vz;

/* loaded from: classes.dex */
public final class vJ implements Closeable {
    public final int MenuHostHelper$$ExternalSyntheticLambda0;
    public final C0556vy MenuHostHelper$$ExternalSyntheticLambda1;
    final vB ViewPager$SavedState$1;
    public final vE setCenterIfNoTextEnabled;
    public final long setIconSize;
    public final vH setIconTintList;
    public C0540vj setLayoutAnimation;
    public final C0557vz setNavigationOnClickListener;
    final vJ setOnLongClickListener;
    public final long setTextAlignment;
    public final String setUiOptions;
    public final vJ setUnboundedRipple;
    public final vJ setX;
    final C0560wa setY;

    public vJ(vE vEVar, vB vBVar, String str, int i, C0556vy c0556vy, C0557vz c0557vz, vH vHVar, vJ vJVar, vJ vJVar2, vJ vJVar3, long j, long j2, C0560wa c0560wa) {
        pN.setY(vEVar, "");
        pN.setY(vBVar, "");
        pN.setY(str, "");
        pN.setY(c0557vz, "");
        this.setCenterIfNoTextEnabled = vEVar;
        this.ViewPager$SavedState$1 = vBVar;
        this.setUiOptions = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0556vy;
        this.setNavigationOnClickListener = c0557vz;
        this.setIconTintList = vHVar;
        this.setOnLongClickListener = vJVar;
        this.setX = vJVar2;
        this.setUnboundedRipple = vJVar3;
        this.setTextAlignment = j;
        this.setIconSize = j2;
        this.setY = c0560wa;
    }

    public static /* synthetic */ String setY(vJ vJVar, String str) {
        pN.setY(str, "");
        C0557vz c0557vz = vJVar.setNavigationOnClickListener;
        pN.setY(str, "");
        C0557vz.setX setx = C0557vz.setX;
        String y = C0557vz.setX.setY(c0557vz.setIconTintList, str);
        if (y != null) {
            return y;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vH vHVar = this.setIconTintList;
        if (vHVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        vHVar.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.ViewPager$SavedState$1);
        sb.append(", code=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", message=");
        sb.append(this.setUiOptions);
        sb.append(", url=");
        sb.append(this.setCenterIfNoTextEnabled.setLayoutAnimation);
        sb.append('}');
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public vJ MenuHostHelper$$ExternalSyntheticLambda0;
        public C0556vy MenuHostHelper$$ExternalSyntheticLambda1;
        public long setCenterIfNoTextEnabled;
        public long setIconSize;
        public int setIconTintList;
        public vB setLayoutAnimation;
        public vJ setNavigationOnClickListener;
        public C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener;
        public vE setTextAlignment;
        public vJ setUiOptions;
        public String setUnboundedRipple;
        public C0560wa setX;
        public vH setY;

        public setIconTintList() {
            this.setIconTintList = -1;
            this.setOnLongClickListener = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
        }

        public setIconTintList(vJ vJVar) {
            pN.setY(vJVar, "");
            this.setIconTintList = -1;
            this.setTextAlignment = vJVar.setCenterIfNoTextEnabled;
            this.setLayoutAnimation = vJVar.ViewPager$SavedState$1;
            this.setIconTintList = vJVar.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setUnboundedRipple = vJVar.setUiOptions;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = vJVar.MenuHostHelper$$ExternalSyntheticLambda1;
            C0557vz c0557vz = vJVar.setNavigationOnClickListener;
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
            C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz.setIconTintList);
            this.setOnLongClickListener = c0558vz$MenuHostHelper$$ExternalSyntheticLambda0;
            this.setY = vJVar.setIconTintList;
            this.setUiOptions = vJVar.setOnLongClickListener;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = vJVar.setX;
            this.setNavigationOnClickListener = vJVar.setUnboundedRipple;
            this.setIconSize = vJVar.setTextAlignment;
            this.setCenterIfNoTextEnabled = vJVar.setIconSize;
            this.setX = vJVar.setY;
        }

        public final setIconTintList setX(C0557vz c0557vz) {
            pN.setY(c0557vz, "");
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
            C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz.setIconTintList);
            this.setOnLongClickListener = c0558vz$MenuHostHelper$$ExternalSyntheticLambda0;
            return this;
        }

        public final vJ MenuHostHelper$$ExternalSyntheticLambda1() {
            int i = this.setIconTintList;
            if (!(i >= 0)) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.setIconTintList);
                throw new IllegalStateException(sb.toString().toString());
            }
            vE vEVar = this.setTextAlignment;
            if (vEVar == null) {
                throw new IllegalStateException("request == null".toString());
            }
            vB vBVar = this.setLayoutAnimation;
            if (vBVar == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.setUnboundedRipple;
            if (str != null) {
                return new vJ(vEVar, vBVar, str, i, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setOnLongClickListener.setX(), this.setY, this.setUiOptions, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setNavigationOnClickListener, this.setIconSize, this.setCenterIfNoTextEnabled, this.setX);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public static void MenuHostHelper$$ExternalSyntheticLambda0(String str, vJ vJVar) {
            if (vJVar != null) {
                if (!(vJVar.setIconTintList == null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".body != null");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if (!(vJVar.setOnLongClickListener == null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(".networkResponse != null");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                if (!(vJVar.setX == null)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(".cacheResponse != null");
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                if (vJVar.setUnboundedRipple == null) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString().toString());
            }
        }
    }
}