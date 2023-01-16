import itertools
lst = [2,1,3,4]
for a in lst:
    for b in range(1,len(lst)):
        if lst[a]>lst[b]:
            lst[a],lst[b] = lst[b],lst[a]

print(lst)