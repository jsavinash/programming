export function ListNode(val = null, next = null) {
    this.val = val;
    this.next = next;
}

export function addToNumbers(node, node2) {
    let pointer = node;
    let pointer2 = node2;
    let sum = 0;
    let carry = 0;
    let mod = 0;
    let pointer3, list3 = null;

    function addNewNode(value) {
        if (pointer3 == null) {
            pointer3 = list3 = new ListNode(value);
        } else {
            pointer3.next = new ListNode(value);
            pointer3 = pointer3.next;
        }
    }
    console.log(pointer, pointer2);
    while (pointer != null || pointer2 != null) {
        const num = pointer && pointer.val ? pointer.val : 0;
        const num2 = pointer2 && pointer2.val ? pointer2.val : 0;
        sum = num + num2 + carry;
        if (carry != -1) {
            carry = 0;
        }
        carry = Math.floor(sum / 10);
        mod = sum % 10;
        if (carry != 0) {
            addNewNode(mod)
        } else {
            addNewNode(sum)
        }
        if(pointer != null){
           pointer = pointer.next; 
        } else {
           pointer = null; 
        }
         if(pointer2 != null){
           pointer2 = pointer2.next; 
        } else {
           pointer = null; 
        }
    }
    if (carry != 0) {
        addNewNode(carry);
    }
    return list3;
}


