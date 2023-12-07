package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class registerIn {
    AtomicReference<Object> setY = new AtomicReference<>();

    public abstract registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(setOnFlingListener setonflinglistener);

    public abstract void setY(setOnFlingListener setonflinglistener);

    /* loaded from: classes.dex */
    public enum setX {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static setX setIconTintList(registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
            int i = AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda0[registerin_menuhosthelper__externalsyntheticlambda1.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ON_PAUSE;
                }
                return ON_STOP;
            }
            return ON_DESTROY;
        }

        public static setX setY(registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
            int i = AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda0[registerin_menuhosthelper__externalsyntheticlambda1.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        return null;
                    }
                    return ON_CREATE;
                }
                return ON_RESUME;
            }
            return ON_START;
        }

        public static setX MenuHostHelper$$ExternalSyntheticLambda1(registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
            int i = AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda0[registerin_menuhosthelper__externalsyntheticlambda1.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ON_RESUME;
                }
                return ON_START;
            }
            return ON_CREATE;
        }

        public final registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1() {
            switch (AnonymousClass2.setX[ordinal()]) {
                case 1:
                case 2:
                    return registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED;
                case 3:
                case 4:
                    return registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED;
                case 5:
                    return registerIn$MenuHostHelper$$ExternalSyntheticLambda1.RESUMED;
                case 6:
                    return registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(" has no target state");
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.registerIn$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setX.values().length];
            setX = iArr;
            try {
                iArr[setX.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[setX.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[setX.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setX[setX.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setX[setX.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setX[setX.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setX[setX.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr2;
            try {
                iArr2[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }
}