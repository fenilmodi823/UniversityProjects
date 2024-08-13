def delete_even_numbers(lst):
    result_list = [num for num in lst if num % 2 != 0]
    return result_list

try:
    input_list = [int(input(f"Enter number {i + 1}: ")) for i in range(10)]
except ValueError:
    print("Please enter valid integers.")

if len(input_list) == 10:
    result = delete_even_numbers(input_list)
    print(f"Original list: {input_list}")
    print(f"List after deleting even numbers: {result}")
else:
    print("Please enter exactly 10 numbers.")
