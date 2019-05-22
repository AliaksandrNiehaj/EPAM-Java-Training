public class DataTypesTester {
	public static void testByte(){

		byte a = 5, b = 2;
		byte c;
		int temp;

		System.out.println("***** Arithmetical Operators (byte) *****");

		c = (byte)(a + b);
		System.out.printf("%d + %d = %d\n", a, b, c);

		c = (byte)(a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);

		c = (byte)(a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);

		c = (byte)(a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);

		c = (byte)(a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);

		c = (byte) (-a);
		System.out.printf("-%d = %d\n", a, c);

		temp = +a;
		System.out.printf("+%d = %d\n", a, temp);

		a = 5;
		System.out.printf("++%d = %d\n", a, ++a);

		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);

		a = 5;
		System.out.printf("--%d = %d\n", a, --a);

		a = 5;
		System.out.printf("%d-- = %d\n", a, a--);


		System.out.println("***** Bitwise Operators (int) *****");

		a = 5;
		
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (int) *****");

		a = 5;
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = -135;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 3 --> c = %d\n", c, c >>>= 3);

		System.out.println("***** Relational Operators (int) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (int) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (int) *****");
		System.out.println("\nCondition Operator (int):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (int):");
		short sh = -32000;
		char ch = '\u0002';
		int i = 32344312;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);

	}

	public static void testShort(){

		short a = 5, b = 2;
		short c;
		long temp;

		System.out.println("***** Arithmetical Operators (short) *****");

		c = (short)(a + b);
		System.out.printf("%d + %d = %d\n", a, b, c);

		c = (short)(a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);

		c = (short)(a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);

		c = (short)(a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);

		c = (short)(a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);

		temp = -a;
		System.out.printf("-%d = %d\n", a, temp);

		c = (short) (+a);
		System.out.printf("+%d = %d\n", a, c);

		a = 5;
		System.out.printf("++%d = %d\n", a, ++a);

		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);

		a = 5;
		System.out.printf("--%d = %d\n", a, --a);

		a = 5;
		System.out.printf("%d-- = %d\n", a, a--);

		System.out.println("***** Bitwise Operators (int) *****");

		a = 5;
		
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (int) *****");

		a = 5;
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = -135;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 3 --> c = %d\n", c, c >>>= 3);

		System.out.println("***** Relational Operators (int) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (int) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (int) *****");
		System.out.println("\nCondition Operator (int):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (int):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
		
	}

	public static void testInt(){

		int a = 5, b = 2;
		int c;

		System.out.println("***** Arithmetical Operators (int) *****");

		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);

		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);

		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);

		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);

		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);

		c = -a;
		System.out.printf("-%d = %d\n", a, c);

		c = +a;
		System.out.printf("+%d = %d\n", a, c);

		a = 5;
		System.out.printf("++%d = %d\n", a, ++a);

		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);

		a = 5;
		System.out.printf("--%d = %d\n", a, --a);

		a = 5;
		System.out.printf("%d-- = %d\n", a, a--);


		System.out.println("***** Bitwise Operators (int) *****");

		a = 5;
		
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (int) *****");

		a = 5;
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = -135;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 3 --> c = %d\n", c, c >>>= 3);

		System.out.println("***** Relational Operators (int) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (int) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (int) *****");
		System.out.println("\nCondition Operator (int):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (int):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);


	}

	public static void testLong(){

		long a = 5L, b = 2L;
		long c;

		System.out.println("***** Arithmetical operators (long) *****");

		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);

		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);

		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);

		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);

		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);

		c = -a;
		System.out.printf("-%d = %d\n", a, c);

		c = +a;
		System.out.printf("+%d = %d\n", a, c);

		a = 5;
		System.out.printf("++%d = %d\n", a, ++a);

		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);

		a = 5;
		System.out.printf("--%d = %d\n", a, --a);

		a = 5;
		System.out.printf("%d-- = %d\n", a, a--);

		System.out.println("***** Bitwise Operators (int) *****");

		a = 5;
		
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (int) *****");

		a = 5;
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = -135;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 3 --> c = %d\n", c, c >>>= 3);

		System.out.println("***** Relational Operators (int) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (int) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (int) *****");
		System.out.println("\nCondition Operator (int):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (int):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
		
	}

	public static void testFloat(){

		float a = 5.0f, b = 2.3f;
		float c;

		System.out.println("***** Arithmetical Operators (float) *****");

		c = a + b;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, c);

		c = a - b;
		System.out.printf("%.1f - %.1f = %.1f\n", a, b, c);

		c = a * b;
		System.out.printf("%.1f * %.1f = %.1f\n", a, b, c);

		c = a / b;
		System.out.printf("%.1f / %.1f = %.1f\n", a, b, c);

		c = a % b;
		System.out.printf("%.1f %% %.1f = %.1f\n", a, b, c);

		c = -a;
		System.out.printf("-%.1f = %.1f\n", a, c);

		c = +a;
		System.out.printf("+%.1f = %.1f\n", a, c);

		a = 5;
		System.out.printf("++%.1f = %.1f\n", a, ++a);

		a = 5;
		System.out.printf("%.1f++ = %.1f\n", a, a++);

		a = 5;
		System.out.printf("--%.1f = %.1f\n", a, --a);

		a = 5;
		System.out.printf("%.1f-- = %.1f\n", a, a--);

		System.out.println("***** Bitwise Operators (int) *****");

		a = 5;
		
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (int) *****");

		a = 5;
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = -135;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 3 --> c = %d\n", c, c >>>= 3);

		System.out.println("***** Relational Operators (int) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (int) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (int) *****");
		System.out.println("\nCondition Operator (int):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (int):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
		
	}

	public static void testDouble(){

		double a = 5.0f, b = 2.3f;
		double c;

		System.out.println("***** Arithmetical Operators (double) *****");

		c = a + b;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, c);

		c = a - b;
		System.out.printf("%.1f - %.1f = %.1f\n", a, b, c);

		c = a * b;
		System.out.printf("%.1f * %.1f = %.1f\n", a, b, c);

		c = a / b;
		System.out.printf("%.1f / %.1f = %.1f\n", a, b, c);

		c = a % b;
		System.out.printf("%.1f %% %.1f = %.1f\n", a, b, c);

		c = -a;
		System.out.printf("-%.2f = %.2f\n", a, c);

		c = +a;
		System.out.printf("+%.2f = %.2f\n", a, c);

		a = 5;
		System.out.printf("++%.1f = %.1f\n", a, ++a);

		a = 5;
		System.out.printf("%.1f++ = %.1f\n", a, a++);

		a = 5;
		System.out.printf("--%.1f = %.1f\n", a, --a);

		a = 5;
		System.out.printf("%.1f-- = %.1f\n", a, a--);

		System.out.println("***** Bitwise Operators (int) *****");

		a = 5;
		
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (int) *****");

		a = 5;
		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		c = -135;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 3 --> c = %d\n", c, c >>>= 3);

		System.out.println("***** Relational Operators (int) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (int) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (int) *****");
		System.out.println("\nCondition Operator (int):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (int):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
		
	}

	public static void testChar(){
		
	}

	public static void testBoolean(){

	}
}