class solution(object):
    def secondHighest(self, s):
        secondLargest = -1
        largest = -1
        for char in s:
            try:
                num = int(char)
                if num > secondLargest:
                    if num > largest:
                        secondLargest = largest
                        largest = num
                    elif num == largest:
                        continue
                    else:
                        secondLargest = num
            except:
                continue
        return secondLargest
obj = solution()
print(obj.secondHighest("dfa12321afd"))