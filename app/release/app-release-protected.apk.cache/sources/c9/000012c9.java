package o;

import java.util.List;

/* renamed from: o.wp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576wp implements vw$MenuHostHelper$$ExternalSyntheticLambda1 {
    public final vE MenuHostHelper$$ExternalSyntheticLambda0;
    final C0560wa MenuHostHelper$$ExternalSyntheticLambda1;
    public final vZ setIconTintList;
    public final int setNavigationOnClickListener;
    private final List<InterfaceC0554vw> setOnLongClickListener;
    private int setUiOptions;
    private final int setUnboundedRipple;
    public final int setX;
    public final int setY;

    /* JADX WARN: Multi-variable type inference failed */
    public C0576wp(vZ vZVar, List<? extends InterfaceC0554vw> list, int i, C0560wa c0560wa, vE vEVar, int i2, int i3, int i4) {
        pN.setY(vZVar, "");
        pN.setY(list, "");
        pN.setY(vEVar, "");
        this.setIconTintList = vZVar;
        this.setOnLongClickListener = list;
        this.setUnboundedRipple = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0560wa;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = vEVar;
        this.setX = i2;
        this.setY = i3;
        this.setNavigationOnClickListener = i4;
    }

    public static /* synthetic */ C0576wp setIconTintList(C0576wp c0576wp, int i, C0560wa c0560wa, vE vEVar, int i2, int i3, int i4, int i5) {
        int i6 = (i5 & 1) != 0 ? c0576wp.setUnboundedRipple : i;
        C0560wa c0560wa2 = (i5 & 2) != 0 ? c0576wp.MenuHostHelper$$ExternalSyntheticLambda1 : c0560wa;
        vE vEVar2 = (i5 & 4) != 0 ? c0576wp.MenuHostHelper$$ExternalSyntheticLambda0 : vEVar;
        int i7 = (i5 & 8) != 0 ? c0576wp.setX : i2;
        int i8 = (i5 & 16) != 0 ? c0576wp.setY : i3;
        int i9 = (i5 & 32) != 0 ? c0576wp.setNavigationOnClickListener : i4;
        pN.setY(vEVar2, "");
        return new C0576wp(c0576wp.setIconTintList, c0576wp.setOnLongClickListener, i6, c0560wa2, vEVar2, i7, i8, i9);
    }

    @Override // o.vw$MenuHostHelper$$ExternalSyntheticLambda1
    public final InterfaceC0545vo setIconTintList() {
        C0560wa c0560wa = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return c0560wa != null ? c0560wa.setX : null;
    }

    @Override // o.vw$MenuHostHelper$$ExternalSyntheticLambda1
    public final InterfaceC0541vk setY() {
        return this.setIconTintList;
    }

    @Override // o.vw$MenuHostHelper$$ExternalSyntheticLambda1
    public final vE MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.vw$MenuHostHelper$$ExternalSyntheticLambda1
    public final vJ MenuHostHelper$$ExternalSyntheticLambda0(vE vEVar) {
        pN.setY(vEVar, "");
        if (!(this.setUnboundedRipple < this.setOnLongClickListener.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.setUiOptions++;
        C0560wa c0560wa = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (c0560wa != null) {
            if (!c0560wa.MenuHostHelper$$ExternalSyntheticLambda0.setY(vEVar.setLayoutAnimation)) {
                StringBuilder sb = new StringBuilder("network interceptor ");
                sb.append(this.setOnLongClickListener.get(this.setUnboundedRipple - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString().toString());
            }
            if (!(this.setUiOptions == 1)) {
                StringBuilder sb2 = new StringBuilder("network interceptor ");
                sb2.append(this.setOnLongClickListener.get(this.setUnboundedRipple - 1));
                sb2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        C0576wp iconTintList = setIconTintList(this, this.setUnboundedRipple + 1, null, vEVar, 0, 0, 0, 58);
        InterfaceC0554vw interfaceC0554vw = this.setOnLongClickListener.get(this.setUnboundedRipple);
        vJ x = interfaceC0554vw.setX(iconTintList);
        if (x == null) {
            StringBuilder sb3 = new StringBuilder("interceptor ");
            sb3.append(interfaceC0554vw);
            sb3.append(" returned null");
            throw new NullPointerException(sb3.toString());
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            if (!(this.setUnboundedRipple + 1 >= this.setOnLongClickListener.size() || iconTintList.setUiOptions == 1)) {
                StringBuilder sb4 = new StringBuilder("network interceptor ");
                sb4.append(interfaceC0554vw);
                sb4.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb4.toString().toString());
            }
        }
        if (x.setIconTintList != null) {
            return x;
        }
        StringBuilder sb5 = new StringBuilder("interceptor ");
        sb5.append(interfaceC0554vw);
        sb5.append(" returned a response with no body");
        throw new IllegalStateException(sb5.toString().toString());
    }
}