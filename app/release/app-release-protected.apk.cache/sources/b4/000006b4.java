package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import o.C0497tw;
import o.lB;
import o.mA;
import o.nR;

/* loaded from: classes.dex */
final class lZ$setIconTintList extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private /* synthetic */ setTitleMarginTop MenuHostHelper$$ExternalSyntheticLambda1$781c81df;
    private /* synthetic */ String setIconTintList;
    private /* synthetic */ String setX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lZ$setIconTintList(setTitleMarginTop settitlemargintop, String str, String str2, oK<? super lZ$setIconTintList> oKVar) {
        super(2, oKVar);
        this.MenuHostHelper$$ExternalSyntheticLambda1$781c81df = settitlemargintop;
        this.setX = str;
        this.setIconTintList = str2;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        return new lZ$setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1$781c81df, this.setX, this.setIconTintList, oKVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.lZ$setIconTintList$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC0368pb implements pB<InterfaceC0498tx<? super C0622yf<kT>>, Throwable, oK<? super nX>, Object> {
        private int setIconTintList;
        private /* synthetic */ setTitleMarginTop setX$781c81df;
        private /* synthetic */ Object setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(setTitleMarginTop settitlemargintop, oK<? super AnonymousClass1> oKVar) {
            super(3, oKVar);
            this.setX$781c81df = settitlemargintop;
        }

        @Override // o.pB
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0498tx<? super C0622yf<kT>> interfaceC0498tx, Throwable th, oK<? super nX> oKVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.setX$781c81df, oKVar);
            anonymousClass1.setY = th;
            return anonymousClass1.setY(nX.setX);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            if (!(obj instanceof nR.setX)) {
                Throwable th = (Throwable) this.setY;
                try {
                    Object[] objArr = {this.setX$781c81df};
                    Object obj2 = C0289md.setTextScaleX.get(496001663);
                    if (obj2 == null) {
                        obj2 = ((Class) C0289md.setY((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.getDefaultSize(0, 0), 4 - Color.argb(0, 0, 0, 0))).getMethod("setY", (Class) C0289md.setY((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16)));
                        C0289md.setTextScaleX.put(496001663, obj2);
                    }
                    tC tCVar = (tC) ((Method) obj2).invoke(null, objArr);
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    tCVar.MenuHostHelper$$ExternalSyntheticLambda1(new mA$MenuHostHelper$$ExternalSyntheticLambda1(message));
                    return nX.setX;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
        return new lZ$setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1$781c81df, this.setX, this.setIconTintList, oKVar).setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
                return nX.setX;
            } else if (obj instanceof nR.setX) {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
        } else if (obj instanceof nR.setX) {
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        } else {
            try {
                Object[] objArr = {this.MenuHostHelper$$ExternalSyntheticLambda1$781c81df};
                Object obj2 = C0289md.setTextScaleX.get(1190711022);
                if (obj2 == null) {
                    obj2 = ((Class) C0289md.setY((char) ((-1) - MotionEvent.axisFromString("")), ViewConfiguration.getKeyRepeatTimeout() >> 16, 4 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("setIconTintList", (Class) C0289md.setY((char) (Process.myPid() >> 22), ViewConfiguration.getMaximumFlingVelocity() >> 16, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3));
                    C0289md.setTextScaleX.put(1190711022, obj2);
                }
                lB lBVar = (lB) ((Method) obj2).invoke(null, objArr);
                String str = this.setX;
                String str2 = this.setIconTintList;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
                obj = new C0500tz(new lB.setX(str2, lBVar, str, null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        final setTitleMarginTop settitlemargintop = this.MenuHostHelper$$ExternalSyntheticLambda1$781c81df;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 2;
        if (new C0497tw.setIconTintList((InterfaceC0492tr) obj, new AnonymousClass1(this.MenuHostHelper$$ExternalSyntheticLambda1$781c81df, null)).setIconTintList(new InterfaceC0498tx() { // from class: o.lZ$setIconTintList.5
            @Override // o.InterfaceC0498tx
            public final /* synthetic */ Object setIconTintList(Object obj3, oK oKVar) {
                C0622yf c0622yf = (C0622yf) obj3;
                int i2 = c0622yf.setX.MenuHostHelper$$ExternalSyntheticLambda0;
                if (200 <= i2 && 299 >= i2) {
                    try {
                        Object[] objArr2 = {setTitleMarginTop.this};
                        Object obj4 = C0289md.setTextScaleX.get(496001663);
                        if (obj4 == null) {
                            obj4 = ((Class) C0289md.setY((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0), 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("setY", (Class) C0289md.setY((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ViewConfiguration.getMaximumFlingVelocity() >> 16, AndroidCharacter.getMirror('0') - ','));
                            C0289md.setTextScaleX.put(496001663, obj4);
                        }
                        tC tCVar = (tC) ((Method) obj4).invoke(null, objArr2);
                        kT kTVar = (kT) c0622yf.setY;
                        List<kP> list = kTVar != null ? kTVar.data : null;
                        pN.setX(list);
                        tCVar.MenuHostHelper$$ExternalSyntheticLambda1(new mA.setY(list));
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    try {
                        Object[] objArr3 = {setTitleMarginTop.this};
                        Object obj5 = C0289md.setTextScaleX.get(496001663);
                        if (obj5 == null) {
                            obj5 = ((Class) C0289md.setY((char) TextUtils.getCapsMode("", 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, (ViewConfiguration.getTapTimeout() >> 16) + 4)).getMethod("setY", (Class) C0289md.setY((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-16777216) - Color.rgb(0, 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3));
                            C0289md.setTextScaleX.put(496001663, obj5);
                        }
                        tC tCVar2 = (tC) ((Method) obj5).invoke(null, objArr3);
                        String str3 = c0622yf.setX.setUiOptions;
                        tCVar2.MenuHostHelper$$ExternalSyntheticLambda1(new mA$MenuHostHelper$$ExternalSyntheticLambda1(str3 != null ? str3 : ""));
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
                return nX.setX;
            }
        }, this) == oJVar) {
            return oJVar;
        }
        return nX.setX;
    }
}