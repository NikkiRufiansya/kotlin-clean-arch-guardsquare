package com.rmldemo.guardsquare.data.local;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.MaterialCheckBox$SavedState$1;
import o.kN;
import o.kO;
import o.setCheckedState;
import o.setImageResource;
import o.setImageResource$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setOnEditorActionListener;
import o.setOnFocusChangeListener;
import o.setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setSelectedTabIndicatorHeight;
import o.setSlideProgress;
import o.setTextAppearance;
import o.setWindowCallback;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile kO setNavigationOnClickListener;

    @Override // o.MaterialCheckBox$SavedState$1
    public final setImageResource setX(setSelectedTabIndicatorHeight setselectedtabindicatorheight) {
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener(setselectedtabindicatorheight, new setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: com.rmldemo.guardsquare.data.local.AppDatabase_Impl.5
            @Override // o.setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setY(setWindowCallback setwindowcallback) {
                setwindowcallback.setY("CREATE TABLE IF NOT EXISTS `News` (`categories` TEXT, `description` TEXT, `image_url` TEXT, `keywords` TEXT, `language` TEXT, `published_at` TEXT, `snippet` TEXT, `source` TEXT, `title` TEXT, `url` TEXT, `uuid` TEXT NOT NULL, `isSaved` INTEGER NOT NULL, PRIMARY KEY(`uuid`))");
                setwindowcallback.setY("CREATE TABLE IF NOT EXISTS `newEntity` (`id` INTEGER NOT NULL, `list` TEXT, PRIMARY KEY(`id`))");
                setwindowcallback.setY("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                setwindowcallback.setY("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '60be97c95466a179bf70c74f77cad4b0')");
            }

            @Override // o.setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback) {
                setwindowcallback.setY("DROP TABLE IF EXISTS `News`");
                setwindowcallback.setY("DROP TABLE IF EXISTS `newEntity`");
                if (AppDatabase_Impl.this.setIconTintList != null) {
                    int size = AppDatabase_Impl.this.setIconTintList.size();
                    for (int i = 0; i < size; i++) {
                        MaterialCheckBox$SavedState$1.setX setx = (MaterialCheckBox$SavedState$1.setX) AppDatabase_Impl.this.setIconTintList.get(i);
                    }
                }
            }

            @Override // o.setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1
            public final void MenuHostHelper$$ExternalSyntheticLambda0() {
                if (AppDatabase_Impl.this.setIconTintList != null) {
                    int size = AppDatabase_Impl.this.setIconTintList.size();
                    for (int i = 0; i < size; i++) {
                        MaterialCheckBox$SavedState$1.setX setx = (MaterialCheckBox$SavedState$1.setX) AppDatabase_Impl.this.setIconTintList.get(i);
                    }
                }
            }

            @Override // o.setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setIconTintList(setWindowCallback setwindowcallback) {
                AppDatabase_Impl.this.MenuHostHelper$$ExternalSyntheticLambda0 = setwindowcallback;
                AppDatabase_Impl.this.setX(setwindowcallback);
                if (AppDatabase_Impl.this.setIconTintList != null) {
                    int size = AppDatabase_Impl.this.setIconTintList.size();
                    for (int i = 0; i < size; i++) {
                        MaterialCheckBox$SavedState$1.setX setx = (MaterialCheckBox$SavedState$1.setX) AppDatabase_Impl.this.setIconTintList.get(i);
                    }
                }
            }

            @Override // o.setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1
            public final setOnFocusChangeListener.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(setWindowCallback setwindowcallback) {
                HashMap hashMap = new HashMap(12);
                hashMap.put("categories", new setOnEditorActionListener.setIconTintList("categories", "TEXT", false, 0, null, 1));
                hashMap.put("description", new setOnEditorActionListener.setIconTintList("description", "TEXT", false, 0, null, 1));
                hashMap.put("image_url", new setOnEditorActionListener.setIconTintList("image_url", "TEXT", false, 0, null, 1));
                hashMap.put("keywords", new setOnEditorActionListener.setIconTintList("keywords", "TEXT", false, 0, null, 1));
                hashMap.put("language", new setOnEditorActionListener.setIconTintList("language", "TEXT", false, 0, null, 1));
                hashMap.put("published_at", new setOnEditorActionListener.setIconTintList("published_at", "TEXT", false, 0, null, 1));
                hashMap.put("snippet", new setOnEditorActionListener.setIconTintList("snippet", "TEXT", false, 0, null, 1));
                hashMap.put("source", new setOnEditorActionListener.setIconTintList("source", "TEXT", false, 0, null, 1));
                hashMap.put("title", new setOnEditorActionListener.setIconTintList("title", "TEXT", false, 0, null, 1));
                hashMap.put("url", new setOnEditorActionListener.setIconTintList("url", "TEXT", false, 0, null, 1));
                hashMap.put("uuid", new setOnEditorActionListener.setIconTintList("uuid", "TEXT", true, 1, null, 1));
                hashMap.put("isSaved", new setOnEditorActionListener.setIconTintList("isSaved", "INTEGER", true, 0, null, 1));
                setOnEditorActionListener setoneditoractionlistener = new setOnEditorActionListener("News", hashMap, new HashSet(0), new HashSet(0));
                setOnEditorActionListener setoneditoractionlistener2 = new setOnEditorActionListener("News", setOnEditorActionListener.MenuHostHelper$$ExternalSyntheticLambda1(setwindowcallback, "News"), setOnEditorActionListener.setIconTintList(setwindowcallback, "News"), setOnEditorActionListener.setX(setwindowcallback, "News"));
                if (!setoneditoractionlistener.equals(setoneditoractionlistener2)) {
                    StringBuilder sb = new StringBuilder("News(com.rmldemo.guardsquare.data.models.news_by_category.News).\n Expected:\n");
                    sb.append(setoneditoractionlistener);
                    sb.append("\n Found:\n");
                    sb.append(setoneditoractionlistener2);
                    return new setOnFocusChangeListener.setIconTintList(false, sb.toString());
                }
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("id", new setOnEditorActionListener.setIconTintList("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("list", new setOnEditorActionListener.setIconTintList("list", "TEXT", false, 0, null, 1));
                setOnEditorActionListener setoneditoractionlistener3 = new setOnEditorActionListener("newEntity", hashMap2, new HashSet(0), new HashSet(0));
                setOnEditorActionListener setoneditoractionlistener4 = new setOnEditorActionListener("newEntity", setOnEditorActionListener.MenuHostHelper$$ExternalSyntheticLambda1(setwindowcallback, "newEntity"), setOnEditorActionListener.setIconTintList(setwindowcallback, "newEntity"), setOnEditorActionListener.setX(setwindowcallback, "newEntity"));
                if (!setoneditoractionlistener3.equals(setoneditoractionlistener4)) {
                    StringBuilder sb2 = new StringBuilder("newEntity(com.rmldemo.guardsquare.data.models.PrimaryNewsUUID).\n Expected:\n");
                    sb2.append(setoneditoractionlistener3);
                    sb2.append("\n Found:\n");
                    sb2.append(setoneditoractionlistener4);
                    return new setOnFocusChangeListener.setIconTintList(false, sb2.toString());
                }
                return new setOnFocusChangeListener.setIconTintList(true, null);
            }

            @Override // o.setOnFocusChangeListener$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setX(setWindowCallback setwindowcallback) {
                ArrayList<String> arrayList = new ArrayList();
                Cursor x = setwindowcallback.setX("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (x.moveToNext()) {
                    try {
                        arrayList.add(x.getString(0));
                    } catch (Throwable th) {
                        x.close();
                        throw th;
                    }
                }
                x.close();
                for (String str : arrayList) {
                    if (str.startsWith("room_fts_content_sync_")) {
                        StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                        sb.append(str);
                        setwindowcallback.setY(sb.toString());
                    }
                }
            }
        }, "60be97c95466a179bf70c74f77cad4b0", "8a27bd59d5a7c5054b13166c164fadc7");
        setImageResource$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1 setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1 = new setImageResource$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1(setselectedtabindicatorheight.setIconTintList);
        setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = setselectedtabindicatorheight.setCenterIfNoTextEnabled;
        setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1.setIconTintList = setonfocuschangelistener;
        return setselectedtabindicatorheight.setMaxEms.setX(setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1());
    }

    @Override // o.MaterialCheckBox$SavedState$1
    public final setTextAppearance setX() {
        return new setTextAppearance(this, new HashMap(0), new HashMap(0), "News", "newEntity");
    }

    @Override // o.MaterialCheckBox$SavedState$1
    public final Map<Class<?>, List<Class<?>>> setOnLongClickListener() {
        List<Class<?>> emptyList;
        HashMap hashMap = new HashMap();
        emptyList = Collections.emptyList();
        hashMap.put(kO.class, emptyList);
        return hashMap;
    }

    @Override // o.MaterialCheckBox$SavedState$1
    public final Set<Class<? extends setCheckedState>> setUnboundedRipple() {
        return new HashSet();
    }

    @Override // o.MaterialCheckBox$SavedState$1
    public final List<setSlideProgress> setLayoutAnimation() {
        return Arrays.asList(new setSlideProgress[0]);
    }

    @Override // com.rmldemo.guardsquare.data.local.AppDatabase
    public final kO setTextAlignment() {
        kO kOVar;
        if (this.setNavigationOnClickListener != null) {
            return this.setNavigationOnClickListener;
        }
        synchronized (this) {
            if (this.setNavigationOnClickListener == null) {
                this.setNavigationOnClickListener = new kN(this);
            }
            kOVar = this.setNavigationOnClickListener;
        }
        return kOVar;
    }
}