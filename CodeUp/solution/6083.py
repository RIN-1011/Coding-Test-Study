a, b, c = map(int, input().split())
s = 0
for i in range(a):
    for j in range(b):
        for k in range(c):
            print(i, j, k)
            s+=1
print(s)
