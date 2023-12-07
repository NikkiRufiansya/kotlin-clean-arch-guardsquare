package o;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class setVerticalScrollbarTrackDrawable {
    private final setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1 setY;

    /* loaded from: classes.dex */
    static final class setIconTintList implements setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1 {
        private final Uri MenuHostHelper$$ExternalSyntheticLambda0;
        private final Uri setX;
        private final ClipDescription setY;

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setX() {
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final Object setY() {
            return null;
        }

        setIconTintList(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.setX = uri;
            this.setY = clipDescription;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = uri2;
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final Uri MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setX;
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final ClipDescription MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setY;
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final Uri setIconTintList() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY implements setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1 {
        final InputContentInfo setX;

        setY(Object obj) {
            this.setX = (InputContentInfo) obj;
        }

        setY(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.setX = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final Uri MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setX.getContentUri();
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final ClipDescription MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setX.getDescription();
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final Uri setIconTintList() {
            return this.setX.getLinkUri();
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final Object setY() {
            return this.setX;
        }

        @Override // o.setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setX() {
            this.setX.requestPermission();
        }
    }

    public setVerticalScrollbarTrackDrawable(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.setY = new setY(uri, clipDescription, uri2);
        } else {
            this.setY = new setIconTintList(uri, clipDescription, uri2);
        }
    }

    private setVerticalScrollbarTrackDrawable(setVerticalScrollbarTrackDrawable$MenuHostHelper$$ExternalSyntheticLambda1 setverticalscrollbartrackdrawable_menuhosthelper__externalsyntheticlambda1) {
        this.setY = setverticalscrollbartrackdrawable_menuhosthelper__externalsyntheticlambda1;
    }

    public final Uri setIconTintList() {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public final ClipDescription MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public final Uri MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY.setIconTintList();
    }

    public static setVerticalScrollbarTrackDrawable MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new setVerticalScrollbarTrackDrawable(new setY(obj));
        }
        return null;
    }

    public final Object setY() {
        return this.setY.setY();
    }

    public final void setX() {
        this.setY.setX();
    }
}