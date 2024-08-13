def newlist(l1, l2):
    newlist = []

    for i in l1:
        if(i not in l2):
            newlist.append(i)
    return newlist

list1 = [8, 2, 3, 1, 5, 7]
list2 = [1, 8, 4, 7]

result = newlist(list1, list2)
print(f"Elements is list1 but not in list2: {result}")
