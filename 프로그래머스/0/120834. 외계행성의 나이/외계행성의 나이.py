def solution(age):
    answer = ''
    word = ['a','b','c','d','e','f','g','h','i','j']
    
    for i in str(age):
        answer += word[int(i)]

    
    return answer