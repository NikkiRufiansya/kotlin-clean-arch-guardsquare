package androidx.lifecycle;

import o.registerIn;
import o.setCheckable;
import o.setItemInvoker;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements setCheckable {
    private final setItemInvoker MenuHostHelper$$ExternalSyntheticLambda0;
    private final setCheckable setIconTintList;

    public FullLifecycleObserverAdapter(setItemInvoker setiteminvoker, setCheckable setcheckable) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setiteminvoker;
        this.setIconTintList = setcheckable;
    }

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[registerIn.setX.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[registerIn.setX.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn.setX.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn.setX.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn.setX.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn.setX.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn.setX.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn.setX.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        switch (AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda1[setx.ordinal()]) {
            case 1:
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY(settouchdelegate);
                break;
            case 2:
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(settouchdelegate);
                break;
            case 3:
                this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(settouchdelegate);
                break;
            case 4:
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(settouchdelegate);
                break;
            case 5:
                this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(settouchdelegate);
                break;
            case 6:
                this.MenuHostHelper$$ExternalSyntheticLambda0.setX(settouchdelegate);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        setCheckable setcheckable = this.setIconTintList;
        if (setcheckable != null) {
            setcheckable.MenuHostHelper$$ExternalSyntheticLambda1(settouchdelegate, setx);
        }
    }
}