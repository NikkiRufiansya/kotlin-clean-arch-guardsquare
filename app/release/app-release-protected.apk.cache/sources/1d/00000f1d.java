package o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.setScaleType;
import o.setStartIconContentDescription;
import o.setStateDescription;

/* loaded from: classes.dex */
final class setSaveFromParentEnabled extends setHovered<setStartIconContentDescription.setX> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final boolean setX(setDrawingCacheQuality setdrawingcachequality) {
        return setdrawingcachequality instanceof setStartIconContentDescription.setIconTintList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final RemoteConfigRegistrar<setStartIconContentDescription.setX> MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        return ((setStartIconContentDescription.setIconTintList) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final RemoteConfigRegistrar<setStartIconContentDescription.setX> setX(Object obj) {
        return ((setStartIconContentDescription.setIconTintList) obj).setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final <UT, UB> UB setY(setTranslateX settranslatex, Object obj, setStateDescription setstatedescription, RemoteConfigRegistrar<setStartIconContentDescription.setX> remoteConfigRegistrar, UB ub, LegacySavedStateHandleController$1<UT, UB> legacySavedStateHandleController$1) {
        Object valueOf;
        List list;
        ArrayList arrayList;
        setStartIconContentDescription.setY sety = (setStartIconContentDescription.setY) obj;
        int i = sety.setX.setX;
        if (sety.setX.MenuHostHelper$$ExternalSyntheticLambda1 && sety.setX.MenuHostHelper$$ExternalSyntheticLambda0) {
            switch (AnonymousClass4.setX[sety.setX.setIconTintList.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    settranslatex.setX(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    settranslatex.setOnLongClickListener(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    settranslatex.setNavigationOnClickListener(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    settranslatex.setMaxEms(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    settranslatex.setLayoutAnimation(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    settranslatex.setUnboundedRipple(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    settranslatex.MenuHostHelper$$ExternalSyntheticLambda0(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    settranslatex.MenuHostHelper$$ExternalSyntheticLambda1(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    settranslatex.setTextScaleX(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    settranslatex.setUiOptions(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    settranslatex.setCenterIfNoTextEnabled(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    settranslatex.setChipCornerRadius(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    settranslatex.setTextAlignment(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    settranslatex.setY(arrayList);
                    ub = (UB) setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(i, arrayList, sety.setX.setY, ub, legacySavedStateHandleController$1);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Type cannot be packed: ");
                    sb.append(sety.setX.setIconTintList);
                    throw new IllegalStateException(sb.toString());
            }
            remoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(sety.setX, arrayList);
        } else {
            if (sety.setX.setIconTintList == setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.ENUM) {
                int unboundedRipple = settranslatex.setUnboundedRipple();
                if (sety.setX.setY.MenuHostHelper$$ExternalSyntheticLambda0() == null) {
                    return (UB) setRotationX.setY(i, unboundedRipple, ub, legacySavedStateHandleController$1);
                }
                valueOf = Integer.valueOf(unboundedRipple);
            } else {
                switch (AnonymousClass4.setX[sety.setX.setIconTintList.ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(settranslatex.setX());
                        break;
                    case 2:
                        valueOf = Float.valueOf(settranslatex.setLayoutAnimation());
                        break;
                    case 3:
                        valueOf = Long.valueOf(settranslatex.setIconSize());
                        break;
                    case 4:
                        valueOf = Long.valueOf(settranslatex.setZ());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(settranslatex.setUnboundedRipple());
                        break;
                    case 6:
                        valueOf = Long.valueOf(settranslatex.setUiOptions());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(settranslatex.setNavigationOnClickListener());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(settranslatex.MenuHostHelper$$ExternalSyntheticLambda0());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(settranslatex.setTextScaleX());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(settranslatex.setTextAlignment());
                        break;
                    case 11:
                        valueOf = Long.valueOf(settranslatex.ViewPager$SavedState$1());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(settranslatex.setChipCornerRadius());
                        break;
                    case 13:
                        valueOf = Long.valueOf(settranslatex.setCenterIfNoTextEnabled());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = settranslatex.setY();
                        break;
                    case 16:
                        valueOf = settranslatex.setMaxEms();
                        break;
                    case 17:
                        valueOf = settranslatex.setX(sety.MenuHostHelper$$ExternalSyntheticLambda1.getClass(), setstatedescription);
                        break;
                    case 18:
                        valueOf = settranslatex.MenuHostHelper$$ExternalSyntheticLambda0(sety.MenuHostHelper$$ExternalSyntheticLambda1.getClass(), setstatedescription);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (sety.setX.MenuHostHelper$$ExternalSyntheticLambda1) {
                setStartIconContentDescription.setX setx = sety.setX;
                if (!setx.setY()) {
                    throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
                }
                RemoteConfigRegistrar.setX(setx.setX(), valueOf);
                Object obj2 = remoteConfigRegistrar.setX.get(setx);
                if (obj2 instanceof setIconEndPadding) {
                    setIconEndPadding seticonendpadding = (setIconEndPadding) obj2;
                    obj2 = seticonendpadding.MenuHostHelper$$ExternalSyntheticLambda0(seticonendpadding.setIconTintList);
                }
                if (obj2 == null) {
                    list = new ArrayList();
                    remoteConfigRegistrar.setX.put(setx, list);
                } else {
                    list = (List) obj2;
                }
                list.add(valueOf);
            } else {
                int i2 = AnonymousClass4.setX[sety.setX.setIconTintList.ordinal()];
                if (i2 == 17 || i2 == 18) {
                    Object obj3 = remoteConfigRegistrar.setX.get(sety.setX);
                    if (obj3 instanceof setIconEndPadding) {
                        setIconEndPadding seticonendpadding2 = (setIconEndPadding) obj3;
                        obj3 = seticonendpadding2.MenuHostHelper$$ExternalSyntheticLambda0(seticonendpadding2.setIconTintList);
                    }
                    if (obj3 != null) {
                        valueOf = ((setDrawingCacheQuality) obj3).setTextScaleX().setY((setDrawingCacheQuality) valueOf).MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                }
                remoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(sety.setX, valueOf);
            }
        }
        return ub;
    }

    /* renamed from: o.setSaveFromParentEnabled$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            setX = iArr;
            try {
                iArr[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                setX[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final int MenuHostHelper$$ExternalSyntheticLambda0(Map.Entry<?, ?> entry) {
        return ((setStartIconContentDescription.setX) entry.getKey()).setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, Map.Entry<?, ?> entry) {
        setStartIconContentDescription.setX setx = (setStartIconContentDescription.setX) entry.getKey();
        if (setx.MenuHostHelper$$ExternalSyntheticLambda1) {
            switch (AnonymousClass4.setX[setx.setIconTintList.ordinal()]) {
                case 1:
                    setRotationX.setY(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 2:
                    setRotationX.setUiOptions(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 3:
                    setRotationX.setUnboundedRipple(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 4:
                    setRotationX.setIconSize(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 5:
                    setRotationX.setOnLongClickListener(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 6:
                    setRotationX.setX(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 7:
                    setRotationX.MenuHostHelper$$ExternalSyntheticLambda1(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 8:
                    setRotationX.setIconTintList(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 9:
                    setRotationX.setTextAlignment(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 10:
                    setRotationX.setLayoutAnimation(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 11:
                    setRotationX.setNavigationOnClickListener(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 12:
                    setRotationX.setCenterIfNoTextEnabled(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 13:
                    setRotationX.setChipCornerRadius(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 14:
                    setRotationX.setOnLongClickListener(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                case 15:
                    setRotationX.setY(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29);
                    return;
                case 16:
                    setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    setRotationX.setY(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    setRotationX.setIconTintList(setx.setX, (List) entry.getValue(), windowInsetsCompat$Impl29, writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (AnonymousClass4.setX[setx.setIconTintList.ordinal()]) {
            case 1:
                windowInsetsCompat$Impl29.setY(setx.setX, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                windowInsetsCompat$Impl29.setY(setx.setX, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                windowInsetsCompat$Impl29.setY(setx.setX, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                windowInsetsCompat$Impl29.setX(setx.setX, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                windowInsetsCompat$Impl29.setX(setx.setX, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda0(setx.setX, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                windowInsetsCompat$Impl29.setIconTintList(setx.setX, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                windowInsetsCompat$Impl29.setIconTintList(setx.setX, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                windowInsetsCompat$Impl29.setOnLongClickListener(setx.setX, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                windowInsetsCompat$Impl29.setY(setx.setX, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(setx.setX, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(setx.setX, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                windowInsetsCompat$Impl29.setIconTintList(setx.setX, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                windowInsetsCompat$Impl29.setX(setx.setX, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                windowInsetsCompat$Impl29.setX(setx.setX, (setSpeed) entry.getValue());
                return;
            case 16:
                windowInsetsCompat$Impl29.setIconTintList(setx.setX, (String) entry.getValue());
                return;
            case 17:
                windowInsetsCompat$Impl29.setIconTintList(setx.setX, entry.getValue(), writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(entry.getValue().getClass()));
                return;
            case 18:
                windowInsetsCompat$Impl29.setY(setx.setX, entry.getValue(), writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTranslateX settranslatex, Object obj, setStateDescription setstatedescription, RemoteConfigRegistrar<setStartIconContentDescription.setX> remoteConfigRegistrar) {
        setStartIconContentDescription.setY sety = (setStartIconContentDescription.setY) obj;
        remoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(sety.setX, settranslatex.MenuHostHelper$$ExternalSyntheticLambda0(sety.MenuHostHelper$$ExternalSyntheticLambda1.getClass(), setstatedescription));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final void setX(setSpeed setspeed, Object obj, setStateDescription setstatedescription, RemoteConfigRegistrar<setStartIconContentDescription.setX> remoteConfigRegistrar) {
        setStartIconContentDescription.setY sety = (setStartIconContentDescription.setY) obj;
        setDrawingCacheQuality MenuHostHelper$$ExternalSyntheticLambda0 = sety.MenuHostHelper$$ExternalSyntheticLambda1.setZ().MenuHostHelper$$ExternalSyntheticLambda0();
        ByteBuffer wrap = ByteBuffer.wrap(setspeed.setIconTintList());
        if (wrap.hasArray()) {
            setScaleType.setIconTintList seticontintlist = new setScaleType.setIconTintList(wrap, true);
            writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0.getClass()).MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, seticontintlist, setstatedescription);
            remoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(sety.setX, MenuHostHelper$$ExternalSyntheticLambda0);
            if (seticontintlist.setIconTintList() != Integer.MAX_VALUE) {
                throw new setProgressDrawableTiled("Protocol message end-group tag did not match expected tag.");
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final Object setIconTintList(setStateDescription setstatedescription, setDrawingCacheQuality setdrawingcachequality, int i) {
        return setstatedescription.MenuHostHelper$$ExternalSyntheticLambda0.get(new setStateDescription.setY(setdrawingcachequality, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setHovered
    public final void setY(Object obj) {
        RemoteConfigRegistrar<setStartIconContentDescription.setX> remoteConfigRegistrar = ((setStartIconContentDescription.setIconTintList) obj).extensions;
        if (remoteConfigRegistrar.setIconTintList) {
            return;
        }
        remoteConfigRegistrar.setX.setIconTintList();
        remoteConfigRegistrar.setIconTintList = true;
    }
}