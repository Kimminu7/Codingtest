check = [0] * 31

for i in range(28):
    n = int(input())
    check[n] = 1

for i in range(1,31):
    if check[i] == 0:
        print(i)





