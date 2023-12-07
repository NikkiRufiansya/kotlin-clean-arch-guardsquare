package o;

import java.util.List;

/* loaded from: classes.dex */
public abstract class mA {
    public /* synthetic */ mA(byte b) {
        this();
    }

    private mA() {
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends mA {
        public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList();

        private setIconTintList() {
            super((byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class setY extends mA {
        public final List<kP> setIconTintList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof setY) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, ((setY) obj).setIconTintList);
        }

        public final int hashCode() {
            return this.setIconTintList.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(list=");
            sb.append(this.setIconTintList);
            sb.append(')');
            return sb.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(List<kP> list) {
            super((byte) 0);
            pN.setY(list, "");
            this.setIconTintList = list;
        }
    }
}