package o;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class joinThreadPool {
    private static joinThreadPool setX = new joinThreadPool();
    public static String[] setY = {"standard", "accelerate", "decelerate", "linear"};
    String MenuHostHelper$$ExternalSyntheticLambda1 = "identity";

    public double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
        return 1.0d;
    }

    public double setIconTintList(double d) {
        return d;
    }

    public static joinThreadPool setIconTintList(final String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new joinThreadPool(str) { // from class: o.joinThreadPool$MenuHostHelper$$ExternalSyntheticLambda0
                private double MenuHostHelper$$ExternalSyntheticLambda0;
                private double setIconTintList;
                private double setOnLongClickListener;
                private double setX;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                    int indexOf = str.indexOf(40);
                    int indexOf2 = str.indexOf(44, indexOf);
                    this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                    int i = indexOf2 + 1;
                    int indexOf3 = str.indexOf(44, i);
                    this.setX = Double.parseDouble(str.substring(i, indexOf3).trim());
                    int i2 = indexOf3 + 1;
                    int indexOf4 = str.indexOf(44, i2);
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
                    int i3 = indexOf4 + 1;
                    this.setOnLongClickListener = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                }

                private double setY(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.setIconTintList * d2 * d3 * d) + (this.MenuHostHelper$$ExternalSyntheticLambda0 * d3 * d * d) + (d * d * d);
                }

                private double setX(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.setX * d2 * d3 * d) + (this.setOnLongClickListener * d3 * d * d) + (d * d * d);
                }

                @Override // o.joinThreadPool
                public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    while (d2 > 1.0E-4d) {
                        d2 *= 0.5d;
                        d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                    }
                    double d4 = d3 - d2;
                    double d5 = d3 + d2;
                    return (setX(d5) - setX(d4)) / (setY(d5) - setY(d4));
                }

                @Override // o.joinThreadPool
                public final double setIconTintList(double d) {
                    if (d <= 0.0d) {
                        return 0.0d;
                    }
                    if (d >= 1.0d) {
                        return 1.0d;
                    }
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    while (d2 > 0.01d) {
                        d2 *= 0.5d;
                        d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                    }
                    double d4 = d3 - d2;
                    double y = setY(d4);
                    double d5 = d3 + d2;
                    double y2 = setY(d5);
                    double x = setX(d4);
                    return (((setX(d5) - x) * (d - y)) / (y2 - y)) + x;
                }
            };
        }
        if (str.startsWith("spline")) {
            return new joinThreadPool(str) { // from class: o.ActivityResult$1
                private SearchView MenuHostHelper$$ExternalSyntheticLambda0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                    double[] dArr = new double[this.MenuHostHelper$$ExternalSyntheticLambda1.length() / 2];
                    int indexOf = str.indexOf(40) + 1;
                    int indexOf2 = str.indexOf(44, indexOf);
                    int i = 0;
                    while (indexOf2 != -1) {
                        dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                        indexOf = indexOf2 + 1;
                        indexOf2 = str.indexOf(44, indexOf);
                        i++;
                    }
                    dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
                    double[] copyOf = Arrays.copyOf(dArr, i + 1);
                    int length = (copyOf.length * 3) - 2;
                    int length2 = copyOf.length - 1;
                    double d = 1.0d / length2;
                    double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
                    double[] dArr3 = new double[length];
                    for (int i2 = 0; i2 < copyOf.length; i2++) {
                        double d2 = copyOf[i2];
                        int i3 = i2 + length2;
                        dArr2[i3][0] = d2;
                        double d3 = i2 * d;
                        dArr3[i3] = d3;
                        if (i2 > 0) {
                            int i4 = (length2 << 1) + i2;
                            dArr2[i4][0] = d2 + 1.0d;
                            dArr3[i4] = d3 + 1.0d;
                            int i5 = i2 - 1;
                            dArr2[i5][0] = (d2 - 1.0d) - d;
                            dArr3[i5] = (d3 - 1.0d) - d;
                        }
                    }
                    SearchView searchView = new SearchView(dArr3, dArr2);
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder(" 0 ");
                    sb.append(searchView.MenuHostHelper$$ExternalSyntheticLambda0(0.0d));
                    printStream.println(sb.toString());
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder(" 1 ");
                    sb2.append(searchView.MenuHostHelper$$ExternalSyntheticLambda0(1.0d));
                    printStream2.println(sb2.toString());
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = searchView;
                }

                @Override // o.joinThreadPool
                public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                    return this.MenuHostHelper$$ExternalSyntheticLambda0.setY(d, 0);
                }

                @Override // o.joinThreadPool
                public final double setIconTintList(double d) {
                    return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(d);
                }
            };
        }
        if (str.startsWith("Schlick")) {
            return new setOnCheckedChangeListener(str);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c == 5) {
                                return new joinThreadPool("cubic(0.4, 0.0, 0.2, 1)") { // from class: o.joinThreadPool$MenuHostHelper$$ExternalSyntheticLambda0
                                    private double MenuHostHelper$$ExternalSyntheticLambda0;
                                    private double setIconTintList;
                                    private double setOnLongClickListener;
                                    private double setX;

                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    {
                                        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                                        int indexOf = str.indexOf(40);
                                        int indexOf2 = str.indexOf(44, indexOf);
                                        this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                                        int i = indexOf2 + 1;
                                        int indexOf3 = str.indexOf(44, i);
                                        this.setX = Double.parseDouble(str.substring(i, indexOf3).trim());
                                        int i2 = indexOf3 + 1;
                                        int indexOf4 = str.indexOf(44, i2);
                                        this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
                                        int i3 = indexOf4 + 1;
                                        this.setOnLongClickListener = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                                    }

                                    private double setY(double d) {
                                        double d2 = 1.0d - d;
                                        double d3 = 3.0d * d2;
                                        return (this.setIconTintList * d2 * d3 * d) + (this.MenuHostHelper$$ExternalSyntheticLambda0 * d3 * d * d) + (d * d * d);
                                    }

                                    private double setX(double d) {
                                        double d2 = 1.0d - d;
                                        double d3 = 3.0d * d2;
                                        return (this.setX * d2 * d3 * d) + (this.setOnLongClickListener * d3 * d * d) + (d * d * d);
                                    }

                                    @Override // o.joinThreadPool
                                    public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                                        double d2 = 0.5d;
                                        double d3 = 0.5d;
                                        while (d2 > 1.0E-4d) {
                                            d2 *= 0.5d;
                                            d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                                        }
                                        double d4 = d3 - d2;
                                        double d5 = d3 + d2;
                                        return (setX(d5) - setX(d4)) / (setY(d5) - setY(d4));
                                    }

                                    @Override // o.joinThreadPool
                                    public final double setIconTintList(double d) {
                                        if (d <= 0.0d) {
                                            return 0.0d;
                                        }
                                        if (d >= 1.0d) {
                                            return 1.0d;
                                        }
                                        double d2 = 0.5d;
                                        double d3 = 0.5d;
                                        while (d2 > 0.01d) {
                                            d2 *= 0.5d;
                                            d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                                        }
                                        double d4 = d3 - d2;
                                        double y = setY(d4);
                                        double d5 = d3 + d2;
                                        double y2 = setY(d5);
                                        double x = setX(d4);
                                        return (((setX(d5) - x) * (d - y)) / (y2 - y)) + x;
                                    }
                                };
                            }
                            PrintStream printStream = System.err;
                            StringBuilder sb = new StringBuilder("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                            sb.append(Arrays.toString(setY));
                            printStream.println(sb.toString());
                            return setX;
                        }
                        return new joinThreadPool("cubic(0.34, 1.56, 0.64, 1)") { // from class: o.joinThreadPool$MenuHostHelper$$ExternalSyntheticLambda0
                            private double MenuHostHelper$$ExternalSyntheticLambda0;
                            private double setIconTintList;
                            private double setOnLongClickListener;
                            private double setX;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                                int indexOf = str.indexOf(40);
                                int indexOf2 = str.indexOf(44, indexOf);
                                this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                                int i = indexOf2 + 1;
                                int indexOf3 = str.indexOf(44, i);
                                this.setX = Double.parseDouble(str.substring(i, indexOf3).trim());
                                int i2 = indexOf3 + 1;
                                int indexOf4 = str.indexOf(44, i2);
                                this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
                                int i3 = indexOf4 + 1;
                                this.setOnLongClickListener = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                            }

                            private double setY(double d) {
                                double d2 = 1.0d - d;
                                double d3 = 3.0d * d2;
                                return (this.setIconTintList * d2 * d3 * d) + (this.MenuHostHelper$$ExternalSyntheticLambda0 * d3 * d * d) + (d * d * d);
                            }

                            private double setX(double d) {
                                double d2 = 1.0d - d;
                                double d3 = 3.0d * d2;
                                return (this.setX * d2 * d3 * d) + (this.setOnLongClickListener * d3 * d * d) + (d * d * d);
                            }

                            @Override // o.joinThreadPool
                            public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                                double d2 = 0.5d;
                                double d3 = 0.5d;
                                while (d2 > 1.0E-4d) {
                                    d2 *= 0.5d;
                                    d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                                }
                                double d4 = d3 - d2;
                                double d5 = d3 + d2;
                                return (setX(d5) - setX(d4)) / (setY(d5) - setY(d4));
                            }

                            @Override // o.joinThreadPool
                            public final double setIconTintList(double d) {
                                if (d <= 0.0d) {
                                    return 0.0d;
                                }
                                if (d >= 1.0d) {
                                    return 1.0d;
                                }
                                double d2 = 0.5d;
                                double d3 = 0.5d;
                                while (d2 > 0.01d) {
                                    d2 *= 0.5d;
                                    d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                                }
                                double d4 = d3 - d2;
                                double y = setY(d4);
                                double d5 = d3 + d2;
                                double y2 = setY(d5);
                                double x = setX(d4);
                                return (((setX(d5) - x) * (d - y)) / (y2 - y)) + x;
                            }
                        };
                    }
                    return new joinThreadPool("cubic(1, 1, 0, 0)") { // from class: o.joinThreadPool$MenuHostHelper$$ExternalSyntheticLambda0
                        private double MenuHostHelper$$ExternalSyntheticLambda0;
                        private double setIconTintList;
                        private double setOnLongClickListener;
                        private double setX;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                            int indexOf = str.indexOf(40);
                            int indexOf2 = str.indexOf(44, indexOf);
                            this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                            int i = indexOf2 + 1;
                            int indexOf3 = str.indexOf(44, i);
                            this.setX = Double.parseDouble(str.substring(i, indexOf3).trim());
                            int i2 = indexOf3 + 1;
                            int indexOf4 = str.indexOf(44, i2);
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
                            int i3 = indexOf4 + 1;
                            this.setOnLongClickListener = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                        }

                        private double setY(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.setIconTintList * d2 * d3 * d) + (this.MenuHostHelper$$ExternalSyntheticLambda0 * d3 * d * d) + (d * d * d);
                        }

                        private double setX(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.setX * d2 * d3 * d) + (this.setOnLongClickListener * d3 * d * d) + (d * d * d);
                        }

                        @Override // o.joinThreadPool
                        public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            while (d2 > 1.0E-4d) {
                                d2 *= 0.5d;
                                d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                            }
                            double d4 = d3 - d2;
                            double d5 = d3 + d2;
                            return (setX(d5) - setX(d4)) / (setY(d5) - setY(d4));
                        }

                        @Override // o.joinThreadPool
                        public final double setIconTintList(double d) {
                            if (d <= 0.0d) {
                                return 0.0d;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            while (d2 > 0.01d) {
                                d2 *= 0.5d;
                                d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                            }
                            double d4 = d3 - d2;
                            double y = setY(d4);
                            double d5 = d3 + d2;
                            double y2 = setY(d5);
                            double x = setX(d4);
                            return (((setX(d5) - x) * (d - y)) / (y2 - y)) + x;
                        }
                    };
                }
                return new joinThreadPool("cubic(0.36, 0, 0.66, -0.56)") { // from class: o.joinThreadPool$MenuHostHelper$$ExternalSyntheticLambda0
                    private double MenuHostHelper$$ExternalSyntheticLambda0;
                    private double setIconTintList;
                    private double setOnLongClickListener;
                    private double setX;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                        int indexOf = str.indexOf(40);
                        int indexOf2 = str.indexOf(44, indexOf);
                        this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                        int i = indexOf2 + 1;
                        int indexOf3 = str.indexOf(44, i);
                        this.setX = Double.parseDouble(str.substring(i, indexOf3).trim());
                        int i2 = indexOf3 + 1;
                        int indexOf4 = str.indexOf(44, i2);
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
                        int i3 = indexOf4 + 1;
                        this.setOnLongClickListener = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                    }

                    private double setY(double d) {
                        double d2 = 1.0d - d;
                        double d3 = 3.0d * d2;
                        return (this.setIconTintList * d2 * d3 * d) + (this.MenuHostHelper$$ExternalSyntheticLambda0 * d3 * d * d) + (d * d * d);
                    }

                    private double setX(double d) {
                        double d2 = 1.0d - d;
                        double d3 = 3.0d * d2;
                        return (this.setX * d2 * d3 * d) + (this.setOnLongClickListener * d3 * d * d) + (d * d * d);
                    }

                    @Override // o.joinThreadPool
                    public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                        double d2 = 0.5d;
                        double d3 = 0.5d;
                        while (d2 > 1.0E-4d) {
                            d2 *= 0.5d;
                            d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                        }
                        double d4 = d3 - d2;
                        double d5 = d3 + d2;
                        return (setX(d5) - setX(d4)) / (setY(d5) - setY(d4));
                    }

                    @Override // o.joinThreadPool
                    public final double setIconTintList(double d) {
                        if (d <= 0.0d) {
                            return 0.0d;
                        }
                        if (d >= 1.0d) {
                            return 1.0d;
                        }
                        double d2 = 0.5d;
                        double d3 = 0.5d;
                        while (d2 > 0.01d) {
                            d2 *= 0.5d;
                            d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                        }
                        double d4 = d3 - d2;
                        double y = setY(d4);
                        double d5 = d3 + d2;
                        double y2 = setY(d5);
                        double x = setX(d4);
                        return (((setX(d5) - x) * (d - y)) / (y2 - y)) + x;
                    }
                };
            }
            return new joinThreadPool("cubic(0.0, 0.0, 0.2, 0.95)") { // from class: o.joinThreadPool$MenuHostHelper$$ExternalSyntheticLambda0
                private double MenuHostHelper$$ExternalSyntheticLambda0;
                private double setIconTintList;
                private double setOnLongClickListener;
                private double setX;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                    int indexOf = str.indexOf(40);
                    int indexOf2 = str.indexOf(44, indexOf);
                    this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                    int i = indexOf2 + 1;
                    int indexOf3 = str.indexOf(44, i);
                    this.setX = Double.parseDouble(str.substring(i, indexOf3).trim());
                    int i2 = indexOf3 + 1;
                    int indexOf4 = str.indexOf(44, i2);
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
                    int i3 = indexOf4 + 1;
                    this.setOnLongClickListener = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                }

                private double setY(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.setIconTintList * d2 * d3 * d) + (this.MenuHostHelper$$ExternalSyntheticLambda0 * d3 * d * d) + (d * d * d);
                }

                private double setX(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.setX * d2 * d3 * d) + (this.setOnLongClickListener * d3 * d * d) + (d * d * d);
                }

                @Override // o.joinThreadPool
                public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    while (d2 > 1.0E-4d) {
                        d2 *= 0.5d;
                        d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                    }
                    double d4 = d3 - d2;
                    double d5 = d3 + d2;
                    return (setX(d5) - setX(d4)) / (setY(d5) - setY(d4));
                }

                @Override // o.joinThreadPool
                public final double setIconTintList(double d) {
                    if (d <= 0.0d) {
                        return 0.0d;
                    }
                    if (d >= 1.0d) {
                        return 1.0d;
                    }
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    while (d2 > 0.01d) {
                        d2 *= 0.5d;
                        d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                    }
                    double d4 = d3 - d2;
                    double y = setY(d4);
                    double d5 = d3 + d2;
                    double y2 = setY(d5);
                    double x = setX(d4);
                    return (((setX(d5) - x) * (d - y)) / (y2 - y)) + x;
                }
            };
        }
        return new joinThreadPool("cubic(0.4, 0.05, 0.8, 0.7)") { // from class: o.joinThreadPool$MenuHostHelper$$ExternalSyntheticLambda0
            private double MenuHostHelper$$ExternalSyntheticLambda0;
            private double setIconTintList;
            private double setOnLongClickListener;
            private double setX;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                int indexOf = str.indexOf(40);
                int indexOf2 = str.indexOf(44, indexOf);
                this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                int i = indexOf2 + 1;
                int indexOf3 = str.indexOf(44, i);
                this.setX = Double.parseDouble(str.substring(i, indexOf3).trim());
                int i2 = indexOf3 + 1;
                int indexOf4 = str.indexOf(44, i2);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
                int i3 = indexOf4 + 1;
                this.setOnLongClickListener = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
            }

            private double setY(double d) {
                double d2 = 1.0d - d;
                double d3 = 3.0d * d2;
                return (this.setIconTintList * d2 * d3 * d) + (this.MenuHostHelper$$ExternalSyntheticLambda0 * d3 * d * d) + (d * d * d);
            }

            private double setX(double d) {
                double d2 = 1.0d - d;
                double d3 = 3.0d * d2;
                return (this.setX * d2 * d3 * d) + (this.setOnLongClickListener * d3 * d * d) + (d * d * d);
            }

            @Override // o.joinThreadPool
            public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
                double d2 = 0.5d;
                double d3 = 0.5d;
                while (d2 > 1.0E-4d) {
                    d2 *= 0.5d;
                    d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                }
                double d4 = d3 - d2;
                double d5 = d3 + d2;
                return (setX(d5) - setX(d4)) / (setY(d5) - setY(d4));
            }

            @Override // o.joinThreadPool
            public final double setIconTintList(double d) {
                if (d <= 0.0d) {
                    return 0.0d;
                }
                if (d >= 1.0d) {
                    return 1.0d;
                }
                double d2 = 0.5d;
                double d3 = 0.5d;
                while (d2 > 0.01d) {
                    d2 *= 0.5d;
                    d3 = setY(d3) < d ? d3 + d2 : d3 - d2;
                }
                double d4 = d3 - d2;
                double y = setY(d4);
                double d5 = d3 + d2;
                double y2 = setY(d5);
                double x = setX(d4);
                return (((setX(d5) - x) * (d - y)) / (y2 - y)) + x;
            }
        };
    }

    public String toString() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}