def solution(n):
    sum = 0
    for i in range(n+1):
        if i % 2 == 0:
            sum += i
    return sum