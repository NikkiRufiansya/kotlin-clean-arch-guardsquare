package o;

/* loaded from: classes.dex */
public interface gC {
    void MenuHostHelper$$ExternalSyntheticLambda0(setX setx);

    gC$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1();

    boolean setIconTintList();

    /* loaded from: classes.dex */
    public static final class setX {
        public final String setY;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof setX) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setY, (Object) ((setX) obj).setY);
        }

        public final int hashCode() {
            return this.setY.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
            sb.append(this.setY);
            sb.append(')');
            return sb.toString();
        }

        public setX(String str) {
            pN.setY(str, "");
            this.setY = str;
        }
    }
}