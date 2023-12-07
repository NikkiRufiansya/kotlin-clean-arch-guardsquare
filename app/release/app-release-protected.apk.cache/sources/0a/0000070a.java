package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class mU {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final Bitmap.Config MenuHostHelper$$ExternalSyntheticLambda1;
    private C0318nf ViewPager$SavedState$1;
    private final setIconTintList setCenterIfNoTextEnabled;
    private mI setChipCornerRadius;
    private mD setIconSize;
    final Context setIconTintList;
    boolean setLayoutAnimation;
    final setOnLongClickListener setNavigationOnClickListener;
    volatile boolean setOnLongClickListener;
    private Map<Object, mH> setOnNavigationItemSelectedListener;
    private Map<ImageView, mJ> setTextScaleX;
    final ReferenceQueue<Object> setUiOptions;
    final List<AbstractC0315nc> setUnboundedRipple;
    final mU$MenuHostHelper$$ExternalSyntheticLambda0 setX;
    static final Handler setY = new Handler(Looper.getMainLooper()) { // from class: o.mU.4
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                mH mHVar = (mH) message.obj;
                if (mHVar.setUnboundedRipple.setOnLongClickListener) {
                    C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Main", "canceled", mHVar.setOnLongClickListener.setIconTintList(), "target got garbage collected");
                }
                mU mUVar = mHVar.setUnboundedRipple;
                Reference reference = mHVar.setIconSize;
                mUVar.MenuHostHelper$$ExternalSyntheticLambda1(reference != null ? reference.get() : null);
                return;
            }
            if (i != 8) {
                if (i == 13) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        mH mHVar2 = (mH) list.get(i2);
                        mU mUVar2 = mHVar2.setUnboundedRipple;
                        Bitmap MenuHostHelper$$ExternalSyntheticLambda1 = mT.setY(mHVar2.MenuHostHelper$$ExternalSyntheticLambda1) ? mUVar2.MenuHostHelper$$ExternalSyntheticLambda1(mHVar2.setY) : null;
                        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                            mUVar2.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, mU$MenuHostHelper$$ExternalSyntheticLambda1.MEMORY, mHVar2, null);
                            if (mUVar2.setOnLongClickListener) {
                                String iconTintList = mHVar2.setOnLongClickListener.setIconTintList();
                                StringBuilder sb = new StringBuilder("from ");
                                sb.append(mU$MenuHostHelper$$ExternalSyntheticLambda1.MEMORY);
                                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Main", "completed", iconTintList, sb.toString());
                            }
                        } else {
                            mUVar2.setX(mHVar2);
                            if (mUVar2.setOnLongClickListener) {
                                C0321ni.MenuHostHelper$$ExternalSyntheticLambda1("Main", "resumed", mHVar2.setOnLongClickListener.setIconTintList());
                            }
                        }
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Unknown handler message received: ");
                sb2.append(message.what);
                throw new AssertionError(sb2.toString());
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                mE mEVar = (mE) list2.get(i3);
                mU mUVar3 = mEVar.setUiOptions;
                mH mHVar3 = mEVar.setIconTintList;
                List<mH> list3 = mEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                boolean z = true;
                boolean z2 = (list3 == null || list3.isEmpty()) ? false : true;
                if (mHVar3 == null && !z2) {
                    z = false;
                }
                if (z) {
                    Uri uri = mEVar.MenuHostHelper$$ExternalSyntheticLambda1.setZ;
                    Exception exc = mEVar.setY;
                    Bitmap bitmap = mEVar.setTextAlignment;
                    mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1 = mEVar.setNavigationOnClickListener;
                    if (mHVar3 != null) {
                        mUVar3.MenuHostHelper$$ExternalSyntheticLambda0(bitmap, mu_menuhosthelper__externalsyntheticlambda1, mHVar3, exc);
                    }
                    if (z2) {
                        int size3 = list3.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            mUVar3.MenuHostHelper$$ExternalSyntheticLambda0(bitmap, mu_menuhosthelper__externalsyntheticlambda1, list3.get(i4), exc);
                        }
                    }
                    mU$MenuHostHelper$$ExternalSyntheticLambda0 mu_menuhosthelper__externalsyntheticlambda0 = mUVar3.setX;
                }
            }
        }
    };
    private static volatile mU setTextAlignment = null;

    /* loaded from: classes.dex */
    public interface setOnLongClickListener {
        public static final setOnLongClickListener MenuHostHelper$$ExternalSyntheticLambda1 = new setOnLongClickListener() { // from class: o.mU.setOnLongClickListener.1
            @Override // o.mU.setOnLongClickListener
            public final mY MenuHostHelper$$ExternalSyntheticLambda1(mY mYVar) {
                return mYVar;
            }
        };

        mY MenuHostHelper$$ExternalSyntheticLambda1(mY mYVar);
    }

    /* loaded from: classes.dex */
    public enum setY {
        LOW,
        NORMAL,
        /* JADX INFO: Fake field, exist only in values array */
        HIGH
    }

    private mU(Context context, mI mIVar, mD mDVar, mU$MenuHostHelper$$ExternalSyntheticLambda0 mu_menuhosthelper__externalsyntheticlambda0, setOnLongClickListener setonlongclicklistener, List<AbstractC0315nc> list, C0318nf c0318nf, Bitmap.Config config, boolean z, boolean z2) {
        this.setIconTintList = context;
        this.setChipCornerRadius = mIVar;
        this.setIconSize = mDVar;
        this.setX = mu_menuhosthelper__externalsyntheticlambda0;
        this.setNavigationOnClickListener = setonlongclicklistener;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C0316nd(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new mM(context));
        arrayList.add(new mP(context));
        arrayList.add(new mK(context));
        arrayList.add(new mF(context));
        arrayList.add(new mO(context));
        arrayList.add(new mW(mIVar.setY, c0318nf));
        this.setUnboundedRipple = Collections.unmodifiableList(arrayList);
        this.ViewPager$SavedState$1 = c0318nf;
        this.setOnNavigationItemSelectedListener = new WeakHashMap();
        this.setTextScaleX = new WeakHashMap();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        this.setOnLongClickListener = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.setUiOptions = referenceQueue;
        setIconTintList seticontintlist = new setIconTintList(referenceQueue, setY);
        this.setCenterIfNoTextEnabled = seticontintlist;
        seticontintlist.start();
    }

    public final mX setY(String str) {
        if (str == null) {
            return new mX(this, null);
        }
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Path must not be empty.");
        }
        return new mX(this, Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bitmap MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        Bitmap x = this.setIconSize.setX(str);
        if (x != null) {
            this.ViewPager$SavedState$1.setOnLongClickListener.sendEmptyMessage(0);
        } else {
            this.ViewPager$SavedState$1.setOnLongClickListener.sendEmptyMessage(1);
        }
        return x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        C0321ni.setIconTintList();
        mH remove = this.setOnNavigationItemSelectedListener.remove(obj);
        if (remove != null) {
            remove.setIconTintList();
            Handler handler = this.setChipCornerRadius.setNavigationOnClickListener;
            handler.sendMessage(handler.obtainMessage(2, remove));
        }
        if (obj instanceof ImageView) {
            mJ remove2 = this.setTextScaleX.remove((ImageView) obj);
            if (remove2 == null) {
                return;
            }
            mX mXVar = remove2.setY;
            remove2.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            WeakReference<ImageView> weakReference = remove2.setX;
            throw null;
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends Thread {
        private final Handler MenuHostHelper$$ExternalSyntheticLambda0;
        private final ReferenceQueue<Object> setY;

        setIconTintList(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.setY = referenceQueue;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    mH$MenuHostHelper$$ExternalSyntheticLambda1 mh_menuhosthelper__externalsyntheticlambda1 = (mH$MenuHostHelper$$ExternalSyntheticLambda1) this.setY.remove(1000L);
                    Message obtainMessage = this.MenuHostHelper$$ExternalSyntheticLambda0.obtainMessage();
                    if (mh_menuhosthelper__externalsyntheticlambda1 != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = mh_menuhosthelper__externalsyntheticlambda1.setX;
                        this.MenuHostHelper$$ExternalSyntheticLambda0.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.post(new Runnable() { // from class: o.mU.setIconTintList.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }
    }

    public static mU MenuHostHelper$$ExternalSyntheticLambda1() {
        if (setTextAlignment == null) {
            synchronized (mU.class) {
                if (setTextAlignment == null) {
                    if (mZ.setIconTintList == null) {
                        throw new IllegalStateException("context == null");
                    }
                    setX setx = new setX(mZ.setIconTintList);
                    Context context = setx.setX;
                    if (setx.setIconTintList == null) {
                        setx.setIconTintList = new mS(context);
                    }
                    if (setx.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                        setx.MenuHostHelper$$ExternalSyntheticLambda1 = new mN(context);
                    }
                    if (setx.setLayoutAnimation == null) {
                        setx.setLayoutAnimation = new C0314nb();
                    }
                    if (setx.setUiOptions == null) {
                        setx.setUiOptions = setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    C0318nf c0318nf = new C0318nf(setx.MenuHostHelper$$ExternalSyntheticLambda1);
                    setTextAlignment = new mU(context, new mI(context, setx.setLayoutAnimation, setY, setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda1, c0318nf), setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setOnLongClickListener, setx.setUiOptions, setx.setNavigationOnClickListener, c0318nf, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setY, setx.setUnboundedRipple);
                }
            }
        }
        return setTextAlignment;
    }

    /* loaded from: classes.dex */
    public static class setX {
        Bitmap.Config MenuHostHelper$$ExternalSyntheticLambda0;
        mD MenuHostHelper$$ExternalSyntheticLambda1;
        mL setIconTintList;
        ExecutorService setLayoutAnimation;
        List<AbstractC0315nc> setNavigationOnClickListener;
        mU$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener;
        setOnLongClickListener setUiOptions;
        boolean setUnboundedRipple;
        final Context setX;
        boolean setY;

        public setX(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.setX = context.getApplicationContext();
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(Bitmap bitmap, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1, mH mHVar, Exception exc) {
        if (mHVar.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        if (!mHVar.setCenterIfNoTextEnabled) {
            Map<Object, mH> map = this.setOnNavigationItemSelectedListener;
            Reference reference = mHVar.setIconSize;
            map.remove(reference == null ? null : reference.get());
        }
        if (bitmap == null) {
            mHVar.setY();
            if (this.setOnLongClickListener) {
                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Main", "errored", mHVar.setOnLongClickListener.setIconTintList(), exc.getMessage());
            }
        } else if (mu_menuhosthelper__externalsyntheticlambda1 == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        } else {
            mHVar.MenuHostHelper$$ExternalSyntheticLambda0(bitmap, mu_menuhosthelper__externalsyntheticlambda1);
            if (this.setOnLongClickListener) {
                String iconTintList = mHVar.setOnLongClickListener.setIconTintList();
                StringBuilder sb = new StringBuilder("from ");
                sb.append(mu_menuhosthelper__externalsyntheticlambda1);
                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Main", "completed", iconTintList, sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(mH mHVar) {
        Reference reference = mHVar.setIconSize;
        Object obj = reference == null ? null : reference.get();
        if (obj != null && this.setOnNavigationItemSelectedListener.get(obj) != mHVar) {
            MenuHostHelper$$ExternalSyntheticLambda1(obj);
            this.setOnNavigationItemSelectedListener.put(obj, mHVar);
        }
        Handler handler = this.setChipCornerRadius.setNavigationOnClickListener;
        handler.sendMessage(handler.obtainMessage(1, mHVar));
    }
}