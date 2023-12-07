package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class mN implements mD {
    private LruCache<String, mN$MenuHostHelper$$ExternalSyntheticLambda1> setIconTintList;

    public mN(Context context) {
        this(C0321ni.setY(context));
    }

    private mN(int i) {
        this.setIconTintList = new LruCache<String, mN$MenuHostHelper$$ExternalSyntheticLambda1>(i) { // from class: o.mN.5
            @Override // android.util.LruCache
            protected final /* bridge */ /* synthetic */ int sizeOf(String str, mN$MenuHostHelper$$ExternalSyntheticLambda1 mn_menuhosthelper__externalsyntheticlambda1) {
                return mn_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            }
        };
    }

    @Override // o.mD
    public final Bitmap setX(String str) {
        mN$MenuHostHelper$$ExternalSyntheticLambda1 mn_menuhosthelper__externalsyntheticlambda1 = this.setIconTintList.get(str);
        if (mn_menuhosthelper__externalsyntheticlambda1 != null) {
            return mn_menuhosthelper__externalsyntheticlambda1.setX;
        }
        return null;
    }

    @Override // o.mD
    public final void setIconTintList(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = C0321ni.MenuHostHelper$$ExternalSyntheticLambda1(bitmap);
        if (MenuHostHelper$$ExternalSyntheticLambda1 > this.setIconTintList.maxSize()) {
            this.setIconTintList.remove(str);
        } else {
            this.setIconTintList.put(str, new mN$MenuHostHelper$$ExternalSyntheticLambda1(bitmap, MenuHostHelper$$ExternalSyntheticLambda1));
        }
    }

    @Override // o.mD
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList.size();
    }

    @Override // o.mD
    public final int setY() {
        return this.setIconTintList.maxSize();
    }
}