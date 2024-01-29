package TipeData.nonPrimitif;

public class multipelArray {
    public static void main(String[] args) {
        // multipel array atau array didalam array ( bisa disebut juga dengan array multi dimensi )
        int[][] arrayInt = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.print(arrayInt[0][0]);
        System.out.print(arrayInt[0][1]);
        System.out.println(arrayInt[0][2]);
        System.out.print(arrayInt[1][0]);
        System.out.print(arrayInt[1][1]);
        System.out.println(arrayInt[1][2]);
        System.out.println("================================");

        // array multi dimensi
        int[][][] arrayInt2 = {
                // index array pertama
                {
                    // index array kedua
                        {
                            // index array ketiga
                                1, 2, 3
                        },
                        {
                                4, 5, 6
                        },
                        {
                                7, 8, 9
                        }
                },
                {
                        {
                                10, 11, 12
                        },
                        {
                                13, 14, 15
                        },
                        {
                                16, 17, 18
                        }
                },
                {
                        {
                                19, 20, 21
                        },
                        {
                                22, 23, 24
                        },
                        {
                                25, 26, 27
                        }
                }
        };

        System.out.println(arrayInt2[0][0][0]);
        System.out.println(arrayInt2[0][0][1]);
        System.out.println(arrayInt2[0][0][2]);
        System.out.println(arrayInt2[0][1][0]);
        System.out.println(arrayInt2[0][1][1]);
        System.out.println(arrayInt2[0][1][2]);
        System.out.println(arrayInt2[0][2][0]);
        System.out.println(arrayInt2[0][2][1]);
        System.out.println(arrayInt2[0][2][2]);
        System.out.println(arrayInt2[1][0][0]);
        System.out.println(arrayInt2[1][0][1]);
        System.out.println(arrayInt2[1][0][2]);
        System.out.println(arrayInt2[1][1][0]);
        System.out.println(arrayInt2[1][1][1]);
        System.out.println(arrayInt2[1][1][2]);
        System.out.println(arrayInt2[1][2][0]);
        System.out.println(arrayInt2[1][2][1]);
        System.out.println(arrayInt2[1][2][2]);
        System.out.println(arrayInt2[2][0][0]);
        System.out.println(arrayInt2[2][0][1]);
        System.out.println(arrayInt2[2][0][2]);
        System.out.println(arrayInt2[2][1][0]);
        System.out.println(arrayInt2[2][1][1]);
        System.out.println(arrayInt2[2][1][2]);
        System.out.println(arrayInt2[2][2][0]);
        System.out.println(arrayInt2[2][2][1]);
        System.out.println(arrayInt2[2][2][2]);
        System.out.println("==================================================");

        int[][][][] arrayInteger = {
                        // index pertama
                        {
                            // index kedua
                            {
                                // index ketiga ( Kenapa menjadi index ke tiga menjadi 0, karena cuman diisikan 1 index saja yaitu 0 )
                                {
                                    // index keempat
                                    1,2,3,4
                                },
                            },
                        {
                            {
                                5,6,7,8
                            }
                        },
                        {
                            {9,10,11,12}
                        },
                        {
                            {13,14,15,16}}
                        },
                        {
                            {
                                {17,18,19,20}
                            },
                        {
                            {21,22,23,24}
                        },
                        {
                            {25,26,27,28}
                        },
                        {
                            {29,30,31,32}
                        }
                        },
                        {
                            {
                                {33,34,35,36}
                            },
                        {
                            {37,38,39,40}
                        },
                        {
                            {41,42,43,44}
                        },
                        {
                            {45,46,47,48}
                        }
                        },
                        {
                            {
                                {49,50,51,52}
                            },
                        {
                            {53,54,55,56}
                        },
                        {
                            {57,58,59,60}
                        },
                        {
                            {61,62,63,64}
                        }
                        }
        };
        System.out.println(arrayInteger[0][0][0][0]);
        System.out.println(arrayInteger[0][0][0][1]);
        System.out.println(arrayInteger[0][0][0][2]);
        System.out.println(arrayInteger[0][0][0][3]);
        System.out.println(arrayInteger[0][1][0][0]);
        System.out.println(arrayInteger[0][1][0][1]);
        System.out.println(arrayInteger[0][1][0][2]);
        System.out.println(arrayInteger[0][1][0][3]);
        System.out.println(arrayInteger[0][2][0][0]);
        System.out.println(arrayInteger[0][2][0][1]);
        System.out.println(arrayInteger[0][2][0][2]);
        System.out.println(arrayInteger[0][2][0][3]);
        System.out.println(arrayInteger[0][3][0][0]);
        System.out.println(arrayInteger[0][3][0][1]);
        System.out.println(arrayInteger[0][3][0][2]);
        System.out.println(arrayInteger[0][3][0][3]);
        System.out.println(arrayInteger[1][0][0][0]);
        System.out.println(arrayInteger[1][0][0][1]);
        System.out.println(arrayInteger[1][0][0][2]);
        System.out.println(arrayInteger[1][0][0][3]);
        System.out.println(arrayInteger[1][1][0][0]);
        System.out.println(arrayInteger[1][1][0][1]);
        System.out.println(arrayInteger[1][1][0][2]);
        System.out.println(arrayInteger[1][1][0][3]);
        System.out.println(arrayInteger[1][2][0][0]);
        System.out.println(arrayInteger[1][2][0][1]);
        System.out.println(arrayInteger[1][2][0][2]);
        System.out.println(arrayInteger[1][2][0][3]);
        System.out.println(arrayInteger[1][3][0][0]);
        System.out.println(arrayInteger[1][3][0][1]);
        System.out.println(arrayInteger[1][3][0][2]);
        System.out.println(arrayInteger[1][3][0][3]);
        System.out.println(arrayInteger[2][0][0][0]);
        System.out.println(arrayInteger[2][0][0][1]);
        System.out.println(arrayInteger[2][0][0][2]);
        System.out.println(arrayInteger[2][0][0][3]);
        System.out.println(arrayInteger[2][1][0][0]);
        System.out.println(arrayInteger[2][1][0][1]);
        System.out.println(arrayInteger[2][1][0][2]);
        System.out.println(arrayInteger[2][1][0][3]);
        System.out.println(arrayInteger[2][2][0][0]);
        System.out.println(arrayInteger[2][2][0][1]);
        System.out.println(arrayInteger[2][2][0][2]);
        System.out.println(arrayInteger[2][2][0][3]);
        System.out.println(arrayInteger[2][3][0][0]);
        System.out.println(arrayInteger[2][3][0][1]);
        System.out.println(arrayInteger[2][3][0][2]);
        System.out.println(arrayInteger[2][3][0][3]);
        System.out.println(arrayInteger[3][0][0][0]);
        System.out.println(arrayInteger[3][0][0][1]);
        System.out.println(arrayInteger[3][0][0][2]);
        System.out.println(arrayInteger[3][0][0][3]);
        System.out.println(arrayInteger[3][1][0][0]);
        System.out.println(arrayInteger[3][1][0][1]);
        System.out.println(arrayInteger[3][1][0][2]);
        System.out.println(arrayInteger[3][1][0][3]);
        System.out.println(arrayInteger[3][2][0][0]);
        System.out.println(arrayInteger[3][2][0][1]);
        System.out.println(arrayInteger[3][2][0][2]);
        System.out.println(arrayInteger[3][2][0][3]);
        System.out.println(arrayInteger[3][3][0][0]);
        System.out.println(arrayInteger[3][3][0][1]);
        System.out.println(arrayInteger[3][3][0][2]);
        System.out.println(arrayInteger[3][3][0][3]);
    }
}
