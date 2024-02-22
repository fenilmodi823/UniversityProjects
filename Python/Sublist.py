m = [[11, 2], [3, 341, 5], [53]]

max_value = float('-inf')

for sublist in m:
    for element in sublist:
        if element > max_value:
            max_value = element

print(f"The maximum element in the list is: {max_value}")
