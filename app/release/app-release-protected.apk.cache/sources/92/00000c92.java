package o;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* loaded from: classes.dex */
public interface setImageResource extends Closeable {

    /* loaded from: classes.dex */
    public interface setX {
        setImageResource setX(setIconTintList seticontintlist);
    }

    setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    setWindowCallback setIconTintList();

    String setX();

    void setY(boolean z);

    /* loaded from: classes.dex */
    public static abstract class setY {
        public final int MenuHostHelper$$ExternalSyntheticLambda1;

        public abstract void MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback);

        public abstract void setIconTintList(setWindowCallback setwindowcallback, int i, int i2);

        public void setX(setWindowCallback setwindowcallback) {
        }

        public setY(int i) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }

        public static void setX(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder("deleting the database file: ");
            sb.append(str);
            Log.w("SupportSQLite", sb.toString());
            try {
                setBoxBackgroundMode$MenuHostHelper$$ExternalSyntheticLambda1.setY(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0;
        public final String MenuHostHelper$$ExternalSyntheticLambda1;
        public final setY setX;
        public final Context setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(Context context, String str, setY sety, boolean z) {
            this.setY = context;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            this.setX = sety;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        }
    }
}