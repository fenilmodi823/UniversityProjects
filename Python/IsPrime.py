def is_prime(number):
    if number <= 1:
        return False
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True

user_number = int(input("Enter a number to check if it's prime: "))

if is_prime(user_number):
    print(f"{user_number} is a prime number.")
else:
    print(f"{user_number} is not a prime number.")
