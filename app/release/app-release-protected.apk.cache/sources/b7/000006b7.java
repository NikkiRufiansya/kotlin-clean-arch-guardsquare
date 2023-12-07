package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.C0497tw;
import o.lB;
import o.mA;
import o.nR;

/* loaded from: classes.dex */
final class lZ$setY extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
    private /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda0;
    private /* synthetic */ String setIconTintList;
    private /* synthetic */ setTitleMarginTop setX$781c81df;
    private int setY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lZ$setY(setTitleMarginTop settitlemargintop, String str, String str2, oK<? super lZ$setY> oKVar) {
        super(2, oKVar);
        this.setX$781c81df = settitlemargintop;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.setIconTintList = str2;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        return new lZ$setY(this.setX$781c81df, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList, oKVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.lZ$setY$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends AbstractC0368pb implements pB<InterfaceC0498tx<? super C0622yf<kT>>, Throwable, oK<? super nX>, Object> {
        private /* synthetic */ setTitleMarginTop setIconTintList$781c81df;
        private int setX;
        private /* synthetic */ Object setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(setTitleMarginTop settitlemargintop, oK<? super AnonymousClass4> oKVar) {
            super(3, oKVar);
            this.setIconTintList$781c81df = settitlemargintop;
        }

        @Override // o.pB
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0498tx<? super C0622yf<kT>> interfaceC0498tx, Throwable th, oK<? super nX> oKVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.setIconTintList$781c81df, oKVar);
            anonymousClass4.setY = th;
            return anonymousClass4.setY(nX.setX);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            if (!(obj instanceof nR.setX)) {
                Throwable th = (Throwable) this.setY;
                try {
                    Object[] objArr = {this.setIconTintList$781c81df};
                    Object obj2 = C0289md.setTextScaleX.get(-369857364);
                    if (obj2 == null) {
                        obj2 = ((Class) C0289md.setY((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ViewConfiguration.getDoubleTapTimeout() >> 16, 4 - Color.argb(0, 0, 0, 0))).getMethod("MenuHostHelper$$ExternalSyntheticLambda0", (Class) C0289md.setY((char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0') + 1, 4 - (ViewConfiguration.getScrollBarSize() >> 8)));
                        C0289md.setTextScaleX.put(-369857364, obj2);
                    }
                    tC tCVar = (tC) ((Method) obj2).invoke(null, objArr);
                    String message = th.getMessage();
                    tCVar.MenuHostHelper$$ExternalSyntheticLambda1(new mA$MenuHostHelper$$ExternalSyntheticLambda1(message != null ? message : ""));
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
        return new lZ$setY(this.setX$781c81df, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList, oKVar).setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        int i = this.setY;
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
                Object[] objArr = {this.setX$781c81df};
                Object obj2 = C0289md.setTextScaleX.get(1190711022);
                if (obj2 == null) {
                    obj2 = ((Class) C0289md.setY((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getTrimmedLength(""), 4 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("setIconTintList", (Class) C0289md.setY((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ViewConfiguration.getJumpTapTimeout() >> 16, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4));
                    C0289md.setTextScaleX.put(1190711022, obj2);
                }
                lB lBVar = (lB) ((Method) obj2).invoke(null, objArr);
                String str = this.MenuHostHelper$$ExternalSyntheticLambda0;
                String str2 = this.setIconTintList;
                this.setY = 1;
                obj = new C0500tz(new lB.setX(str2, lBVar, str, null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        final String str3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        final setTitleMarginTop settitlemargintop = this.setX$781c81df;
        this.setY = 2;
        if (new C0497tw.setIconTintList((InterfaceC0492tr) obj, new AnonymousClass4(this.setX$781c81df, null)).setIconTintList(new InterfaceC0498tx() { // from class: o.lZ$setY.5
            @Override // o.InterfaceC0498tx
            public final /* synthetic */ Object setIconTintList(Object obj3, oK oKVar) {
                C0622yf c0622yf = (C0622yf) obj3;
                int i2 = c0622yf.setX.MenuHostHelper$$ExternalSyntheticLambda0;
                int i3 = 1;
                char c = 0;
                long j = 0;
                if (200 <= i2 && 299 >= i2) {
                    String lowerCase = str3.toLowerCase(Locale.ROOT);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
                    if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, (Object) "general")) {
                        kT kTVar = (kT) c0622yf.setY;
                        List<kP> list = kTVar != null ? kTVar.data : null;
                        ArrayList arrayList = new ArrayList();
                        int i4 = 1190711022;
                        if (list != null) {
                            setTitleMarginTop settitlemargintop2 = settitlemargintop;
                            int i5 = 0;
                            for (T t : list) {
                                if (i5 >= 0) {
                                    kP kPVar = (kP) t;
                                    try {
                                        Object[] objArr2 = new Object[i3];
                                        objArr2[c] = settitlemargintop2;
                                        Object obj4 = C0289md.setTextScaleX.get(Integer.valueOf(i4));
                                        if (obj4 == null) {
                                            Class<?>[] clsArr = new Class[i3];
                                            clsArr[0] = (Class) C0289md.setY((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Gravity.getAbsoluteGravity(0, 0), 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                            obj4 = ((Class) C0289md.setY((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 3)).getMethod("setIconTintList", clsArr);
                                            C0289md.setTextScaleX.put(1190711022, obj4);
                                        }
                                        lB lBVar2 = (lB) ((Method) obj4).invoke(null, objArr2);
                                        String str4 = kPVar.uuid;
                                        pN.setY(str4, "");
                                        kP iconTintList = lBVar2.setX.setIconTintList(str4);
                                        try {
                                            if (iconTintList != null) {
                                                if (!(iconTintList.uuid.length() == 0)) {
                                                    continue;
                                                    arrayList.add(kPVar.uuid);
                                                    i5++;
                                                    i3 = 1;
                                                    c = 0;
                                                    j = 0;
                                                    i4 = 1190711022;
                                                }
                                            }
                                            Object[] objArr3 = {settitlemargintop2};
                                            Object obj5 = C0289md.setTextScaleX.get(1190711022);
                                            if (obj5 == null) {
                                                obj5 = ((Class) C0289md.setY((char) Gravity.getAbsoluteGravity(0, 0), (-1) - TextUtils.indexOf((CharSequence) "", '0'), ((byte) KeyEvent.getModifierMetaStateMask()) + 5)).getMethod("setIconTintList", (Class) C0289md.setY((char) Color.green(0), KeyEvent.getMaxKeyCode() >> 16, 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                C0289md.setTextScaleX.put(1190711022, obj5);
                                            }
                                            lB lBVar3 = (lB) ((Method) obj5).invoke(null, objArr3);
                                            pN.setY(kPVar, "");
                                            lBVar3.setX.setY(kPVar);
                                            arrayList.add(kPVar.uuid);
                                            i5++;
                                            i3 = 1;
                                            c = 0;
                                            j = 0;
                                            i4 = 1190711022;
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                } else {
                                    throw new ArithmeticException("Index overflow has happened.");
                                }
                            }
                        }
                        kM kMVar = new kM(arrayList, 1);
                        try {
                            Object[] objArr4 = {settitlemargintop};
                            Object obj6 = C0289md.setTextScaleX.get(1190711022);
                            if (obj6 == null) {
                                obj6 = ((Class) C0289md.setY((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3)).getMethod("setIconTintList", (Class) C0289md.setY((char) (ViewConfiguration.getLongPressTimeout() >> 16), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, View.resolveSizeAndState(0, 0, 0) + 4));
                                C0289md.setTextScaleX.put(1190711022, obj6);
                            }
                            lB lBVar4 = (lB) ((Method) obj6).invoke(null, objArr4);
                            pN.setY(kMVar, "");
                            lBVar4.setX.setIconTintList(kMVar);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    }
                    try {
                        Object[] objArr5 = {settitlemargintop};
                        Object obj7 = C0289md.setTextScaleX.get(-369857364);
                        if (obj7 == null) {
                            obj7 = ((Class) C0289md.setY((char) (Color.rgb(0, 0, 0) + 16777216), View.resolveSizeAndState(0, 0, 0), Color.green(0) + 4)).getMethod("MenuHostHelper$$ExternalSyntheticLambda0", (Class) C0289md.setY((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getMinimumFlingVelocity() >> 16, (ViewConfiguration.getPressedStateDuration() >> 16) + 4));
                            C0289md.setTextScaleX.put(-369857364, obj7);
                        }
                        tC tCVar = (tC) ((Method) obj7).invoke(null, objArr5);
                        kT kTVar2 = (kT) c0622yf.setY;
                        List<kP> list2 = kTVar2 != null ? kTVar2.data : null;
                        pN.setX(list2);
                        tCVar.MenuHostHelper$$ExternalSyntheticLambda1(new mA.setY(list2));
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                } else {
                    try {
                        Object[] objArr6 = {settitlemargintop};
                        Object obj8 = C0289md.setTextScaleX.get(-369857364);
                        if (obj8 == null) {
                            obj8 = ((Class) C0289md.setY((char) (ImageFormat.getBitsPerPixel(0) + 1), Color.alpha(0), 4 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("MenuHostHelper$$ExternalSyntheticLambda0", (Class) C0289md.setY((char) View.MeasureSpec.makeMeasureSpec(0, 0), AndroidCharacter.getMirror('0') - '0', 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                            C0289md.setTextScaleX.put(-369857364, obj8);
                        }
                        tC tCVar2 = (tC) ((Method) obj8).invoke(null, objArr6);
                        String str5 = c0622yf.setX.setUiOptions;
                        tCVar2.MenuHostHelper$$ExternalSyntheticLambda1(new mA$MenuHostHelper$$ExternalSyntheticLambda1(str5 != null ? str5 : ""));
                    } catch (Throwable th6) {
                        Throwable cause6 = th6.getCause();
                        if (cause6 != null) {
                            throw cause6;
                        }
                        throw th6;
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