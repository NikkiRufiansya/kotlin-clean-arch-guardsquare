package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class setOnPageChangeListener {
    private static final PathMeasure setIconTintList = new PathMeasure();
    private static final Path MenuHostHelper$$ExternalSyntheticLambda1 = new Path();
    private static final Path setUiOptions = new Path();
    private static final float[] MenuHostHelper$$ExternalSyntheticLambda0 = new float[4];
    private static final float setY = (float) (Math.sqrt(2.0d) / 2.0d);
    private static float setX = -1.0f;

    public static int MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    public static Path setY(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void setIconTintList(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float setY(Matrix matrix) {
        float[] fArr = MenuHostHelper$$ExternalSyntheticLambda0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = setY;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean setIconTintList(Matrix matrix) {
        float[] fArr = MenuHostHelper$$ExternalSyntheticLambda0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void setIconTintList(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = setIconTintList;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f != 1.0f || f2 != 0.0f) {
            if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
                float f4 = f * length;
                float f5 = f2 * length;
                float f6 = f3 * length;
                float min = Math.min(f4, f5) + f6;
                float max = Math.max(f4, f5) + f6;
                if (min >= length && max >= length) {
                    min = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(min, length);
                    max = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(max, length);
                }
                if (min < 0.0f) {
                    min = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(min, length);
                }
                if (max < 0.0f) {
                    max = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(max, length);
                }
                int i = (min > max ? 1 : (min == max ? 0 : -1));
                if (i == 0) {
                    path.reset();
                    int i2 = setIntValues.setX;
                    if (i2 > 0) {
                        setIntValues.setX = i2 - 1;
                        return;
                    }
                    return;
                }
                if (i >= 0) {
                    min -= length;
                }
                Path path2 = MenuHostHelper$$ExternalSyntheticLambda1;
                path2.reset();
                pathMeasure.getSegment(min, max, path2, true);
                if (max > length) {
                    Path path3 = setUiOptions;
                    path3.reset();
                    pathMeasure.getSegment(0.0f, max % length, path3, true);
                    path2.addPath(path3);
                } else if (min < 0.0f) {
                    Path path4 = setUiOptions;
                    path4.reset();
                    pathMeasure.getSegment(min + length, length, path4, true);
                    path2.addPath(path4);
                }
                path.set(path2);
                int i3 = setIntValues.setX;
                if (i3 > 0) {
                    setIntValues.setX = i3 - 1;
                    return;
                }
                return;
            }
            int i4 = setIntValues.setX;
            if (i4 > 0) {
                setIntValues.setX = i4 - 1;
                return;
            }
            return;
        }
        int i5 = setIntValues.setX;
        if (i5 > 0) {
            setIntValues.setX = i5 - 1;
        }
    }

    public static float MenuHostHelper$$ExternalSyntheticLambda0() {
        if (setX == -1.0f) {
            setX = Resources.getSystem().getDisplayMetrics().density;
        }
        return setX;
    }

    public static float setY(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap setX(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean setIconTintList(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, RectF rectF, Paint paint) {
        setX(canvas, rectF, paint, 31);
    }

    public static void setX(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        int i2 = setIntValues.setX;
        if (i2 > 0) {
            setIntValues.setX = i2 - 1;
        }
    }

    public static void setIconTintList(Path path, setActiveIndicatorHeight setactiveindicatorheight) {
        if (setactiveindicatorheight == null || setactiveindicatorheight.setX) {
            return;
        }
        setIconTintList(path, ((setOnTouchListener) setactiveindicatorheight.MenuHostHelper$$ExternalSyntheticLambda1).setUiOptions() / 100.0f, ((setOnTouchListener) setactiveindicatorheight.setY).setUiOptions() / 100.0f, ((setOnTouchListener) setactiveindicatorheight.MenuHostHelper$$ExternalSyntheticLambda0).setUiOptions() / 360.0f);
    }
}