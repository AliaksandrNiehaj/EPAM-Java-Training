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


		System.out.println("***** Bitwise Operators (byte) *****");

		a = 5;
		
		c = (byte) (a & b);
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte) (a | b);
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte) (a ^ b);
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte) ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (byte) (a << 1);
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (byte) (a >> 1);
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (byte) (a >> 1);
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = (byte) (a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (byte) (a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (byte) *****");

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
		c = -105;
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 3 --> c = %d\n", c, c >>>= 3);

		System.out.println("***** Relational Operators (byte) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (byte) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (byte) *****");
		System.out.println("\nCondition Operator (byte):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (byte):");
		short sh = -32000;
		char ch = '\u0002';
		int i = 32344312;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = (byte) sh;
		System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
		c = (byte) ch;
		System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
		c = (byte) i;
		System.out.printf("byte = int: c = (byte)%d --> c = %d\n", i, c);
		c = (byte) l;
		System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
		c = (byte) f;
		System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
		c = (byte) d;
		System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);

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

		System.out.println("***** Bitwise Operators (short) *****");

		a = 5;
		
		c = (short) (a & b);
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (short) (a | b);
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (short) (a ^ b);
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (short) ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (short) (a << 1);
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (short) (a >> 1);
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (short) (a >> 1);
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = (short) (a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (short) (a >>> 1);
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


		System.out.println("***** Assignment Operators (short) *****");

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

		System.out.println("***** Relational Operators (short) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (short) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (short) *****");
		System.out.println("\nCondition Operator (short):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (short):");
		byte bt = 1;
		char ch = '\u0002';
		int i = 32344312;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
		c = (short) ch;
		System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
		c = (short) i;
		System.out.printf("short = int: c = (short)%d --> c = %d\n", i, c);
		c = (short) l;
		System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
		c = (short) f;
		System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
		c = (short) d;
		System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
//		c = (int) bool;
		System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
		
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

		System.out.println("***** Bitwise Operators (long) *****");

		a = 5;
		
		c = a & b;
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

		c = a | b;
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

		c = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

		c = ~a;
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		c = a << 1;
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		a = -5;
		c = a >> 1;
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		a = 5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		a = -5;
		c = a >>> 1;
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));


		System.out.println("***** Assignment Operators (long) *****");

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

		System.out.println("***** Relational Operators (long) *****");

		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (long) *****");

		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (long) *****");
		System.out.println("\nCondition Operator (long):");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (long):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int i = 32344312;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
		c = i;
		System.out.printf("long = int: c = %d --> c = %d\n", i, c);
		c = (long) f;
		System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
		c = (long) d;
		System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
//		c = (long) bool;
		System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
		
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

		System.out.println("***** Bitwise Operators (float) *****");
		// no

		System.out.println("***** Assignment Operators (float) *****");

		a = 5;
		c = 7;
		System.out.printf("%.1f += %.1f --> c = %.1f\n", c, a, c += a);
		System.out.printf("%.1f -= %.1f --> c = %.1f\n", c, a, c -= a);
		System.out.printf("%.1f *= %.1f --> c = %.1f\n", c, a, c *= a);
		System.out.printf("%.1f /= %.1f --> c = %.1f\n", c, a, c /= a);
		System.out.printf("%.1f %%= %.1f --> c = %.1f\n", c, a, c %= a);

		System.out.println("***** Relational Operators (float) *****");

		System.out.printf("%.1f > %.1f --> %b\n", a, b, a > b);
		System.out.printf("%.1f >= %.1f --> %b\n", a, b, a >= b);
		System.out.printf("%.1f < %.1f --> %b\n", a, b, a < b);
		System.out.printf("%.1f <= %.1f --> %b\n", a, b, a <= b);
		System.out.printf("%.1f == %.1f --> %b\n", a, b, a == b);
		System.out.printf("%.1f != %.1f --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (float) *****");

		System.out.printf("(%.1f > %.1f) && (%.1f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%.1f > %.1f) & (%.1f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%.1f >= %.1f) || (%.1f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%.1f >= %.1f) | (%.1f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%.1f >= %.1f) ^ (%.1f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%.1f >= %.1f) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (float) *****");
		System.out.println("\nCondition Operator (float):");

		System.out.printf("%.1f > %.1f ? %.1f : %.1f --> %.1f\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (float):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int i = 32344312;
		long l = 100_000_000_000_000_000L;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("float = byte: c = %d --> c = %.1f\n", bt, c);
		c = sh;
		System.out.printf("float = short: c = %d --> c = %.1f\n", sh, c);
		c = ch;
		System.out.printf("float = char: c = '%c' --> c = %.1f\n", ch, c);
		c = (float) i;
		System.out.printf("float = int: c = (float)%d --> c = %.1f\n", i, c);
		c = (float) l;
		System.out.printf("float = long: c = (float)%d --> c = %.1f\n", l, c);
		c = (float) d;
		System.out.printf("float = double: c = (float)%f --> c = %.1f\n", d, c);
//		c = (float) bool;
		System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
		
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

		System.out.println("***** Bitwise Operators (double) *****");
		// no

		System.out.println("***** Assignment Operators (double) *****");

		a = 5;
		c = 7;
		System.out.printf("%.1f += %.1f --> c = %.1f\n", c, a, c += a);
		System.out.printf("%.1f -= %.1f --> c = %.1f\n", c, a, c -= a);
		System.out.printf("%.1f *= %.1f --> c = %.1f\n", c, a, c *= a);
		System.out.printf("%.1f /= %.1f --> c = %.1f\n", c, a, c /= a);
		System.out.printf("%.1f %%= %.1f --> c = %.1f\n", c, a, c %= a);

		System.out.println("***** Relational Operators (double) *****");

		System.out.printf("%.1f > %.1f --> %b\n", a, b, a > b);
		System.out.printf("%.1f >= %.1f --> %b\n", a, b, a >= b);
		System.out.printf("%.1f < %.1f --> %b\n", a, b, a < b);
		System.out.printf("%.1f <= %.1f --> %b\n", a, b, a <= b);
		System.out.printf("%.1f == %.1f --> %b\n", a, b, a == b);
		System.out.printf("%.1f != %.1f --> %b\n", a, b, a != b);

		System.out.println("***** Logical Operations (double) *****");

		System.out.printf("(%.1f > %.1f) && (%.1f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		System.out.printf("(%.1f > %.1f) & (%.1f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		System.out.printf("(%.1f >= %.1f) || (%.1f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		System.out.printf("(%.1f >= %.1f) | (%.1f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		System.out.printf("(%.1f >= %.1f) ^ (%.1f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		System.out.printf("!(%.1f >= %.1f) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misk Operators (double) *****");
		System.out.println("\nCondition Operator (double):");

		System.out.printf("%.1f > %.1f ? %.1f : %.1f --> %.1f\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator (double):");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int i = 32344312;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		boolean bool = true;

		c = bt;
		System.out.printf("double = byte: c = %d --> c = %.1f\n", bt, c);
		c = sh;
		System.out.printf("double = short: c = %d --> c = %.1f\n", sh, c);
		c = ch;
		System.out.printf("double = char: c = '%c' --> c = %.1f\n", ch, c);
		c = i;
		System.out.printf("double = int: c = %d --> c = %.1f\n", i, c);
		c = l;
		System.out.printf("double = long: c = %d --> c = %.1f\n", l, c);
		c = f;
		System.out.printf("double = float: c = %.1f --> c = %.1f\n", f, c);
//		c = (double) bool;
		System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);
		
	}

	public static void testChar(){

		char a, b, c;

		System.out.println("***** Arithmetical Operators (char) *****");

		a = '\u1111';
		b = '\u0110';
		c = (char) (a + b);
		System.out.printf("%c + %c = %c\n", a, b, c);

		a = '\u1111';
		b = '\u0110';
		c = (char) (a - b);
		System.out.printf("%c - %c = %c\n", a, b, c);

		a = '\u1111';
		b = '\u0110';
		c = (char) (a * b);
		System.out.printf("%c * %c = %c\n", a, b, c);

		a = '\u1111';
		b = '\u0110';
		c = (char) (a / b);
		System.out.printf("%c / %c = %c\n", a, b, c);

		a = '\u1111';
		b = '\u0110';
		c = (char) (a % b);
		System.out.printf("%c %% %c = %c\n", a, b, c);

		a = '\u1111';
		b = '\u0110';
		c = (char) -a;
		System.out.printf("-%c = %c\n", a, c);

		a = '\u1111';
		b = '\u0110';
		c = (char) +a;
		System.out.printf("+%c = %c\n", a, c);

		a = '\u1111';
		System.out.printf("++%c = %c\n", a, ++a);

		a = '\u1111';
		System.out.printf("%c++ = %c\n", a, a++);

		a = '\u1111';
		System.out.printf("--%c = %c\n", a, --a);

		a = '\u1111';
		System.out.printf("%c-- = %c\n", a, a--);


		System.out.println("\n***** Bitwise Operators (char) *****");

		a = '\u1111';
		b = '\u0110';
        c = (char)(a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char)(a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char)(a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a),Integer.toBinaryString(b),Integer.toBinaryString(c));

        c = (char)~a;
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (char)(a << 1);
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (char)(a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = (char) -5;
        c = (char)(a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = '\u1111';
        c = (char)(a >>> 10);
        System.out.printf("%c >>> 10 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 10 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = (char) -120;
        c = (char)(a >>> 10);
        System.out.printf("%c >>> 10 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 10 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators (char) *****");

        a = '\u1111';
        c = '\u0101';

        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n\n", c, a, c %= a);

        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        System.out.printf("%c >>= %c --> c = %c\n", c, a, c >>= a);
        System.out.printf("%c <<= %c --> c = %c\n", c, a, c <<= a);
        System.out.printf("%c >>>= %c --> c = %c\n", c, a, c >>>= a);

        System.out.println("\n***** Relational Operators (char) *****");
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators (char) *****");
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator (char) *****");
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator (char) *****");

        byte bt = 1;
		short sh = -32000;
		int i = 32344312;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = (char) bt;
        System.out.printf("char = byte: c = (char)%d --> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
        c = (char) i;
        System.out.printf("char = char: c = (char)%d --> c = %c\n", i, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%.1f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%.3f --> c = %c\n", d, c);
        // c = (char) bool;
        System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);

	}

	public static void testBoolean(){

		boolean a = true, b = false;
		boolean c;

		System.out.println("\n***** Arithmetical Operators *****");

		// c = a + b; // addition
		// c = a - b; // subtraction
		// c = a * b; // multiplication // c = a / b; // division
		// c = a % b; // modulus
		// c = -a; // unary minus
		// c = +a; // unary plus
		// c = ++a; // prefix increment
		// c = a++; // postfix increment
		// c = --a; // prefix decrement
		// c = a--; // postfix decrement

		System.out.println("No any mathematic operators for boolean type.");

		System.out.println("\n*****Bitwise Operators*****");

		c = a & b;
		System.out.printf(("%b & %b = %b\n"), a, b, c);

		c = a | b;
		System.out.printf(("%b | %b = %b\n"), a, b, c);

		c = a ^ b;
		System.out.printf(("%b ^ %b = %b\n"), a, b, c);


		System.out.println("\n***** Assignment Operators *****");

		System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

		// c += a;
		// c -= a;
		// c *= a;
		// c/=a;
		// c%=a;
		// c >>= 1;
		// c <<= 1;
		// c >>>= 1;

		System.out.println("We can't exist arithmetic operations and shifts with boolean type.");

		System.out.println("\n***** Relational Operators *****");

		// equal to
		System.out.printf("%b == %b --> %b\n", a, b, a == b);

		//nor equal to
		System.out.printf("%b != %b --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		c = a && b;
		System.out.printf("%b && %b = %b\n", a, b, c);

		c = a || b;
		System.out.printf(("%b || %b = %b\n"), a, b, c);

		c = a ^ b;
		System.out.printf(("%b ^ %b = %b\n"), a, b, c);

		a = false;
		c = a ^ b;
		System.out.printf(("%b ^ %b = %b\n"), a, b, c);

		a = true;
		b = true;
		c = a ^ b;
		System.out.printf(("%b ^ %b = %b\n"), a, b, c);

		a = false;
		c = a ^ b;
		System.out.printf(("%b ^ %b = %b\n"), a, b, c);

		a = true;
		b = false;

		System.out.printf("!%b --> %b\n", a, !a);
		System.out.printf("!%b --> %b\n", b, !b);


		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
		System.out.printf("%b ? %b : %b --> %b\n", c, b, a, (c ? a : b));

		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		short sh = -32_000;
		char ch = '\u0002';
		int in = 7647;
		long l = 100_000_000_000_000_000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

//		c = (boolean) bt;
//		c = (boolean) sh;
//		c = (boolean) ch;
//		c = (boolean) in;
//		c = (boolean) l;
//		c = (boolean) f;
//		c = (boolean) d;
		c = bool;

		System.out.println("We can't transform boolean type in byte, short, int, long,, char, float and double. This type doesn't transform in any types.");

	}

	public static void testString() {

		String a = "Hello", b = "World";
		String c;

		System.out.println("***** Arithmetical Operators (String) *****\n");

		c = a + b;
		System.out.printf("\"%s\" + \"%s\" = \"%s\"\n", a, b, c);

		char ch = '\u1101';
		System.out.printf("\"%s\" + %c = \"%s\"\n", b, ch, b + ch);

		int x = 333;
		c = x + a;
		System.out.printf("\"%s\" + \"%s\" = \"%s\"\n", x, a, c);

		float f = 5.7f;
		System.out.printf("%.3f + \"%s\" --> c = \"%s\"\n", f, c, f + c);

		a = "Hello";
		c = "hei";
		System.out.printf("\"%s\" += \"%s\" --> c = \"%s\"\n", c, a, c += a);

		boolean tr = true;
		boolean fal = false;
		String or = "or";
		char q = '?';
		System.out.printf("%b + \"%s\" + %b + %c = \"%s\"\n", tr, or, fal, q, tr + or + fal + q);


		System.out.println("\n***** Relational Operators (String) *****");

		String one = "one";
		String two = "two";

		System.out.printf("\"%s\" == \"%s\" --> \"%b\"\n", one, two, one == two);

		two = "one";
		System.out.printf("\"%s\" == \"%s\" --> \"%b\"\n", one, two, one == two);

		two = new String("one");
		System.out.printf("\"%s\" == \"%s\" --> \"%b\"\n", one, two, one == two);

		System.out.printf("\"%s\".equals(\"%s\") --> \"%b\"\n", one, two, one.equals(two));


		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		short sh = -32000;
		ch = '\u0110';
		int i = 32344312;
		long l = 100_000_000_000_000_000L;
		f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = Byte.toString(bt);
		System.out.printf("String = byte: c = Byte.toString(%d) --> c = \"%s\"\n", bt, c);
		c = Short.toString(sh);
		System.out.printf("String = short: c = Short.toString(%d) --> c = \"%s\"\n", sh, c);
		c = Character.toString(ch);
		System.out.printf("String = char: c = Character.toString(%c) --> c = \"%s\"\n", ch, c);
		c = Integer.toString(i);
		System.out.printf("String = int: c = Integer.toString(%d) --> c = \"%s\"\n", i, c);
		c = Long.toString(l);
		System.out.printf("String = long: c = Long.toString(%d) --> c = \"%s\"\n", l, c);
		c = Float.toString(f);
		System.out.printf("String = float: c = Float.toString(%.1f) --> c = \"%s\"\n", f, c);
		c = Double.toString(d);
		System.out.printf("String = double: c = Double.toString(%.1f) --> c = \"%s\"\n", d, c);
		c = Boolean.toString(bool);
		System.out.printf("String = boolean: c = Boolean.toString(%b) --> c = \"%s\"\n", bool, c);

		System.out.println("\nWe can use method \"valueOf()\" of String class also. Ex.:\nc = String.valueOf(bt);");

	}

	public static void testStudent() {

		Student student1 = new Student("Eugene", 7);
		Student student2 = new Student("Jane", 9);
		Student student3 = new Student("Alex", 9);
		String studentInfo;

		System.out.println("\n***** Relational Operators (Student) *****");

		System.out.printf("\n\"%s\" == \"%s\" --> %b\n", student1, student2, student1 == student2);
		System.out.printf("\n\"%s\" == \"%s\" --> %b\n", student2, student3, student2 == student3);
		System.out.printf("\n\"%s\" == \"%s\" --> %b\n", student1, student3, student1 == student3);

		System.out.printf("\n\"%s\".equals(\"%s\") --> %b\n", student1, student2, student1.equals(student2));
		System.out.printf("\n\"%s\".equals(\"%s\") --> %b\n", student2, student3, student2.equals(student3));
		System.out.printf("\n\"%s\".equals(\"%s\") --> %b\n", student1, student3, student1.equals(student3));

		System.out.printf("\n\"%s\" != \"%s\" --> %b\n", student1, student2, student1 != student2);
		System.out.printf("\n\"%s\" != \"%s\" --> %b\n", student2, student3, student2 != student3);
		System.out.printf("\n\"%s\" != \"%s\" --> %b\n", student1, student3, student1 != student3);


		System.out.println("\nType Cast Operator:");
		studentInfo = student1.toString();
		System.out.printf("String = Student1.toString: studentInfo --> \"%s\"\n", studentInfo);
		studentInfo = student2.toString();
		System.out.printf("String = Student2.toString: studentInfo --> \"%s\"\n", studentInfo);
		studentInfo = student3.toString();
		System.out.printf("String = Student3.toString: studentInfo --> \"%s\"\n", studentInfo);
	}
}