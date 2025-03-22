package com.oops.java_association;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeMinister {
    ArrayList<Minister> ministers = new ArrayList();
    ArrayList<MembersOfParliament> memberOfParliament = new ArrayList();

    void addMinister(Minister minister) {
        this.ministers.add(minister);
    }

    void addMemberOfParliament(MembersOfParliament membersOfParliament) {
        this.memberOfParliament.add(membersOfParliament);
    }

    void showAllMinister() {
        Iterator<Minister> itr = this.ministers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().name);
        }
    }
    void showAllMemberOfParliament() {
        Iterator<MembersOfParliament> itr = this.memberOfParliament.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().name);
        }
    }
}
