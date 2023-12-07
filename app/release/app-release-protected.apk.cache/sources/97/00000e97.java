package o;

import android.content.Context;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class setPopupBackgroundDrawable implements InterfaceC0398qe<Context, setSecondaryProgressTintBlendMode<setCropToPadding>> {
    private final Object MenuHostHelper$$ExternalSyntheticLambda0;
    final String MenuHostHelper$$ExternalSyntheticLambda1;
    private volatile setSecondaryProgressTintBlendMode<setCropToPadding> setIconTintList;
    private final rU setUnboundedRipple;
    private final setTickMarkTintMode<setCropToPadding> setX;
    private final InterfaceC0377pk<Context, List<setDescendantFocusability<setCropToPadding>>> setY;

    /* JADX WARN: Multi-variable type inference failed */
    public setPopupBackgroundDrawable(String str, setTickMarkTintMode<setCropToPadding> settickmarktintmode, InterfaceC0377pk<? super Context, ? extends List<? extends setDescendantFocusability<setCropToPadding>>> interfaceC0377pk, rU rUVar) {
        pN.setY(str, "");
        pN.setY(interfaceC0377pk, "");
        pN.setY(rUVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setX = null;
        this.setY = interfaceC0377pk;
        this.setUnboundedRipple = rUVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Object();
    }

    @Override // o.InterfaceC0398qe
    public final /* bridge */ /* synthetic */ setSecondaryProgressTintBlendMode<setCropToPadding> MenuHostHelper$$ExternalSyntheticLambda1(Context context, InterfaceC0416qw interfaceC0416qw) {
        return MenuHostHelper$$ExternalSyntheticLambda12(context, (InterfaceC0416qw<?>) interfaceC0416qw);
    }

    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1  reason: avoid collision after fix types in other method */
    private setSecondaryProgressTintBlendMode<setCropToPadding> MenuHostHelper$$ExternalSyntheticLambda12(Context context, InterfaceC0416qw<?> interfaceC0416qw) {
        setSecondaryProgressTintBlendMode<setCropToPadding> setsecondaryprogresstintblendmode;
        pN.setY(context, "");
        pN.setY(interfaceC0416qw, "");
        setSecondaryProgressTintBlendMode<setCropToPadding> setsecondaryprogresstintblendmode2 = this.setIconTintList;
        if (setsecondaryprogresstintblendmode2 == null) {
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (this.setIconTintList == null) {
                    Context applicationContext = context.getApplicationContext();
                    setTabIndicatorFullWidth settabindicatorfullwidth = setTabIndicatorFullWidth.setIconTintList;
                    setTickMarkTintMode<setCropToPadding> settickmarktintmode = this.setX;
                    InterfaceC0377pk<Context, List<setDescendantFocusability<setCropToPadding>>> interfaceC0377pk = this.setY;
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) applicationContext, "");
                    this.setIconTintList = setTabIndicatorFullWidth.setX(settickmarktintmode, interfaceC0377pk.setX(applicationContext), this.setUnboundedRipple, new setX(applicationContext, this));
                }
                setsecondaryprogresstintblendmode = this.setIconTintList;
                pN.setX(setsecondaryprogresstintblendmode);
            }
            return setsecondaryprogresstintblendmode;
        }
        return setsecondaryprogresstintblendmode2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends pO implements InterfaceC0376pj<File> {
        final /* synthetic */ Context MenuHostHelper$$ExternalSyntheticLambda1;
        final /* synthetic */ setPopupBackgroundDrawable setIconTintList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setX(Context context, setPopupBackgroundDrawable setpopupbackgrounddrawable) {
            super(0);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
            this.setIconTintList = setpopupbackgrounddrawable;
        }

        @Override // o.InterfaceC0376pj
        public final /* synthetic */ File setIconTintList() {
            Context context = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
            String str = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setY(context, "");
            pN.setY(str, "");
            String MenuHostHelper$$ExternalSyntheticLambda0 = pN.MenuHostHelper$$ExternalSyntheticLambda0(str, (Object) ".preferences_pb");
            pN.setY(context, "");
            pN.setY(MenuHostHelper$$ExternalSyntheticLambda0, "");
            return new File(context.getApplicationContext().getFilesDir(), pN.MenuHostHelper$$ExternalSyntheticLambda0("datastore/", (Object) MenuHostHelper$$ExternalSyntheticLambda0));
        }
    }
}