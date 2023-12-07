package o;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public class readObject {
    private final AccessibilityRecord setY;

    public static void setY(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void setIconTintList(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.setY;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof readObject) {
            readObject readobject = (readObject) obj;
            AccessibilityRecord accessibilityRecord = this.setY;
            if (accessibilityRecord == null) {
                return readobject.setY == null;
            }
            return accessibilityRecord.equals(readobject.setY);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void setY(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }
}