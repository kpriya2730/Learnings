# Concept
## Basics
1. Dividend = Quotient x Divisor + Remainder
   - D = q*d + r
   - r = D - q*d
   - r = Dividend - Largest multiple of divisor that is less than or equal to the Dividend
```dtd
Example:
1. 30 % 4 = 30 - 28 = 2
2. 40 % 7 = 40 - 35 = 5 

For negative numbers,
1. -40 % 7 = -40 - Largest multiple of divisor that is 
        less than or equal to the Dividend = -40 - (-42) = 2
2. -60 % 9 = -60 - (-63) = 3
3. -30 % 4 = -30 - (-32) = 2
```
2. Range of remainder for divisor m = **[0, m-1]**
3. In C,C++,Java, JS, the modulus operation returns negative remainders when Dividend is negative. 
It is because the compilers in these languages are not smart enough.
4. In Python, the modulus operation returns positive remainders as above.
5. How to get positive remainders in languages in point 3 for dividend = *a* and divisor = *m*
>remainder = a % m + m
6. What is the importance of modulus operator?
   1. Ranging the input
   2. Used to restrict the ranges, Ex: Hashmap, Hashtable
   3. [-100, -99, -98,...0,1,2,...99,100] each numbers %5 will be ranged from [0,4]
   4. Consistent hashing uses mod operator
   5. Cryptography uses mod operator

## Modular Arithmetic
How the mod operator behave with + and x operators?
1. **(a+b)%m = (a%m + b%m)%m**
   1. max_value of (a+b)%m is m-1, always no matter what is the dividend.
    ```
    a=6, b=8, m=10
    (6+8)%10 = 14%10 = 4
   
    a=6, b=8, m=10
    (6+8)%10 = (6%10 + 8%10)%10 = (6+8)%10 = 4
   ```
2. **(a x b)%m = ((a%m) x (b%m))%m**
3. Divisibility Rules:
   ```
   Rule for 3 = Sum of digits has to be divisible by 3
   How did we get this rule??
   4372%3 = (4+3+7+2)%3
   4372 = 4*10^3+3*10^2+7*10+2
   4372%3
   => (4*10^3+3*10^2+7*10+2)%3
   => ((4*10^3)%3+(3*10^2)%3+(7*10)%3+2%3)%3
   => ((4%3*10^3%3)%3+(3%3*10^2%3)%3+(7%3*10%3)%3+2%3)
   Note: 10%3 = 1, 100%3=1,.., 10^n%3=1
   => ((4%3)%3+(3%3)%3+(7%3)%3+2%3)
   Note: (a%b)%b = a%b
   => (4%3+3%3+7%3+2%3)%3
   => (4+3+7+2)%3
   ```



