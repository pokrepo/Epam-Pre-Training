class DataTypesTester {
    static void testByte() {
        byte a = 5, b = 2, c;

        System.out.println("/n***** Arithmetical Operators *****");

        //addition
        c = (byte) (a+b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        //unary minus
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (byte) +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 5;
        c = ++a;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 5;
        c = a++;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 5;
        c = --a;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 5;
        c = a--;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("/n***** Bitwise Operators *****");

        c = (byte) (a & b); //bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (byte) (a | b); //bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (byte) (a ^ b); //bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (byte) ~a; //bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (byte) (a << 1); //left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (byte) (a >> 1); //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (byte) (a >> 1); //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = 5;
        c = (byte) (a >>> 1); //zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (byte) (a >>> 1); //bitwise unary compliment
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("/n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("/n***** Relational Operators *****");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("/n***** Logical Operations *****");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (b > 0));

        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        //bitwise logical OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, (a > b) | (b > 0));

        //logical XOR
        System.out.printf("(%d > %d) >= (%d > 0) --> %b\n", a, b, a, (a > b) ^ (b > 0));

        //logical NOT
        System.out.printf("(%d > %d) != (%d > 0) --> %b\n", a, b, a, (a > b) != (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        System.out.println("/n***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("/Type Cast Operator:");

        short sh = -3200;
        int i = 400000000;
        char ch = '\u0002';
        long L = 100000000000000000L;
        float f = 1.9f;
        double d = 12345678.625;
        boolean bool = true;

        c = (byte) sh;
        System.out.printf("byte = short: c = %d --> c = %d\n", sh, c);

        c = (byte) i;
        System.out.printf("byte = int: c = %d --> c = %d\n", i, c);

        c = (byte) ch;
        System.out.printf("byte = char: c = %c --> c = %d\n", ch, c);

        c = (byte) L;
        System.out.printf("byte = long: c = %d --> c = %d\n", L, c);

        c = (byte) f;
        System.out.printf("byte = float: c = %f --> c = %d\n", f, c);

        c = (byte) d;
        System.out.printf("byte = double: c = %f --> c = %d\n", d, c);

        //c = (byte) bool;
        //System.out.printf("byte = boolean: c = %d --> Compile Error\n", bool);
    }
    static void testShort() {
        short a = 5, b = 2, c;

        System.out.println("/n***** Arithmetical Operators *****");

        //addition
        c = (short) (a+b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        //unary minus
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 5;
        c = ++a;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 5;
        c = a++;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 5;
        c = --a;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 5;
        c = a--;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("/n***** Bitwise Operators *****");

        c = (short) (a & b); //bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (short) (a | b); //bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (short) (a ^ b); //bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (short) ~a; //bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (a << 1); //left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (a >> 1); //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >> 1); //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = 5;
        c = (short) (a >>> 1); //zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >>> 1); //bitwise unary compliment
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("/n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("/n***** Relational Operators *****");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("/n***** Logical Operations *****");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (b > 0));

        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        //bitwise logical OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, (a > b) | (b > 0));

        //logical XOR
        System.out.printf("(%d > %d) >= (%d > 0) --> %b\n", a, b, a, (a > b) ^ (b > 0));

        //logical NOT
        System.out.printf("(%d > %d) != (%d > 0) --> %b\n", a, b, a, (a > b) != (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        System.out.println("/n***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("/Type Cast Operator:");

        byte bt = 1;
        int i = 400000000;
        char ch = '\u0002';
        long L = 100000000000000000L;
        float f = 1.9f;
        double d = 12345678.625;
        boolean bool = true;

        c = (short) bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);

        c = (short) i;
        System.out.printf("short = int: c = %d --> c = %d\n", i, c);

        c = (short) L;
        System.out.printf("short = long: c = %d --> c = %d\n", L, c);

        //c = (short) ch;
        //System.out.printf("short = char: c = %d --> c = %d\n", ch, c);

        //c = (short) f;
        //System.out.printf("short = float: c = %d --> c = %d\n", f, c);

        //c = (short) d;
        //System.out.printf("short = double: c = %d --> c = %d\n", d, c);

        //c = (short) bool;
        //System.out.printf("short = boolean: c = %d --> Compile Error\n", bool);
    }
    static void testChar() {
        char a = '5', b = '2', c;

        System.out.println("/n***** Arithmetical Operators *****");

        //addition
        c = (char) (a+b);
        System.out.printf("%c + %c = %c\n", a, b, c);
        //subtraction
        c = (char) (a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);
        //multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
        //division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);
        //modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
        a = '5';
        //unary minus
        c = (char) -a;
        System.out.printf("-%c = %c\n", a, c);
        //unary plus
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);
        //prefix increment
        a = '5';
        c = ++a;
        System.out.printf("++%c = %c\n", a, ++a);
        //postfix increment
        a = '5';
        c = a++;
        System.out.printf("%c++ = %c\n", a, a++);
        //prefix decrement
        a = '5';
        c = --a;
        System.out.printf("--%c = %c\n", a, --a);
        //postfix decrement
        a = '5';
        c = a--;
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("/n***** Bitwise Operators *****");

        c = (char) (a & b); //bitwise AND
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (char) (a | b); //bitwise OR
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (char) (a ^ b); //bitwise XOR
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (char) ~a; //bitwise unary compliment
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (char) (a << 1); //left shift
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (char) (a >> 1); //right shift
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = (char) -'5';
        c = (char) (a >> 1); //right shift
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = '5';
        c = (char) (a >>> 1); //zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = (char) -'5';
        c = (char) (a >>> 1); //bitwise unary compliment
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("/n***** Assignment Operators *****");

        c = '7';
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        System.out.printf("%c >>= %c --> c = %c\n", c, a, c >>= a);
        System.out.printf("%c <<= %c --> c = %c\n", c, a, c <<= a);
        System.out.printf("%c >>>= %c --> c = %c\n", c, a, c >>>= a);

        System.out.println("/n***** Relational Operators *****");

        //greater than
        //System.out.printf("%с > %с --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        //less than
        //System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("/n***** Logical Operations *****");

        //logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (b > 0));

        //bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (b > 0));

        //logical OR
        System.out.printf("(%c > %c) || (%c > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        //bitwise logical OR
        System.out.printf("(%c > %c) | (%c > 0) --> %b\n", a, b, a, (a > b) | (b > 0));

        //logical XOR
        System.out.printf("(%c > %c) >= (%c > 0) --> %b\n", a, b, a, (a > b) ^ (b > 0));

        //logical NOT
        System.out.printf("(%c > %c) != (%c > 0) --> %b\n", a, b, a, (a > b) != (b > 0));

        //logical OR
        System.out.printf("(%c > %c) || (%c > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        System.out.println("/n***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("/Type Cast Operator:");

        short sh = -3200;
        int i = 400000000;
        byte bt = 1;
        long L = 100000000000000000L;
        float f = 1.9f;
        double d = 12345678.625;
        boolean bool = true;

        c = (char) bt;
        System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);

        c = (char) i;
        System.out.printf("char = int: c = %d --> c = %c\n", i, c);

        c = (char) sh;
        System.out.printf("char = short: c = %d --> c = %c\n", sh, c);

        c = (char) L;
        System.out.printf("char = long: c = %d --> c = %c\n", L, c);

        c = (char) f;
        System.out.printf("char = float: c = %f --> c = %c\n", f, c);

        c = (char) d;
        System.out.printf("char = double: c = %f --> c = %c\n", d, c);

        //c = (char) bool;
        //System.out.printf("char = boolean: c = %d --> Compile Error\n", bool);
    }
    static void testLong() {
        long a = 5, b = 2, c;

        System.out.println("/n***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        //unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 5;
        c = ++a;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 5;
        c = a++;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 5;
        c = --a;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 5;
        c = a--;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("/n***** Bitwise Operators *****");

        c = a & b; //bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b),
                Long.toBinaryString(c));

        c = a | b; //bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b),
                Long.toBinaryString(c));

        c = a ^ b; //bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b),
                Long.toBinaryString(c));

        c = ~a; //bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a << 1; //left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a >> 1; //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = -5;
        c = (long) (a >> 1); //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        a = 5;
        c = (long) (a >>> 1); //zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = -5;
        c = (long) (a >>> 1); //bitwise unary compliment
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        System.out.println("/n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("/n***** Relational Operators *****");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("/n***** Logical Operations *****");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (b > 0));

        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        //bitwise logical OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, (a > b) | (b > 0));

        //logical XOR
        System.out.printf("(%d > %d) >= (%d > 0) --> %b\n", a, b, a, (a > b) ^ (b > 0));

        //logical NOT
        System.out.printf("(%d > %d) != (%d > 0) --> %b\n", a, b, a, (a > b) != (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        System.out.println("/n***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("/Type Cast Operator:");

        short sh = -3200;
        int i = 400000000;
        char ch = '\u0002';
        byte bt = 1;
        float f = 1.9f;
        double d = 12345678.625;
        boolean bool = true;

        c = (long) bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);

        c = (long) i;
        System.out.printf("long = int: c = %d --> c = %d\n", i, c);

        c = (long) ch;
        System.out.printf("long = char: c = %c --> c = %d\n", ch, c);

        c = (long) sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);

        c = (long) f;
        System.out.printf("long = float: c = %f --> c = %d\n", f, c);

        c = (long) d;
        System.out.printf("long = double: c = %f --> c = %d\n", d, c);

        //c = (long) bool;
        //System.out.printf("long = boolean: c = %d --> Compile Error\n", bool);
    }
    static void testInt() {
        int a = 5, b = 2, c;

        System.out.println("/n***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        //unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 5;
        c = ++a;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 5;
        c = a++;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 5;
        c = --a;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 5;
        c = a--;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("/n***** Bitwise Operators *****");

        c = a & b; //bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = a | b; //bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = a ^ b; //bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = ~a; //bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = a << 1; //left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = a >> 1; //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; //right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = 5;
        c = a >>> 1; //zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; //bitwise unary compliment
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("/n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("/n***** Relational Operators *****");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("/n***** Logical Operations *****");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (b > 0));

        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        //bitwise logical OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, (a > b) | (b > 0));

        //logical XOR
        System.out.printf("(%d > %d) >= (%d > 0) --> %b\n", a, b, a, (a > b) ^ (b > 0));

        //logical NOT
        System.out.printf("(%d > %d) != (%d > 0) --> %b\n", a, b, a, (a > b) != (b > 0));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        System.out.println("/n***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("/Type Cast Operator:");

        short sh = -3200;
        byte bt = 1;
        char ch = '\u0002';
        long L = 100000000000000000L;
        float f = 1.9f;
        double d = 12345678.625;
        boolean bool = true;

        c = (int) bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);

        c = (int) L;
        System.out.printf("int = long: c = %d --> c = %d\n", L, c);

        c = (int) ch;
        System.out.printf("int = char: c = %c --> c = %d\n", ch, c);

        c = (int) sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);

        c = (int) f;
        System.out.printf("int = float: c = %f --> c = %d\n", f, c);

        c = (int) d;
        System.out.printf("int = double: c = %f --> c = %d\n", d, c);

        //c = (int) bool;
        //System.out.printf("int = boolean: c = %d --> Compile Error\n", bool);
    }
    static void testDouble() {
        double a = 5, b = 2, c;

        System.out.println("***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        a = 5;
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        //prefix increment
        a = 5;
        c = ++a;
        System.out.printf("++%f = %f\n", a, ++a);
        //postfix increment
        a = 5;
        c = a++;
        System.out.printf("%f++ = %f\n", a, a++);
        //prefix decrement
        a = 5;
        c = --a;
        System.out.printf("--%f = %f\n", a, --a);
        //postfix decrement
        a = 5;
        c = a--;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("***** Bitwise Operators *****");

       //None of them work with double

        System.out.println("***** Assignment Operators *****");

        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        /*
        c &= a;
        c |= a;
        c ^= a;
        c >>= a;
        c <<= a;
        c >>>= a;

        - Doesn't work
         */

        System.out.println("***** Relational Operators *****");

        //greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("***** Logical Operations *****");

        //logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (b > 0));

        //bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (b > 0));

        //logical OR
        System.out.printf("(%f > %f) || (%f > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        //bitwise logical OR
        System.out.printf("(%f > %f) | (%f > 0) --> %b\n", a, b, a, (a > b) | (b > 0));

        //logical XOR
        System.out.printf("(%f > %f) >= (%f > 0) --> %b\n", a, b, a, (a > b) ^ (b > 0));

        //logical NOT
        System.out.printf("(%f > %f) != (%f > 0) --> %b\n", a, b, a, (a > b) != (b > 0));

        //logical OR
        System.out.printf("(%f > %f) || (%f > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        System.out.println("***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("/Type Cast Operator:");

        short sh = -3200;
        byte bt = 1;
        char ch = '\u0002';
        long L = 100000000000000000L;
        float f = 1.9f;
        int i = 400000000;
        boolean bool = true;

        c = (double) bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);

        c = (double) L;
        System.out.printf("double = long: c = %d --> c = %f\n", L, c);

        c = (double) ch;
        System.out.printf("double = char: c = %c --> c = %f\n", ch, c);

        c = (double) sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);

        c = (double) f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);

        c = (double) i;
        System.out.printf("double = int: c = %d --> c = %f\n", i, c);

        //c = (double) bool;
        //System.out.printf("double = boolean: c = %d --> Compile Error\n", bool);
    }
    static void testFloat() {
        float a = 5.2f, b = 2.6f, c;

        System.out.println("/n***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        a = 5.1f;
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        //prefix increment
        a = 5.1f;
        c = ++a;
        System.out.printf("++%f = %f\n", a, ++a);
        //postfix increment
        a = 5.1f;
        c = a++;
        System.out.printf("%f++ = %f\n", a, a++);
        //prefix decrement
        a = 5.1f;
        c = --a;
        System.out.printf("--%f = %f\n", a, --a);
        //postfix decrement
        a = 5.1f;
        c = a--;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("/n***** Bitwise Operators *****");

        //None of them work with double

        System.out.println("/n***** Assignment Operators *****");

        c = 7.1f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
         /*
        c &= a;
        c |= a;
        c ^= a;
        c >>= a;
        c <<= a;
        c >>>= a;

        - Doesn't work
         */

        System.out.println("/n***** Relational Operators *****");

        //greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        //less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("/n***** Logical Operations *****");

        //logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (b > 0));

        //bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (b > 0));

        //logical OR
        System.out.printf("(%f > %f) || (%f > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        //bitwise logical OR
        System.out.printf("(%f > %f) | (%f > 0) --> %b\n", a, b, a, (a > b) | (b > 0));

        //logical XOR
        System.out.printf("(%f > %f) >= (%f > 0) --> %b\n", a, b, a, (a > b) ^ (b > 0));

        //logical NOT
        System.out.printf("(%f > %f) != (%f > 0) --> %b\n", a, b, a, (a > b) != (b > 0));

        //logical OR
        System.out.printf("(%f > %f) || (%f > 0) --> %b\n", a, b, a, (a > b) || (b > 0));

        System.out.println("/n***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %b\n", a, b, a, b, (a > b ? a : b));

        System.out.println("/Type Cast Operator:");

        short sh = -3200;
        byte bt = 1;
        char ch = '\u0002';
        long L = 100000000000000000L;
        int i = 400000000;
        double d = 12345678.625;
        boolean bool = true;

        c = (float) bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);

        c = (float) L;
        System.out.printf("float = long: c = %d --> c = %f\n", L, c);

        c = (float) ch;
        System.out.printf("float = char: c = %c --> c = %f\n", ch, c);

        c = (float) sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);

        c = (float) i;
        System.out.printf("float = int: c = %d --> c = %f\n", i, c);

        c = (float) d;
        System.out.printf("float = double: c = %f --> c = %f\n", d, c);

        //c = (float) bool;
        //System.out.printf("float = boolean: c = %d --> Compile Error\n", bool);
    }
    static void testBoolean() {
        boolean a = true, b = false, c;

        System.out.println("/n***** Arithmetical Operators *****");

        //addition
        //subtraction
        //multiplication
        //division
        //modulus
        //unary minus
        //unary plus
        //prefix increment
        //postfix increment
        //prefix decrement
        //postfix decrement

        System.out.println("/n***** Bitwise Operators *****");

        c = a & b; //bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);

        c = a | b; //bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);

        c = a ^ b; //bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        //bitwise unary compliment
        //left shift
        //right shift
        //right shift
        //zero fill right shift

        System.out.println("/n***** Assignment Operators *****");


        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

         /*
        c += a;
        c -= a;
        c *= a;
        c /= a;
        c %= a;
        c >>= a;
        c <<= a;
        c >>>= a;

        - Doesn't work
         */

        System.out.println("/n***** Relational Operators *****");

        //equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        System.out.println("/n***** Logical Operations *****");

        //logical AND
        c = a && b;
        System.out.printf("%b && %b = %b\n", a, b, c);

        //logical OR
        c = a || b;
        System.out.printf("%b || %b = %b\n", a, b, c);

        //logical XOR
        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        //logical NOT
        System.out.printf("!%b --> %b\n", a, !a);


        System.out.println("/n***** Misc Operators *****");

        System.out.println("/Condition Operator:");

        System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

        System.out.println("/Type Cast Operator:");

        //short sh = -3200;
        //byte bt = 1;
        //char ch = '\u0002';
        //long L = 100000000000000000L;
        //float f = 1.9f;
        //double d = 12345678.625;
        boolean bool = true;

        c = bool;
    }
}