package o;

import java.util.List;
import java.util.Map;
import o.setRightStripDrawable;

/* loaded from: classes.dex */
final class setImageTintBlendMode implements WindowInsetsCompat$Impl29 {
    private final setMenuPrepared setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setImageTintBlendMode(setMenuPrepared setmenuprepared) {
        setMenuPrepared setmenuprepared2 = (setMenuPrepared) setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(setmenuprepared, "output");
        this.setIconTintList = setmenuprepared2;
        setmenuprepared2.MenuHostHelper$$ExternalSyntheticLambda1 = this;
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final WindowInsetsCompat$Impl29$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList() {
        return WindowInsetsCompat$Impl29$MenuHostHelper$$ExternalSyntheticLambda0.ASCENDING;
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setY(int i, int i2) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i, i2);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setY(int i, long j) {
        this.setIconTintList.setX(i, j);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, long j) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i, j);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setY(int i, float f) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.floatToRawIntBits(f));
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setY(int i, double d) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i, Double.doubleToRawLongBits(d));
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        this.setIconTintList.setLayoutAnimation(i, i2);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setX(int i, long j) {
        this.setIconTintList.setX(i, j);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setX(int i, int i2) {
        this.setIconTintList.setLayoutAnimation(i, i2);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, long j) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i, j);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconTintList(int i, int i2) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i, i2);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconTintList(int i, boolean z) {
        this.setIconTintList.setX(i, z);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconTintList(int i, String str) {
        this.setIconTintList.setX(i, str);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setX(int i, setSpeed setspeed) {
        this.setIconTintList.setX(i, setspeed);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setOnLongClickListener(int i, int i2) {
        this.setIconTintList.setUiOptions(i, i2);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        this.setIconTintList.setUiOptions(i, (i2 << 1) ^ (i2 >> 31));
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconTintList(int i, long j) {
        this.setIconTintList.setX(i, (j << 1) ^ (j >> 63));
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setY(int i, Object obj, setValues setvalues) {
        this.setIconTintList.setY(i, (setDrawingCacheQuality) obj, setvalues);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconTintList(int i, Object obj, setValues setvalues) {
        setMenuPrepared setmenuprepared = this.setIconTintList;
        setmenuprepared.setOnLongClickListener(i, 3);
        setvalues.setY((setValues) ((setDrawingCacheQuality) obj), (WindowInsetsCompat$Impl29) setmenuprepared.MenuHostHelper$$ExternalSyntheticLambda1);
        setmenuprepared.setOnLongClickListener(i, 4);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        this.setIconTintList.setOnLongClickListener(i, 3);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setIconTintList.setOnLongClickListener(i, 4);
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, Object obj) {
        if (obj instanceof setSpeed) {
            this.setIconTintList.setY(i, (setSpeed) obj);
        } else {
            this.setIconTintList.setX(i, (setDrawingCacheQuality) obj);
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setOnLongClickListener(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += setMenuPrepared.setUnboundedRipple(list.get(i4).intValue());
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setZ(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.setLayoutAnimation(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setX(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setTextScaleX(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setNavigationOnClickListener(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(list.get(i4).longValue());
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setY(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.setX(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setTextAlignment(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += setMenuPrepared.setX(list.get(i4).longValue());
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setY(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.setX(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setIconTintList(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setUnboundedRipple(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += setMenuPrepared.setUnboundedRipple();
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setTextScaleX(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setY(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += setMenuPrepared.setIconTintList();
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setIconTintList(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconTintList(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += setMenuPrepared.setX(list.get(i4).intValue());
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setZ(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.setLayoutAnimation(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += setMenuPrepared.setX();
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.setX(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconTintList(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof ExecutorsRegistrar) {
            ExecutorsRegistrar executorsRegistrar = (ExecutorsRegistrar) list;
            while (i2 < list.size()) {
                Object iconTintList = executorsRegistrar.setIconTintList(i2);
                if (iconTintList instanceof String) {
                    this.setIconTintList.setX(i, (String) iconTintList);
                } else {
                    this.setIconTintList.setX(i, (setSpeed) iconTintList);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.setX(i, list.get(i2));
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setX(int i, List<setSpeed> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.setIconTintList.setX(i, list.get(i2));
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setCenterIfNoTextEnabled(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += setMenuPrepared.setCenterIfNoTextEnabled(list.get(i4).intValue());
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setAnimationFromJson(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.setUiOptions(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setLayoutAnimation(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += setMenuPrepared.setLayoutAnimation();
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setTextScaleX(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setUiOptions(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += setMenuPrepared.setOnLongClickListener();
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                this.setIconTintList.setIconTintList(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setChipCornerRadius(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += setMenuPrepared.setChipCornerRadius(list.get(i4).intValue());
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                setMenuPrepared setmenuprepared = this.setIconTintList;
                int intValue = list.get(i2).intValue();
                setmenuprepared.setAnimationFromJson((intValue << 1) ^ (intValue >> 31));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            setMenuPrepared setmenuprepared2 = this.setIconTintList;
            int intValue2 = list.get(i2).intValue();
            setmenuprepared2.setUiOptions(i, (intValue2 << 1) ^ (intValue2 >> 31));
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setIconSize(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i4).longValue());
            }
            this.setIconTintList.setAnimationFromJson(i3);
            while (i2 < list.size()) {
                setMenuPrepared setmenuprepared = this.setIconTintList;
                long longValue = list.get(i2).longValue();
                setmenuprepared.setY((longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            setMenuPrepared setmenuprepared2 = this.setIconTintList;
            long longValue2 = list.get(i2).longValue();
            setmenuprepared2.setX(i, (longValue2 << 1) ^ (longValue2 >> 63));
            i2++;
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void setX(int i, List<?> list, setValues setvalues) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.setIconTintList.setY(i, (setDrawingCacheQuality) list.get(i2), setvalues);
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<?> list, setValues setvalues) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            setIconTintList(i, list.get(i2), setvalues);
        }
    }

    @Override // o.WindowInsetsCompat$Impl29
    public final <K, V> void setY(int i, setRightStripDrawable.setY<K, V> sety, Map<K, V> map) {
        boolean z = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.setIconTintList.setOnLongClickListener(i, 2);
            this.setIconTintList.setAnimationFromJson(RemoteConfigRegistrar.setY(sety.setIconTintList, 1, entry.getKey()) + RemoteConfigRegistrar.setY(sety.setX, 2, entry.getValue()));
            setMenuPrepared setmenuprepared = this.setIconTintList;
            K key = entry.getKey();
            V value = entry.getValue();
            RemoteConfigRegistrar.setIconTintList(setmenuprepared, sety.setIconTintList, 1, key);
            RemoteConfigRegistrar.setIconTintList(setmenuprepared, sety.setX, 2, value);
        }
    }
}