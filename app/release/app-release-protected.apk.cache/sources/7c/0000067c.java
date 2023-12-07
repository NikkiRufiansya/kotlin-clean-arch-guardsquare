package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kN implements kO {
    private final kR MenuHostHelper$$ExternalSyntheticLambda0 = new kR();
    private final setContentCaptureSession<kP> setIconTintList;
    private final setContentCaptureSession<kM> setX;
    private final MaterialCheckBox$SavedState$1 setY;

    public kN(MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1) {
        this.setY = materialCheckBox$SavedState$1;
        this.setIconTintList = new setContentCaptureSession<kP>(materialCheckBox$SavedState$1) { // from class: o.kN.3
            @Override // o.setOnDragListener
            public final String MenuHostHelper$$ExternalSyntheticLambda0() {
                return "INSERT OR REPLACE INTO `News` (`categories`,`description`,`image_url`,`keywords`,`language`,`published_at`,`snippet`,`source`,`title`,`url`,`uuid`,`isSaved`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // o.setContentCaptureSession
            public final /* synthetic */ void setY(setTextSelectHandleRight settextselecthandleright, kP kPVar) {
                kP kPVar2 = kPVar;
                kR unused = kN.this.MenuHostHelper$$ExternalSyntheticLambda0;
                String y = kR.setY(kPVar2.categories);
                if (y == null) {
                    settextselecthandleright.setIconTintList(1);
                } else {
                    settextselecthandleright.setY(1, y);
                }
                if (kPVar2.description == null) {
                    settextselecthandleright.setIconTintList(2);
                } else {
                    settextselecthandleright.setY(2, kPVar2.description);
                }
                if (kPVar2.image_url == null) {
                    settextselecthandleright.setIconTintList(3);
                } else {
                    settextselecthandleright.setY(3, kPVar2.image_url);
                }
                if (kPVar2.keywords == null) {
                    settextselecthandleright.setIconTintList(4);
                } else {
                    settextselecthandleright.setY(4, kPVar2.keywords);
                }
                if (kPVar2.language == null) {
                    settextselecthandleright.setIconTintList(5);
                } else {
                    settextselecthandleright.setY(5, kPVar2.language);
                }
                if (kPVar2.published_at == null) {
                    settextselecthandleright.setIconTintList(6);
                } else {
                    settextselecthandleright.setY(6, kPVar2.published_at);
                }
                if (kPVar2.snippet == null) {
                    settextselecthandleright.setIconTintList(7);
                } else {
                    settextselecthandleright.setY(7, kPVar2.snippet);
                }
                if (kPVar2.source == null) {
                    settextselecthandleright.setIconTintList(8);
                } else {
                    settextselecthandleright.setY(8, kPVar2.source);
                }
                if (kPVar2.title == null) {
                    settextselecthandleright.setIconTintList(9);
                } else {
                    settextselecthandleright.setY(9, kPVar2.title);
                }
                if (kPVar2.url == null) {
                    settextselecthandleright.setIconTintList(10);
                } else {
                    settextselecthandleright.setY(10, kPVar2.url);
                }
                if (kPVar2.uuid == null) {
                    settextselecthandleright.setIconTintList(11);
                } else {
                    settextselecthandleright.setY(11, kPVar2.uuid);
                }
                settextselecthandleright.setY(12, kPVar2.isSaved ? 1L : 0L);
            }
        };
        this.setX = new setContentCaptureSession<kM>(materialCheckBox$SavedState$1) { // from class: o.kN.4
            @Override // o.setOnDragListener
            public final String MenuHostHelper$$ExternalSyntheticLambda0() {
                return "INSERT OR REPLACE INTO `newEntity` (`id`,`list`) VALUES (?,?)";
            }

            @Override // o.setContentCaptureSession
            public final /* synthetic */ void setY(setTextSelectHandleRight settextselecthandleright, kM kMVar) {
                kM kMVar2 = kMVar;
                settextselecthandleright.setY(1, kMVar2.MenuHostHelper$$ExternalSyntheticLambda0);
                kR unused = kN.this.MenuHostHelper$$ExternalSyntheticLambda0;
                String y = kR.setY(kMVar2.setX);
                if (y == null) {
                    settextselecthandleright.setIconTintList(2);
                } else {
                    settextselecthandleright.setY(2, y);
                }
            }
        };
    }

    @Override // o.kO
    public final void setY(kP kPVar) {
        this.setY.setY();
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
        try {
            this.setIconTintList.setIconTintList(kPVar);
            this.setY.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener();
            MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1 = this.setY;
            setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist = materialCheckBox$SavedState$1.setY;
            if (setpasswordvisibilitytoggletintlist == null) {
                materialCheckBox$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0();
            } else {
                setpasswordvisibilitytoggletintlist.setY(new FloatingActionButton$Behavior(materialCheckBox$SavedState$1));
            }
        } catch (Throwable th) {
            MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$12 = this.setY;
            setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist2 = materialCheckBox$SavedState$12.setY;
            if (setpasswordvisibilitytoggletintlist2 == null) {
                materialCheckBox$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0();
            } else {
                setpasswordvisibilitytoggletintlist2.setY(new FloatingActionButton$Behavior(materialCheckBox$SavedState$12));
            }
            throw th;
        }
    }

    @Override // o.kO
    public final void setIconTintList(kM kMVar) {
        this.setY.setY();
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
        try {
            this.setX.setIconTintList(kMVar);
            this.setY.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener();
            MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1 = this.setY;
            setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist = materialCheckBox$SavedState$1.setY;
            if (setpasswordvisibilitytoggletintlist == null) {
                materialCheckBox$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0();
            } else {
                setpasswordvisibilitytoggletintlist.setY(new FloatingActionButton$Behavior(materialCheckBox$SavedState$1));
            }
        } catch (Throwable th) {
            MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$12 = this.setY;
            setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist2 = materialCheckBox$SavedState$12.setY;
            if (setpasswordvisibilitytoggletintlist2 == null) {
                materialCheckBox$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0();
            } else {
                setpasswordvisibilitytoggletintlist2.setY(new FloatingActionButton$Behavior(materialCheckBox$SavedState$12));
            }
            throw th;
        }
    }

    @Override // o.kO
    public final List<kP> setY() {
        setDividerPadding MenuHostHelper$$ExternalSyntheticLambda1 = setDividerPadding.MenuHostHelper$$ExternalSyntheticLambda1("select * from news", 0);
        this.setY.setY();
        Cursor MenuHostHelper$$ExternalSyntheticLambda12 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, null);
        try {
            int x = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "categories");
            int x2 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "description");
            int x3 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "image_url");
            int x4 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "keywords");
            int x5 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "language");
            int x6 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "published_at");
            int x7 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "snippet");
            int x8 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "source");
            int x9 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "title");
            int x10 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "url");
            int x11 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "uuid");
            int x12 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "isSaved");
            ArrayList arrayList = new ArrayList(MenuHostHelper$$ExternalSyntheticLambda12.getCount());
            while (MenuHostHelper$$ExternalSyntheticLambda12.moveToNext()) {
                arrayList.add(new kP(kR.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12.isNull(x) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x)), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x2) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x2), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x3) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x3), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x4) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x4), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x5) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x5), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x6) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x6), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x7) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x7), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x8) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x8), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x9) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x9), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x10) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x10), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x11) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x11), MenuHostHelper$$ExternalSyntheticLambda12.getInt(x12) != 0));
            }
            return arrayList;
        } finally {
            MenuHostHelper$$ExternalSyntheticLambda12.close();
            MenuHostHelper$$ExternalSyntheticLambda1.setX();
        }
    }

    @Override // o.kO
    public final kP setIconTintList(String str) {
        setDividerPadding MenuHostHelper$$ExternalSyntheticLambda1 = setDividerPadding.MenuHostHelper$$ExternalSyntheticLambda1("select * from news where uuid = ?", 1);
        if (str == null) {
            MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0[1] = 1;
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0[1] = 4;
            MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple[1] = str;
        }
        this.setY.setY();
        kP kPVar = null;
        Cursor MenuHostHelper$$ExternalSyntheticLambda12 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, null);
        try {
            int x = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "categories");
            int x2 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "description");
            int x3 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "image_url");
            int x4 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "keywords");
            int x5 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "language");
            int x6 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "published_at");
            int x7 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "snippet");
            int x8 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "source");
            int x9 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "title");
            int x10 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "url");
            int x11 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "uuid");
            int x12 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "isSaved");
            if (MenuHostHelper$$ExternalSyntheticLambda12.moveToFirst()) {
                kPVar = new kP(kR.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12.isNull(x) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x)), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x2) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x2), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x3) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x3), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x4) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x4), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x5) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x5), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x6) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x6), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x7) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x7), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x8) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x8), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x9) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x9), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x10) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x10), MenuHostHelper$$ExternalSyntheticLambda12.isNull(x11) ? null : MenuHostHelper$$ExternalSyntheticLambda12.getString(x11), MenuHostHelper$$ExternalSyntheticLambda12.getInt(x12) != 0);
            }
            return kPVar;
        } finally {
            MenuHostHelper$$ExternalSyntheticLambda12.close();
            MenuHostHelper$$ExternalSyntheticLambda1.setX();
        }
    }

    @Override // o.kO
    public final kM MenuHostHelper$$ExternalSyntheticLambda1() {
        setDividerPadding MenuHostHelper$$ExternalSyntheticLambda1 = setDividerPadding.MenuHostHelper$$ExternalSyntheticLambda1("select * from newEntity where id = 0", 0);
        this.setY.setY();
        kM kMVar = null;
        String string = null;
        Cursor MenuHostHelper$$ExternalSyntheticLambda12 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, null);
        try {
            int x = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "id");
            int x2 = setEndIconActivated.setX(MenuHostHelper$$ExternalSyntheticLambda12, "list");
            if (MenuHostHelper$$ExternalSyntheticLambda12.moveToFirst()) {
                int i = MenuHostHelper$$ExternalSyntheticLambda12.getInt(x);
                if (!MenuHostHelper$$ExternalSyntheticLambda12.isNull(x2)) {
                    string = MenuHostHelper$$ExternalSyntheticLambda12.getString(x2);
                }
                kMVar = new kM(i, kR.setIconTintList(string));
            }
            return kMVar;
        } finally {
            MenuHostHelper$$ExternalSyntheticLambda12.close();
            MenuHostHelper$$ExternalSyntheticLambda1.setX();
        }
    }
}