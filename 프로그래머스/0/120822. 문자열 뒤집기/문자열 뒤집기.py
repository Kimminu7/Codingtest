def solution(my_string):
    a = list(my_string)
    a = a[-1::-1]
    return ''.join(a)