package o;

import android.database.Cursor;
import o.setImageResource;

/* loaded from: classes.dex */
public final class setOnFocusChangeListener extends setImageResource.setY {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private setSelectedTabIndicatorHeight setIconTintList;
    private final setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setX;
    private final String setY;

    public setOnFocusChangeListener(setSelectedTabIndicatorHeight setselectedtabindicatorheight, setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonfocuschangelistener_menuhosthelper__externalsyntheticlambda1, String str, String str2) {
        super(setonfocuschangelistener_menuhosthelper__externalsyntheticlambda1.setIconTintList);
        this.setIconTintList = setselectedtabindicatorheight;
        this.setX = setonfocuschangelistener_menuhosthelper__externalsyntheticlambda1;
        this.setY = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str2;
    }

    @Override // o.setImageResource.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback) {
        boolean y = setY(setwindowcallback);
        this.setX.setY(setwindowcallback);
        if (!y) {
            setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0(setwindowcallback);
            if (!MenuHostHelper$$ExternalSyntheticLambda0.setX) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
                throw new IllegalStateException(sb.toString());
            }
        }
        setIconTintList(setwindowcallback);
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0077 A[EDGE_INSN: B:63:0x0077->B:40:0x0077 ?: BREAK  , SYNTHETIC] */
    @Override // o.setImageResource.setY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setIconTintList(o.setWindowCallback r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnFocusChangeListener.setIconTintList(o.setWindowCallback, int, int):void");
    }

    @Override // o.setImageResource.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback, int i, int i2) {
        setIconTintList(setwindowcallback, i, i2);
    }

    @Override // o.setImageResource.setY
    public final void setX(setWindowCallback setwindowcallback) {
        super.setX(setwindowcallback);
        if (MenuHostHelper$$ExternalSyntheticLambda0(setwindowcallback)) {
            Cursor y = setwindowcallback.setY(new FragmentManagerState$1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = y.moveToFirst() ? y.getString(0) : null;
                y.close();
                if (!this.setY.equals(string) && !this.MenuHostHelper$$ExternalSyntheticLambda0.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                y.close();
                throw th;
            }
        } else {
            setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0(setwindowcallback);
            if (!MenuHostHelper$$ExternalSyntheticLambda0.setX) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
                throw new IllegalStateException(sb.toString());
            }
            setIconTintList(setwindowcallback);
        }
        this.setX.setIconTintList(setwindowcallback);
        this.setIconTintList = null;
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(setWindowCallback setwindowcallback) {
        Cursor x = setwindowcallback.setX("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (x.moveToFirst()) {
                if (x.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            x.close();
        }
    }

    private static boolean setY(setWindowCallback setwindowcallback) {
        Cursor x = setwindowcallback.setX("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (x.moveToFirst()) {
                if (x.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            x.close();
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public final String MenuHostHelper$$ExternalSyntheticLambda0;
        public final boolean setX;

        public setIconTintList(boolean z, String str) {
            this.setX = z;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        }
    }

    private void setIconTintList(setWindowCallback setwindowcallback) {
        setwindowcallback.setY("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.setY;
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        setwindowcallback.setY(sb.toString());
    }
}