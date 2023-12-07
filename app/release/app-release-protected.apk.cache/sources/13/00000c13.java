package o;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import o.setCropToPadding;
import o.setNumColumns;

/* loaded from: classes.dex */
public final class setHandwritingDelegatorCallback implements setElegantTextHeight<setCropToPadding> {
    public static final setHandwritingDelegatorCallback setY = new setHandwritingDelegatorCallback();
    private static final String setIconTintList = "preferences_pb";

    private setHandwritingDelegatorCallback() {
    }

    @Override // o.setElegantTextHeight
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(setCropToPadding setcroptopadding, OutputStream outputStream) {
        setNumColumns.setX iconTintList;
        Map<setCropToPadding.setY<?>, Object> y = setcroptopadding.setY();
        setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
        for (Map.Entry<setCropToPadding.setY<?>, Object> entry : y.entrySet()) {
            Object value = entry.getValue();
            String str = entry.getKey().setX;
            if (value instanceof Boolean) {
                iconTintList = setNumColumns.setX.setX().MenuHostHelper$$ExternalSyntheticLambda1(((Boolean) value).booleanValue()).setIconTintList();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            } else if (value instanceof Float) {
                iconTintList = setNumColumns.setX.setX().setIconTintList(((Number) value).floatValue()).setIconTintList();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            } else if (value instanceof Double) {
                iconTintList = setNumColumns.setX.setX().MenuHostHelper$$ExternalSyntheticLambda1(((Number) value).doubleValue()).setIconTintList();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            } else if (value instanceof Integer) {
                iconTintList = setNumColumns.setX.setX().MenuHostHelper$$ExternalSyntheticLambda0(((Number) value).intValue()).setIconTintList();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            } else if (value instanceof Long) {
                iconTintList = setNumColumns.setX.setX().setY(((Number) value).longValue()).setIconTintList();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            } else if (value instanceof String) {
                iconTintList = setNumColumns.setX.setX().MenuHostHelper$$ExternalSyntheticLambda0((String) value).setIconTintList();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            } else if (value instanceof Set) {
                iconTintList = setNumColumns.setX.setX().MenuHostHelper$$ExternalSyntheticLambda0(setNumColumns.setIconTintList.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1((Set) value)).setIconTintList();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            } else {
                throw new IllegalStateException(pN.MenuHostHelper$$ExternalSyntheticLambda0("PreferencesSerializer does not support type: ", (Object) value.getClass().getName()));
            }
            MenuHostHelper$$ExternalSyntheticLambda0.setX(str, iconTintList);
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList().setY(outputStream);
        return nX.setX;
    }

    public static String setX() {
        return setIconTintList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setElegantTextHeight
    public final Object setIconTintList(InputStream inputStream) {
        setNumColumns.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
        setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda02 = FragmentState$1.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(inputStream);
        setCropToPadding.setX[] setxArr = new setCropToPadding.setX[0];
        pN.setY(setxArr, "");
        setRepeatMode setrepeatmode = new setRepeatMode(null, false, 1);
        setCropToPadding.setX[] setxArr2 = (setCropToPadding.setX[]) Arrays.copyOf(setxArr, 0);
        pN.setY(setxArr2, "");
        if (!setrepeatmode.setIconTintList.get()) {
            for (setCropToPadding.setX setx : setxArr2) {
                setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setY);
            }
            Map unmodifiableMap = Collections.unmodifiableMap(MenuHostHelper$$ExternalSyntheticLambda02.preferences_);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableMap, "");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                setNumColumns.setX setx2 = (setNumColumns.setX) entry.getValue();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, "");
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setx2, "");
                setNumColumns.setX.setY MenuHostHelper$$ExternalSyntheticLambda1 = setNumColumns.setX.setY.MenuHostHelper$$ExternalSyntheticLambda1(setx2.valueCase_);
                switch (MenuHostHelper$$ExternalSyntheticLambda1 == null ? -1 : setHandwritingDelegatorCallback$MenuHostHelper$$ExternalSyntheticLambda1.setY[MenuHostHelper$$ExternalSyntheticLambda1.ordinal()]) {
                    case -1:
                        throw new FirebaseCommonLegacyRegistrar("Value case is null.");
                    case 0:
                    default:
                        throw new nU();
                    case 1:
                        pN.setY(str, "");
                        setCropToPadding.setY<?> sety = new setCropToPadding.setY<>(str);
                        Object valueOf = Boolean.valueOf(setx2.valueCase_ == 1 ? ((Boolean) setx2.value_).booleanValue() : false);
                        pN.setY(sety, "");
                        setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety, valueOf);
                        break;
                    case 2:
                        pN.setY(str, "");
                        setCropToPadding.setY<?> sety2 = new setCropToPadding.setY<>(str);
                        Object valueOf2 = Float.valueOf(setx2.valueCase_ == 2 ? ((Float) setx2.value_).floatValue() : 0.0f);
                        pN.setY(sety2, "");
                        setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety2, valueOf2);
                        break;
                    case 3:
                        pN.setY(str, "");
                        setCropToPadding.setY<?> sety3 = new setCropToPadding.setY<>(str);
                        Object valueOf3 = Double.valueOf(setx2.valueCase_ == 7 ? ((Double) setx2.value_).doubleValue() : 0.0d);
                        pN.setY(sety3, "");
                        setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety3, valueOf3);
                        break;
                    case 4:
                        pN.setY(str, "");
                        setCropToPadding.setY<?> sety4 = new setCropToPadding.setY<>(str);
                        Object valueOf4 = Integer.valueOf(setx2.valueCase_ == 3 ? ((Integer) setx2.value_).intValue() : 0);
                        pN.setY(sety4, "");
                        setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety4, valueOf4);
                        break;
                    case 5:
                        pN.setY(str, "");
                        setCropToPadding.setY<?> sety5 = new setCropToPadding.setY<>(str);
                        Object valueOf5 = Long.valueOf(setx2.valueCase_ == 4 ? ((Long) setx2.value_).longValue() : 0L);
                        pN.setY(sety5, "");
                        setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety5, valueOf5);
                        break;
                    case 6:
                        pN.setY(str, "");
                        setCropToPadding.setY<?> sety6 = new setCropToPadding.setY<>(str);
                        String str2 = setx2.valueCase_ == 5 ? (String) setx2.value_ : "";
                        pN.MenuHostHelper$$ExternalSyntheticLambda0(str2, "");
                        pN.setY(sety6, "");
                        setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety6, str2);
                        break;
                    case 7:
                        pN.setY(str, "");
                        setCropToPadding.setY<?> sety7 = new setCropToPadding.setY<>(str);
                        if (setx2.valueCase_ == 6) {
                            MenuHostHelper$$ExternalSyntheticLambda0 = (setNumColumns.setIconTintList) setx2.value_;
                        } else {
                            MenuHostHelper$$ExternalSyntheticLambda0 = setNumColumns.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
                        }
                        setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<String> setviewcacheextension_menuhosthelper__externalsyntheticlambda1 = MenuHostHelper$$ExternalSyntheticLambda0.strings_;
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setviewcacheextension_menuhosthelper__externalsyntheticlambda1, "");
                        Object unboundedRipple = C0348oi.setUnboundedRipple(setviewcacheextension_menuhosthelper__externalsyntheticlambda1);
                        pN.setY(sety7, "");
                        setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety7, unboundedRipple);
                        break;
                    case 8:
                        throw new FirebaseCommonLegacyRegistrar("Value not set.");
                }
            }
            return setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    @Override // o.setElegantTextHeight
    public final /* synthetic */ setCropToPadding setIconTintList() {
        return new setRepeatMode(null, true, 1);
    }
}