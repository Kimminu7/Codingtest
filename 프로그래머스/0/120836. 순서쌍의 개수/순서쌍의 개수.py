def solution(n):
    a = []
    for i in range(1,n+1):
        if n%i == 0:
            a.append((i,n))
    answer = len(a)
    return answer