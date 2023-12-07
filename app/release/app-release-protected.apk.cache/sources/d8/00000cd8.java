package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import o.SingleGeneratedAdapterObserver;
import o.setTextMetricsParams;

/* loaded from: classes.dex */
public class setItemActiveIndicatorMarginHorizontal extends setKeyProgressIncrement {
    private static int setY(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private Font MenuHostHelper$$ExternalSyntheticLambda0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int y = setY(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int y2 = setY(fontStyle, font2.getStyle());
            if (y2 < y) {
                font = font2;
                y = y2;
            }
        }
        return font;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setKeyProgressIncrement
    public SingleGeneratedAdapterObserver.setX MenuHostHelper$$ExternalSyntheticLambda0(SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setKeyProgressIncrement
    public Typeface setIconTintList(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // o.setKeyProgressIncrement
    public Typeface setX(Context context, CancellationSignal cancellationSignal, SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = setxArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                SingleGeneratedAdapterObserver.setX setx = setxArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(setx.setIconTintList(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(setx.setX()).setSlant(setx.MenuHostHelper$$ExternalSyntheticLambda1() ? 1 : 0).setTtcIndex(setx.setY()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                        }
                    } catch (Throwable th) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(MenuHostHelper$$ExternalSyntheticLambda0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // o.setKeyProgressIncrement
    public Typeface setIconTintList(Context context, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0 settextmetricsparams_menuhosthelper__externalsyntheticlambda0, Resources resources, int i) {
        setTextMetricsParams.setY[] MenuHostHelper$$ExternalSyntheticLambda0;
        try {
            FontFamily.Builder builder = null;
            for (setTextMetricsParams.setY sety : settextmetricsparams_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0()) {
                try {
                    Font build = new Font.Builder(resources, sety.setIconTintList()).setWeight(sety.MenuHostHelper$$ExternalSyntheticLambda0()).setSlant(sety.setNavigationOnClickListener() ? 1 : 0).setTtcIndex(sety.MenuHostHelper$$ExternalSyntheticLambda1()).setFontVariationSettings(sety.setX()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(MenuHostHelper$$ExternalSyntheticLambda0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // o.setKeyProgressIncrement
    public Typeface MenuHostHelper$$ExternalSyntheticLambda1(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}