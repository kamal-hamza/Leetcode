class Solution(object):
    def convert(self, s, numRows):
        if (numRows == 1):
            return s

        list = [""] * numRows
        goingUp = True
        rowIndex = 1

        for ch in s:
            list[rowIndex - 1] += ch

            if (rowIndex == numRows):
                goingUp = False
            elif (rowIndex == 1):
                goingUp = True

            if (goingUp):
                rowIndex += 1
            else:
                rowIndex -= 1

        return (''.join(list))