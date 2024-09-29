def solution(str1, str2):
    result = []
    for s1, s2 in zip(str1, str2):
        result.append(s1)
        result.append(s2)
    return ''.join(result)