user_number = int(input("Enter a number: "))

if user_number % 4 == 0:
    print(f"{user_number} is divisible by 4.")
else:
    print(f"{user_number} is not divisible by 4.")

if user_number % 2 == 0:
    print(f"{user_number} is an even number.")
else:
    print(f"{user_number} is an odd number.")
