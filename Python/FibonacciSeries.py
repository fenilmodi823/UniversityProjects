def fibonacci_series(n):
    fib_series = []
    a, b = 0, 1
    for _ in range(n):
        fib_series.append(a)
        a, b = b, a + b
    return fib_series

num_terms = int(input("Enter the number of terms in the Fibonacci series: "))

result = fibonacci_series(num_terms)
print(f"The Fibonacci series with {num_terms} terms is: {result}")
