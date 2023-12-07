package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import o.ReflectedParcelable;
import o.setPivotY;

/* loaded from: classes.dex */
public final /* synthetic */ class setItemActiveIndicatorShapeAppearance implements setPivotY.setIconTintList {
    private /* synthetic */ ReflectedParcelable.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    private /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda1;
    private /* synthetic */ long setY;

    public /* synthetic */ setItemActiveIndicatorShapeAppearance(String str, ReflectedParcelable.setIconTintList seticontintlist, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
        this.setY = j;
    }

    @Override // o.setPivotY.setIconTintList
    public final Object setIconTintList(Object obj) {
        String str = this.MenuHostHelper$$ExternalSyntheticLambda1;
        ReflectedParcelable.setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0;
        long j = this.setY;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!((Boolean) setPivotY.MenuHostHelper$$ExternalSyntheticLambda0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(seticontintlist.setUnboundedRipple)}), new setPivotY.setIconTintList() { // from class: o.setContentId
            @Override // o.setPivotY.setIconTintList
            public final Object setIconTintList(Object obj2) {
                return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(seticontintlist.setUnboundedRipple));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            StringBuilder sb = new StringBuilder("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
            sb.append(j);
            sb.append(" WHERE log_source = ? AND reason = ?");
            sQLiteDatabase.execSQL(sb.toString(), new String[]{str, Integer.toString(seticontintlist.setUnboundedRipple)});
        }
        return null;
    }
}