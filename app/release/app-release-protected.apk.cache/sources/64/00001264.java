package o;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.pY;
import o.wB;

/* loaded from: classes.dex */
public final class wB$MenuHostHelper$$ExternalSyntheticLambda1 implements wC$MenuHostHelper$$ExternalSyntheticLambda1, InterfaceC0376pj<nX> {
    final /* synthetic */ wB setIconTintList;
    private final wC setX;

    /* loaded from: classes.dex */
    public static final class setIconTintList extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ wB$MenuHostHelper$$ExternalSyntheticLambda1 ViewPager$SavedState$1;
        private /* synthetic */ pY.setX setChipCornerRadius;
        private /* synthetic */ pY$MenuHostHelper$$ExternalSyntheticLambda0 setLayoutAnimation;
        private /* synthetic */ wH setNavigationOnClickListener;
        private /* synthetic */ pY.setX setOnLongClickListener;
        private /* synthetic */ boolean setUiOptions;
        private /* synthetic */ String setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setIconTintList(String str, String str2, wB$MenuHostHelper$$ExternalSyntheticLambda1 wb_menuhosthelper__externalsyntheticlambda1, pY.setX setx, boolean z, wH wHVar, pY$MenuHostHelper$$ExternalSyntheticLambda0 py_menuhosthelper__externalsyntheticlambda0, pY.setX setx2) {
            super(str2, true);
            this.setUnboundedRipple = str;
            this.ViewPager$SavedState$1 = wb_menuhosthelper__externalsyntheticlambda1;
            this.setOnLongClickListener = setx;
            this.setUiOptions = z;
            this.setNavigationOnClickListener = wHVar;
            this.setLayoutAnimation = py_menuhosthelper__externalsyntheticlambda0;
            this.setChipCornerRadius = setx2;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            this.ViewPager$SavedState$1.setIconTintList.setUiOptions.setY(this.ViewPager$SavedState$1.setIconTintList, (wH) this.setOnLongClickListener.setX);
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class setX extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ int ViewPager$SavedState$1;
        private /* synthetic */ wB$MenuHostHelper$$ExternalSyntheticLambda1 setChipCornerRadius;
        private /* synthetic */ wF setLayoutAnimation;
        private /* synthetic */ List setNavigationOnClickListener;
        private /* synthetic */ wF setOnLongClickListener;
        private /* synthetic */ String setUiOptions;
        private /* synthetic */ boolean setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(String str, String str2, wF wFVar, wB$MenuHostHelper$$ExternalSyntheticLambda1 wb_menuhosthelper__externalsyntheticlambda1, wF wFVar2, int i, List list, boolean z) {
            super(str2, true);
            this.setUiOptions = str;
            this.setOnLongClickListener = wFVar;
            this.setChipCornerRadius = wb_menuhosthelper__externalsyntheticlambda1;
            this.setLayoutAnimation = wFVar2;
            this.ViewPager$SavedState$1 = i;
            this.setNavigationOnClickListener = list;
            this.setUnboundedRipple = z;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            wR unused;
            try {
                this.setChipCornerRadius.setIconTintList.setUiOptions.setY(this.setOnLongClickListener);
                return -1L;
            } catch (IOException e) {
                wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
                unused = wR.MenuHostHelper$$ExternalSyntheticLambda1;
                StringBuilder sb = new StringBuilder("Http2Connection.Listener failure for ");
                sb.append(this.setChipCornerRadius.setIconTintList.setY);
                wR.setX(sb.toString(), 4, e);
                try {
                    this.setOnLongClickListener.setX(EnumC0584wx.PROTOCOL_ERROR, e);
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setY extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ boolean setLayoutAnimation = false;
        private /* synthetic */ String setOnLongClickListener;
        private /* synthetic */ wH setUiOptions;
        private /* synthetic */ wB$MenuHostHelper$$ExternalSyntheticLambda1 setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(String str, String str2, wB$MenuHostHelper$$ExternalSyntheticLambda1 wb_menuhosthelper__externalsyntheticlambda1, boolean z, wH wHVar) {
            super(str2, true);
            this.setOnLongClickListener = str;
            this.setUnboundedRipple = wb_menuhosthelper__externalsyntheticlambda1;
            this.setUiOptions = wHVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0191 A[ORIG_RETURN, RETURN] */
        @Override // o.vR
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            /*
                Method dump skipped, instructions count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.wB$MenuHostHelper$$ExternalSyntheticLambda1.setY.MenuHostHelper$$ExternalSyntheticLambda1():long");
        }
    }

    public wB$MenuHostHelper$$ExternalSyntheticLambda1(wB wBVar, wC wCVar) {
        pN.setY(wCVar, "");
        this.setIconTintList = wBVar;
        this.setX = wCVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
     */
    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean r18, int r19, o.InterfaceC0607xr r20, int r21) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wB$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(boolean, int, o.xr, int):void");
    }

    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z, int i, List<C0581wu> list) {
        boolean z2;
        vV vVVar;
        pN.setY(list, "");
        if (wB.MenuHostHelper$$ExternalSyntheticLambda1(i)) {
            wB wBVar = this.setIconTintList;
            pN.setY(list, "");
            vW vWVar = wBVar.setIconSize;
            StringBuilder sb = new StringBuilder();
            sb.append(wBVar.setY);
            sb.append('[');
            sb.append(i);
            sb.append("] onHeaders");
            String obj = sb.toString();
            vWVar.setX(new wB.setOnLongClickListener(obj, obj, wBVar, i, list, z), 0L);
            return;
        }
        synchronized (this.setIconTintList) {
            wF MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                z2 = this.setIconTintList.setMinAndMaxProgress;
                if (z2) {
                    return;
                }
                if (i <= this.setIconTintList.setUnboundedRipple) {
                    return;
                }
                if (i % 2 == this.setIconTintList.setNavigationOnClickListener % 2) {
                    return;
                }
                wF wFVar = new wF(i, this.setIconTintList, false, z, vL.MenuHostHelper$$ExternalSyntheticLambda1(list));
                this.setIconTintList.setUnboundedRipple = i;
                this.setIconTintList.setTextAlignment.put(Integer.valueOf(i), wFVar);
                vVVar = this.setIconTintList.setChipIconTintResource;
                vW MenuHostHelper$$ExternalSyntheticLambda02 = vVVar.MenuHostHelper$$ExternalSyntheticLambda0();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.setIconTintList.setY);
                sb2.append('[');
                sb2.append(i);
                sb2.append("] onStream");
                String obj2 = sb2.toString();
                MenuHostHelper$$ExternalSyntheticLambda02.setX(new setX(obj2, obj2, wFVar, this, MenuHostHelper$$ExternalSyntheticLambda0, i, list, z), 0L);
                return;
            }
            nX nXVar = nX.setX;
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(vL.MenuHostHelper$$ExternalSyntheticLambda1(list), z);
        }
    }

    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setY(int i, EnumC0584wx enumC0584wx) {
        pN.setY(enumC0584wx, "");
        if (wB.MenuHostHelper$$ExternalSyntheticLambda1(i)) {
            wB wBVar = this.setIconTintList;
            pN.setY(enumC0584wx, "");
            vW vWVar = wBVar.setIconSize;
            StringBuilder sb = new StringBuilder();
            sb.append(wBVar.setY);
            sb.append('[');
            sb.append(i);
            sb.append("] onReset");
            String obj = sb.toString();
            vWVar.setX(new wB.setUiOptions(obj, obj, wBVar, i, enumC0584wx), 0L);
            return;
        }
        wF y = this.setIconTintList.setY(i);
        if (y != null) {
            y.MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx);
        }
    }

    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    public final void MenuHostHelper$$ExternalSyntheticLambda0(wH wHVar) {
        vW vWVar;
        pN.setY(wHVar, "");
        vWVar = this.setIconTintList.setAnimationFromJson;
        StringBuilder sb = new StringBuilder();
        sb.append(this.setIconTintList.setY);
        sb.append(" applyAndAckSettings");
        String obj = sb.toString();
        vWVar.setX(new setY(obj, obj, this, false, wHVar), 0L);
    }

    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setY(boolean z, final int i, final int i2) {
        vW vWVar;
        long j;
        long j2;
        if (!z) {
            vWVar = this.setIconTintList.setAnimationFromJson;
            StringBuilder sb = new StringBuilder();
            sb.append(this.setIconTintList.setY);
            sb.append(" ping");
            final String obj = sb.toString();
            vWVar.setX(new vR(obj) { // from class: o.wB$MenuHostHelper$$ExternalSyntheticLambda1$MenuHostHelper$$ExternalSyntheticLambda0
                private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;

                @Override // o.vR
                public final long MenuHostHelper$$ExternalSyntheticLambda1() {
                    wB wBVar = this.setIconTintList;
                    try {
                        wBVar.setTextScaleX.setY(true, i, i2);
                        return -1L;
                    } catch (IOException e) {
                        EnumC0584wx enumC0584wx = EnumC0584wx.PROTOCOL_ERROR;
                        wBVar.setIconTintList(enumC0584wx, enumC0584wx, e);
                        return -1L;
                    }
                }
            }, 0L);
            return;
        }
        synchronized (this.setIconTintList) {
            if (i == 1) {
                this.setIconTintList.setTextAppearanceResource++;
            } else if (i != 2) {
                if (i == 3) {
                    wB wBVar = this.setIconTintList;
                    j2 = wBVar.setMaxEms;
                    wBVar.setMaxEms = j2 + 1;
                    wB wBVar2 = this.setIconTintList;
                    if (wBVar2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    wBVar2.notifyAll();
                }
                nX nXVar = nX.setX;
            } else {
                wB wBVar3 = this.setIconTintList;
                j = wBVar3.setLayoutAnimation;
                wBVar3.setLayoutAnimation = j + 1;
            }
        }
    }

    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setX(int i, long j) {
        if (i == 0) {
            synchronized (this.setIconTintList) {
                this.setIconTintList.setCenterIfNoTextEnabled += j;
                wB wBVar = this.setIconTintList;
                if (wBVar != null) {
                    wBVar.notifyAll();
                    nX nXVar = nX.setX;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            return;
        }
        wF MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i);
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            synchronized (MenuHostHelper$$ExternalSyntheticLambda0) {
                MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple += j;
                if (j > 0) {
                    MenuHostHelper$$ExternalSyntheticLambda0.notifyAll();
                }
                nX nXVar2 = nX.setX;
            }
        }
    }

    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<C0581wu> list) {
        pN.setY(list, "");
        wB wBVar = this.setIconTintList;
        pN.setY(list, "");
        synchronized (wBVar) {
            if (wBVar.MenuHostHelper$$ExternalSyntheticLambda1.contains(Integer.valueOf(i))) {
                wBVar.setX(i, EnumC0584wx.PROTOCOL_ERROR);
                return;
            }
            wBVar.MenuHostHelper$$ExternalSyntheticLambda1.add(Integer.valueOf(i));
            vW vWVar = wBVar.setIconSize;
            StringBuilder sb = new StringBuilder();
            sb.append(wBVar.setY);
            sb.append('[');
            sb.append(i);
            sb.append("] onRequest");
            String obj = sb.toString();
            vWVar.setX(new wB.setNavigationOnClickListener(obj, obj, wBVar, i, list), 0L);
        }
    }

    @Override // o.wC$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setY(int i, EnumC0584wx enumC0584wx, C0610xu c0610xu) {
        int i2;
        wF[] wFVarArr;
        pN.setY(enumC0584wx, "");
        pN.setY(c0610xu, "");
        c0610xu.MenuHostHelper$$ExternalSyntheticLambda0();
        synchronized (this.setIconTintList) {
            Object[] array = this.setIconTintList.setTextAlignment.values().toArray(new wF[0]);
            if (array != null) {
                wFVarArr = (wF[]) array;
                this.setIconTintList.setMinAndMaxProgress = true;
                nX nXVar = nX.setX;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        for (wF wFVar : wFVarArr) {
            if (wFVar.MenuHostHelper$$ExternalSyntheticLambda1 > i && wFVar.MenuHostHelper$$ExternalSyntheticLambda0()) {
                wFVar.MenuHostHelper$$ExternalSyntheticLambda1(EnumC0584wx.REFUSED_STREAM);
                this.setIconTintList.setY(wFVar.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
    }

    @Override // o.InterfaceC0376pj
    public final /* synthetic */ nX setIconTintList() {
        EnumC0584wx enumC0584wx;
        EnumC0584wx enumC0584wx2;
        EnumC0584wx enumC0584wx3 = EnumC0584wx.INTERNAL_ERROR;
        EnumC0584wx enumC0584wx4 = EnumC0584wx.INTERNAL_ERROR;
        IOException iOException = null;
        try {
            try {
                wC wCVar = this.setX;
                wB$MenuHostHelper$$ExternalSyntheticLambda1 wb_menuhosthelper__externalsyntheticlambda1 = this;
                pN.setY(wb_menuhosthelper__externalsyntheticlambda1, "");
                if (wCVar.MenuHostHelper$$ExternalSyntheticLambda1) {
                    if (!wCVar.setY(true, wb_menuhosthelper__externalsyntheticlambda1)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                } else {
                    C0610xu MenuHostHelper$$ExternalSyntheticLambda0 = wCVar.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(C0586wz.setY.MenuHostHelper$$ExternalSyntheticLambda0());
                    Logger logger = wC.setX;
                    if (logger.isLoggable(Level.FINE)) {
                        StringBuilder sb = new StringBuilder("<< CONNECTION ");
                        sb.append(MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList());
                        logger.fine(vL.MenuHostHelper$$ExternalSyntheticLambda1(sb.toString(), new Object[0]));
                    }
                    if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(C0586wz.setY, MenuHostHelper$$ExternalSyntheticLambda0)) {
                        StringBuilder sb2 = new StringBuilder("Expected a connection header but was ");
                        String str = MenuHostHelper$$ExternalSyntheticLambda0.setX;
                        if (str == null) {
                            byte[] x = MenuHostHelper$$ExternalSyntheticLambda0.setX();
                            pN.setY(x, "");
                            String str2 = new String(x, qQ.setIconTintList);
                            MenuHostHelper$$ExternalSyntheticLambda0.setX = str2;
                            str = str2;
                        }
                        sb2.append(str);
                        throw new IOException(sb2.toString());
                    }
                }
                while (this.setX.setY(false, this)) {
                }
                enumC0584wx = EnumC0584wx.NO_ERROR;
                enumC0584wx2 = EnumC0584wx.CANCEL;
            } catch (IOException e) {
                iOException = e;
                enumC0584wx = EnumC0584wx.PROTOCOL_ERROR;
                enumC0584wx2 = EnumC0584wx.PROTOCOL_ERROR;
            }
            this.setIconTintList.setIconTintList(enumC0584wx, enumC0584wx2, iOException);
            vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
            return nX.setX;
        } catch (Throwable th) {
            this.setIconTintList.setIconTintList(enumC0584wx3, enumC0584wx4, null);
            vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
            throw th;
        }
    }
}