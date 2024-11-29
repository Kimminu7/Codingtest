a = []

for i in range(1,10):
    n = int(input())
    a.append(n)

print(max(a))
print(a.index(max(a))+1)
