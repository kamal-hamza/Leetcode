class ListNode(object):

    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class solution(object):

    def addTwoNumbers(self, l1, l2):
        head = ListNode()
        current = head
        carry = 0
        while l1 != None or l2 != None or carry != 0:
            l1Val = l1.val if l1 else 0
            l2Val = l2.val if l2 else 0
            total = l1Val + l2Val + carry
            current.next = ListNode(total % 10)
            carry = total // 10
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            current = current.next

        return head.next 

            


sol = solution()
sol.addTwoNumbers()




