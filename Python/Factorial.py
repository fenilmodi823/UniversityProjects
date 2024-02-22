def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

user_number = int(input("Enter a number to calculate its factorial: "))

if user_number < 0:
    print("Factorial is not defined for negative numbers.")
else:
    result = factorial(user_number)
    print(f"The factorial of {user_number} is: {result}")
