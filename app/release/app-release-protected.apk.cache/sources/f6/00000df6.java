package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o.IObjectWrapper$Stub;

/* loaded from: classes.dex */
public final class setOnEditorActionListener {
    public final Set<setY> MenuHostHelper$$ExternalSyntheticLambda0;
    public final Map<String, setIconTintList> setIconTintList;
    public final Set<setX> setX;
    public final String setY;

    public setOnEditorActionListener(String str, Map<String, setIconTintList> map, Set<setX> set, Set<setY> set2) {
        this.setY = str;
        this.setIconTintList = Collections.unmodifiableMap(map);
        this.setX = Collections.unmodifiableSet(set);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public final boolean equals(Object obj) {
        Set<setY> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setOnEditorActionListener) {
            setOnEditorActionListener setoneditoractionlistener = (setOnEditorActionListener) obj;
            String str = this.setY;
            if (str == null ? setoneditoractionlistener.setY == null : str.equals(setoneditoractionlistener.setY)) {
                Map<String, setIconTintList> map = this.setIconTintList;
                if (map == null ? setoneditoractionlistener.setIconTintList == null : map.equals(setoneditoractionlistener.setIconTintList)) {
                    Set<setX> set2 = this.setX;
                    if (set2 == null ? setoneditoractionlistener.setX == null : set2.equals(setoneditoractionlistener.setX)) {
                        Set<setY> set3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (set3 == null || (set = setoneditoractionlistener.MenuHostHelper$$ExternalSyntheticLambda0) == null) {
                            return true;
                        }
                        return set3.equals(set);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.setY;
        int hashCode = str != null ? str.hashCode() : 0;
        Map<String, setIconTintList> map = this.setIconTintList;
        int hashCode2 = map != null ? map.hashCode() : 0;
        Set<setX> set = this.setX;
        return (((hashCode * 31) + hashCode2) * 31) + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.setY);
        sb.append("', columns=");
        sb.append(this.setIconTintList);
        sb.append(", foreignKeys=");
        sb.append(this.setX);
        sb.append(", indices=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append('}');
        return sb.toString();
    }

    public static Set<setX> setIconTintList(setWindowCallback setwindowcallback, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor x = setwindowcallback.setX(sb.toString());
        try {
            int columnIndex = x.getColumnIndex("id");
            int columnIndex2 = x.getColumnIndex("seq");
            int columnIndex3 = x.getColumnIndex("table");
            int columnIndex4 = x.getColumnIndex("on_delete");
            int columnIndex5 = x.getColumnIndex("on_update");
            int columnIndex6 = x.getColumnIndex("id");
            int columnIndex7 = x.getColumnIndex("seq");
            int columnIndex8 = x.getColumnIndex("from");
            int columnIndex9 = x.getColumnIndex("to");
            int count = x.getCount();
            ArrayList<setOnEditorActionListener$MenuHostHelper$$ExternalSyntheticLambda0> arrayList = new ArrayList();
            int i = 0;
            while (i < count) {
                x.moveToPosition(i);
                arrayList.add(new setOnEditorActionListener$MenuHostHelper$$ExternalSyntheticLambda0(x.getInt(columnIndex6), x.getInt(columnIndex7), x.getString(columnIndex8), x.getString(columnIndex9)));
                i++;
                columnIndex7 = columnIndex7;
                columnIndex6 = columnIndex6;
                columnIndex8 = columnIndex8;
            }
            Collections.sort(arrayList);
            int count2 = x.getCount();
            for (int i2 = 0; i2 < count2; i2++) {
                x.moveToPosition(i2);
                if (x.getInt(columnIndex2) == 0) {
                    int i3 = x.getInt(columnIndex);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (setOnEditorActionListener$MenuHostHelper$$ExternalSyntheticLambda0 setoneditoractionlistener_menuhosthelper__externalsyntheticlambda0 : arrayList) {
                        if (setoneditoractionlistener_menuhosthelper__externalsyntheticlambda0.setIconTintList == i3) {
                            arrayList2.add(setoneditoractionlistener_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0);
                            arrayList3.add(setoneditoractionlistener_menuhosthelper__externalsyntheticlambda0.setY);
                        }
                    }
                    hashSet.add(new setX(x.getString(columnIndex3), x.getString(columnIndex4), x.getString(columnIndex5), arrayList2, arrayList3));
                }
            }
            return hashSet;
        } finally {
            x.close();
        }
    }

    public static Map<String, setIconTintList> MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor x = setwindowcallback.setX(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (x.getColumnCount() > 0) {
                int columnIndex = x.getColumnIndex("name");
                int columnIndex2 = x.getColumnIndex("type");
                int columnIndex3 = x.getColumnIndex("notnull");
                int columnIndex4 = x.getColumnIndex("pk");
                int columnIndex5 = x.getColumnIndex("dflt_value");
                while (x.moveToNext()) {
                    String string = x.getString(columnIndex);
                    hashMap.put(string, new setIconTintList(string, x.getString(columnIndex2), x.getInt(columnIndex3) != 0, x.getInt(columnIndex4), x.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            x.close();
        }
    }

    public static Set<setY> setX(setWindowCallback setwindowcallback, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor x = setwindowcallback.setX(sb.toString());
        try {
            int columnIndex = x.getColumnIndex("name");
            int columnIndex2 = x.getColumnIndex("origin");
            int columnIndex3 = x.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                return null;
            }
            HashSet hashSet = new HashSet();
            while (x.moveToNext()) {
                if ("c".equals(x.getString(columnIndex2))) {
                    setY MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setwindowcallback, x.getString(columnIndex), x.getInt(columnIndex3) == 1);
                    if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                        return null;
                    }
                    hashSet.add(MenuHostHelper$$ExternalSyntheticLambda1);
                }
            }
            return hashSet;
        } finally {
            x.close();
        }
    }

    private static setY MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback, String str, boolean z) {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor x = setwindowcallback.setX(sb.toString());
        try {
            int columnIndex = x.getColumnIndex("seqno");
            int columnIndex2 = x.getColumnIndex("cid");
            int columnIndex3 = x.getColumnIndex("name");
            int columnIndex4 = x.getColumnIndex("desc");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
                x.close();
                return null;
            }
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            while (x.moveToNext()) {
                if (x.getInt(columnIndex2) >= 0) {
                    int i = x.getInt(columnIndex);
                    String string = x.getString(columnIndex3);
                    String str2 = x.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                    treeMap.put(Integer.valueOf(i), string);
                    treeMap2.put(Integer.valueOf(i), str2);
                }
            }
            ArrayList arrayList = new ArrayList(treeMap.size());
            arrayList.addAll(treeMap.values());
            ArrayList arrayList2 = new ArrayList(treeMap2.size());
            arrayList2.addAll(treeMap2.values());
            return new setY(str, z, arrayList, arrayList2);
        } finally {
            x.close();
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public final int MenuHostHelper$$ExternalSyntheticLambda0;
        public final String MenuHostHelper$$ExternalSyntheticLambda1;
        public final int setIconTintList;
        public final String setLayoutAnimation;
        private final int setNavigationOnClickListener;
        public final String setX;
        public final boolean setY;

        public setIconTintList(String str, String str2, boolean z, int i, String str3, int i2) {
            this.setX = str;
            this.setLayoutAnimation = str2;
            this.setY = z;
            this.setIconTintList = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i3;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str3;
            this.setNavigationOnClickListener = i2;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof setIconTintList) {
                setIconTintList seticontintlist = (setIconTintList) obj;
                if (this.setIconTintList == seticontintlist.setIconTintList && this.setX.equals(seticontintlist.setX) && this.setY == seticontintlist.setY) {
                    if (this.setNavigationOnClickListener != 1 || seticontintlist.setNavigationOnClickListener != 2 || (str3 = this.MenuHostHelper$$ExternalSyntheticLambda1) == null || setX(str3, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1)) {
                        if (this.setNavigationOnClickListener != 2 || seticontintlist.setNavigationOnClickListener != 1 || (str2 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1) == null || setX(str2, this.MenuHostHelper$$ExternalSyntheticLambda1)) {
                            int i = this.setNavigationOnClickListener;
                            return (i == 0 || i != seticontintlist.setNavigationOnClickListener || ((str = this.MenuHostHelper$$ExternalSyntheticLambda1) == null ? seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 == null : setX(str, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1))) && this.MenuHostHelper$$ExternalSyntheticLambda0 == seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0056 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean setX(java.lang.String r6, java.lang.String r7) {
            /*
                r0 = 0
                if (r7 != 0) goto L4
                return r0
            L4:
                boolean r1 = r6.equals(r7)
                r2 = 1
                if (r1 == 0) goto Lc
                return r2
            Lc:
                int r1 = r6.length()
                if (r1 != 0) goto L14
            L12:
                r1 = 0
                goto L42
            L14:
                r1 = 0
                r3 = 0
            L16:
                int r4 = r6.length()
                if (r1 >= r4) goto L3f
                char r4 = r6.charAt(r1)
                r5 = 40
                if (r1 != 0) goto L27
                if (r4 == r5) goto L27
                goto L12
            L27:
                if (r4 != r5) goto L2c
                int r3 = r3 + 1
                goto L3c
            L2c:
                r5 = 41
                if (r4 != r5) goto L3c
                int r3 = r3 + (-1)
                if (r3 != 0) goto L3c
                int r4 = r6.length()
                int r4 = r4 - r2
                if (r1 == r4) goto L3c
                goto L12
            L3c:
                int r1 = r1 + 1
                goto L16
            L3f:
                if (r3 != 0) goto L12
                r1 = 1
            L42:
                if (r1 == 0) goto L56
                int r0 = r6.length()
                int r0 = r0 - r2
                java.lang.String r6 = r6.substring(r2, r0)
                java.lang.String r6 = r6.trim()
                boolean r6 = r6.equals(r7)
                return r6
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOnEditorActionListener.setIconTintList.setX(java.lang.String, java.lang.String):boolean");
        }

        public final int hashCode() {
            int hashCode = this.setX.hashCode();
            return (((((hashCode * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0) * 31) + (this.setY ? 1231 : 1237)) * 31) + this.setIconTintList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.setX);
            sb.append("', type='");
            sb.append(this.setLayoutAnimation);
            sb.append("', affinity='");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append("', notNull=");
            sb.append(this.setY);
            sb.append(", primaryKeyPosition=");
            sb.append(this.setIconTintList);
            sb.append(", defaultValue='");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class setX {
        public final String MenuHostHelper$$ExternalSyntheticLambda0;
        public final String MenuHostHelper$$ExternalSyntheticLambda1;
        public final List<String> setIconTintList;
        public final List<String> setX;
        public final String setY;

        public setX(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
            this.setY = str2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str3;
            this.setX = Collections.unmodifiableList(list);
            this.setIconTintList = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof setX) {
                setX setx = (setX) obj;
                if (this.MenuHostHelper$$ExternalSyntheticLambda0.equals(setx.MenuHostHelper$$ExternalSyntheticLambda0) && this.setY.equals(setx.setY) && this.MenuHostHelper$$ExternalSyntheticLambda1.equals(setx.MenuHostHelper$$ExternalSyntheticLambda1) && this.setX.equals(setx.setX)) {
                    return this.setIconTintList.equals(setx.setIconTintList);
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
            int hashCode2 = this.setY.hashCode();
            return (((((((hashCode * 31) + hashCode2) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode()) * 31) + this.setX.hashCode()) * 31) + this.setIconTintList.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append("', onDelete='");
            sb.append(this.setY);
            sb.append("', onUpdate='");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append("', columnNames=");
            sb.append(this.setX);
            sb.append(", referenceColumnNames=");
            sb.append(this.setIconTintList);
            sb.append('}');
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class setY {
        public final String MenuHostHelper$$ExternalSyntheticLambda1;
        public final List<String> setIconTintList;
        public final boolean setX;
        public final List<String> setY;

        public setY(String str, boolean z, List<String> list, List<String> list2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            this.setX = z;
            this.setIconTintList = list;
            this.setY = list2.size() == 0 ? Collections.nCopies(list.size(), IObjectWrapper$Stub.setX.ASC.name()) : list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof setY) {
                setY sety = (setY) obj;
                if (this.setX == sety.setX && this.setIconTintList.equals(sety.setIconTintList) && this.setY.equals(sety.setY)) {
                    if (this.MenuHostHelper$$ExternalSyntheticLambda1.startsWith("index_")) {
                        return sety.MenuHostHelper$$ExternalSyntheticLambda1.startsWith("index_");
                    }
                    return this.MenuHostHelper$$ExternalSyntheticLambda1.equals(sety.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return ((((((this.MenuHostHelper$$ExternalSyntheticLambda1.startsWith("index_") ? -1184239155 : this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode()) * 31) + (this.setX ? 1 : 0)) * 31) + this.setIconTintList.hashCode()) * 31) + this.setY.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append("', unique=");
            sb.append(this.setX);
            sb.append(", columns=");
            sb.append(this.setIconTintList);
            sb.append(", orders=");
            sb.append(this.setY);
            sb.append('}');
            return sb.toString();
        }
    }
}