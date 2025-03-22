import { addToNumbers, ListNode } from './no_2_add_two_numbers/addToNumbers';

const node = new ListNode(9)
node.next = new ListNode(9)

const node2 = new ListNode(9)

let output = addToNumbers(node, node2);

while(output != null){
    console.log(output.val)
    output = output.next;
}
