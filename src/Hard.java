public class Hard {

    public static void main(String[] args) {
        EX:
        for (int a = 1; a <= 40; a++) {
            for (int b = 1; b <= 40; b++) {
                for (int c = 1; c <= 40; c++) {
                    for (int d = 1; d <= 40; d++) {
                        for (int i = 1; i <= 40; i++) {
                            boolean bool = (
                                    i == a || i == b || i == c || i == d ||

                                            i == a + b || (i == a + c) || (i == a + d) ||
                                            i == b + c || (i == b + d) || (i == c + d) ||

                                            i == Math.abs(a - b) || i == Math.abs(a - c) || i == Math.abs(a - d) ||
                                            i == Math.abs(b - c) || i == Math.abs(b - d) || i == Math.abs(c - d) ||

                                            i == Math.abs(a + b - c) || i == Math.abs(a + b - d) || i == Math.abs(a + c - b) || i == Math.abs(a + c - d) ||
                                            i == Math.abs(a + d - b) || i == Math.abs(a + d - c) ||
                                            i == Math.abs(b + c - a) || i == Math.abs(b + c - d) || i == Math.abs(b + d - a) || i == Math.abs(b + d - c) ||
                                            i == Math.abs(c + d - a) || i == Math.abs(c + d - b) ||

                                            i == a + b + c || i == a + b + d || i == a + c + d || i == b + c + d ||

                                            i == Math.abs(a + b + c + d) ||
                                            i == Math.abs(a + b + c - d) || i == Math.abs(a + b - c + d) || i == Math.abs(a - b + c + d) || i == Math.abs(-a + b + c + d) ||
                                            i == Math.abs(a + b - c - d) || i == Math.abs(a - b + c - d) || i == Math.abs(-a + b + c - d) ||
                                            i == Math.abs(a - b - c + d) || i == Math.abs(-a + b - c + d) || i == Math.abs(-a - b + c + d));
                            if (!bool) {
                                break;
                            } else {
                                if (i == 40) {
                                    System.out.println(a + " " + b + " " + c + " " + d);
                                    break EX;
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
