package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;

/* renamed from: o.ll  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272ll implements InterfaceC0276lp {
    private nF<kS> MenuHostHelper$$ExternalSyntheticLambda0;
    private nF<Context> MenuHostHelper$$ExternalSyntheticLambda1;
    private nF<String> setIconTintList;
    private nF<C0624yh> setLayoutAnimation;
    private nF<C0598xk> setNavigationOnClickListener;
    private nF<kO> setOnLongClickListener;
    private nF<vD> setUiOptions;
    private nF<SharedPreferences> setUnboundedRipple;
    private nF<C0627yk> setX;
    private nF<com.rmldemo.guardsquare.data.local.AppDatabase> setY;

    public /* synthetic */ C0272ll(C0280lt c0280lt, C0275lo c0275lo, byte b) {
        this(c0280lt, c0275lo);
    }

    private C0272ll(C0280lt c0280lt, C0275lo c0275lo) {
        this.setIconTintList = C0335nw.setX(new C0285ly(c0280lt));
        this.setX = C0335nw.setX(new C0284lx(c0280lt));
        nF<C0598xk> x = C0335nw.setX(new lz(c0280lt));
        this.setNavigationOnClickListener = x;
        nF<vD> x2 = C0335nw.setX(new C0283lw(c0280lt, x));
        this.setUiOptions = x2;
        nF<C0624yh> x3 = C0335nw.setX(new lE(c0280lt, this.setIconTintList, this.setX, x2));
        this.setLayoutAnimation = x3;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = C0335nw.setX(new C0279ls(c0280lt, x3));
        nF<Context> x4 = C0335nw.setX(new C0282lv(c0280lt));
        this.MenuHostHelper$$ExternalSyntheticLambda1 = x4;
        nF<com.rmldemo.guardsquare.data.local.AppDatabase> x5 = C0335nw.setX(new C0278lr(c0275lo, x4));
        this.setY = x5;
        this.setOnLongClickListener = C0335nw.setX(new C0281lu(c0275lo, x5));
        this.setUnboundedRipple = C0335nw.setX(new C0277lq(c0275lo, this.MenuHostHelper$$ExternalSyntheticLambda1));
    }

    /* renamed from: o.ll$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        public C0280lt MenuHostHelper$$ExternalSyntheticLambda0;
        public C0275lo setY;

        public /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
        }
    }

    @Override // o.InterfaceC0276lp
    public final void setX(lP lPVar) {
        lPVar.setError = new lB(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), this.setOnLongClickListener.setIconTintList());
    }

    @Override // o.InterfaceC0276lp
    public final void setIconTintList(lX lXVar) {
        lXVar.setTitleMarginEnd = this.setOnLongClickListener.setIconTintList();
    }

    @Override // o.InterfaceC0276lp
    public final void MenuHostHelper$$ExternalSyntheticLambda0(lW lWVar) {
        lWVar.FirebaseRemoteConfigKtxRegistrar = this.setUnboundedRipple.setIconTintList();
    }

    @Override // o.InterfaceC0276lp
    public final void MenuHostHelper$$ExternalSyntheticLambda0(C0288mc c0288mc) {
        try {
            Object[] objArr = {new lB(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), this.setOnLongClickListener.setIconTintList()), new mC(this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList())};
            Object obj = C0289md.setTextScaleX.get(2000437493);
            if (obj == null) {
                obj = ((Class) C0289md.setY((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Drawable.resolveOpacity(0, 0), 3 - ImageFormat.getBitsPerPixel(0))).getDeclaredConstructor(lB.class, mC.class);
                C0289md.setTextScaleX.put(2000437493, obj);
            }
            c0288mc.setTitleMarginEnd$781c81df = (setTitleMarginTop) ((Constructor) obj).newInstance(objArr);
            c0288mc.setError = this.setOnLongClickListener.setIconTintList();
            c0288mc.setTooltipText = this.setUnboundedRipple.setIconTintList();
            c0288mc.FirebaseRemoteConfigKtxRegistrar = new mC(this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // o.InterfaceC0276lp
    public final void setIconTintList(C0291mf c0291mf) {
        c0291mf.setTitleMarginEnd = this.setUnboundedRipple.setIconTintList();
    }

    @Override // o.InterfaceC0276lp
    public final void setIconTintList(C0295mj c0295mj) {
        c0295mj.FirebaseRemoteConfigKtxRegistrar = new C0304ms(new lB(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), this.setOnLongClickListener.setIconTintList()), new mC(this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()));
    }

    @Override // o.InterfaceC0276lp
    public final void setIconTintList(C0302mq c0302mq) {
        c0302mq.setTitleMarginEnd = this.setUnboundedRipple.setIconTintList();
    }

    @Override // o.InterfaceC0276lp
    public final void setIconTintList(C0309mx c0309mx) {
        c0309mx.setTitleMarginEnd = this.setUnboundedRipple.setIconTintList();
    }
}