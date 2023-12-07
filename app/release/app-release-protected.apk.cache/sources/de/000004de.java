package o;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class getClass {
    private static final int[] setX = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    static final setTickMarkTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setErrorEnabled();
    static final setTickMarkTintList setY = MenuHostHelper$$ExternalSyntheticLambda1();

    private static setTickMarkTintList MenuHostHelper$$ExternalSyntheticLambda1() {
        try {
            return (setTickMarkTintList) Class.forName("o.setEmojiCompatEnabled").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String setX(setFabAnchorMode<String, String> setfabanchormode, String str) {
        int size = setfabanchormode.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            if (str.equals(setfabanchormode.setX[i2 + 1])) {
                return (String) setfabanchormode.setX[i2];
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(setFabAnchorMode<String, String> setfabanchormode, setFabAnchorMode<String, View> setfabanchormode2) {
        for (int size = setfabanchormode.size() - 1; size >= 0; size--) {
            if (!setfabanchormode2.containsKey((String) setfabanchormode.setX[(size << 1) + 1])) {
                setfabanchormode.setIconTintList(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(setDropDownBackgroundResource setdropdownbackgroundresource, setDropDownBackgroundResource setdropdownbackgroundresource2, boolean z, setFabAnchorMode<String, View> setfabanchormode) {
        setIsHandwritingDelegate layoutDirection;
        if (z) {
            layoutDirection = setdropdownbackgroundresource2.setLayoutDirection();
        } else {
            layoutDirection = setdropdownbackgroundresource.setLayoutDirection();
        }
        if (layoutDirection != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = setfabanchormode == null ? 0 : setfabanchormode.size();
            for (int i = 0; i < size; i++) {
                int i2 = i << 1;
                arrayList2.add(setfabanchormode.setX[i2]);
                arrayList.add(setfabanchormode.setX[i2 + 1]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }
}