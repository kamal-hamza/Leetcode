class solution(object):

    def __init__(self):
        self._smallest = 1
        self._list = []

    def popSmallest(self):
        if len(self._list) == 0:
            self._smallest += 1
            return self._smallest - 1
        else:
            num = self._list[0]
            del self._list[0]
            return num

    def addBack(self, num):
        if num < self._smallest:
            self._list.append(num)
            self._list.sort()

sol = solution()
sol.popSmallest()