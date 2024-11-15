def solution(n):
    if n % 2 == 1:  # n이 홀수일 때
        return sum(i for i in range(1, n + 1, 2))  # 홀수의 합
    else:  # n이 짝수일 때
        return sum(i ** 2 for i in range(2, n + 1, 2))  # 짝수의 제곱의 합
