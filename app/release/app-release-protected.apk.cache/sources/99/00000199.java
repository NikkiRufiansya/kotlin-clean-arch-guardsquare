package o;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.setMIndicatorOptions;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class FabTransformationScrimBehavior {
    private static HashMap<String, Constructor<? extends setLayoutMode>> setIconTintList;
    HashMap<Integer, ArrayList<setLayoutMode>> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends setLayoutMode>> hashMap = new HashMap<>();
        setIconTintList = hashMap;
        try {
            hashMap.put("KeyAttribute", wait.class.getConstructor(new Class[0]));
            setIconTintList.put("KeyPosition", onContextItemSelected.class.getConstructor(new Class[0]));
            setIconTintList.put("KeyCycle", setErrorTextAppearance.class.getConstructor(new Class[0]));
            setIconTintList.put("KeyTimeCycle", BottomSheetBehavior$SavedState$1.class.getConstructor(new Class[0]));
            setIconTintList.put("KeyTrigger", setTypeface.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setLayoutMode setlayoutmode) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(Integer.valueOf(setlayoutmode.MenuHostHelper$$ExternalSyntheticLambda1))) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.put(Integer.valueOf(setlayoutmode.MenuHostHelper$$ExternalSyntheticLambda1), new ArrayList<>());
        }
        ArrayList<setLayoutMode> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda1.get(Integer.valueOf(setlayoutmode.MenuHostHelper$$ExternalSyntheticLambda1));
        if (arrayList != null) {
            arrayList.add(setlayoutmode);
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, XmlPullParser xmlPullParser) {
        Exception e;
        setLayoutMode setlayoutmode;
        Constructor<? extends setLayoutMode> constructor;
        try {
            int eventType = xmlPullParser.getEventType();
            setLayoutMode setlayoutmode2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (setIconTintList.containsKey(name)) {
                        try {
                            constructor = setIconTintList.get(name);
                        } catch (Exception e2) {
                            setLayoutMode setlayoutmode3 = setlayoutmode2;
                            e = e2;
                            setlayoutmode = setlayoutmode3;
                        }
                        if (constructor != null) {
                            setlayoutmode = constructor.newInstance(new Object[0]);
                            try {
                                setlayoutmode.setIconTintList(context, Xml.asAttributeSet(xmlPullParser));
                                MenuHostHelper$$ExternalSyntheticLambda1(setlayoutmode);
                            } catch (Exception e3) {
                                e = e3;
                                Log.e("KeyFrames", "unable to create ", e);
                                setlayoutmode2 = setlayoutmode;
                                continue;
                                eventType = xmlPullParser.next();
                            }
                            setlayoutmode2 = setlayoutmode;
                            continue;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Keymaker for ");
                            sb.append(name);
                            sb.append(" not found");
                            throw new NullPointerException(sb.toString());
                            break;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (setlayoutmode2 != null && setlayoutmode2.setY != null) {
                            setActiveIndicatorDrawable.setY(context, xmlPullParser, setlayoutmode2.setY);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && setlayoutmode2 != null && setlayoutmode2.setY != null) {
                        setActiveIndicatorDrawable.setY(context, xmlPullParser, setlayoutmode2.setY);
                        continue;
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public final void setY(setIconStartPadding seticonstartpadding) {
        ArrayList<setLayoutMode> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda1.get(Integer.valueOf(seticonstartpadding.setNavigationOnClickListener));
        if (arrayList != null) {
            seticonstartpadding.setChipCornerRadius.addAll(arrayList);
        }
        ArrayList<setLayoutMode> arrayList2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(-1);
        if (arrayList2 != null) {
            Iterator<setLayoutMode> it = arrayList2.iterator();
            while (it.hasNext()) {
                setLayoutMode next = it.next();
                String str = ((setMIndicatorOptions.setIconTintList) seticonstartpadding.setTextAppearanceResource.getLayoutParams()).ViewPager$SavedState$1;
                String str2 = next.MenuHostHelper$$ExternalSyntheticLambda0;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    seticonstartpadding.setChipCornerRadius.add(next);
                }
            }
        }
    }
}