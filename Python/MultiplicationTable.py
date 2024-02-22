def multiplication_table(number, limit):
    for i in range(1, limit + 1):
        result = number * i
        print(f"{number} x {i} = {result}")

number_to_multiply = int(input("Enter the number for the multiplication table: "))

number_of_times = int(input("Enter the limit of the multiplication table: "))

multiplication_table(number_to_multiply, number_of_times)
