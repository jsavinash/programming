package com.no_2_add_to_numbers;

import com.common.ListNode;

public class AddToNumbers {

    ListNode addToNumbers(ListNode list, ListNode list2) {
       int sum;
       int carry = 0;
        int mod;
        ListNode list3 = null;
        ListNode listPointer = list;
        ListNode listPointer2 = list2;
        ListNode listPointer3 = null;
       while (listPointer != null || listPointer2 != null){
           int num = listPointer != null ? listPointer.val : 0;
           int num2 = listPointer2 != null ? listPointer2.val : 0;
           sum = num + num2 + carry;
           if(carry != 0){
               carry = 0;
           }
           carry = sum / 10;
           mod = sum % 10;
           if(carry != 0) {
               if(list3 != null) {
                   list3.next = new ListNode(mod);
                   list3 = list3.next;
               } else {
                   listPointer3 =  list3 = new ListNode(mod);
               }
           } else {
               if(list3 != null) {
                   list3.next = new ListNode(sum);
                   list3 = list3.next;
               } else {
                   listPointer3 = list3 = new ListNode(sum);
               }
           }
           if(listPointer != null) {
               listPointer = listPointer.next;
           } else {
               listPointer = null;
           }
           if(listPointer2 != null) {
               listPointer2 = listPointer2.next;
           } else {
               listPointer2 = null;
           }
       }
       if(carry != 0){
           list3.next = new ListNode(carry);
           list3 = list3.next;
           carry = 0;
       }
       return listPointer3;
    }


    public static void main(String args[]){
        ListNode list = new ListNode(9);
        list.next = new ListNode(9);

        ListNode list2 = new ListNode(9);

        //  1
        //  99
        //   9
        // ----
        // 108
        AddToNumbers atn = new AddToNumbers();
        ListNode listPointer3 = atn.addToNumbers(list, list2);;
        while (listPointer3 != null){
            System.out.print(listPointer3.val +",");
            listPointer3 = listPointer3.next;
        }
    }
}
