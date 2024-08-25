def solution(slice, n):
    s1,answer = 0,0
    if n % slice == 0:
        s1 = n // slice
        answer = s1
    elif n % slice != 0:
        s1 = n // slice +1
        answer = s1

    return answer