package o;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
class setScroller implements setOnQueryTextFocusChangeListener {
    private final SQLiteProgram setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setScroller(SQLiteProgram sQLiteProgram) {
        this.setIconTintList = sQLiteProgram;
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setIconTintList(int i) {
        this.setIconTintList.bindNull(i);
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, long j) {
        this.setIconTintList.bindLong(i, j);
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setX(int i, double d) {
        this.setIconTintList.bindDouble(i, d);
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, String str) {
        this.setIconTintList.bindString(i, str);
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, byte[] bArr) {
        this.setIconTintList.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.setIconTintList.close();
    }
}