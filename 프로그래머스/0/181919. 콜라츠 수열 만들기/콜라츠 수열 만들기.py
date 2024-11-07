def solution(n):
    a = [n]
    while n != 1:
        if n % 2 == 0:
            n /= 2
    
        elif n % 2 !=0:
            n = 3*n+1
        a.append(n)
    return a