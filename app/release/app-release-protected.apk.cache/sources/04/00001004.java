package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class setSupportBackgroundTintList {
    public setDropDownBackgroundDrawable MenuHostHelper$$ExternalSyntheticLambda1;
    public final List<String> setIconTintList;

    public setSupportBackgroundTintList(String... strArr) {
        this.setIconTintList = Arrays.asList(strArr);
    }

    public setSupportBackgroundTintList(setSupportBackgroundTintList setsupportbackgroundtintlist) {
        this.setIconTintList = new ArrayList(setsupportbackgroundtintlist.setIconTintList);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(String str, int i) {
        if (i >= this.setIconTintList.size()) {
            return false;
        }
        boolean z = i == this.setIconTintList.size() - 1;
        String str2 = this.setIconTintList.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if (!z) {
                if (i != this.setIconTintList.size() - 2) {
                    return false;
                }
                List<String> list = this.setIconTintList;
                if (!list.get(list.size() - 1).equals("**")) {
                    return false;
                }
            }
            return z2;
        }
        if (!(!z && this.setIconTintList.get(i + 1).equals(str))) {
            if (z) {
                return true;
            }
            int i2 = i + 1;
            if (i2 < this.setIconTintList.size() - 1) {
                return false;
            }
            return this.setIconTintList.get(i2).equals(str);
        }
        if (i != this.setIconTintList.size() - 2) {
            if (i != this.setIconTintList.size() - 3) {
                return false;
            }
            List<String> list2 = this.setIconTintList;
            if (!list2.get(list2.size() - 1).equals("**")) {
                return false;
            }
        }
        return true;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(String str, int i) {
        return "__container".equals(str) || i < this.setIconTintList.size() - 1 || this.setIconTintList.get(i).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.setIconTintList);
        sb.append(",resolved=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1 != null);
        sb.append('}');
        return sb.toString();
    }

    public final int setX(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.setIconTintList.get(i).equals("**")) {
            return (i != this.setIconTintList.size() - 1 && this.setIconTintList.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean setY(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.setIconTintList.size()) {
            return false;
        }
        return this.setIconTintList.get(i).equals(str) || this.setIconTintList.get(i).equals("**") || this.setIconTintList.get(i).equals("*");
    }
}