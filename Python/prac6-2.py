def is_palindrome(input_str):
    reversed_str = input_str[::-1]

    return input_str == reversed_str

hardcoded_string = "naman"
if is_palindrome(hardcoded_string):
    print(f"{hardcoded_string} is a palindrome.")
else:
    print(f"{hardcoded_string} is not a palindrome.")
