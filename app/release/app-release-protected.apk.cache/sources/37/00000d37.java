package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class setLogoDescription {
    private static final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    public final Context MenuHostHelper$$ExternalSyntheticLambda0;
    public BadgeState$State$1 setIconTintList;
    private final Map<String, setErrorIconOnClickListener> setX;
    private String setY;

    public setLogoDescription(Drawable.Callback callback, String str, BadgeState$State$1 badgeState$State$1, Map<String, setErrorIconOnClickListener> map) {
        this.setY = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.setY;
            if (str2.charAt(str2.length() - 1) != '/') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.setY);
                sb.append('/');
                this.setY = sb.toString();
            }
        }
        if (!(callback instanceof View)) {
            setDrawingCacheEnabled.setIconTintList("LottieDrawable must be inside of a view for images to work.");
            this.setX = new HashMap();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = ((View) callback).getContext();
        this.setX = map;
        this.setIconTintList = badgeState$State$1;
    }

    public final Bitmap setX(String str) {
        setErrorIconOnClickListener seterroricononclicklistener = this.setX.get(str);
        if (seterroricononclicklistener == null) {
            return null;
        }
        Bitmap bitmap = seterroricononclicklistener.MenuHostHelper$$ExternalSyntheticLambda1;
        if (bitmap != null) {
            return bitmap;
        }
        BadgeState$State$1 badgeState$State$1 = this.setIconTintList;
        if (badgeState$State$1 != null) {
            Bitmap x = badgeState$State$1.setX();
            if (x != null) {
                setX(str, x);
            }
            return x;
        }
        String str2 = seterroricononclicklistener.setIconTintList;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return setX(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                setDrawingCacheEnabled.setIconTintList("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.setY)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            AssetManager assets = this.MenuHostHelper$$ExternalSyntheticLambda0.getAssets();
            StringBuilder sb = new StringBuilder();
            sb.append(this.setY);
            sb.append(str2);
            return setX(str, setOnPageChangeListener.setX(BitmapFactory.decodeStream(assets.open(sb.toString()), null, options), seterroricononclicklistener.setX, seterroricononclicklistener.setY));
        } catch (IOException e2) {
            setDrawingCacheEnabled.setIconTintList("Unable to open asset.", e2);
            return null;
        }
    }

    private Bitmap setX(String str, Bitmap bitmap) {
        synchronized (MenuHostHelper$$ExternalSyntheticLambda1) {
            this.setX.get(str).MenuHostHelper$$ExternalSyntheticLambda1 = bitmap;
        }
        return bitmap;
    }
}