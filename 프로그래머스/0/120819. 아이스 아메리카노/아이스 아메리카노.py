def solution(money):
    ame = 5500   # 아메리카노 한잔가격
    count = money // ame     # 몇개 당 살것인지.
    charge = money % ame    # 거스름돈
    answer = [count, charge] # 리스트로 [ ] 감싸주기
    return answer
