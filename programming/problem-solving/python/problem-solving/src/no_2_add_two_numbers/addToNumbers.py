class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class AddToNumbers:
    def addToNumbers(self, list, list2):
        sum = 0
        carry = 0
        mod = 0
        pointer = list
        pointer2 = list2
        list3 = None
        pointer3 = None
        while pointer != None or pointer2 != None:
            num = pointer.val if pointer != None else 0
            num2 = pointer2.val if pointer2 != None else 0
            sum = num + num2 + carry
            if carry != 0:
                carry = 0
            carry = sum // 10
            mod = sum % 10
            if carry != 0:
                if pointer3 == None:
                    pointer3 = list3 = ListNode(mod)
                else:
                    pointer3.next = ListNode(mod)
                    pointer3 = pointer3.next
            else:
                if pointer3 == None:
                    pointer3 = list3 = ListNode(sum)
                else:
                    pointer3.next = ListNode(sum)
                    pointer3 = pointer3.next
            if pointer != None:
                pointer = pointer.next
            else:
                pointer = None
            if pointer2 != None:
                pointer2 = pointer2.next
            else:
                pointer2 = None

        if carry != 0:
            pointer3.next = ListNode(carry)
            pointer3 = pointer3.next
        return list3


list = ListNode(9)
list.next = ListNode(9)
list2 = ListNode(9)

obj = AddToNumbers()
output = obj.addToNumbers(list, list2)

while output != None:
    print(output.val)
    output = output.next
