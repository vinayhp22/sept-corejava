Unary operators: increment & decrement operators
post increment(x++) -> first used, then increment by 1
pre increment(++x) -> first increment by 1, then used

post decrement(x--)-> first used, then decrement by 1
pre decrement(--x) -> first decrement by 1, then used
b = 10
b++
S.o.p(b) //11
b = b+1
S.o.p(b)


Result Type Rule: max(int, type of a, type of b)
int + double -> double
long + double 

10/0 - >  ArithmeticException
0/0 -> ArithmeticException
10/0.0 -> Infinity
-0.1/0.0 ->-Infinity
-0/0.0 ->NaN  -> false except != 