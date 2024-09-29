def solution(my_string, n):
    r = []
    for i in my_string:
        for j in range(n):
            r.append(i)
    return ''.join(r)