package o;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class setEndIconActivated {
    public static int setX(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            StringBuilder sb = new StringBuilder("`");
            sb.append(str);
            sb.append("`");
            columnIndex = cursor.getColumnIndex(sb.toString());
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    StringBuilder sb2 = new StringBuilder(".");
                    sb2.append(str);
                    String obj = sb2.toString();
                    StringBuilder sb3 = new StringBuilder(".");
                    sb3.append(str);
                    sb3.append("`");
                    String obj2 = sb3.toString();
                    for (int i = 0; i < columnNames.length; i++) {
                        String str3 = columnNames[i];
                        if (str3.length() >= str.length() + 2 && (str3.endsWith(obj) || (str3.charAt(0) == '`' && str3.endsWith(obj2)))) {
                            columnIndex = i;
                            break;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "";
        }
        StringBuilder sb4 = new StringBuilder("column '");
        sb4.append(str);
        sb4.append("' does not exist. Available columns: ");
        sb4.append(str2);
        throw new IllegalArgumentException(sb4.toString());
    }
}