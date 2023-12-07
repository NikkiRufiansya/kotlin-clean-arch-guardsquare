package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class setStrokeAlpha {
    private final setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0 setY;

    /* loaded from: classes.dex */
    interface setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle);

        setStrokeAlpha setIconTintList();

        void setIconTintList(int i);

        void setY(Uri uri);
    }

    static String MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    static String setX(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setStrokeAlpha(setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0 setstrokealpha_menuhosthelper__externalsyntheticlambda0) {
        this.setY = setstrokealpha_menuhosthelper__externalsyntheticlambda0;
    }

    public static setStrokeAlpha setIconTintList(ContentInfo contentInfo) {
        return new setStrokeAlpha(new setOnLongClickListener(contentInfo));
    }

    public final ContentInfo setY() {
        return setErrorIconDrawable.setIconTintList(Objects.requireNonNull(this.setY.MenuHostHelper$$ExternalSyntheticLambda0()));
    }

    public final String toString() {
        return this.setY.toString();
    }

    public final ClipData setX() {
        return this.setY.setY();
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY.setX();
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY.setIconTintList();
    }

    /* loaded from: classes.dex */
    static final class setLayoutAnimation implements setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0 {
        private final ClipData MenuHostHelper$$ExternalSyntheticLambda0;
        private final Bundle MenuHostHelper$$ExternalSyntheticLambda1;
        private final Uri setIconTintList;
        private final int setX;
        private final int setY;

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final ContentInfo MenuHostHelper$$ExternalSyntheticLambda0() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setLayoutAnimation(setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda1 setstrokealpha_menuhosthelper__externalsyntheticlambda1) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setstrokealpha_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1;
            int i = setstrokealpha_menuhosthelper__externalsyntheticlambda1.setX;
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i <= 5) {
                this.setY = i;
                int i2 = setstrokealpha_menuhosthelper__externalsyntheticlambda1.setIconTintList;
                if ((i2 & 1) == i2) {
                    this.setX = i2;
                    this.setIconTintList = setstrokealpha_menuhosthelper__externalsyntheticlambda1.setY;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = setstrokealpha_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                    return;
                }
                StringBuilder sb = new StringBuilder("Requested flags 0x");
                sb.append(Integer.toHexString(i2));
                sb.append(", but only 0x");
                sb.append(Integer.toHexString(1));
                sb.append(" are allowed");
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final ClipData setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setX() {
            return this.setY;
        }

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setIconTintList() {
            return this.setX;
        }

        public final String toString() {
            String obj;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0.getDescription());
            sb.append(", source=");
            sb.append(setStrokeAlpha.MenuHostHelper$$ExternalSyntheticLambda1(this.setY));
            sb.append(", flags=");
            sb.append(setStrokeAlpha.setX(this.setX));
            if (this.setIconTintList == null) {
                obj = "";
            } else {
                StringBuilder sb2 = new StringBuilder(", hasLinkUri(");
                sb2.append(this.setIconTintList.toString().length());
                sb2.append(")");
                obj = sb2.toString();
            }
            sb.append(obj);
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1 != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setOnLongClickListener implements setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0 {
        private final ContentInfo setY;

        setOnLongClickListener(ContentInfo contentInfo) {
            this.setY = setErrorIconDrawable.setIconTintList(contentInfo);
        }

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final ContentInfo MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setY;
        }

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final ClipData setY() {
            ClipData clip;
            clip = this.setY.getClip();
            return clip;
        }

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setX() {
            int source;
            source = this.setY.getSource();
            return source;
        }

        @Override // o.setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setIconTintList() {
            int flags;
            flags = this.setY.getFlags();
            return flags;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentInfoCompat{");
            sb.append(this.setY);
            sb.append("}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private final setIconTintList setIconTintList;

        public setY(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.setIconTintList = new setX(clipData, i);
            } else {
                this.setIconTintList = new setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda1(clipData, i);
            }
        }

        public final setY setX(int i) {
            this.setIconTintList.setIconTintList(i);
            return this;
        }

        public final setY MenuHostHelper$$ExternalSyntheticLambda1(Uri uri) {
            this.setIconTintList.setY(uri);
            return this;
        }

        public final setY MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
            return this;
        }

        public final setStrokeAlpha setX() {
            return this.setIconTintList.setIconTintList();
        }
    }

    /* loaded from: classes.dex */
    static final class setX implements setIconTintList {
        private final ContentInfo.Builder setIconTintList;

        setX(ClipData clipData, int i) {
            this.setIconTintList = setErrorIconDrawable.setX(clipData, i);
        }

        @Override // o.setStrokeAlpha.setIconTintList
        public final void setIconTintList(int i) {
            this.setIconTintList.setFlags(i);
        }

        @Override // o.setStrokeAlpha.setIconTintList
        public final void setY(Uri uri) {
            this.setIconTintList.setLinkUri(uri);
        }

        @Override // o.setStrokeAlpha.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
            this.setIconTintList.setExtras(bundle);
        }

        @Override // o.setStrokeAlpha.setIconTintList
        public final setStrokeAlpha setIconTintList() {
            ContentInfo build;
            build = this.setIconTintList.build();
            return new setStrokeAlpha(new setOnLongClickListener(build));
        }
    }
}