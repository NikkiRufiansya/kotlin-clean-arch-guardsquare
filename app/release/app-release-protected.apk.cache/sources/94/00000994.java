package o;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes.dex */
public final class setBoxBackgroundMode$MenuHostHelper$$ExternalSyntheticLambda1 {
    public static boolean setY(File file) {
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static boolean setY(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }
}