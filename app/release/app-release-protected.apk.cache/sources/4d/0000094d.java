package o;

/* loaded from: classes.dex */
public final class setAnimateShowBeforeLayout {

    /* loaded from: classes.dex */
    public interface setY<T> {
        T MenuHostHelper$$ExternalSyntheticLambda0();

        boolean setIconTintList(T t);
    }

    /* loaded from: classes.dex */
    public static class setIconTintList<T> implements setY<T> {
        private final Object[] MenuHostHelper$$ExternalSyntheticLambda0;
        private int setIconTintList;

        public setIconTintList(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new Object[i];
        }

        @Override // o.setAnimateShowBeforeLayout.setY
        public T MenuHostHelper$$ExternalSyntheticLambda0() {
            int i = this.setIconTintList;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.setIconTintList = i2;
                return t;
            }
            return null;
        }

        @Override // o.setAnimateShowBeforeLayout.setY
        public boolean setIconTintList(T t) {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= this.setIconTintList) {
                    z = false;
                    break;
                } else if (this.MenuHostHelper$$ExternalSyntheticLambda0[i] == t) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i2 = this.setIconTintList;
            Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i2 < objArr.length) {
                objArr[i2] = t;
                this.setIconTintList = i2 + 1;
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class setX<T> extends setIconTintList<T> {
        private final Object MenuHostHelper$$ExternalSyntheticLambda1;

        public setX(int i) {
            super(i);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
        }

        @Override // o.setAnimateShowBeforeLayout.setIconTintList, o.setAnimateShowBeforeLayout.setY
        public final T MenuHostHelper$$ExternalSyntheticLambda0() {
            T t;
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                t = (T) super.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            return t;
        }

        @Override // o.setAnimateShowBeforeLayout.setIconTintList, o.setAnimateShowBeforeLayout.setY
        public final boolean setIconTintList(T t) {
            boolean iconTintList;
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                iconTintList = super.setIconTintList(t);
            }
            return iconTintList;
        }
    }
}