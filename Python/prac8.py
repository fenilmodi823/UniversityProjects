def reverse_words(input_string):
    words = input_string.split()

    reversed_words = words[::-1]

    reversed_string = ' '.join(reversed_words)

    return reversed_string

example_string = "My name is fenil modi and I am at silver oak ."
result = reverse_words(example_string)

print("Original string:", example_string)
print("String with words in backward order:", result)
