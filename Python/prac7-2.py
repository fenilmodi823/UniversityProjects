def newlist(l1):
    newlist = []

    for i in l1:
        if(i not in newlist):
            newlist.append(i)
    return newlist

list1 = [8, 2, 3, 1, 5, 7, 1, 8, 4, 7]

result = newlist(list1)
print(newlist(list1))

