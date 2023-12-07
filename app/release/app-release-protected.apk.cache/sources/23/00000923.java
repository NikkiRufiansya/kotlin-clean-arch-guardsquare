package o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import o.setImageResource;

/* loaded from: classes.dex */
class setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0 extends SQLiteOpenHelper {
    final setImageResource.setY MenuHostHelper$$ExternalSyntheticLambda0;
    final setCursorVisible[] MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0(Context context, String str, final setCursorVisible[] setcursorvisibleArr, final setImageResource.setY sety) {
        super(context, str, null, sety.MenuHostHelper$$ExternalSyntheticLambda1, new DatabaseErrorHandler() { // from class: o.setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0.4
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                setCursorVisible iconTintList = setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setcursorvisibleArr, sQLiteDatabase);
                StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
                sb.append(iconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
                Log.e("SupportSQLite", sb.toString());
                if (!iconTintList.setNavigationOnClickListener()) {
                    setImageResource.setY.setX(iconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = iconTintList.setY();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        iconTintList.close();
                    } catch (IOException unused2) {
                    }
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            setImageResource.setY.setX((String) next.second);
                        }
                    } else {
                        setImageResource.setY.setX(iconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
                    }
                }
            }
        });
        this.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setcursorvisibleArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0() {
        synchronized (this) {
            this.setX = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.setX) {
                close();
                return MenuHostHelper$$ExternalSyntheticLambda0();
            }
            return setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, writableDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setWindowCallback setY() {
        synchronized (this) {
            this.setX = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.setX) {
                close();
                return setY();
            }
            return setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, readableDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.setX = true;
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.setX = true;
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.setX) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setX(setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            super.close();
            this.MenuHostHelper$$ExternalSyntheticLambda1[0] = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
        if ((r1.setY == r3) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.setCursorVisible setIconTintList(o.setCursorVisible[] r2, android.database.sqlite.SQLiteDatabase r3) {
        /*
            r0 = 0
            r1 = r2[r0]
            if (r1 == 0) goto Le
            android.database.sqlite.SQLiteDatabase r1 = r1.setY
            if (r1 != r3) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto L15
        Le:
            o.setCursorVisible r1 = new o.setCursorVisible
            r1.<init>(r3)
            r2[r0] = r1
        L15:
            r2 = r2[r0]
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(o.setCursorVisible[], android.database.sqlite.SQLiteDatabase):o.setCursorVisible");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, sQLiteDatabase);
    }
}