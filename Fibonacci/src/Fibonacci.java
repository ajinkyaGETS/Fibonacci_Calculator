public class Fibonacci{
 public static long calculate(long i){	
  if (i < 2)  // Ajinkya_fixed the bug in the code
   return i;
  long a = 0;
  long b = 1;
  long fib = 1;
  for (long x = 2; x <= i; x++){
   fib = a + b;
   a = b;
   b = fib;
  }
 return fib;
 }
}
