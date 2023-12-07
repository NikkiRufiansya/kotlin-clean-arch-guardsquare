package o;

import android.util.Log;
import java.io.IOException;
import java.net.ProtocolException;
import o.lC;
import o.vJ;

/* renamed from: o.wa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560wa {
    public final C0561wb MenuHostHelper$$ExternalSyntheticLambda0;
    public final vZ MenuHostHelper$$ExternalSyntheticLambda1;
    public final AbstractC0549vs setIconTintList;
    public boolean setNavigationOnClickListener;
    public final C0563wd setX;
    public final InterfaceC0574wn setY;

    public C0560wa(vZ vZVar, AbstractC0549vs abstractC0549vs, C0561wb c0561wb, InterfaceC0574wn interfaceC0574wn) {
        pN.setY(vZVar, "");
        pN.setY(abstractC0549vs, "");
        pN.setY(c0561wb, "");
        pN.setY(interfaceC0574wn, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = vZVar;
        this.setIconTintList = abstractC0549vs;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0561wb;
        this.setY = interfaceC0574wn;
        this.setX = interfaceC0574wn.setIconTintList();
    }

    public final vJ.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        try {
            vJ.setIconTintList iconTintList = this.setY.setIconTintList(z);
            if (iconTintList != null) {
                pN.setY(this, "");
                iconTintList.setX = this;
            }
            return iconTintList;
        } catch (IOException e) {
            AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, e);
            setX(e);
            throw e;
        }
    }

    public final vH setY(vJ vJVar) {
        pN.setY(vJVar, "");
        try {
            String y = vJ.setY(vJVar, "Content-Type");
            long x = this.setY.setX(vJVar);
            setY sety = new setY(this, this.setY.MenuHostHelper$$ExternalSyntheticLambda1(vJVar), x);
            pN.setY(sety, "");
            return new C0575wo(y, x, new xB(sety));
        } catch (IOException e) {
            AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, e);
            setX(e);
            throw e;
        }
    }

    public final void setX(IOException iOException) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(iOException);
        C0563wd iconTintList = this.setY.setIconTintList();
        vZ vZVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        synchronized (iconTintList) {
            pN.setY(vZVar, "");
            if (iOException instanceof wJ) {
                if (((wJ) iOException).setIconTintList == EnumC0584wx.REFUSED_STREAM) {
                    int i = iconTintList.setOnLongClickListener + 1;
                    iconTintList.setOnLongClickListener = i;
                    if (i > 1) {
                        iconTintList.setLayoutAnimation = true;
                        iconTintList.setIconSize++;
                    }
                } else if (((wJ) iOException).setIconTintList != EnumC0584wx.CANCEL || !vZVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                    iconTintList.setLayoutAnimation = true;
                    iconTintList.setIconSize++;
                }
            } else {
                if (!(iconTintList.setY != null) || (iOException instanceof C0583ww)) {
                    iconTintList.setLayoutAnimation = true;
                    if (iconTintList.setTextScaleX == 0) {
                        if (iOException != null) {
                            C0563wd.MenuHostHelper$$ExternalSyntheticLambda0(vZVar.setIconTintList, iconTintList.ViewPager$SavedState$1, iOException);
                        }
                        iconTintList.setIconSize++;
                    }
                }
            }
        }
    }

    public final <E extends IOException> E MenuHostHelper$$ExternalSyntheticLambda1(boolean z, boolean z2, E e) {
        if (e != null) {
            setX(e);
        }
        if (z2) {
            if (e != null) {
                AbstractC0549vs.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, e);
            } else {
                AbstractC0549vs.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        if (z) {
            if (e != null) {
                AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, e);
            } else {
                AbstractC0549vs.setUnboundedRipple(this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        return (E) this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this, z2, z, e);
    }

    /* renamed from: o.wa$setX */
    /* loaded from: classes.dex */
    public final class setX extends AbstractC0609xt {
        private final long MenuHostHelper$$ExternalSyntheticLambda0;
        private long MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setIconTintList;
        private /* synthetic */ C0560wa setX;
        private boolean setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(C0560wa c0560wa, xK xKVar, long j) {
            super(xKVar);
            pN.setY(xKVar, "");
            this.setX = c0560wa;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
        }

        @Override // o.AbstractC0609xt, o.xK
        public final void a_(C0602xo c0602xo, long j) {
            pN.setY(c0602xo, "");
            if (!(!this.setIconTintList)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (j2 != -1 && this.MenuHostHelper$$ExternalSyntheticLambda1 + j > j2) {
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                sb.append(" bytes but received ");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1 + j);
                throw new ProtocolException(sb.toString());
            }
            try {
                super.a_(c0602xo, j);
                this.MenuHostHelper$$ExternalSyntheticLambda1 += j;
            } catch (IOException e) {
                e = e;
                if (!this.setY) {
                    this.setY = true;
                    e = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(false, true, e);
                }
                throw e;
            }
        }

        @Override // o.AbstractC0609xt, o.xK, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                e = e;
                if (!this.setY) {
                    this.setY = true;
                    e = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(false, true, e);
                }
                throw e;
            }
        }

        @Override // o.AbstractC0609xt, o.xK, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.setIconTintList) {
                return;
            }
            this.setIconTintList = true;
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (j != -1 && this.MenuHostHelper$$ExternalSyntheticLambda1 != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                if (this.setY) {
                    return;
                }
                this.setY = true;
                this.setX.MenuHostHelper$$ExternalSyntheticLambda1(false, true, null);
            } catch (IOException e) {
                e = e;
                if (!this.setY) {
                    this.setY = true;
                    e = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(false, true, e);
                }
                throw e;
            }
        }
    }

    /* renamed from: o.wa$setY */
    /* loaded from: classes.dex */
    public final class setY extends AbstractC0608xs {
        private long MenuHostHelper$$ExternalSyntheticLambda0;
        private final long MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setIconTintList;
        private /* synthetic */ C0560wa setNavigationOnClickListener;
        private boolean setX;
        private boolean setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(C0560wa c0560wa, xJ xJVar, long j) {
            super(xJVar);
            pN.setY(xJVar, "");
            this.setNavigationOnClickListener = c0560wa;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
            this.setIconTintList = true;
            if (j == 0) {
                setX(null);
            }
        }

        @Override // o.AbstractC0608xs, o.xJ
        public final long setY(C0602xo c0602xo, long j) {
            pN.setY(c0602xo, "");
            if (!(!this.setY)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long y = setIconTintList().setY(c0602xo, j);
                if (this.setIconTintList) {
                    this.setIconTintList = false;
                    AbstractC0549vs abstractC0549vs = this.setNavigationOnClickListener.setIconTintList;
                    AbstractC0549vs.setOnLongClickListener(this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                if (y == -1) {
                    setX(null);
                    return -1L;
                }
                long j2 = this.MenuHostHelper$$ExternalSyntheticLambda0 + y;
                long j3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (j3 != -1 && j2 > j3) {
                    StringBuilder sb = new StringBuilder("expected ");
                    sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                    sb.append(" bytes but received ");
                    sb.append(j2);
                    throw new ProtocolException(sb.toString());
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = j2;
                if (j2 == j3) {
                    setX(null);
                }
                return y;
            } catch (IOException e) {
                throw setX(e);
            }
        }

        @Override // o.AbstractC0608xs, o.xJ, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.setY) {
                return;
            }
            this.setY = true;
            try {
                super.close();
                setX(null);
            } catch (IOException e) {
                throw setX(e);
            }
        }

        private <E extends IOException> E setX(E e) {
            if (this.setX) {
                return e;
            }
            this.setX = true;
            if (e == null && this.setIconTintList) {
                this.setIconTintList = false;
                AbstractC0549vs abstractC0549vs = this.setNavigationOnClickListener.setIconTintList;
                AbstractC0549vs.setOnLongClickListener(this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            return (E) this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(true, false, e);
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(long j, long j2) {
        String str;
        String str2;
        lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
        lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("Emulator Detected", "");
        lC.setY = "Emulator Detected";
        str = lC.setIconTintList;
        str2 = lC.setY;
        Log.d(str, str2);
    }
}