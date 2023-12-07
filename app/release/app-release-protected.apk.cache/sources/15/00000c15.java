package o;

/* loaded from: classes.dex */
final class setHapticFeedbackEnabled {

    /* loaded from: classes.dex */
    static class setY<T> implements setHapticFeedbackEnabled$MenuHostHelper$$ExternalSyntheticLambda0<T> {
        private int setX;
        private final Object[] setY = new Object[256];

        @Override // o.setHapticFeedbackEnabled$MenuHostHelper$$ExternalSyntheticLambda0
        public final T setY() {
            int i = this.setX;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = this.setY;
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.setX = i2;
                return t;
            }
            return null;
        }

        @Override // o.setHapticFeedbackEnabled$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(T t) {
            int i = this.setX;
            Object[] objArr = this.setY;
            if (i < objArr.length) {
                objArr[i] = t;
                this.setX = i + 1;
                return true;
            }
            return false;
        }

        @Override // o.setHapticFeedbackEnabled$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setY(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.setX;
                Object[] objArr = this.setY;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.setX = i3 + 1;
                }
            }
        }
    }
}