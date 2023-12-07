package o;

import java.util.Arrays;
import o.LiveData$LifecycleBoundObserver;

/* loaded from: classes.dex */
final class setDrawingCacheBackgroundColor extends LiveData$LifecycleBoundObserver {
    private final Iterable<setPaddingRelative> MenuHostHelper$$ExternalSyntheticLambda0;
    private final byte[] setY;

    /* synthetic */ setDrawingCacheBackgroundColor(Iterable iterable, byte[] bArr, byte b) {
        this(iterable, bArr);
    }

    private setDrawingCacheBackgroundColor(Iterable<setPaddingRelative> iterable, byte[] bArr) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = iterable;
        this.setY = bArr;
    }

    @Override // o.LiveData$LifecycleBoundObserver
    public final Iterable<setPaddingRelative> setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.LiveData$LifecycleBoundObserver
    public final byte[] MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendRequest{events=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.setY));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveData$LifecycleBoundObserver) {
            LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = (LiveData$LifecycleBoundObserver) obj;
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.equals(liveData$LifecycleBoundObserver.setIconTintList())) {
                if (Arrays.equals(this.setY, liveData$LifecycleBoundObserver instanceof setDrawingCacheBackgroundColor ? ((setDrawingCacheBackgroundColor) liveData$LifecycleBoundObserver).setY : liveData$LifecycleBoundObserver.MenuHostHelper$$ExternalSyntheticLambda0())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.setY);
    }

    /* loaded from: classes.dex */
    public static final class setX extends LiveData$LifecycleBoundObserver.setY {
        private Iterable<setPaddingRelative> MenuHostHelper$$ExternalSyntheticLambda0;
        private byte[] setIconTintList;

        @Override // o.LiveData$LifecycleBoundObserver.setY
        public final LiveData$LifecycleBoundObserver.setY setX(Iterable<setPaddingRelative> iterable) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = iterable;
            return this;
        }

        @Override // o.LiveData$LifecycleBoundObserver.setY
        public final LiveData$LifecycleBoundObserver.setY MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
            this.setIconTintList = bArr;
            return this;
        }

        @Override // o.LiveData$LifecycleBoundObserver.setY
        public final LiveData$LifecycleBoundObserver setIconTintList() {
            String str = this.MenuHostHelper$$ExternalSyntheticLambda0 == null ? " events" : "";
            if (!str.isEmpty()) {
                StringBuilder sb = new StringBuilder("Missing required properties:");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            return new setDrawingCacheBackgroundColor(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList, (byte) 0);
        }
    }
}